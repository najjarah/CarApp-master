package com.example.carApp.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private long id; 
  private String brand, model, color, registerNumber;
  private int year, price;
public Car() {
	super();
	// TODO Auto-generated constructor stub
}
public Car( String brand, String model, String color, String registerNumber, int year, int price) {
	super();
	
	this.brand = brand;
	this.model = model;
	this.color = color;
	this.registerNumber = registerNumber;
	this.year = year;
	this.price = price;
}

}
