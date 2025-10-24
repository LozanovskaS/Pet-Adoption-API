package com.PetAdoption.API.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Long>{
    List<Image> findByPetId(Long petId);
    List<Image> findByUrl(String url);
}
