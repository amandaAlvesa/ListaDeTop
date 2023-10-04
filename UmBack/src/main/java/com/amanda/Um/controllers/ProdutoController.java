package com.amanda.Um.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amanda.Um.entities.Produto;
import com.amanda.Um.response.ResponseModelo;
import com.amanda.Um.services.ProdutoService;

@RestController
@RequestMapping("/list")
@CrossOrigin("http://localhost:5173/")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping
	public List<Produto> pegarResultados() {
	    return produtoService.pegar();
	}

	@PostMapping
	public ResponseEntity<ResponseModelo> salvar(@RequestBody Produto produto) {
		return produtoService.salvar(produto); 
	}
	
//	@GetMapping("list/{id}")
//	public Respo
	
}
