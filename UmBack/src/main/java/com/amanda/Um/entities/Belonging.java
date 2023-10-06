package com.amanda.Um.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of="id")
@Entity
@Table(name="tb_belonging")
public class Belonging {
	
	@EmbeddedId
	private BelongingPk id = new BelongingPk();
	
	private Integer position;
	
	public Belonging(Produto produto, ProdutoList list, Integer position) {
		id.setList(list);
		id.setProduto(produto);
		this.position = position;
	}
}
