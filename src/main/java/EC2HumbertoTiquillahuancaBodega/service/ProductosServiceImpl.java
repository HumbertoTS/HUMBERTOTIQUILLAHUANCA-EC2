package EC2HumbertoTiquillahuancaBodega.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EC2HumbertoTiquillahuancaBodega.model.Productos;
import EC2HumbertoTiquillahuancaBodega.repository.ProductosRepository;

@Service
public class ProductosServiceImpl implements ProductosService {

	@Autowired
	private ProductosRepository repositorio;
	
	@Override
	public void guardar(Productos productos) {
		// TODO Auto-generated method stub
		repositorio.save(productos);
	}

	@Override
	public void actualizar(Productos productos) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(productos);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Productos obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
