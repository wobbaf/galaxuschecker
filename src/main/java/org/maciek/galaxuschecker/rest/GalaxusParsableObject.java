package org.maciek.galaxuschecker.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GalaxusParsableObject {
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public List<String> getImage() {
        return image;
    }

    public void setImage(List<String> image) {
        this.image = image;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public AggregateRating getAggregateRating() {
        return aggregateRating;
    }

    public void setAggregateRating(AggregateRating aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    public Offers getOffers() {
        return offers;
    }

    public void setOffers(Offers offers) {
        this.offers = offers;
    }

    public static class AggregateRating {
        @JsonProperty("@type")
        private String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double getRatingValue() {
            return ratingValue;
        }

        public void setRatingValue(double ratingValue) {
            this.ratingValue = ratingValue;
        }

        public int getReviewCount() {
            return reviewCount;
        }

        public void setReviewCount(int reviewCount) {
            this.reviewCount = reviewCount;
        }

        private double ratingValue;
        private int reviewCount;
    }

    public static class Author {
        @JsonProperty("@type")
        private String type;
        private String name;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Brand {
        @JsonProperty("@type")
        private String type;
        private String name;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class EligibleQuantity {
        @JsonProperty("@type")
        private String type;
        private int value;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public static class EligibleTransactionVolume {
        @JsonProperty("@type")
        private String type;
        private EligibleQuantity eligibleQuantity;
        private int price;
        private String priceCurrency;

        public EligibleTransactionVolume() {
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public EligibleQuantity getEligibleQuantity() {
            return eligibleQuantity;
        }

        public void setEligibleQuantity(EligibleQuantity eligibleQuantity) {
            this.eligibleQuantity = eligibleQuantity;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getPriceCurrency() {
            return priceCurrency;
        }

        public void setPriceCurrency(String priceCurrency) {
            this.priceCurrency = priceCurrency;
        }
    }

    public static class Offers {
        @JsonProperty("@type")
        private String type;
        private Double price;
        private String priceCurrency;
        private String availability;
        private String itemCondition;
        private String url;
        private EligibleTransactionVolume eligibleTransactionVolume;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public String getPriceCurrency() {
            return priceCurrency;
        }

        public void setPriceCurrency(String priceCurrency) {
            this.priceCurrency = priceCurrency;
        }

        public String getAvailability() {
            return availability;
        }

        public void setAvailability(String availability) {
            this.availability = availability;
        }

        public String getItemCondition() {
            return itemCondition;
        }

        public void setItemCondition(String itemCondition) {
            this.itemCondition = itemCondition;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public EligibleTransactionVolume getEligibleTransactionVolume() {
            return eligibleTransactionVolume;
        }

        public void setEligibleTransactionVolume(EligibleTransactionVolume eligibleTransactionVolume) {
            this.eligibleTransactionVolume = eligibleTransactionVolume;
        }
    }

    public static class Review {
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public ReviewRating getReviewRating() {
            return reviewRating;
        }

        public void setReviewRating(ReviewRating reviewRating) {
            this.reviewRating = reviewRating;
        }

        @JsonProperty("@type")
        private String type;
        private Author author;
        private ReviewRating reviewRating;
    }

    public static class ReviewRating {
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getBestRating() {
            return bestRating;
        }

        public void setBestRating(int bestRating) {
            this.bestRating = bestRating;
        }

        public int getRatingValue() {
            return ratingValue;
        }

        public void setRatingValue(int ratingValue) {
            this.ratingValue = ratingValue;
        }

        @JsonProperty("@type")
        private String type;
        private int bestRating;
        private int ratingValue;
    }

    @JsonProperty("@context")
    private String context;

    @JsonProperty("@type")
    private String type;
    private String name;
    private Brand brand;
    private String description;
    private String gtin;
    private List<String> image;
    private String sku;
    private Review review;
    private AggregateRating aggregateRating;
    private Offers offers;

}
