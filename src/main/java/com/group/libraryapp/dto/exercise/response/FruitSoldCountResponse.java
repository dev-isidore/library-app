package com.group.libraryapp.dto.exercise.response;

public class FruitSoldCountResponse {
    private long count;

    public FruitSoldCountResponse(long count) {
        this.count = count;
    }

    public long getCount() {
        return count;
    }
}
