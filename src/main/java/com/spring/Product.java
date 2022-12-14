package com.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Product {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@NotNull
public int id;

@Size(min=1,max=20)
@NotEmpty(message="Name should not be empty")
public String name;

@Size(min=1,max=20)
@NotEmpty(message="Brand should not be empty")
public String brand;

@Size(min=1,max=20)
@NotEmpty(message="Madein should not be empty")
public String madein;

@NotNull()
@Range(min=500,max=100000)
public float price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getMadein() {
	return madein;
}
public void setMadein(String madein) {
	this.madein = madein;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public Product(int id, String name, String brand, String madein, float price) {
	super();
	this.id = id;
	this.name = name;
	this.brand = brand;
	this.madein = madein;
	this.price = price;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", madein=" + madein + ", price=" + price
			+ "]";
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

}
