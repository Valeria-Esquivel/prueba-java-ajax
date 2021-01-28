package com.teambravos.pokedex.persistence.mapper;

import com.teambravos.pokedex.domain.PokemonI;
import com.teambravos.pokedex.domain.dto.AuthenticationRequest;
import com.teambravos.pokedex.persistence.entity.Pokemon;
import com.teambravos.pokedex.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    @Mappings({
            @Mapping(source = "idUsuario",target = "userId"),
            @Mapping(source = "usuario",target = "username"),
            @Mapping(source = "contraseña",target = "password"),


    })
    AuthenticationRequest toUser(Usuario usuario);


 
    List<AuthenticationRequest> toUsers(List<Usuario> usuarios);

    @InheritInverseConfiguration
    Usuario toUsuario(AuthenticationRequest user);
}
