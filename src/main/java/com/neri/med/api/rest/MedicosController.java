package com.neri.med.api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicosController {

    @GetMapping("/listar")
    public String listar() {
    return "medicoslskahfkashkjshfkjhsfh";
    }


}
