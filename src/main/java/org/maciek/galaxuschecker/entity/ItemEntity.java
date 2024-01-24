package org.maciek.galaxuschecker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class ItemEntity {
    public ItemEntity() {
    }

    public ItemEntity(Long id, String name, Double price, LocalDateTime lastUpdated) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.lastUpdated = lastUpdated;
    }

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    private String name;
    private Double price;
    private LocalDateTime lastUpdated;
}
