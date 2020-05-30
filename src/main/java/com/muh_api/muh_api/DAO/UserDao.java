package com.muh_api.muh_api.DAO;

import com.muh_api.muh_api.Entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserDao implements UserDaoImp {

    private EntityManager entityManager;
    @Autowired
    public UserDao (EntityManager theentityManager){
        entityManager=theentityManager;
    }

    @Override
    public void save(User user) {
        Session currentSession =entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(user);

    }
    @Override
    public List<User> userlist() {

        Session currentSession=entityManager.unwrap(Session.class);
        Query<User> theQuery=currentSession.createQuery("from User",User.class);



        List<User> user=theQuery.getResultList();
        return user;
    }

    @Override
    public User findByUsername(String user) {
        Session currentSession=entityManager.unwrap(Session.class);
        Query<User> theQuery=currentSession.createQuery("from User u where u.username=: user",User.class);
        theQuery.setParameter("user",user);

        return theQuery.getResultList().get(0);
    }
}
