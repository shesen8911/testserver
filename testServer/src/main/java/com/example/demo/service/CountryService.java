package com.example.demo.service;

import com.example.demo.model.Country;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface CountryService {
    void create(Country country);
    List<Country> readAll();
    Optional<Country> readById(Long id);
    void update(Long id, BigDecimal population);
    void deleteAll();
    void deleteById(Long id);
}