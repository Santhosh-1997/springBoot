package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Products> allProducts() {
		
		List<Products> list = new ArrayList<>();
		
		list.add(new Products(5,"mobile",1000,"nokia","phone","123","000"));
		list.add(new Products(5,"mobile",1000,"nokia","phone","123","000"));
		
		return list;
		
	}
	
	@GetMapping(value = "/product/{id}")
	public Products getProductbyId(@PathVariable("id") Integer id) {
		
		Products product1 = new Products(5,"mobile",1000,"nokia","phone","123","000");
		Products product2 = new Products(9,"mobile",1000,"samsung","phone","123","000");
		
		Map<Integer, Products> map = new HashMap<>();
		
		map.put(5,product1);
		map.put(9, product2);
		
		return map.get(id);
	}
	
	@RequestMapping(value = "/saveProduct")
	public String saveProduct(@RequestBody Products product) {
		
		
		return product.toString();
	}
	
	@GetMapping(value = "/deleteProduct/{id}")
	public String deleteProductbyId(@PathVariable("id") Integer id) {
		
		Products product1 = new Products(5,"mobile",1000,"nokia","phone","123","000");
		Products product2 = new Products(9,"mobile",1000,"samsung","phone","123","000");
		
		Map<Integer, Products> map = new HashMap<>();
		
		map.put(5,product1);
		map.put(9, product2);
		
		map.remove(id);
		
		return "deleted";
	}
	
	/*
	 * @GetMapping(value = "/updateProduct/{id}") public String
	 * updateProductbyId(@PathVariable("id") Integer id) {
	 * 
	 * Products product1 = new
	 * Products(5,"mobile",1000,"nokia","phone","123","000"); Products product2 =
	 * new Products(9,"mobile",1000,"samsung","phone","123","000");
	 * 
	 * Map<Integer, Products> map = new HashMap<>();
	 * 
	 * map.put(5,product1); map.put(9, product2);
	 * 
	 * map.remove(id);
	 * 
	 * return "deleted"; }
	 */
	
}
