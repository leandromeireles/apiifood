package br.com.fiap.ifood.repository;

import java.util.List;

import br.com.fiap.ifood.modelo.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {



}
