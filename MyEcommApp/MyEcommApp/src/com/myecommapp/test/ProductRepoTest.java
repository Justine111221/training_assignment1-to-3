package com.myecommapp.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.myecommapp.model.Product;
import com.myecommapp.repository.ProductRepository;

class ProductRepoTest {
	ProductRepository productRepo;
	Product prod;
	@BeforeEach
	void setUp() {
		productRepo = new ProductRepository();
		prod = new Product();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void testAdd() {
//		prod.setProductName("TEST CASE");
//		prod.setCategoryId("CAT0000042");
//		prod.setProductPrice(25_000.42f);
//		prod.setProductImage("TEST CASE");
//		prod.setProductAvailableQty("100");
//		assertEquals("Failed to ADD Customer !", true, productRepo.add(prod));
//	}

//	@Test
//	void testUpdate() {
//		prod.setProductName("TEST CASE UPDATED");
//		prod.setCategoryId("CAT0000042");
//		prod.setProductPrice(25_000.42f);
//		prod.setProductImage("TEST CASE UPDATED");
//		prod.setProductAvailableQty("100");
//		prod.setProductId("P0000022");
//		assertEquals("Failed to ADD Customer !", true, productRepo.update(prod));
//	}

	@Test
	void testDelete() {
		prod.setProductId("P0000022");
		assertEquals("Failed to ADD Customer !", true, productRepo.delete(prod));
	}

}
