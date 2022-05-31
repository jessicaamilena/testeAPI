package com.example.demo.resource;

import com.example.demo.model.Pessoa;
import com.example.demo.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaResource {

    public PessoaResource(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    PessoaService pessoaService;

    @GetMapping()
    public List<Pessoa> buscarTodos(){
        return pessoaService.buscarTodos();
    }
    @GetMapping("/{id}")
    public Pessoa buscarPorId(@PathVariable Long id){
        return pessoaService.findUserById(id);
    }
    @PostMapping
    public Pessoa criar(@RequestBody Pessoa pessoa){
        return pessoaService.criar(pessoa);
    }
    @PutMapping
    public Pessoa atualizar(@RequestBody Pessoa pessoa){
        return pessoaService.atualizar(pessoa);
    }
    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id){
        pessoaService.remover(id);
    }
}
