package com.amanda.Um.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amanda.Um.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
