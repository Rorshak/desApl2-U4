package utng.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="salario")
public class Salario implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_salario")
    private Long idSalario;
    @Column(name="nombre_salario", length=10)
    private String nombre;

    public Salario(Long idSalario, String nombre) {
        this.idSalario = idSalario;
        this.nombre = nombre;
        
    }    
    public Salario() {
        this.idSalario=0L;
    }

    public Long getIdSalario() {
        return idSalario;
    }

    public void setIdSalario(Long idSalario) {
        this.idSalario = idSalario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
   
    
}
