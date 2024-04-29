package com.shyamal.model;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String centerName;

    @Pattern(regexp = "[a-zA-Z0-9]{12}")
    private String centerCode;

    @Embedded
    private Address address;

    @NotNull
    @Min(0)
    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    @NotNull
    private Long createdOn; // Epoch time

    @Email
    private String contactEmail;

    @Pattern(regexp = "\\d{10}")
    private String contactPhone;
    
}