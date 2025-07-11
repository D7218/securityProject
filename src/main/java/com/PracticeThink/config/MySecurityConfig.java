package com.PracticeThink.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
	public class MySecurityConfig {

		@Bean
		public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
			http
					.authorizeHttpRequests(auth -> auth // simple use the lambda syntax to provide rule configuration
							.anyRequest().authenticated() //this means http request must be authenticated
					)
					.httpBasic(); // popup show the browser to enter username and password

			return http.build(); // returns it as a spring bean
		}

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

			   return new InMemoryUserDetailsManager(userDetails,userDetail); // it will use bean to authenticate incoming request
		   }
		   @Bean
           public PasswordEncoder passwordEncoder(){ // simple find the ecoder
			return new BCryptPasswordEncoder();
	  }
	}
