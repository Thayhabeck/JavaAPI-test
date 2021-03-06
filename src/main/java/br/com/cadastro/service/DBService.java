package br.com.cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cadastro.domain.Produto;
import br.com.cadastro.repositories.ProdutoRepository;

@Service
public class DBService {
	
	@Autowired
	private ProdutoRepository repo;
	
	public void inicializarBancoDados() {
		Produto produto = new Produto(null, "Notebook", "K45A", 15, 2599.00);
		repo.save(produto);
	}

}
