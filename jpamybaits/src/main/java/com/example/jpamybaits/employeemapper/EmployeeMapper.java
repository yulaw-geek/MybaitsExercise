package com.example.jpamybaits.employeemapper;

import com.example.jpamybaits.Employee.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    int insertEmployee(Employee employee);
    Employee findEmployeeById(Long id);
    int deleteEmployeeById(Long id);
}
