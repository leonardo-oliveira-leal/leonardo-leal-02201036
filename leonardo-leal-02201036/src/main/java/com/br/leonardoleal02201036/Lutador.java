package com.br.leonardoleal02201036;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lutador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double forca;
    private Double vida;
    private Integer concentracao;

    public Lutador(String nome, Double forca) {
        this.nome = nome;
        this.forca = forca;
    }

}
