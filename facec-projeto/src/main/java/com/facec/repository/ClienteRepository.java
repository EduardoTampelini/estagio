package com.facec.repository;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.facec.model.Cliente;



public interface ClienteRepository extends JpaRepository<Cliente,Long>{

	List<Cliente> findByNomeContaining(String consulta);
	
	
}
