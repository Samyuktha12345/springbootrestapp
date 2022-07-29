package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
@Autowired
private ProductRepository repo;

//display all data
public List<Product>listAll(){
	return repo.findAll();
}
	//insert data
	public void save(Product product) {
		repo.save(product);
	}
	
	//search by id
	public Product get(Integer id) {
		return repo.findById(id).get();
}
	
	//delete record
	public void delete(Integer id) {
		repo.deleteById(id);
	}
	public List<Product>getByKeyword(String keyword){
		return repo.findByKeyword(keyword);
	}
}
