package exam.ss10.controller;

import exam.ss10.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @GetMapping
    public List<Employee> getAllEmployees() {

        return Arrays.asList(
                new Employee(1L, "Nguyen Van An", 15000000.0),
                new Employee(2L, "Tran Thi Binh", 18000000.0),
                new Employee(3L, "Le Van Cuong", 22000000.0)
        );
    }
}