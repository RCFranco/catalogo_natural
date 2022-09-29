package com.cesupa.catalogo.domain.animal;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Animal {
    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
    @Indexed(unique = true)
    private String nomeCientifico;
    private String localizacao;
    private String dieta;
    private String habitat;
    private String tipo;
    private int tempoVida;

    public Animal(String name, String nomeCientifico, String localizacao, String dieta, String habitat, String tipo, int tempoVida) {
        this.name = name;
        this.nomeCientifico = nomeCientifico;
        this.localizacao = localizacao;
        this.dieta = dieta;
        this.habitat = habitat;
        this.tipo = tipo;
        this.tempoVida = tempoVida;
    }
}
