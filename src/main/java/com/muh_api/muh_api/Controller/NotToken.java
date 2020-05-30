package com.muh_api.muh_api.Controller;

import com.muh_api.muh_api.Entity.Tokens;
import com.muh_api.muh_api.Service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NotToken {

    @Autowired
    private TokenService tokenService;
    @PostMapping("/token")
    @CrossOrigin
    public void saveToken(@RequestBody Tokens tokens){
        tokenService.saveToken(tokens);
    }

    @GetMapping("/token/{token}")
    @CrossOrigin
    public Tokens getToken(@PathVariable String token){

        String tkn="ExponentPushToken["+token+"]";
        System.out.println(tkn);
      return  tokenService.getToken(tkn);
    }

    @GetMapping("/tokenlist/{tip}")
    @CrossOrigin
    public List<Tokens> getToken(@PathVariable int tip){
        return  tokenService.getTokensTips(tip);
    }

    @PutMapping("/token")
    @CrossOrigin
    public void updateToken(@RequestBody Tokens tokens){

        tokenService.updateToken(tokens);
    }



}
