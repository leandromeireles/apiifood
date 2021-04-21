package br.com.fiap.ifood.repository;

import br.com.fiap.ifood.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
