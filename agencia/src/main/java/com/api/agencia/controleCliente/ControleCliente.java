package com.api.agencia.controleCliente;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.agencia.ResourceNotFoundException;
import com.api.agencia.cliente.Cliente;
import com.api.agencia.repository.ClienteRepository;



@CrossOrigin(origins = "http://localhost:3000")
	@RestController
	@RequestMapping("/api/")
	public class ControleCliente {
	    
		@Autowired
	    private ClienteRepository clienteRepository;

	    // pegar todos os clientes
		@GetMapping("/cliente")
		public List<Cliente> getAllCliente() {
			return clienteRepository.findAll();
		}
		
		//criar cliente na api
		@PostMapping("/cliente")
		public Cliente createCliente(@RequestBody Cliente cliente) {
			return clienteRepository.save(cliente);
		}

	
	// pega o cliente por id na api
	@GetMapping("/cliente/{id}")
	public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
		Cliente cliente = clienteRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Cliente não existe com esse código :" + id));
		return ResponseEntity.ok(cliente);
	}
	// atualiza o cliente na api
	@PutMapping("/cliente/{id}")
	public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody  Cliente clienteDetails) {
		 Cliente cliente = clienteRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Cliente não existe com esse código :" + id));

		cliente.setNome(clienteDetails.getNome());
		cliente.setCpf(clienteDetails.getCpf());
		cliente.setNascimento(clienteDetails.getNascimento());
		cliente.setTel1(clienteDetails.getTel1());
		cliente.setTel2(clienteDetails.getTel2());
		cliente.setEmail(clienteDetails.getEmail());
		cliente.setCep(clienteDetails.getCep());
		cliente.setRua(clienteDetails.getRua());
		cliente.setNumero(clienteDetails.getNumero());
		cliente.setBairro(clienteDetails.getBairro());
		cliente.setCidade(clienteDetails.getCidade());
		cliente.setCivil(clienteDetails.getCivil());
		cliente.setFilho(clienteDetails.isFilho());
		cliente.setNumFilhos(clienteDetails.getNumFilhos());
		cliente.setEscolaridade(clienteDetails.getEscolaridade());
		cliente.setProfissao(clienteDetails.getProfissao());
		cliente.setPergunta(clienteDetails.getPergunta());
		cliente.setSexo(clienteDetails.getSexo());
		
		 Cliente updatedCliente = clienteRepository.save(cliente);
		return ResponseEntity.ok(updatedCliente);
	}
	
	//exclui cliente na api
	@DeleteMapping("/cliente/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteCliente(@PathVariable Long id) {
		Cliente cliente = clienteRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Cliente não existe com esse código :" + id));

		clienteRepository.delete(cliente);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Cliente foi deletado ", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
