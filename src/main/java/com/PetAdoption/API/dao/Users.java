package com.PetAdoption.API.dao;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<AdoptionApplication> adoptionApplications;

    private String username;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;


    public Users() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<AdoptionApplication> getAdoptionApplications() {
        return adoptionApplications;
    }

    public void setAdoptionApplications(List<AdoptionApplication> adoptionApplications) {
        this.adoptionApplications = adoptionApplications;
    }


    public Users(Long id, List<AdoptionApplication> adoptionApplications, String username, String email, String firstName, String lastName, String phone, String address) {
        this.id = id;
        this.adoptionApplications = adoptionApplications;
        this.username = username;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
