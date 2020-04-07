package kg.itacademy.firstSpringBoot.service;

import kg.itacademy.firstSpringBoot.entity.City;

import java.util.List;

public interface CityService {
    List<City> getAllCities();

    City getById(Long id);

    City save(City c);
}
