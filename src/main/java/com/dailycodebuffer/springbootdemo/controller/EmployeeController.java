package com.dailycodebuffer.springbootdemo.controller;

import com.dailycodebuffer.springbootdemo.model.Employee;
import com.dailycodebuffer.springbootdemo.service.EmpoyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmpoyeeService empoyeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee)
    {
         return empoyeeService.save(employee);
    }
    @GetMapping
    public List<Employee> getAllEmployees()
    {
        return empoyeeService.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Employee getSingleEmployee(@PathVariable String id)
    {
        return empoyeeService.getSingleEmployee(id);
    }
}
