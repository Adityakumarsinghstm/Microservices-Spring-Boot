package com.dailycodebuffer.springbootdemo.service;

import com.dailycodebuffer.springbootdemo.model.Employee;

import java.util.List;

public interface EmpoyeeService {
   Employee save(Employee employee);
   List<Employee> getAllEmployees();
   Employee getSingleEmployee(String id);
}
