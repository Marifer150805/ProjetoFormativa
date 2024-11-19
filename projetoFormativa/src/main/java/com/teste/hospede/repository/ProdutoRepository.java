package com.teste.hospede.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.hospede.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}