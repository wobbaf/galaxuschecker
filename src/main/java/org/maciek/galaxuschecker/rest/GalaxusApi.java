package org.maciek.galaxuschecker.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.maciek.galaxuschecker.entity.ItemEntity;
import org.maciek.galaxuschecker.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
public class GalaxusApi {
    RestTemplate restTemplate = new RestTemplate();

    @Autowired
    private ItemRepository itemRepository;

    @Scheduled(fixedDelay = 500)
    private void scheduleExecuteForProductIds() throws JsonProcessingException {
        executeForProductId(List.of(24646423L, 32517165L, 32517170L));
    }

    private void executeForProductId(List<Long> productId) throws JsonProcessingException {

        List<GalaxusRequestObject> requestList = new ArrayList<>();

        for (Long l : productId) {
            requestList.add(new GalaxusRequestObject(l));
        }

        RequestEntity<List<GalaxusRequestObject>> re = RequestEntity.post("https://www.galaxus.ch/api/graphql/get-product-details-structured-data")
                .header("Accept-Language", "en-GB")
                .accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON)
                .body(requestList, GalaxusRequestObject.class);

        ResponseEntity<GalaxusResponseObject[]> responseEntity = restTemplate.exchange(re, GalaxusResponseObject[].class);


        ObjectMapper om = new ObjectMapper();
        itemRepository.findAll().forEach(item ->
                System.out.printf("%s: %f at %s%n", item.getName(), item.getPrice(), item.getLastUpdated()));

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            for (GalaxusResponseObject gro : Objects.requireNonNull(responseEntity.getBody())) {
                GalaxusParsableObject gpo = om.readValue(gro.getData().getProductDetailsStructuredData(), GalaxusParsableObject.class);
                ItemEntity ie = itemRepository.save(new ItemEntity(Long.valueOf(gpo.getGtin()), gpo.getName(), gpo.getOffers().getPrice(), LocalDateTime.now()));

                System.out.printf("%s: %f%n", ie.getName(), ie.getPrice());
            }
        }
    }

}
