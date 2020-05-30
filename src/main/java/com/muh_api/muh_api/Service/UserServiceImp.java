package com.muh_api.muh_api.Service;

import com.muh_api.muh_api.DAO.UserDao;
import com.muh_api.muh_api.Entity.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private UserDao userDao;
    private PasswordEncoder passEnco;
    public UserServiceImp(UserDao theUserDao){
         userDao=theUserDao;
         passEnco=new BCryptPasswordEncoder();
    }
    @Override
    @Transactional
    public void save(User theUser) {
        String encryptedPas=passEnco.encode(theUser.getPassword());
        theUser.setPassword(encryptedPas);
  userDao.save(theUser);
    }

    @Override
    @Transactional
    public List<User> findall() {
        return userDao.userlist();
    }

    @Override
    @Transactional
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
