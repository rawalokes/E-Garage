package com.Servicecenter.model;

import javax.persistence.*;

@Entity

public class Bike {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String no;
    private String company;
    private String model;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bike(int id, String no, String company, String model, User user) {
        this.id = id;
        this.no = no;
        this.company = company;
        this.model = model;
        this.user = user;
    }

    public Bike() {
    }
}
