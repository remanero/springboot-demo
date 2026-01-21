package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.HelloRequestDTO;
import com.example.demo.model.Hello;
import com.example.demo.service.HelloService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	private final HelloService service;
	
	public HelloController(HelloService service) {
		this.service = service;
	}
	
//	@GetMapping("/hello")
//	public String hello() {
//		return "Spring Boot rodando via branch de feature!";
//	}
	
	@GetMapping
	public List<Hello> listar() {
		return service.listar();
	}
	
//	@PostMapping
//	public Hello salvar(@RequestBody String mensagem) {
//		return service.salvar(mensagem);
//	}
	
	@PostMapping
	public Hello salvar(@RequestBody @Valid HelloRequestDTO dto) {
		return service.salvar(dto.getMensagem());
	}
}
