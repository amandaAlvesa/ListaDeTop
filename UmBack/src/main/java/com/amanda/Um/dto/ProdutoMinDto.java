package com.amanda.Um.dto;

import com.amanda.Um.entities.Produto;
import com.amanda.Um.projections.ProdutoMinProjection;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProdutoMinDto {

	private Long id;
	private String name;
	private String image;
	private String description;
	
	public ProdutoMinDto(Produto entity) {
		id = entity.getId();
		name = entity.getName();
		image = entity.getImage();
		description = entity.getDescription();		
	}
	
	public ProdutoMinDto(ProdutoMinProjection projection) {
		id = projection.getId();
		name = projection.getName();
		image = projection.getImage();
		description = projection.getDescription();
	}
	
}
