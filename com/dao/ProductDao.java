package com.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Product;

import jakarta.persistence.Entity;

public class ProductDao {

	public void insertData() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();
		System.out.println("Enter the Name: ");
		p.setPname(sc.next());
		System.out.println("Enter the Price: ");
		p.setPrice(sc.nextInt());
		System.out.println("Enter the Color: ");
		p.setColor(sc.next());

		session.persist(p);
		transaction.commit();
		session.close();
		sf.close();
	}
}
