package br.com.alura.loja;

import java.math.BigDecimal;

import org.junit.Assert;

//import static org.junit.Assert.fail;

import org.junit.Test;


public class ProdutoTest {

	@Test
	public void test() {
	
		Produto p = new Produto("teste",BigDecimal.TEN);
		Assert.assertEquals("teste", p.getNome());
		Assert.assertEquals("10", p.getPreco());
		
		
	}
}
