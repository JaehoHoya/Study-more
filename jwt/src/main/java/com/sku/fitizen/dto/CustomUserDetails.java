package com.sku.fitizen.dto;

import com.sku.fitizen.entity.FitizenUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetails  implements UserDetails {

    private final FitizenUser user;

    public CustomUserDetails(FitizenUser user) {
        this.user = user;
    }




    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        List<GrantedAuthority> collection = new ArrayList<>();

        collection.add(new GrantedAuthority() {
            @Override
            public String getAuthority() {
                return user.getUserRole();
            }
        });
        return collection;
    }

    @Override
    public String getPassword() {
        return user.getUserPwd();
    }

    @Override
    public String getUsername() {
        return user.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {

        return true;
    }
}

