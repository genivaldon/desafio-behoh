package br.com.springboot.service;

import br.com.springboot.model.Evento;
import br.com.springboot.model.Usuario;
import br.com.springboot.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

  @Autowired
  private UsuarioRepository usuarioRepository;

  @Autowired
  private EventoService eventoService;

  public Usuario findById(Integer idUsuario) {
    return usuarioRepository
      .findById(idUsuario)
      .orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
  }

  public Usuario save(Usuario usuario) {
    return this.usuarioRepository.save(usuario);
  }

  public List<Usuario> findAll() {
    return usuarioRepository.findAll();
  }

  public void delete(Integer idUsuario) {
    this.usuarioRepository.deleteById(idUsuario);
  }

  public Usuario adicionarEvento(Integer idUsuario, Integer idEvento) {
    Usuario usuarioAddEvento = findById(idUsuario);
    Evento eventoParaAdicionar = eventoService.findById(idEvento);
    if(eventoParaAdicionar.getQuantVagas() > 0){
      usuarioAddEvento.addEvento(eventoParaAdicionar);
    eventoParaAdicionar.setQuantVagas(eventoParaAdicionar.getQuantVagas() - 1);
    } else {
       throw new RuntimeException ("Não há mais vagas disponíveis.");
    }
    
    return usuarioRepository.save(usuarioAddEvento);
  }

  public Usuario removerEvento(Integer idUsuario, Integer idEvento) {
    Usuario usuarioRemoveEvento = findById(idUsuario);
    Evento eventoParaAdicionar = eventoService.findById(idEvento);
    usuarioRemoveEvento.removeEvento(eventoParaAdicionar);
    eventoParaAdicionar.setQuantVagas(eventoParaAdicionar.getQuantVagas() + 1);
    return usuarioRepository.save(usuarioRemoveEvento);
  }
}
