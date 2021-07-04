package io.julioamorim.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private Integer yearOfBirth;
    private Integer monthOfBirth;
    private Integer dayOfBirth;
    private String email;
    private Address address;

    public void updateUserGenerals(User user) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.email = email;
    }

    public void upateUserAddress(Address address) {
        this.address = address;
    }

}