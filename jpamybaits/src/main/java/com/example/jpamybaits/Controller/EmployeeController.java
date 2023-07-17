package com.example.jpamybaits.Controller;


import com.example.jpamybaits.Employee.Employee;
import com.example.jpamybaits.employeeservice.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public int add(@RequestBody Employee employee){
        return employeeService.addEmployeeMybaits(employee);
    }

    @GetMapping("/{id}")
    public Employee get(@PathVariable Long id){
        return employeeService.findEmployeeMybaits(id);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable Long id){
        return employeeService.deleteEmployeeMybaits(id);
    }

}
