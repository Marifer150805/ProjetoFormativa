package com.teste.hospede.entities;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.teste.hospede.entities.Produto;

class ProdutoTest {
	
	private Produto produto;
	
	@BeforeEach
	void setUp() {
		//Arrange
		produto = new Produto(1L, "PC", "PC novo", 2.800);
	}

	@Test
	@DisplayName("Testando o getter e setter do campo ID")
	void testId() {
		//Act
		produto.setId(2L);
		assertEquals(2L,produto.getId());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo nome")
	void testNome() {
		//Act
		produto.setNome("PC");
		assertEquals("PC", produto.getNome());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo descricao")
	void testDescricao() {
		//Act
		produto.setDescricao("PC novo");
		assertEquals("PC novo", produto.getDescricao());
	}
	
	@Test
	@DisplayName("Testando o getter e setter do campo preco")
	void testPreco() {
		//Act
		produto.setPreco(2.800);
		assertEquals(2.800, produto.getPreco());
	}
	
	
	@Test
	@DisplayName("Testando o construtor com todos os argumentos")
	void testContrutorAll() {
		
		//Act 
		Produto novoProduto = new Produto(3L, "PC","PC novo", 2.8000);
		//Assention
		assertAll("novoQuarto", 
				()-> assertEquals(3L, novoProduto.getId()),
				()-> assertEquals("PC", novoProduto.getNome()),
				()-> assertEquals("PC novo", novoProduto.getDescricao()),
				()-> assertEquals(2.800, novoProduto.getPreco()));
				
	}
}
