package com.PetAdoption.API.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long> {
    List<Users> findByUsername(String username);
    List<Users> findByEmail(String email);
    List<Users> findByPhone(String phone);
    List<Users> findByLastName(String lastName);
    List<Users> findByAddress(String address);
}
