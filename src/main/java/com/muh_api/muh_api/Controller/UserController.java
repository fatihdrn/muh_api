package com.muh_api.muh_api.Controller;

import com.muh_api.muh_api.DAO.UserDao;
import com.muh_api.muh_api.Entity.User;
import com.muh_api.muh_api.GenericResponse;
import com.muh_api.muh_api.Service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.net.www.content.text.Generic;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class UserController {

  private UserService userService;
  public UserController(UserService theUserService){
      userService=theUserService;

  }
    @CrossOrigin
    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findall();

    }
    @CrossOrigin
    @PostMapping("/users")
    public void createUser(@RequestBody User theUser){

    userService.save(theUser);



    }
}
