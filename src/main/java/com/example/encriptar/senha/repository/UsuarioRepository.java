package com.example.encriptar.senha.repository;

import com.example.encriptar.senha.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel,Integer> {

    public Optional<UsuarioModel> findByLogin(String login);
}
