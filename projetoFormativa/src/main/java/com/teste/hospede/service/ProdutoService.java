package com.teste.hospede.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.hospede.entities.Produto;
import com.teste.hospede.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository ProdutoRepository;

    public Produto salvarProduto(Produto Produto) {
        return ProdutoRepository.save(Produto);
    }

    public List<Produto> listarTodos() {
        return ProdutoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Long id) {
        return ProdutoRepository.findById(id);
    }

    public Produto atualizarProduto(Produto Produto) {
        if (ProdutoRepository.existsById(Produto.getId())) {
            return ProdutoRepository.save(Produto);
        } else {
            throw new RuntimeException("Hóspede não encontrado");
        }
    }

    public void deletarProduto(Long id) {
        ProdutoRepository.deleteById(id);
    }
}

