package com.teambravos.pokedex.persistence;

import com.teambravos.pokedex.domain.repository.PokemonRepositoryI;
import com.teambravos.pokedex.domain.PokemonI;
import com.teambravos.pokedex.persistence.crud.PokemonCrudRepository;
import com.teambravos.pokedex.persistence.entity.Pokemon;
import com.teambravos.pokedex.persistence.mapper.PokemonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PokemonRepository implements PokemonRepositoryI {

    @Autowired
    private PokemonCrudRepository pokemonCrudRepository;
    @Autowired
    private PokemonMapper mapper;


    @Override
    public List<PokemonI> getAll() {
        List<Pokemon> pokemonsList = (List<Pokemon>) pokemonCrudRepository.findAll();
        return mapper.toPokemons(pokemonsList);
    }

    @Override
    public Optional<PokemonI> getPokemon(int pokemonId) {
        return pokemonCrudRepository.findById(pokemonId).map(pokemon -> mapper.toPokemonI(pokemon));
    }

    @Override
    public PokemonI save(PokemonI pokemon) {
        Pokemon pokemonSave = mapper.toPokemon(pokemon);
        return mapper.toPokemonI(pokemonCrudRepository.save(pokemonSave));
    }

    @Override
    public PokemonI update(int pokemonId, PokemonI pokemon) {

        Pokemon pokemonSave = mapper.toPokemon(pokemon);
        return mapper.toPokemonI(pokemonCrudRepository.save(pokemonSave));
    }


    @Override
    public void delete(int pokemonId) {

        pokemonCrudRepository.deleteById(pokemonId);
    }
}
