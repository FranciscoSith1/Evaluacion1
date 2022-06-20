package com.evaluacion.franciscocid.controllers;

import com.evaluacion.franciscocid.models.Vendedor;
import com.evaluacion.franciscocid.services.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller

public class VendedorController {

    @Autowired
    VendedorService vendedorService;

    @RequestMapping("/vendedor")
    public String inicio(@ModelAttribute("vendedor") Vendedor vendedor) {
        return "Registro.jsp";
    }

    @PostMapping("/registrar")
    public String guardarAuto(@Valid @ModelAttribute("vendedor") Vendedor vendedor,
                              BindingResult resultado,
                              Model model) {
        if (resultado.hasErrors()) { //capturando si existe un error en el ingreso de datos desde el JSP
            model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
            return "index.jsp";
        } else {
            vendedorService.registrarVendedor(vendedor);

            List<Vendedor> listaAsistencia = vendedorService.findAll();

            model.addAttribute("asistencias", listaAsistencia);
            return "vendedor.jsp";
        }
    }
    @RequestMapping("/Asistencia")
    public String mostrar(Model model) {
        List<Vendedor> listaAsistencia = vendedorService.findAll();

        model.addAttribute("asistencias", listaAsistencia);
        return "vendedor.jsp";

    }
}
