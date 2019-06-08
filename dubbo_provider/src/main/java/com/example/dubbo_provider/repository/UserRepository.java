package com.example.dubbo_provider.repository;

import com.example.dubbo_provider.mode.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
