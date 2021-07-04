package io.julioamorim.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String street;
    private Integer number;
    private String zipCode;
}