package com.group.libraryapp.dto.exercise.response;

import java.time.LocalDateTime;

public class FruitUpdateResponse {
    private long id;
    private boolean isSold;
    private LocalDateTime altDatetime;

    public FruitUpdateResponse(long id, boolean isSold, LocalDateTime altDatetime) {
        this.id = id;
        this.isSold = isSold;
        this.altDatetime = altDatetime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public LocalDateTime getAltDatetime() {
        return altDatetime;
    }

    public void setAltDatetime(LocalDateTime altDatetime) {
        this.altDatetime = altDatetime;
    }
}
