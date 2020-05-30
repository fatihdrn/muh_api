package com.muh_api.muh_api.Service;

import com.muh_api.muh_api.DAO.TokenDAO;
import com.muh_api.muh_api.Entity.Tokens;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TokenServiceImp implements TokenService {
   @Autowired
   private TokenDAO tokenDAO;

    @Override
    @Transactional
    public void saveToken(Tokens tokens) {
        tokenDAO.saveToken(tokens);
    }

    @Override
    @Transactional
    public Tokens getToken(String token) {

        return tokenDAO.getToken(token);
    }

    @Override
    @Transactional
    public List<Tokens> getTokensTips(int tip) {
        return tokenDAO.getTokensTips(tip);
    }

    @Override
    @Transactional
    public void updateToken(Tokens tokens) {
         tokenDAO.updateToken(tokens);
    }
}
