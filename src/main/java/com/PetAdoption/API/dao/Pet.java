package com.PetAdoption.API.dao;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String species;
    private String breed;
    private int age;
    private String gender;
    private String description;
    private String status;


    @OneToMany
    private List<AdoptionApplication> adoptionApplications;

    @OneToMany(mappedBy = "pet", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Image> images = new ArrayList<>();

    @OneToMany
    private List<Comment> comments;

    public Pet() {
    }

    public void addImage(Image image) {
        images.add(image);
        image.setPet(this);
    }

    public void removeImage(Image image) {
        images.remove(image);
        image.setPet(null);
    }

    public Pet(String name, String species, String breed, int age, String gender, String description, String status) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.gender = gender;
        this.description = description;
        this.status = status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public List<Image> getImages() {
        return images;
    }
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
