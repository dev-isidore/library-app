package com.group.libraryapp.dto.exercise.response;

import com.group.libraryapp.domain.exercise.Fruit;

import java.time.LocalDate;

public class FruitResponse {
    private String name;
    private Long price;
    private LocalDate warehousingDate;

    public FruitResponse(Fruit fruit) {
        this.name = fruit.getName();
        this.price = fruit.getPrice();
        this.warehousingDate = fruit.getWarehousingDate();
    }

    public String getName() {
        return name;
    }

    public Long getPrice() {
        return price;
    }

    public LocalDate getWarehousingDate() {
        return warehousingDate;
    }
}
