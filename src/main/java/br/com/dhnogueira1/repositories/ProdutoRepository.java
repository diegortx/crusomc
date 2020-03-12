package br.com.dhnogueira1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import br.com.dhnogueira1.domain.Categoria;
import br.com.dhnogueira1.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
