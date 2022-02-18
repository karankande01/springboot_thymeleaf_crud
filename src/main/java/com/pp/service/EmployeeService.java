package com.pp.service;

import com.pp.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(int id);
    void deleteEmployee(int id);
    Page<Employee> findPaginated(int pageNo,int pageSize, String sortField , String sortDirection);
}
