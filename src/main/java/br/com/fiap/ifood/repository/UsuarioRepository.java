package br.com.fiap.ifood.repository;

import br.com.fiap.ifood.modelo.Restaurante;
import br.com.fiap.ifood.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
