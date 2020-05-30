package com.muh_api.muh_api.Service;

import com.muh_api.muh_api.Entity.User;

import java.util.List;

public interface UserService {

public void save(User theUser);
public List<User> findall();
User findByUsername(String username);

}
