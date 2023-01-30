package com.neri.med.api.medico;

import com.neri.med.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome , String email , String crm , EnumEspecialidade especialidade ,
                                  DadosEndereco dadosEndereco) {


}
