package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.model.Hello;
import com.example.demo.repository.HelloRepository;

@Service
public class HelloService {
	
	private final HelloRepository repository;
	
	public HelloService(HelloRepository repository) {
		this.repository = repository;
	}
	
	public List<Hello> listar() {
		return repository.findAll();
	}
	
	public Hello salvar(String mensagem) {
		return repository.save(new Hello(mensagem));
	}
}
