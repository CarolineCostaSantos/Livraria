package br.com.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livraria.modelo.LivrariaTudao;

public interface LivrariaTudaoRepository extends
JpaRepository<LivrariaTudao, Integer>{

}
