package com.majesty.userinfo.repository;

import com.majesty.userinfo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
