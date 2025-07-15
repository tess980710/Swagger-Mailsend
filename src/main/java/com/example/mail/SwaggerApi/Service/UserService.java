package com.example.mail.SwaggerApi.Service;

import com.example.mail.SwaggerApi.Dto.UserDto;
import com.example.mail.SwaggerApi.Entity.UserEntity;
import com.example.mail.SwaggerApi.Repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;

    public UserEntity createUser(UserDto dto){
        UserEntity user = UserEntity.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .build();
        return userRepo.save(user);
    }

    public List<UserEntity> getAllUsers(){
        return userRepo.findAll();
    }

    public UserEntity updateUser(Long id, UserDto dto){
        UserEntity user = userRepo.findById(id).orElseThrow();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        return userRepo.save(user);
    }

    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }
}
