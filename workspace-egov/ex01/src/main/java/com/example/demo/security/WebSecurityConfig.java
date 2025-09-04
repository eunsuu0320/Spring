package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationSuccessHandler ash() {
		return new CustomLoginSuccessHandler();
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				(requests) -> requests
				.requestMatchers("/", "/home").permitAll()
				.requestMatchers("/emp/**").hasRole("ADMIN")
				.requestMatchers("/board").hasAnyRole("USER", "ADMIN")
				.anyRequest().authenticated()
				)
				.formLogin((form) -> form.loginPage("/login").permitAll()
				.successHandler(ash())
				)
				.logout((logout) -> logout.permitAll());
				
		http.csrf(csrf -> csrf.disable());
		http.exceptionHandling(ex -> ex.accessDeniedHandler(adh()));

		return http.build();
	}
	
	@Bean
	public AccessDeniedHandler adh() {
		return new CustomAccessDeniedHandler();
	}

	//@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails user = User.withDefaultPasswordEncoder().username("user").password("1234").roles("USER").build();
//		UserDetails admin = User.withDefaultPasswordEncoder().username("admin").password("1234").roles("ADMIN").build();
//
//		return new InMemoryUserDetailsManager(user, admin);
//	}
}
