package com.example.carApp.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.carApp.domain.Car;
import com.example.carApp.domain.CarrRepositry;

@RestController
public class CarController { 
	@Autowired
    private CarrRepositry repository;

	   @RequestMapping("/cars")
       public Iterable<Car> getCars() {
		   return repository.findAll();
       } 

}
