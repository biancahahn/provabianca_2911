package prova_bianca2911.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import prova_bianca2911.model.Endereco;
import prova_bianca2911.repository.EnderecoRepository;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@GetMapping
	public List<Endereco> listar() {
		return enderecoRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus
	public Endereco adicionar(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}

}
