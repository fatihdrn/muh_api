package com.muh_api.muh_api.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConf extends WebSecurityConfigurerAdapter {

    @Autowired
    UserAuthService userAuthService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.httpBasic().authenticationEntryPoint(new AutEntryPoint());
        http.authorizeRequests().antMatchers(HttpMethod.POST,"/api/auth").authenticated()
                .antMatchers(HttpMethod.POST,"/api/makale").authenticated()
                .antMatchers(HttpMethod.POST,"/api/users").authenticated()
                .antMatchers(HttpMethod.POST,"/api/mevzuat").authenticated()
                .antMatchers(HttpMethod.DELETE,"/api/mevzuat/**").authenticated()
                .antMatchers(HttpMethod.DELETE,"/api/makale/**").authenticated()
                .antMatchers(HttpMethod.POST,"/api/kitap").authenticated()
                .antMatchers(HttpMethod.DELETE,"/api/kitap/**").authenticated()
                .antMatchers(HttpMethod.POST,"/api/vergi").authenticated()
                .antMatchers(HttpMethod.DELETE,"/api/vergi/**").authenticated()

                .and()
                .authorizeRequests().anyRequest().permitAll();
      http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userAuthService).passwordEncoder(passwordEncoder());

    }
    @Bean
    PasswordEncoder passwordEncoder(){
return new BCryptPasswordEncoder();
    }
}
