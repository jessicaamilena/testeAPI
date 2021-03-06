package com.example.demo.service;

import com.example.demo.model.Pessoa;
import com.example.demo.repository.PessoaRepository;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> buscarTodos() {
        return pessoaRepository.findAll();
    }

    public Pessoa criar(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public Pessoa atualizar(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public Pessoa findUserById(Long id) {
        return pessoaRepository.findUserById(id);
    }

    public void remover(Long id){
        pessoaRepository.deleteById(id);
    }
}
