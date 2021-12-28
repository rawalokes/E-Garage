package com.Servicecenter.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
    @Id
    private int id;
    private String username;
    private String password;
}
