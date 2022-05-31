package com.example.demo.repository;

import com.example.demo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

    @Query("SELECT p FROM Pessoa p")
    List<Pessoa> buscarTodos();

    @Query("SELECT p FROM Pessoa p WHERE id = :id ")
    Pessoa findUserById(Long id);
}
