package br.com.springboot.controller;

import br.com.springboot.model.Usuario;
import br.com.springboot.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

  @Autowired
  private UsuarioService usuarioService;

  @GetMapping(value = "buscar_por_id/{idUsuario}")
  @ResponseStatus(HttpStatus.OK)
  public Usuario findById(@PathVariable Integer idUsuario) {
    return usuarioService.findById(idUsuario);
  }

  @PostMapping(value = "criarUsuario")
  @ResponseStatus(HttpStatus.CREATED)
  public Usuario save(@RequestBody Usuario usuario) {
    return usuarioService.save(usuario);
  }

  @GetMapping(value = "todos_os_usuarios")
  @ResponseStatus(HttpStatus.OK)
  public List<Usuario> getAllUsuarios() {
    return usuarioService.findAll();
  }

  @DeleteMapping(value = "delete_usuario/{IdUsuario}")
  public void delete(@PathVariable Integer idUsuario) {
    usuarioService.delete(idUsuario);
  }

  @PostMapping(value = "adicionar_evento")
  @ResponseStatus(HttpStatus.CREATED)
  public Usuario adicionarEvento(
    @RequestParam Integer idUsuario,
    @RequestParam Integer idEvento
  ) {
    return usuarioService.adicionarEvento(idUsuario, idEvento);
  }

  @PutMapping(value = "remover_evento")
  @ResponseStatus(HttpStatus.CREATED)
  public Usuario removerEvento(
    @RequestParam Integer idUsuario,
    @RequestParam Integer idEvento
  ) {
    return usuarioService.removerEvento(idUsuario, idEvento);
  }
}
