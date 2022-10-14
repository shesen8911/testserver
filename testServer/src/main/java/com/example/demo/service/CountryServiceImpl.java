package com.example.demo.service;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    CountryRepository countryRepository;

    public void create(Country country) {
        countryRepository.save(country);
    }

    public List<Country> readAll() {
        return (List<Country>) countryRepository.findAll();
    }

    public Optional<Country> readById(Long id) {
        return countryRepository.findById(id);
    }

    public void update(Long id, BigDecimal population) {
        countryRepository.update(id, population);
    }

    public void deleteAll() {
        countryRepository.deleteAll();
    }

    public void deleteById(Long id) {
        countryRepository.deleteById(id);
    }

}