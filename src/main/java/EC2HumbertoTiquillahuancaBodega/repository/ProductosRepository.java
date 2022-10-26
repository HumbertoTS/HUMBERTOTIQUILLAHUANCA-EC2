package EC2HumbertoTiquillahuancaBodega.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import EC2HumbertoTiquillahuancaBodega.model.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer>{

}
