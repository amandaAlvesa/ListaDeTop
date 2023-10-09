package com.amanda.Um.dto;

import com.amanda.Um.entities.ProdutoList;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor

public class ProdutoListDto {

	private Long id;
	private String name;
	
	public ProdutoListDto(ProdutoList entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}

}

