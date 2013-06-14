package br.com.caelum.mirrorfashion.modelo;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class GeradorProdutosTest {

	@Test
	public void deveSempreGerarTresProdutos() {

		GeradorProdutos geradorProdutos = new GeradorProdutos();

		List<Produto> produtos = geradorProdutos.geraProdutos();
		
		assertEquals(3, produtos.size());
	}
}
