package br.com.fiap.ifood.repository;

import br.com.fiap.ifood.domain.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

	Restaurante findByNome(String nome);

}
