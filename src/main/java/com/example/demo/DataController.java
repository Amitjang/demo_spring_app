package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.*;

@RestController
//@RequestMapping("/models")
public class DataController {
    @Autowired
    private MyModelRepo repository;

    @GetMapping()
    public List<Car> getAllCars() {
        return repository.findAll();
    }

    @GetMapping("/{brand}")
    public Object getByName(@PathVariable String brand,
                         @RequestParam(name="id",required = false) String id) {
        if(id!=null){
            return repository.findByIdAndBrand(id,brand);
        }
        return repository.findByBrand(brand);

    }

    @PostMapping("/")
    public Car addCar(@RequestBody Car car) {
//        cars.add(car);
        return repository.insert(car);

    }

    @PatchMapping("/{id}")
    public Car changeCar(@RequestBody Car car, @PathVariable String id) {
       Car oldCar =repository.findById(id).orElseThrow();
       oldCar.setData(car);
       return repository.save(oldCar);
    }
//    DeleteMapping("/{name}")



    @DeleteMapping("/{id}")
    public Car deleteCar(@PathVariable String id) {
        Optional<Car> car = repository.findById(id);
        repository.deleteById(id);
        return car.orElse(null);


    }



}
