package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
public class CountryController {

    private CountryService countryService;

    @Autowired
    public void setCountryService(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/")
    public List<Country> read() {
        // TODO:可以在中間接proxy
        return countryService.readAll();
    }
    @GetMapping("/{id}")
    public Optional<Country> read(@PathVariable Long id) {
        // TODO:可以在中間接proxy
        return countryService.readById(id);
    }

    @PostMapping("/create")
    public String create(@RequestBody Country country) {
        // TODO:可以在中間接proxy
        countryService.create(country);
        return "success create" + country.toString();
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody BigDecimal population) {
        // TODO:可以在中間接proxy
        countryService.update(id, population);
        return "success";
    }

    @DeleteMapping("/")
    public String deleteAll() {
        countryService.deleteAll();
        return "success";
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id) {
        countryService.deleteById(id);
        return "success";
    }

}
