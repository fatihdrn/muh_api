package com.muh_api.muh_api.DAO;

import com.muh_api.muh_api.Entity.Tokens;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class TokenDAOImp implements TokenDAO{
     @Autowired
    private EntityManager entityManager;

    @Override
    public void saveToken(Tokens tokens) {
        Session currentSession =entityManager.unwrap(Session.class);
        System.out.println(tokens.getId());
        currentSession.saveOrUpdate(tokens);
    }

    @Override
    public Tokens getToken(String token) {
        Session currentSession =entityManager.unwrap(Session.class);
        Query que1=currentSession.createQuery(" from Tokens where token=:token");
        que1.setParameter("token",token);

        List<Tokens> list = que1.list();
        if(list.isEmpty()){
       Tokens tkns=new Tokens();
        tkns.setId(-1);
        tkns.setTip(-1);
        tkns.setToken("a");
        System.out.println("if");
        return tkns;}
        else{
            System.out.println("else");
       return list.get(0);}
    }
    @Override
    public  List<Tokens> getTokensTips(int tip) {
        Session currentSession =entityManager.unwrap(Session.class);
        Query que1=currentSession.createQuery(" from Tokens where tip=:tip");
        que1.setParameter("tip",tip);

        List<Tokens> tacirler = que1.list();

        return tacirler;
    }

    @Override
    public void updateToken(Tokens tokens) {
        Session currentSession =entityManager.unwrap(Session.class);
        System.out.println(tokens.getId());
        currentSession.saveOrUpdate(tokens);
    }

}
