package com.poc.cicdpipeline.Controller;

import com.poc.cicdpipeline.Entity.PermanentEmployee;
import com.poc.cicdpipeline.Repository.EmployeeRepository;
import com.poc.cicdpipeline.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/getEmployeeDetails")
    public ResponseEntity getEmployeeDetails(){


       return new ResponseEntity<>(employeeRepository.findAll(),HttpStatus.OK);
    }

    @PostMapping(path ="/insertemployeedetails")
    public ResponseEntity insertEmployeeDetails(@RequestBody PermanentEmployee permanentEmployee){
        employeeService.insertEmployeeDetails(permanentEmployee);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
