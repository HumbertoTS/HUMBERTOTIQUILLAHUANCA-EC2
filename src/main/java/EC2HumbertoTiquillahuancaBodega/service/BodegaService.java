package EC2HumbertoTiquillahuancaBodega.service;

import java.util.List;

import EC2HumbertoTiquillahuancaBodega.model.Bodega;


public interface BodegaService {

	void guardar(Bodega bodega);
	void actualizar(Bodega bodega);
	void eliminar(Integer id);
	List<Bodega> listar();
	Bodega obtener(Integer id);
}
