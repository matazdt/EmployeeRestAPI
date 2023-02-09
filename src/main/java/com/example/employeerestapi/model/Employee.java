package com.example.employeerestapi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Getter
@Setter
@Entity
public class Employee {

    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @NotBlank
    @Column(name= "firstName")
    private String firstName;

//    @NotBlank
    @Column(name= "lastName")
    private String lastName;

    @Column(name= "age")
    private Long age = 0L;

//    @NotBlank
    @Column(name= "department")
    private String department;

//    @NotBlank
    @Column(name= "location")
    private String location;

    @CreationTimestamp
    @Column(name= "created")
    private Date created;

    @UpdateTimestamp
    @Column(name= "updated")
    private Date updated;
}
