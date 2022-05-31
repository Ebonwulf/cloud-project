package com.nology.cloudproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {

    int deletePokemonByPokemonId(int pokemonId);
}
