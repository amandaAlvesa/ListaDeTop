package com.amanda.Um.exceptions;

public class ProdutoNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ProdutoNotFoundException(Long id) {
		super("Cadastro Não Encontrdao");
	}
}
