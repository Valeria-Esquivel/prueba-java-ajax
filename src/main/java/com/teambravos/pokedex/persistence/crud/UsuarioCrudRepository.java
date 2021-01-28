package com.teambravos.pokedex.persistence.crud;
import com.teambravos.pokedex.persistence.entity.Usuario;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioCrudRepository extends JpaRepository<Usuario,Long> {



        Optional<Usuario> findByUsuario(String usuario);


}
