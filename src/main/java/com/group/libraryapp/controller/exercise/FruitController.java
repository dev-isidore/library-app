package com.group.libraryapp.controller.exercise;

import com.group.libraryapp.dto.exercise.request.FruitCreateRequest;
import com.group.libraryapp.dto.exercise.request.FruitUpdateRequest;
import com.group.libraryapp.dto.exercise.response.FruitListQueryOption;
import com.group.libraryapp.dto.exercise.response.FruitResponse;
import com.group.libraryapp.dto.exercise.response.FruitSoldCountResponse;
import com.group.libraryapp.dto.exercise.response.FruitStatResponse;
import com.group.libraryapp.service.exercise.FruitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class FruitController {
    private final FruitService fruitService;

    public FruitController(FruitService fruitService) {
        this.fruitService = fruitService;
    }

    @PostMapping("/api/v1/fruit")
    public void saveFruit(@RequestBody FruitCreateRequest request) {
        fruitService.saveFruit(request.getName(), request.getPrice(), request.getWarehousingDate());
    }

    @PutMapping("/api/v1/fruit")
    public void updateFruitSales(@RequestBody FruitUpdateRequest request) {
        fruitService.updateFruitSales(request.getId());
    }

    @GetMapping("/api/v1/fruit/stat")
    public FruitStatResponse getFruitSalesStat() {
        return fruitService.getFruitSalesStat();
    }

    @GetMapping("/api/v1/fruit/count")
    public FruitSoldCountResponse getFruitSoldCount(@RequestParam String name) {
        final long soldCount = fruitService.getFruitSoldCount(name);
        return new FruitSoldCountResponse(soldCount);
    }

    @GetMapping("/api/v1/fruit/list")
    public List<FruitResponse> getFruits(@RequestParam FruitListQueryOption options, @RequestParam long price) {
        return fruitService.getFruitsByPrice(options, price).stream().map(FruitResponse::new).collect(Collectors.toList());
    }
}
