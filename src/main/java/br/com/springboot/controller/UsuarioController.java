package br.com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.model.Usuario;
import br.com.springboot.service.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService serviceU;

    @GetMapping(value = "buscar_por_id/{idUsuario}")
    @ResponseStatus(HttpStatus.OK)
    public Usuario findById(@PathVariable Integer idUsuario) {
        return serviceU.findById(idUsuario);
    }

    @PostMapping(value = "criarUsuario")
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario save(@RequestBody Usuario usuario) {
        return serviceU.save(usuario);
    }

    @PostMapping(value = "todos_os_usuarios")
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> getAllUsuarios() {
        return serviceU.findAll();
    }

    @DeleteMapping(value = "delete_usuario/{IdUsuario}")
    public void delete(@PathVariable Integer idUsuario) {
        serviceU.delete(idUsuario);
    }

}
