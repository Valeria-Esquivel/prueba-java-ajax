package com.teambravos.pokedex.persistence.mapper;


import com.teambravos.pokedex.domain.PokemonI;
import com.teambravos.pokedex.persistence.entity.Pokemon;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PokemonMapper {

    @Mappings({
            @Mapping(source = "idPokemon",target = "pokemonId"),
            @Mapping(source = "nombre",target = "name"),
            @Mapping(source = "tipo",target = "type"),
            @Mapping(source = "habilidades",target = "abilities"),
            @Mapping(source = "habilidadesEspeciales",target = "specialAbilities"),
            @Mapping(source = "evolucion",target = "evolution"),
            @Mapping(source = "imagen",target = "image"),





    })
    PokemonI toPokemonI(Pokemon pokemon);

    List<PokemonI> toPokemons(List<Pokemon> pokemones);

    @InheritInverseConfiguration
    Pokemon toPokemon(PokemonI pokemon);



}
