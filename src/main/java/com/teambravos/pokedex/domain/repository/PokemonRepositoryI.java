package com.teambravos.pokedex.domain.repository;

import com.teambravos.pokedex.domain.PokemonI;
import com.teambravos.pokedex.persistence.entity.Usuario;

import java.util.List;
import java.util.Optional;

public interface PokemonRepositoryI {
    List<PokemonI> getAll();
    Optional<PokemonI> getPokemon(int pokemonId);
    PokemonI save (PokemonI pokemon);
    PokemonI update (int pokemonId, PokemonI pokemon);
    void delete(int pokemonId);

}
