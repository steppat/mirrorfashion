package br.com.caelum.mirrorfashion.controller;

import static br.com.caelum.vraptor.view.Results.jsonp;

import java.util.List;

import br.com.caelum.mirrorfashion.modelo.GeradorProdutos;
import br.com.caelum.mirrorfashion.modelo.Produto;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.com.caelum.vraptor.serialization.JSONPSerialization;

@Resource
@RequestScoped
public class ProdutoController {

	@Get("/produtos")
	public void produtos(Result result, String callback) {

		GeradorProdutos geradorProdutos = new GeradorProdutos();

		List<Produto> produtos = geradorProdutos.geraProdutos();

		System.out.println(callback);

		JSONPSerialization serialization = result.use(jsonp());

		serialization.withCallback(callback).from(produtos, "produtos")
				.serialize();

	}

}