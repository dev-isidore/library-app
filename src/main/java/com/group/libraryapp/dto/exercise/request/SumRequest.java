package com.group.libraryapp.dto.exercise.request;

import java.util.List;

public class SumRequest {
    private List<Integer> numbers;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
