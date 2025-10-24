package com.PetAdoption.API.rest;

import com.PetAdoption.API.dao.Users;
import com.PetAdoption.API.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping
    List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }

    @PostMapping
    Users createUser(@RequestBody Users user){
        return usersService.createUser(user);
    }

    @PutMapping
    Users updateUser(@RequestBody Users user){
        return usersService.updateUser(user);
    }

    @GetMapping("/{id}")
    Optional<Users> getUserById(@PathVariable("id") Long id){
        return usersService.getUserById(id);
    }

    @DeleteMapping("/{id}")
    void deleteUser(@PathVariable("id") Long id){
        usersService.deleteUserById(id);
    }

    @GetMapping("/username/{username}")
    List<Users> findByUsername(@PathVariable("username") String username){
        return usersService.findByUsername(username);
    }

    @GetMapping("/email/{email}")
    List<Users> findByEmail(@PathVariable("email") String email){
        return usersService.findByEmail(email);
    }

    @GetMapping("/phone/{phone}")
    List<Users> findByPhone(@PathVariable("phone") String phone){
        return usersService.findByPhone(phone);
    }

    @GetMapping("/lastName/{lastName}")
    List<Users> findByLastName(@PathVariable("lastName") String lastName){
        return usersService.findByLastName(lastName);
    }

    @GetMapping("/address/{address}")
    List<Users> findByAddress(@PathVariable("address") String address){
        return usersService.findByAddress(address);
    }
}
