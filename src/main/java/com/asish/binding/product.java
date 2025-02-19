package com.asish.binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class product {

	   private Integer pid;
	   
	   private String pname;
	   
	   private Double price;
}
