package com.amanda.Um.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amanda.Um.entities.Produto;
import com.amanda.Um.entities.ProdutoList;

public interface ProdutoListRepository extends JpaRepository<ProdutoList, Long> {

}
