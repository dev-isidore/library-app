package com.group.libraryapp.domain.exercise;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface FruitRepository extends JpaRepository<Fruit, Long> {
    List<Fruit> findAllByIsSold(boolean isSold);

    long countByIsSoldAndName(boolean isSold, String name);

    List<Fruit> findAllByPriceGreaterThanEqual(long price);
    List<Fruit> findAllByPriceLessThanEqual(long price);

}
