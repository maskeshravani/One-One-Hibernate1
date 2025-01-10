package com.Controller;

import com.Service.StudentService;

public class StudentController {

    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.InsertData();
        System.out.println("Data is inserted");
    }
}
