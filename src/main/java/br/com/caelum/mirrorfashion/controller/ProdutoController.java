package br.com.caelum.mirrorfashion.controller;

import static br.com.caelum.vraptor.view.Results.json;

import java.util.List;

import br.com.caelum.mirrorfashion.modelo.GeradorProdutos;
import br.com.caelum.mirrorfashion.modelo.Produto;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class ProdutoController {

	@Get("/produtos")
	public void produtos(Result result) {
		
		GeradorProdutos geradorProdutos = new GeradorProdutos();

		List<Produto> produtos = geradorProdutos.geraProdutos();

		result.use(json()).from(produtos, "produtos").serialize();

	}

}