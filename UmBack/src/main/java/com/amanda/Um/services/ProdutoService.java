package com.amanda.Um.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.amanda.Um.entities.Produto;
import com.amanda.Um.repositories.ProdutoRepository;
import com.amanda.Um.response.ResponseModelo;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ResponseModelo rm;
	
	public List<Produto> pegar(){
		return produtoRepository.findAll();
	}
	
	public ResponseEntity<ResponseModelo> salvar(Produto produto){
		produtoRepository.save(produto);
		rm.setMensagem("Produto Criado");
		return new ResponseEntity<>(rm, HttpStatus.CREATED);
	}
	

}
