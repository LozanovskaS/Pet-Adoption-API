package com.PetAdoption.API.service;

import com.PetAdoption.API.dao.Image;
import com.PetAdoption.API.dao.ImageRepository;
import com.PetAdoption.API.dao.Pet;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ImageService {

    @Autowired
    private ImageRepository imageRepository;

    public Image createImage(Image image){
        return imageRepository.save(image);
    }

    public Image updateImage(Image image){
        return imageRepository.save(image);
    }

    public List<Image> getAllImages(){
        return imageRepository.findAll();
    }

    public Optional<Image> getImageById(Long id){
        return imageRepository.findById(id);
    }

    public void deleteImage(Long id){
        imageRepository.deleteById(id);
    }

    public List<Image> findByPetId(Long petId){
        return imageRepository.findByPetId(petId);
    }

    public List<Image> findByUrl(String url){
        return imageRepository.findByUrl(url);
    }

}
