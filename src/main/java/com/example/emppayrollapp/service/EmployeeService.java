package com.example.emppayrollapp.service;


import com.example.emppayrollapp.model.EmployeeEntity;
import com.example.emppayrollapp.repository.repo;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.repository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    repo repository;

    public String welcomeMessage() {
        return "This is an Employee Payroll App";
    }

    public EmployeeEntity saveData(EmployeeEntity empData) {
        repository.save(empData);
        return empData;
    }
}
