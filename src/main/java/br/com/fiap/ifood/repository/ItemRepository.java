package br.com.fiap.ifood.repository;

import br.com.fiap.ifood.modelo.Item;
import br.com.fiap.ifood.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
