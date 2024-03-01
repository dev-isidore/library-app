package com.group.libraryapp.domain.exercise;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;
    private Long price;
    private LocalDate warehousingDate;
    private boolean isSold;
    private LocalDateTime regDatetime;
    private LocalDateTime altDatetime;

    protected Fruit() {
    }

    public Fruit(String name, long price, LocalDate warehousingDate) {
        this.name = name;
        this.price = price;
        this.warehousingDate = warehousingDate;
        this.isSold = false;
        this.regDatetime = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public LocalDate getWarehousingDate() {
        return warehousingDate;
    }

    public boolean isSold() {
        return isSold;
    }

    public LocalDateTime getRegDatetime() {
        return regDatetime;
    }

    public LocalDateTime getAltDatetime() {
        return altDatetime;
    }

    public void updateSales() {
        this.altDatetime = LocalDateTime.now();
        this.isSold = true;
    }
}
