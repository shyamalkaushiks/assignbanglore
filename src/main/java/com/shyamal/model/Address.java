package com.shyamal.model;

import javax.validation.constraints.NotBlank;

import jakarta.persistence.Embeddable;
import lombok.Data;
@Data
@Embeddable
public class Address {

    @NotBlank
    private String detailedAddress;

    @NotBlank
    private String city;

    @NotBlank
    private String state;

    @NotBlank
    private String pincode;

  
}