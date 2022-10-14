package com.example.demo.repository;

import com.example.demo.model.Country;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;

public interface CountryRepository extends CrudRepository<Country, Long> {
    @Modifying
    @Query("UPDATE country SET population = :population WHERE id = :id")
    void update(long id, BigDecimal population);
}
