package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
