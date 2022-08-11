package com.poc.cicdpipeline.Service;

import com.poc.cicdpipeline.Entity.PermanentEmployee;
import com.poc.cicdpipeline.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public PermanentEmployee insertEmployeeDetails(PermanentEmployee permanentEmployee) {
        return employeeRepository.save(permanentEmployee);
    }
}
