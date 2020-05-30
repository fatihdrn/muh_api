package com.muh_api.muh_api.Service;

import com.muh_api.muh_api.Entity.Tokens;

import java.util.List;

public interface TokenService {

    void saveToken(Tokens tokens);
    Tokens getToken(String token);
    List<Tokens> getTokensTips(int tip);
    void updateToken(Tokens tokens);
}
