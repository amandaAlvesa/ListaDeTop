package com.amanda.Um.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.amanda.Um.dto.ProdutoListDto;
import com.amanda.Um.entities.Produto;
import com.amanda.Um.entities.ProdutoList;
import com.amanda.Um.exceptions.ProdutoNotFoundException;
import com.amanda.Um.repositories.ProdutoListRepository;
import com.amanda.Um.response.ResponseModelo;

@Service
public class ProdutoListService {

	@Autowired
	private ProdutoListRepository produtoListRepository;
	
	@Autowired
	private ResponseModelo rm;
	
	public List<ProdutoListDto> pegar(){
		 List<ProdutoList>result=produtoListRepository.findAll();
		 return result.stream().map(e-> new ProdutoListDto(e)).toList();
	}
	
	public ResponseEntity<ResponseModelo> salvar(ProdutoList produto){
		produtoListRepository.save(produto);
		rm.setMensagem("Produto Criado");
		return new ResponseEntity<>(rm, HttpStatus.CREATED);
	}
	
	public Optional<ProdutoList> getById(Long id){
	  return produtoListRepository.findById(id);
	}
	
	public void update(ProdutoList newProduto, Long id){
		produtoListRepository.findById(id)
			.map(produto -> {
				produto.setName(newProduto.getName());
				rm.setMensagem("Produto ALterado");
				rm.getMensagem();
				return produtoListRepository.save(newProduto);
			}).orElseThrow(() -> new ProdutoNotFoundException(id));
	}
	
	public ResponseEntity<ResponseModelo> deletar(Long id){
		if(!produtoListRepository.existsById(id)) {
			 throw new ProdutoNotFoundException(id);
		}else {
			rm.setMensagem("Produto Deletado");
			 produtoListRepository.deleteById(id);
			 return new ResponseEntity<>(rm, HttpStatus.OK);
		}
	}
	
}
