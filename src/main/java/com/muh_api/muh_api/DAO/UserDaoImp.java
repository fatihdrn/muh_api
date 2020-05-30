package com.muh_api.muh_api.DAO;

import com.muh_api.muh_api.Entity.User;

import java.util.List;

public interface UserDaoImp {
public void save(User user);

public List<User> userlist();
   User findByUsername(String user);
}
