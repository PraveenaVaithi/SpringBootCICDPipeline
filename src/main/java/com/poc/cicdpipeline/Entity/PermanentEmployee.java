package com.poc.cicdpipeline.Entity;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="permanent_employee")
@Getter
@Setter
public class PermanentEmployee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;
    private String employeeName;
    private String location;
}
