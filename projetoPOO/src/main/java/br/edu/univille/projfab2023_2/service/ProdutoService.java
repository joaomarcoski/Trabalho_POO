package br.edu.univille.projfab2023_2.service;

import java.util.List;

import br.edu.univille.projfab2023_2.entity.Produto;

public interface ProdutoService {
    List<Produto> getAll();

    void save(Produto produto);
}
