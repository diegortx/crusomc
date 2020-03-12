package br.com.dhnogueira1.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dhnogueira1.domain.Categoria;
import br.com.dhnogueira1.repositories.CategoriaRepository;
import br.com.dhnogueira1.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado ! Id: " + id + ", Tipoe: " + Categoria.class.getName()));
		
	}
}
