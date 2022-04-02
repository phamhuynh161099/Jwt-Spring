package com.fpt.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fpt.entity.User;
import com.fpt.repository.UserRepository;
/**
 * Lay cac lop service de thao tac
 * */
@Service
public class UserPrincipalDetailsServcie implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	
	/**
	 * Lay User Sau khi Dang Nhap
	 * */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUsername(username);
		//Truyen tham so user vao principal
		UserPrincipal userPrincipal=new UserPrincipal(user);
		return userPrincipal;
	}
	
}
