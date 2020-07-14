package com.summerSchool.firstProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.summerSchool.firstProject.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{

}
