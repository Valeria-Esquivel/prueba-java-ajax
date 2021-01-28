package com.teambravos.pokedex.domain;

import com.teambravos.pokedex.domain.repository.PokemonRepositoryI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

public class PokemonI {
    private Integer pokemonId;
    private String name;
    private String type;
    private String abilities;
    private  String specialAbilities;
    private Integer evolution;
    private  String image;

    public Integer getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(Integer pokemonId) {
        this.pokemonId = pokemonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAbilities() {
        return abilities;
    }

    public void setAbilities(String abilities) {
        this.abilities = abilities;
    }

    public String getSpecialAbilities() {
        return specialAbilities;
    }

    public void setSpecialAbilities(String specialAbilities) {
        this.specialAbilities = specialAbilities;
    }

    public Integer getEvolution() {
        return evolution;
    }

    public void setEvolution(Integer evolution) {
        this.evolution = evolution;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}

