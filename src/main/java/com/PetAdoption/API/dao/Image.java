package com.PetAdoption.API.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pet_id")
    @JsonIgnore
    private Pet pet;

    private String url;
    private String description;

    public Image(Pet pet, String url, String description) {
        this.pet = pet;
        this.url = url;
        this.description = description;
    }

    public Image() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Image image)) return false;
        return Objects.equals(getId(), image.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", pet=" + pet +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
