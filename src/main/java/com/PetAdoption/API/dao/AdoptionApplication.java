package com.PetAdoption.API.dao;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class AdoptionApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    private String status;


    public AdoptionApplication() {
    }

    public AdoptionApplication(Pet pet, Users user, String status) {
        this.pet = pet;
        this.user = user;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "AdoptionApplication{" +
                "id=" + id +
                ", pet=" + pet +
                ", user=" + user +
                ", status='" + status + '\'' +
                '}';
    }
}
