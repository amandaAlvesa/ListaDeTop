package com.amanda.Um.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.amanda.Um.dto.ProdutoMinDto;
import com.amanda.Um.entities.Belonging;
import com.amanda.Um.entities.Produto;
import com.amanda.Um.exceptions.ProdutoNotFoundException;
import com.amanda.Um.projections.ProdutoMinProjection;
import com.amanda.Um.repositories.ProdutoRepository;
import com.amanda.Um.response.ResponseModelo;

import jakarta.transaction.Transactional;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ResponseModelo rm;
	
	public List<Produto> pegar(){
		return produtoRepository.findAll();
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
	
	@Transactional
	public List<ProdutoMinDto> findByID(Long listId){
		List<ProdutoMinProjection> result = produtoRepository.searchByList(listId);
		return result.stream().map(x -> new ProdutoMinDto(x)).toList(); 
	}
	
	
	public void salvar(String name, String description, String image, Long listId, Long produtoId, Integer position){
		produtoRepository.salvar(name, description, image, listId, listId, position);
		
		//		List<ProdutoMinDto> result = findByID(listId);
//		
//		Produto pr = new Produto(produto);
//		pr.stream().map(x -> new ProdutoMinDto(x)).toList();
//		
//		result.add((ProdutoMinDto) pr);
//		List<ProdutoMinProjection> result = produtoRepository.searchByList(listId);
//		result.stream().map(x -> new ProdutoMinDto(x)).toList(); 
//
//		Belonging b = new Belonging( result, listId);
//		rm.setMensagem("Produto Criado");
//		return new ResponseEntity<>(rm, HttpStatus.CREATED);
	}
}
