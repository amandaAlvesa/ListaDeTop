package com.amanda.Um.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.amanda.Um.entities.ProdutoList;

public interface ProdutoListRepository extends JpaRepository<ProdutoList, Long> {
	@Modifying
	@Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND produto_id = :produtoId")
	void updateBelongingPosition(Long listId, Long produtoId, Integer newPosition);
}
                                          