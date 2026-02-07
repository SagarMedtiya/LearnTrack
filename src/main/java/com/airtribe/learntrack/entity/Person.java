package com.airtribe.learntrack.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Person {
    private  Integer id;
    private String firstName;
    private String lastName;
    private String email;

    public String getDisplayName(){
        return firstName + " " + lastName;
    }
}
