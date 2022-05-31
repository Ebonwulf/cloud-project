package com.nology.cloudproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class PokemonController {
    @Autowired
    PokemonRepository pokemonRepository;

    @GetMapping("/pokemon")
    public String getPokemon() {
        return "getting pokemon";
    }

    @GetMapping("/pokemons")
    public List<Pokemon> getPokemons() {
      return  pokemonRepository.findAll();
    }

    @PostMapping("/pokemon")
    public String addPokemon(@RequestBody Pokemon text) {
        this.pokemonRepository.save(text);
        return "Pokemon saved";

    }

    @DeleteMapping("/pokemon/{pokemonId}")
    @Transactional
    public String deletePokemon(@PathVariable int pokemonId) {
        System.out.println("pokemon = " + pokemonId);
        int deleted = this.pokemonRepository.deletePokemonByPokemonId(pokemonId);
        if (deleted > 0) {
            return "Pokemon removed";
        }
        return "Pokemon Id doesn't exist";
    }

}
