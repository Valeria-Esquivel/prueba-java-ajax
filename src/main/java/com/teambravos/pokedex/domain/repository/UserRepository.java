package com.teambravos.pokedex.domain.repository;

import com.teambravos.pokedex.domain.dto.AuthenticationRequest;
import com.teambravos.pokedex.persistence.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    List<AuthenticationRequest> getAllUser();


}
