package EC2HumbertoTiquillahuancaBodega.service;

import java.util.List;

import EC2HumbertoTiquillahuancaBodega.model.Cliente;

public interface ClienteService {

	void guardar(Cliente cliente);
	void actualizar(Cliente cliente);
	void eliminar(Integer id);
	List<Cliente> listar();
	Cliente obtener(Integer id);
}
