package br.com.slurpuff.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.slurpuff.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
    
}

