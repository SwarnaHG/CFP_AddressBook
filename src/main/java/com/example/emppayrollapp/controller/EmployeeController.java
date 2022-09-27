package com.example.emppayrollapp.controller;
import com.example.emppayrollapp.model.EmployeeEntity;
import com.example.emppayrollapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")

public class EmployeeController {
    @Autowired
    EmployeeService service;

    @RequestMapping(value = {"", "/", "/home"}, method = RequestMethod.GET)
    public String greet() {
        return "Welcome to Employee Payroll App";
    }


    @GetMapping("/get")
    public String serviceCall() {
        return service.welcomeMessage();
    }

    @PostMapping("/post")
    public EmployeeEntity addEmpData(@RequestBody EmployeeEntity empData) {
        service.saveData(empData);
        return empData;
    }

}
