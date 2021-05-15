package com.webservice.app.repositories;

import java.io.Serializable;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.webservice.app.entities.Usuario;



@Repository("userRepository")
public interface IUserRepository extends JpaRepository<Usuario, Serializable> {

	
	public abstract Usuario findByUsuario(@Param("usuario") String usuario);
}
