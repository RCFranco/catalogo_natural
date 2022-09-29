package com.cesupa.catalogo.domain.plant;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Plant {
    @Id
    private String id;
    @Indexed(unique = true)
    private String name;
    @Indexed(unique = true)
    private String nomeCientifico;
    private String localizacao;
    private String tipo;
    private boolean isComestivel;

    public Plant(String name, String nomeCientifico, String localizacao, String tipo, boolean isComestivel) {
        this.name = name;
        this.nomeCientifico = nomeCientifico;
        this.localizacao = localizacao;
        this.tipo = tipo;
        this.isComestivel = isComestivel;
    }
}
