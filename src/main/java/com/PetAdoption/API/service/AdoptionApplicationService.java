package com.PetAdoption.API.service;

import com.PetAdoption.API.dao.AdoptionApplication;
import com.PetAdoption.API.dao.AdoptionApplicationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AdoptionApplicationService {

    @Autowired
    private AdoptionApplicationRepository adoptionApplicationRepository;

    public AdoptionApplication createAdoptionApp(AdoptionApplication application){
        return adoptionApplicationRepository.save(application);
    }

    public AdoptionApplication updateAdoptionApp(AdoptionApplication application){
        return adoptionApplicationRepository.save(application);
    }

    public List<AdoptionApplication> getAllAdoptionApps(){
        return adoptionApplicationRepository.findAll();
    }

    public Optional<AdoptionApplication> getAdoptionAppById(Long id){
        return adoptionApplicationRepository.findById(id);
    }

    public void deleteAdoptionApp(Long id){
        adoptionApplicationRepository.deleteById(id);
    }

    public List<AdoptionApplication> findByStatus(String status){
        return adoptionApplicationRepository.findByStatus(status);
    }

    public List<AdoptionApplication> findByPetId(Long petId){
        return adoptionApplicationRepository.findByPetId(petId);
    }
}
