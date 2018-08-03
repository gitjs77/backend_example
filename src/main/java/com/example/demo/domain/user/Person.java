package com.example.demo.domain.user;

import javax.persistence.*;

/**
 * @Author Jack <e.kobets>
 */

@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String firstName;

    public String secondName;

    public String middleName;
}

