package EC2HumbertoTiquillahuancaBodega.security;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import EC2HumbertoTiquillahuancaBodega.model.Usuario;
import EC2HumbertoTiquillahuancaBodega.repository.UsuarioRepository;

@Service
public class UserDetailService implements UserDetailsService {

	
	
	public Usuario usuario;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		if( "empleado".equals(username)||"admin".equals(username)) {
			return new User("empleado","123456", new ArrayList<>());
		}else {
			throw new UsernameNotFoundException("Usuario no existe " + username);
		}
	}

}

