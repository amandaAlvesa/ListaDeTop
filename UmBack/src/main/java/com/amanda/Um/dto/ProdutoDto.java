package com.amanda.Um.dto;

import org.springframework.beans.BeanUtils;

import com.amanda.Um.entities.Produto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProdutoDto {
	
	private Long id;	
	private String name;
	private String description;
	private String image;
	private Integer position;
	
	public ProdutoDto(Produto entity) {
		BeanUtils.copyProperties(entity, this);
	}
}
