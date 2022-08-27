package com.example.springtelegrammbot.model;


import lombok.Data;
import org.glassfish.grizzly.http.util.TimeStamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity(name = "userDataTable")
public class User {

    @Id
    private Long chatID;

    private String firstName;

    private String lastName;

    private String userName;

    private TimeStamp registration;


}
