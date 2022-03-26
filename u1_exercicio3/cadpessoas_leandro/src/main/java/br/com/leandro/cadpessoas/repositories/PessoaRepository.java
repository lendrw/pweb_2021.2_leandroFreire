package br.com.leandro.cadpessoas.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class PessoaRepository extends JpaRepository<Pessoa, Long>{
    
}
