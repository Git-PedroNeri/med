package com.neri.med.api.rest;

import com.neri.med.api.endereco.DadosEndereco;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("enderecos")
public class EnderecoController {

    @PostMapping
    public void listar(@RequestBody DadosEndereco endereco) {
        System.out.println(endereco);
    }


}
