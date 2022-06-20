package com.evaluacion.franciscocid.services;

import com.evaluacion.franciscocid.models.Vendedor;
import com.evaluacion.franciscocid.repositories.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class VendedorService {
    @Autowired
    VendedorRepository vendedorRepository;

    public void registrarVendedor(@Valid Vendedor vendedor) {
        vendedorRepository.save(vendedor);
    }

    public List<Vendedor> findAll() {
        return  vendedorRepository.findAll();
    }
}
