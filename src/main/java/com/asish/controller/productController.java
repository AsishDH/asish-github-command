package com.asish.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asish.binding.product;

@RestController
public class productController {

	   @PostMapping("/product")
	   public ResponseEntity<product> getProductDetails(){
		   
		      product p1 = new product();
		      p1.setPid(101);
		      p1.setPname("dell");
		      p1.setPrice(340000.00);
		      
		      return new ResponseEntity<>(p1,HttpStatus.OK);
	   }
	   
	   @PostMapping("/allProduct")
	   public ResponseEntity<List<product>> getAllProductDetails(){
		   
		            product p1 = new product(101, "dell", 37800.00);
		            product p2 = new product(102, "lonovo", 27800.00);
		            product p3 = new product(103, "hp", 39800.00);
		            
		            List<product> list = Arrays.asList(p1,p2,p3);
		            
		            return new ResponseEntity<>(list,HttpStatus.OK);
		            
	   }
}
