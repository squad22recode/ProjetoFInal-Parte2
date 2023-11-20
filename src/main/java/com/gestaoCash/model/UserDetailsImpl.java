package com.gestaoCash.model;

import java.util.Collection;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.gestaoCash.repositories.UserRepository;


public class UserDetailsImpl implements UserDetails {

    private static final long serialVersionUID = 1L;
	
	private Users users;
    public UserDetailsImpl(Users user) {
        this.users = user;
    }
	
//	public UserDetailsImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
    	String perfil = users.getTipoUsuario().equals("Adm") ?
                "ADMIN" :
                "USER";
     
            return AuthorityUtils.createAuthorityList(perfil);
    	
    }

    @Override
    public String getPassword() {
        return users.getSenha();
    }

    @Override
    public String getUsername() {
        return users.getEmail();
    }
    
    
    public Users getDetailsLog() {
        return users;
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }
    
}
