package com.example.mail.SwaggerApi.Repository;

import com.example.mail.SwaggerApi.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Long> {
}
