package com.api.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.agencia.cliente.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


}
