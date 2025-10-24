package com.PetAdoption.API.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdoptionApplicationRepository extends JpaRepository<AdoptionApplication, Long> {
    List<AdoptionApplication> findByStatus(String status);
    List<AdoptionApplication> findByPetId(Long petId);
}
