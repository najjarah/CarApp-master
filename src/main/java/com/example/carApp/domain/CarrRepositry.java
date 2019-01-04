package com.example.carApp.domain;


import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;






public interface CarrRepositry extends CrudRepository <Car, Long> {

	
	
	  // Fetch cars by brand
	  List<Car> findByBrand(String brand);

	  // Fetch cars by color
	  List<Car> findByColor(String color);

	  // Fetch cars by year
	  List<Car> findByYear(int year);


	// Fetch cars by brand and model
	  List<Car> findByBrandAndModel(String brand, String model);

	  // Fetch cars by brand or color
	  List<Car> findByBrandOrColor(String brand, String color); 
	  // Fetch cars by brand and sort by year
	  List<Car> findByBrandOrderByYearAsc(String brand);

	  
	  // Fetch cars by brand using SQL
//	  @Query("select c from Car c where c.brand like %?1")
//	  List<Car> findByBrandEndsWith(String brand);


}

//
//import org.springframework.data.repository.PagingAndSortingRepository;
//public interface CarrRepositry extends PagingAndSortingRepository<Car, Long> {
//
//}
//adds more functions
