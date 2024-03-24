package com.javatechie.us.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    public OrderDTO(int i, String string, String string2, String string3, int j) {
		// TODO Auto-generated constructor stub
	}
	private int id;
    private String name;
    private String category;
    private String color;
    private double price;
}
