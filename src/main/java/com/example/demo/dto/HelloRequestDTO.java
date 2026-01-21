package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;

public class HelloRequestDTO {
	@NotBlank(message = "Mensagem é obrigatória")
	private String mensagem;
	
	public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
