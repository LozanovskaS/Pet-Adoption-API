package com.PetAdoption.API.service;


import com.PetAdoption.API.dao.Users;
import com.PetAdoption.API.dao.UsersRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public Users createUser(Users user){
        return usersRepository.save(user);
    }

    public Users updateUser(Users user){
        return  usersRepository.save(user);
    }

    public List<Users> getAllUsers(){
        return usersRepository.findAll();
    }

    public Optional<Users> getUserById(Long id){
        return usersRepository.findById(id);
    }

    public void deleteUserById(Long id){
        usersRepository.deleteById(id);
    }

    public List<Users> findByUsername(String username){
        return usersRepository.findByUsername(username);
    }

    public List<Users> findByEmail(String email){
        return usersRepository.findByEmail(email);
    }

    public List<Users> findByPhone(String phone){
        return usersRepository.findByPhone(phone);
    }

    public List<Users> findByLastName(String lastName){
        return usersRepository.findByLastName(lastName);
    }

    public List<Users> findByAddress(String address){
        return usersRepository.findByAddress(address);
    }


}
