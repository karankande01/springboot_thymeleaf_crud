package com.pp.service;

import com.pp.model.Employee;
import com.pp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void saveEmployee(Employee employee) {
        employeeRepository.saveAndFlush(employee);
    }

    public Employee getEmployeeById(int id){
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if(optional.isPresent()){
            employee = optional.get();
        }else {
            throw new RuntimeException("Employee not found for Id ::"+ id);
        }
        return employee;
    }

    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
