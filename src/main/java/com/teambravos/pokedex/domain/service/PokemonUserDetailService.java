package com.teambravos.pokedex.domain.service;

import com.teambravos.pokedex.domain.dto.AuthenticationRequest;
import com.teambravos.pokedex.domain.repository.PokemonRepositoryI;
import com.teambravos.pokedex.domain.repository.UserRepository;
import com.teambravos.pokedex.persistence.crud.PokemonCrudRepository;
import com.teambravos.pokedex.persistence.crud.UsuarioCrudRepository;
import com.teambravos.pokedex.persistence.entity.Pokemon;
import com.teambravos.pokedex.persistence.entity.Usuario;
import com.teambravos.pokedex.persistence.mapper.PokemonMapper;
import com.teambravos.pokedex.persistence.mapper.UsuarioMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.security.Permission;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PokemonUserDetailService implements UserDetailsService {



    @Autowired
    private UsuarioCrudRepository usuarioCrudRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<Usuario> userDb = usuarioCrudRepository.findByUsuario(username);
        if (userDb.isPresent()) {
            Usuario user = userDb.get();
            return new User(username,"{noop}"+user.getContraseña(), new ArrayList<>());
        }else {
            throw new UsernameNotFoundException("Usuario no encontrado!");
        }






        //return new User("valeria","{noop}pokemos", new ArrayList<>());



    }
}
