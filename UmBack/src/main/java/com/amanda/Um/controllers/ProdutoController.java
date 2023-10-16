package com.amanda.Um.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amanda.Um.dto.ProdutoMinDto;
import com.amanda.Um.dto.ReplacementDto;
import com.amanda.Um.entities.Produto;
import com.amanda.Um.entities.ProdutoList;
import com.amanda.Um.exceptions.ProdutoNotFoundException;
import com.amanda.Um.repositories.ProdutoListRepository;
import com.amanda.Um.repositories.ProdutoRepository;
import com.amanda.Um.response.ResponseModelo;
import com.amanda.Um.services.ProdutoListService;
import com.amanda.Um.services.ProdutoService;

@RestController
@RequestMapping("/list")
@CrossOrigin("http://localhost:5173/")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private ProdutoListService produtoListService;
	
	@GetMapping
	List<Produto> pegarResultados() {
	    return produtoService.pegar();
	}

	@PostMapping("/add")
	void salvar(@RequestBody String name,@RequestBody String description,@RequestBody String image,@RequestBody Long listId,@RequestBody Long produtoId,@RequestBody Integer position) {
	 produtoService.salvar(name, description, image, listId, produtoId, position); 
	}
	
	@GetMapping("/{id}")
	Produto getroduto(@PathVariable Long id) {
		return produtoService.getById(id).orElseThrow(() -> new ProdutoNotFoundException(id));
	} 
	
	@PutMapping("/{id}")
	void update(@RequestBody Produto newProduto,@PathVariable Long id) {
		produtoService.update(newProduto, id);
	}
	
	@DeleteMapping("/{id}")
	ResponseEntity<ResponseModelo> deletar(@PathVariable Long id){
		return produtoService.deletar(id);
	}
	
	@GetMapping("/{listId}/produtos")
	public List<ProdutoMinDto> findByList(@PathVariable Long listId){
		
		List<ProdutoMinDto> result = produtoService.findByID(listId);
		return result;
	}
	
	@PostMapping("/{listId}/replacement")
	public void move (@PathVariable Long listId, @RequestBody ReplacementDto body) {
		produtoListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
	}
}
