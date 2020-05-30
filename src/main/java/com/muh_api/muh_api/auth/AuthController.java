package com.muh_api.muh_api.auth;

import com.muh_api.muh_api.ApiError;
import com.muh_api.muh_api.Entity.User;
import com.muh_api.muh_api.Service.UserService;
import com.muh_api.muh_api.configuration.AdminUser;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;


@RestController
public class AuthController {

    private UserService userService;
    public AuthController(UserService theuserService){
        userService=theuserService;
    }

    @CrossOrigin
    @PostMapping("/api/auth")
    ResponseEntity<?> handleAuthentication(@RequestHeader(name="Authorization") String authorization){

        AdminUser adminUser= (AdminUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();




        return ResponseEntity.ok(adminUser.getUser());

        }
}
