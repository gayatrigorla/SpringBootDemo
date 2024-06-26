package sia.demo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsInterface {
    UserDetails loadUserByUsername(String username) throws
            UsernameNotFoundException;
}
