package com.PetAdoption.API.rest;

import com.PetAdoption.API.dao.Pet;
import com.PetAdoption.API.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("pet")
public class PetController {
    @Autowired
    PetService petService;

    @GetMapping
    List<Pet> getAllPets() {
        return petService.getAllPets();
    }

    @PostMapping
    Pet createPet(@RequestBody Pet pet) {
        return petService.createPet(pet);
    }

    @PutMapping("/{id}")
    Pet updatePet(@PathVariable("id") Long id, @RequestBody Pet pet) {
        return petService.updatePet(pet);
    }

    @GetMapping("/{id}")
    Optional<Pet> getPet(@PathVariable("id") Long id) {
        return petService.getPetById(id);
    }

    @DeleteMapping("/{id}")
    void deletePet(@PathVariable("id") Long id) {
        petService.deletePetById(id);
    }

    @GetMapping("/species/{species}")
    List<Pet> findPetBySpecies(@PathVariable("species") String species) {
        return petService.findPetBySpecies(species);
    }

    @GetMapping("/breed/{breed}")
    List<Pet> findPetByBreed(@PathVariable("breed") String breed) {
        return petService.findPetByBreed(breed);
    }

    @GetMapping("/status/{status}")
    List<Pet> findPetByStatus(@PathVariable("status") String status) {
        return petService.findPetByStatus(status);
    }

}
