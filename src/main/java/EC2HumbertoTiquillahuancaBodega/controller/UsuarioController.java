package EC2HumbertoTiquillahuancaBodega.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import EC2HumbertoTiquillahuancaBodega.dto.UsuarioDTORequest;
import EC2HumbertoTiquillahuancaBodega.dto.UsuarioDTOResponse;
import EC2HumbertoTiquillahuancaBodega.security.TokenUtil;
import EC2HumbertoTiquillahuancaBodega.security.UserDetailService;


@RestController
public class UsuarioController {
	
	@Autowired
	private TokenUtil util;
	
	@Autowired
	private UserDetailService service;
	
	@RequestMapping(path = "/crearToken",method = RequestMethod.POST)
	public ResponseEntity<?> crearToken(@RequestBody UsuarioDTORequest request){
		
		UserDetails user =service.loadUserByUsername(request.getUsuario());
		if(user.getPassword().equals(request.getPassword()))
			return ResponseEntity.ok(new UsuarioDTOResponse(util.generateToken(user.getUsername())));
		else
			throw new UsernameNotFoundException("Contraseña invalidad");
	}
}
