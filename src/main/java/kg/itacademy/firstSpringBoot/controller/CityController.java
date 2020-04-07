package kg.itacademy.firstSpringBoot.controller;

import kg.itacademy.firstSpringBoot.entity.City;
import kg.itacademy.firstSpringBoot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city") // localhost:8080/city
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping
    public List<City> getAll() {
        return cityService.getAllCities();
    }

    @PostMapping
    public City create(@RequestBody City city) {
        return cityService.save(city);
    }
}
