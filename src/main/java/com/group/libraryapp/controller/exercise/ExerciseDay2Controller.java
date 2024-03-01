package com.group.libraryapp.controller.exercise;

import com.group.libraryapp.dto.exercise.response.CalcResponse;
import com.group.libraryapp.dto.exercise.response.DayOfTheWeekResponse;
import com.group.libraryapp.dto.exercise.request.SumRequest;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@RestController
public class ExerciseDay2Controller {
    @GetMapping("/api/v1/calc")
    public CalcResponse calc(@RequestParam int num1, @RequestParam int num2){
        return new CalcResponse(num1 + num2, num1 - num2, num1 * num2);
    }

    @GetMapping("/api/v1/day-of-the-week")
    public DayOfTheWeekResponse getDayOfWeek(@RequestParam String date) {
        LocalDate localDate = LocalDate.parse(date);
        return new DayOfTheWeekResponse(localDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US).toUpperCase());
    }

    @PostMapping("/api/v1/sum")
    public int sum(@RequestBody SumRequest sumRequest) {
        return sumRequest.getNumbers().stream().reduce(Integer::sum).get();
    }
}
