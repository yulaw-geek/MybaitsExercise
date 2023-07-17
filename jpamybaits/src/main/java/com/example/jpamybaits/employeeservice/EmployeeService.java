package com.example.jpamybaits.employeeservice;


import com.example.jpamybaits.employeemapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.jpamybaits.Employee.Employee;

@Service
public class EmployeeService {

    @Autowired
    private  EmployeeMapper employeeMapper;

    public int addEmployeeMybaits(Employee employee){
        return employeeMapper.insertEmployee(employee);
    }

    public Employee findEmployeeMybaits(Long id){
        return employeeMapper.findEmployeeById(id);
    }

    public int deleteEmployeeMybaits(Long id){
        return employeeMapper.deleteEmployeeById(id);
    }
}
