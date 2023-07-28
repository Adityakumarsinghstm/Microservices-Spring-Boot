package com.dailycodebuffer.springbootdemo.service;

import com.dailycodebuffer.springbootdemo.error.EmployeeNotFoundException;
import com.dailycodebuffer.springbootdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmpoyeeServiceImpl implements EmpoyeeService{
List<Employee> employees = new ArrayList<>();
    @Override
    public Employee save(Employee employee) {
        if(employee.getEmployeeId().isEmpty() || employee.getEmployeeId()==null)
        {
            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getSingleEmployee(String id) {
       return employees.stream().filter(employee -> employee.getEmployeeId().equals(id)).findFirst()
               .orElseThrow(() -> new EmployeeNotFoundException(" "+"Employee not find with this id "+ id));
    }
}
