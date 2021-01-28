package com.teambravos.pokedex.persistence.entity;

import javax.persistence.*;
/**
 *
 * Pokemon es la entidad principal que usaremos en esta aplicacion
 *
 *
 * @author valeria Esquivel
 * @since   13-01-2021
 */
@Entity
@Table(name = "pokemons")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pokemon")
    private Integer idPokemon;
    private String nombre;
    private String tipo;
    private String habilidades;
    @Column(name="habilidades_especiales")
    private  String habilidadesEspeciales;
    private Integer evolucion;
    private  String imagen;

    public Integer getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(Integer idPokemon) {
        this.idPokemon = idPokemon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getHabilidadesEspeciales() {
        return habilidadesEspeciales;
    }

    public void setHabilidadesEspeciales(String habilidadesEspeciales) {
        this.habilidadesEspeciales = habilidadesEspeciales;
    }

    public Integer getEvolucion() {
        return evolucion;
    }

    public void setEvolucion(Integer evolucion) {
        this.evolucion = evolucion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
