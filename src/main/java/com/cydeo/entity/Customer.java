package com.cydeo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Customer extends BaseEntity {

    private String firstName;
    private String lastName;
    private String userName;
    private String email;

}
