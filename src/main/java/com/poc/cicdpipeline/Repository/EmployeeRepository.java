package com.poc.cicdpipeline.Repository;

import com.poc.cicdpipeline.Entity.PermanentEmployee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<PermanentEmployee, Integer> {
}
