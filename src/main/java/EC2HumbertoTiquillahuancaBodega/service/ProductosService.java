package EC2HumbertoTiquillahuancaBodega.service;

import java.util.List;

import EC2HumbertoTiquillahuancaBodega.model.Productos;

public interface ProductosService {

	void guardar(Productos productos);
	void actualizar(Productos productos);
	void eliminar(Integer id);
	List<Productos> listar();
	Productos obtener(Integer id);
}
