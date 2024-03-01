package com.group.libraryapp.dto.exercise.response;

public class DayOfTheWeekResponse {
    private String dayOfTheWeek;

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public DayOfTheWeekResponse(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }
}
