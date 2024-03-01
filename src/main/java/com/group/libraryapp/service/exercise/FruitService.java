package com.group.libraryapp.service.exercise;

import com.group.libraryapp.domain.exercise.Fruit;
import com.group.libraryapp.dto.exercise.response.FruitListQueryOption;
import com.group.libraryapp.dto.exercise.response.FruitStatResponse;
import com.group.libraryapp.domain.exercise.FruitRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class FruitService {
    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public void saveFruit(String name, long price, LocalDate warehousingDate) {
        Fruit fruit = new Fruit(name, price, warehousingDate);
        fruitRepository.save(fruit);
    }

    public void updateFruitSales(Long id) {
        Fruit fruit = fruitRepository.findById(id).orElseThrow(IllegalArgumentException::new);
        fruit.updateSales();
        fruitRepository.save(fruit);
    }

    public FruitStatResponse getFruitSalesStat() {
        FruitStatResponse fruitStatResponse = new FruitStatResponse();
        fruitStatResponse.setSalesAmount(fruitRepository.findAllByIsSold(true).stream().mapToLong(Fruit::getPrice).sum());
        fruitStatResponse.setNotSalesAmount(fruitRepository.findAllByIsSold(false).stream().mapToLong(Fruit::getPrice).sum());

        return fruitStatResponse;
    }

    public long getFruitSoldCount(String name) {
        return fruitRepository.countByIsSoldAndName(true, name);
    }

    public List<Fruit> getFruitsByPrice(FruitListQueryOption options, long price) {
        if(options == FruitListQueryOption.GTE) {
            return fruitRepository.findAllByPriceGreaterThanEqual(price);
        }
        if(options == FruitListQueryOption.LTE){
            return fruitRepository.findAllByPriceLessThanEqual(price);
        }
        return Collections.emptyList();
    }
}
