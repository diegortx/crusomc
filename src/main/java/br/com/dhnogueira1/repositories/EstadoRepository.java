package br.com.dhnogueira1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import br.com.dhnogueira1.domain.Categoria;
import br.com.dhnogueira1.domain.Cidade;
import br.com.dhnogueira1.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
