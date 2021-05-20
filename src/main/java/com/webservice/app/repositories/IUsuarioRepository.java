package com.webservice.app.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.webservice.app.entities.Usuario;

@Repository("usuarioRepository")
public interface IUsuarioRepository extends JpaRepository<Usuario, Serializable> {

	public abstract Usuario findByUsuario(@Param("usuario") String usuario);

	public abstract Usuario findById(@Param("id") int id);
	
	public abstract List<Usuario> findAll();
	
	@Query("SELECT u FROM Usuario u JOIN FETCH u.rol WHERE u.enabled=true")
	public abstract List<Usuario> findByEnabled();

}
