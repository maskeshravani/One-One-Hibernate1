package com.controller;

import com.service.productService;

public class ProductController {
	public static void main(String[] args) {
		productService p = new productService();
		p.InsertData();
		System.out.println("Data is inserted");
	}
}
