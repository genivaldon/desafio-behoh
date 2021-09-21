package br.com.springboot.model;

//import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Evento {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String nome;
  private Integer quantVagas;

  //private LocalDateTime dataEvento;

  @ManyToMany
  private Set<Usuario> usuarios = new HashSet<>();

  public Evento(Integer id, String nome, Integer quantVagas) {
    this.id = id;
    this.nome = nome;
    this.quantVagas = quantVagas;
    //this.dataEvento = dataEvento;
  }

  public Evento() {}

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getQuantVagas() {
    return quantVagas;
  }

  public void setQuantVagas(Integer quantVagas) {
    this.quantVagas = quantVagas;
  }

  public void addUsuario(Usuario usuario) {
    this.usuarios.add(usuario);
  }

  public void removeUsuario(Usuario usuario) {
    this.usuarios.remove(usuario);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Evento other = (Evento) obj;
    if (id == null) {
      if (other.id != null) return false;
    } else if (!id.equals(other.id)) return false;
    return true;
  }
}
