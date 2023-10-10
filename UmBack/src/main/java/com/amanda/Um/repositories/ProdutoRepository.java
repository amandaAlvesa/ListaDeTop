package com.amanda.Um.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.amanda.Um.entities.Produto;
import com.amanda.Um.projections.ProdutoMinProjection;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	@Query(nativeQuery = true, value = """ 
			SELECT tb_produto.id, tb_produto.name, tb_produto.image,tb_produto.description, tb_belonging.position
			FROM tb_produto
			INNER JOIN tb_belonging ON tb_produto.id = tb_belonging.produto_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<ProdutoMinProjection> searchByList(Long listId);
}
