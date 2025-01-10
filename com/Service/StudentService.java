package com.Service;

import com.Dao.StudentDao;

public class StudentService {

    public void InsertData() {
        StudentDao sd = new StudentDao();
        sd.insertData();
    }
}
