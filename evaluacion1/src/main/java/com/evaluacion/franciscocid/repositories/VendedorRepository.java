package com.evaluacion.franciscocid.repositories;

import com.evaluacion.franciscocid.models.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository <Vendedor, Long>{
}
