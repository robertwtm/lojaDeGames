package org.generation.lojaDeGames.repository;

import java.util.List;
import java.util.Optional;

import org.generation.lojaDeGames.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
}
