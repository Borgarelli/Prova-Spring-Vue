package br.gov.sp.fatec.projetolabiv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.projetolabiv.entity.Anotacao;

public interface AnotacaoRepository extends JpaRepository<Anotacao, Long>{

    public List<Anotacao> findByTextoContainsIgnoreCase(String texto);
    
}
