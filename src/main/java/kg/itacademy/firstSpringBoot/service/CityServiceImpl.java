package kg.itacademy.firstSpringBoot.service;

import kg.itacademy.firstSpringBoot.entity.City;
import kg.itacademy.firstSpringBoot.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {// Inversion Of Control IOC
    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public City getById(Long id) {
        Optional<City> city = cityRepository.findById(id);
        return city.orElse(new City());
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }
}
