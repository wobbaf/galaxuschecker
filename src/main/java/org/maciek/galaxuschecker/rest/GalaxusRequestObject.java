package org.maciek.galaxuschecker.rest;

//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class GalaxusRequestObject {

    public GalaxusRequestObject(Long productId) {
        this.operationName = "GET_PRODUCT_DETAILS_STRUCTURED_DATA";
        Map<String, Long> temp = new HashMap<>();
        temp.put("productId", productId);
        temp.put("shopOfferId", null);
        this.variables = temp;
        this.query = "query GET_PRODUCT_DETAILS_STRUCTURED_DATA($productId: Int!, $shopOfferId: Int) {  productDetailsStructuredData(productId: $productId, shopOfferId: $shopOfferId)}";
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Map<String, Long> getVariables() {
        return variables;
    }

    public void setVariables(Map<String, Long> variables) {
        this.variables = variables;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    String operationName;
    Map<String, Long> variables;
    String query;
}
