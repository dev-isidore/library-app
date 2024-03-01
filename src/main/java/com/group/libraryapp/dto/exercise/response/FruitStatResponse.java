package com.group.libraryapp.dto.exercise.response;

public class FruitStatResponse {
    private long salesAmount;
    private long notSalesAmount;

    public long getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }

    public long getNotSalesAmount() {
        return notSalesAmount;
    }

    public void setNotSalesAmount(long notSalesAmount) {
        this.notSalesAmount = notSalesAmount;
    }
}
