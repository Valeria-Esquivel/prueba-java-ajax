package com.teambravos.pokedex.persistence.crud;

import com.teambravos.pokedex.domain.PokemonI;
import com.teambravos.pokedex.persistence.entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


public interface PokemonCrudRepository extends CrudRepository<Pokemon,Integer>{



}
