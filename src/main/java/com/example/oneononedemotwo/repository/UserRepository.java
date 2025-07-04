package com.example.oneononedemotwo.repository;

import com.example.oneononedemotwo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
