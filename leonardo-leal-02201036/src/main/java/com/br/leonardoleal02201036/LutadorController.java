package com.br.leonardoleal02201036;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {

    @Autowired
    private LutadorRepository repository;

    @PostMapping
    public String postLutador(@RequestBody Lutador novoLutador){
        repository.save(novoLutador);
        return "Lutador cadastrado";
    }

    @GetMapping
    public List<Lutador> getLutadores(@PathVariable Integer id){
        return repository.findAll();
    }
}
