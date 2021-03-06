package com.hongzhou.auth;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class HotelUserDetailsService implements UserDetailsService {
	
	private final UserRepository userRepository;
	private final AuthGroupRepository authGroupRepository;

	public HotelUserDetailsService(UserRepository userRepository, AuthGroupRepository authGroupRepository) {
		super();
		this.userRepository = userRepository;
		this.authGroupRepository = authGroupRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = this.userRepository.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("cannot find username: " + user.getUsername());
		}
		List<AuthGroup> authGroups = this.authGroupRepository.findByUsername(username);
		return new HotelUserPrincipal(user, authGroups);
	}

}
