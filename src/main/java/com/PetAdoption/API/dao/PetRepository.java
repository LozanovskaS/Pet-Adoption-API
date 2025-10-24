package com.PetAdoption.API.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PetRepository extends JpaRepository<Pet, Long> {
    List<Pet> findPetBySpecies(String species);
    List<Pet> findPetByBreed(String breed);
    List<Pet> findPetByStatus(String status);

    @Query("SELECT p FROM Pet p LEFT JOIN FETCH p.images WHERE p.id = :id")
    Optional<Pet> findByIdWithImages(@Param("id") Long id);
}
