package com.PetAdoption.API.service;

import com.PetAdoption.API.dao.Image;
import com.PetAdoption.API.dao.Pet;
import com.PetAdoption.API.dao.PetRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PetService {

    @Autowired
    private PetRepository petRepository;

    public Pet createPet(Pet pet){
        return petRepository.save(pet);
    }

    public Pet updatePet(Pet pet){
        return  petRepository.save(pet);
    }

    public List<Pet> getAllPets(){
        return petRepository.findAll();
    }

    public Optional<Pet> getPetById(Long id){
        return petRepository.findById(id);
    }

    public void deletePetById(Long id){
        petRepository.deleteById(id);
    }

    public List<Pet> findPetBySpecies(String species){
        return petRepository.findPetBySpecies(species);
    }

    public List<Pet> findPetByBreed(String breed){
        return petRepository.findPetByBreed(breed);
    }

    public List<Pet> findPetByStatus(String status){
        return petRepository.findPetByStatus(status);
    }

    @Transactional
    public Pet savePetWithImages(Pet pet, List<Image> images) {
        for (Image image : images) {
            pet.addImage(image);
        }
        return petRepository.save(pet);
    }
    
}
