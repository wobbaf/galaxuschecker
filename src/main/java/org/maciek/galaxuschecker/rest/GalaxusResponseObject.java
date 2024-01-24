package org.maciek.galaxuschecker.rest;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class GalaxusResponseObject {
    public GalaxusResponseObjectData getData() {
        return data;
    }

    public void setData(GalaxusResponseObjectData data) {
        this.data = data;
    }

    private GalaxusResponseObjectData data;
    public static class GalaxusResponseObjectData {
        public String getProductDetailsStructuredData() {
            return productDetailsStructuredData;
        }

        public void setProductDetailsStructuredData(String productDetailsStructuredData) {
            this.productDetailsStructuredData = productDetailsStructuredData;
        }

        private String productDetailsStructuredData;

    }
}
