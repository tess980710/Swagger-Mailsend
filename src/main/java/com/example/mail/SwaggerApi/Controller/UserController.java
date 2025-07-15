package com.example.mail.SwaggerApi.Controller;

import com.example.mail.SwaggerApi.Dto.UserDto;
import com.example.mail.SwaggerApi.Entity.UserEntity;
import com.example.mail.SwaggerApi.Service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
@Tag(name = "회원관리")
public class UserController {

        private final UserService userService;

        @PostMapping
        @Operation(summary = "회원등록")
        public UserEntity create(@RequestBody UserDto dto){
            return userService.createUser(dto);
        }

        @GetMapping
        @Operation(summary = "회원조회")
        public List<UserEntity> getAll(){
            return userService.getAllUsers();
        }


        @PutMapping("/{id}")
        @Operation(summary = "회원 수정")
        public UserEntity update(@PathVariable Long id, @RequestBody UserDto dto){
            return userService.updateUser(id,dto);
        }

        @DeleteMapping("/{id}")
        @Operation(summary = "회원삭제")
        public void delete(@PathVariable Long id){
            userService.deleteUser(id);
        }


}
