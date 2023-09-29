package br.edu.univille.projfab2023_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.univille.projfab2023_2.entity.Produto;

@Repository
public interface ProdutoRepository 
    extends JpaRepository<Produto,Long> {
        
}
