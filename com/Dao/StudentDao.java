package com.Dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.StudentEx;

public class StudentDao {

    public void insertData() {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(StudentEx.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        Scanner sc = new Scanner(System.in);
        
        StudentEx s = new StudentEx();
        System.out.println("Enter the name: ");
        s.setName(sc.next());
        
        System.out.println("Enter the age: ");
        s.setAge(sc.nextInt());
        
        System.out.println("Enter the city: ");
        s.setCity(sc.next());

        session.persist(s);
        transaction.commit();
        session.close();
        sf.close();
    }
}
