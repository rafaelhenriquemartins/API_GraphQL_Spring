package com.udemy.compras.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoInput {

    private Long id;
    private String nome;
    private Float valor;
}
