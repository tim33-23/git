/*package com.example.springwebcontent.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
*//*        http
                .csrf().ignoringAntMatchers("/**");*//*
                 *//* .authorizeRequests()
                  .antMatchers("/main").authenticated()
                  .and()
                  .formLogin()
                  .loginPage("/login")
                  .permitAll();*//*
    }
}*/
