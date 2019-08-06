package com.mycompany.rajstore.Product.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.rajstore.Product.domain.Product;

@RestController
public class ProductService {
	
	// This is Product Service
	@RequestMapping("/product/{id}")
	public Product getProduct(@PathVariable("id") int id)
	{
		return new Product(id);
	}

	@RequestMapping("/productIds")
	public List<Integer> getProductIds(int productIds)
	{
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(Integer.valueOf(productIds+1));
		intList.add(Integer.valueOf(productIds+2));
		intList.add(Integer.valueOf(productIds+3));
		return intList;
	}
}
