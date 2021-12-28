package com.Servicecenter.model;

import javax.persistence.*;

@Entity
public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String phoneNO;
    private String imageUrl;
    private String username;
    private String password;
    @OneToOne
    @JoinColumn(name = "bike_id")
    private Bike bike;

    public String getPhoneNO() {
        return phoneNO;
    }

    public void setPhoneNO(String phoneNO) {
        this.phoneNO = phoneNO;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public Rider(int id, String phoneNO, String imageUrl, String username, String password, Bike bike) {
        this.id = id;
        this.phoneNO = phoneNO;
        this.imageUrl = imageUrl;
        this.username = username;
        this.password = password;
        this.bike = bike;
    }

    public Rider() {
    }
}
