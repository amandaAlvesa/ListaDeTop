package com.amanda.Um.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.amanda.Um.entities.Produto;
import com.amanda.Um.exceptions.ProdutoNotFoundException;
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
	
	public Optional<Produto> getById(Long id){
	  return produtoRepository.findById(id);
	}
	
	public void update(Produto newProduto, Long id){
		produtoRepository.findById(id)
			.map(produto -> {
				produto.setName(newProduto.getName());
				produto.setDescription(newProduto.getDescription());
				produto.setImage(newProduto.getImage());
				rm.setMensagem("Produto ALterado");
				rm.getMensagem();
				return produtoRepository.save(newProduto);
			}).orElseThrow(() -> new ProdutoNotFoundException(id));
	}
	
	public ResponseEntity<ResponseModelo> deletar(Long id){
		if(!produtoRepository.existsById(id)) {
			 throw new ProdutoNotFoundException(id);
		}else {
			rm.setMensagem("Produto Deletado");
			 produtoRepository.deleteById(id);
			 return new ResponseEntity<>(rm, HttpStatus.OK);
		}
	}
	
}
