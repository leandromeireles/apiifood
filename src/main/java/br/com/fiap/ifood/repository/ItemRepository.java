package br.com.fiap.ifood.repository;

import br.com.fiap.ifood.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
