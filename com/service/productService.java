package com.service;

import com.dao.ProductDao;

public class productService {
	public void InsertData() {
		
		ProductDao p = new ProductDao();
		p.insertData();
	}
}
