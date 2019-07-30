package com.fse.mastertm.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fse.mastertm.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}