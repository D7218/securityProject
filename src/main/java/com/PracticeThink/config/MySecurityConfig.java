package com.PracticeThink.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
	public class MySecurityConfig {
		  @Bean
           public UserDetailsService userDetailsService(){
			   UserDetails userDetails = User.builder()
					   .username("omkar")
					   .password(passwordEncoder().encode("admin123"))
					   .roles("USER")
					   .build();

			        UserDetails userDetail = User.builder()
					  .username("mohan")
					  .password(passwordEncoder().encode("mohan123"))
					  .roles("USER")
					  .build();

			   return new InMemoryUserDetailsManager(userDetails,userDetail);
		   }
		   @Bean
           public PasswordEncoder passwordEncoder(){
			return new BCryptPasswordEncoder();
			// somthing
	  }
	}
