package com.muh_api.muh_api.configuration;

import com.muh_api.muh_api.Entity.User;
import com.muh_api.muh_api.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserAuthService implements UserDetailsService {
    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User inDb=userService.findByUsername(s);
        if(inDb==null){
            throw new UsernameNotFoundException("user not found");
        }
        return new AdminUser(inDb);
    }
}
