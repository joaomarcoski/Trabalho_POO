package br.edu.univille.projfab2023_2.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.univille.projfab2023_2.entity.Produto;
import br.edu.univille.projfab2023_2.repository.ProdutoRepository;
import br.edu.univille.projfab2023_2.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

    @Autowired
    private ProdutoRepository repository;

    @Override
    public List<Produto> getAll() {
        return repository.findAll();
    }

    @Override
    public void save(Produto produto) {
        repository.save(produto);
    }

    @Override
    public void delete(Produto produto) {
        repository.delete(produto);
    }
}
