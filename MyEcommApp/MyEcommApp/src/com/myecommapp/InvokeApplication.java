package com.myecommapp;

import static org.junit.Assert.assertEquals;

import com.myecommapp.model.Category;
import com.myecommapp.repository.CategoryRepository;
import com.myecommapp.repository.CustomerRepository;

public class InvokeApplication {

	public static void main(String[] args) {
		try {
		CustomerRepository customerRepo = new CustomerRepository();
		if (customerRepo.authenticate("mr.arthur.morgan@gmail.com", "arthurito")) {
			System.out.println("Welcome user");
		} else {
			System.out.println("Access Denied");
		}
	} catch (Exception e) {
		System.out.println("problem in connecting to db ");			
	}

	
//		try {
//			CategoryRepository categoryRepo = new CategoryRepository();
//			Category cat = new Category();
//			cat.setCategoryName("Test CASE!");
//			categoryRepo.add(cat);
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
	}

}
