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
@Table(name="division")
public class Division implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_division")
    private Long idDivision;
    @Column(name="nombre_division", length=10)
    private String nombre;
    @Column(name="categoria",length=40)
    private String categoria;
    
    @Column(name="nivel",length=40)
    private String nivel;
    
    
    public Division(Long idDivision, String nombre, String categoria, String nivel) {
        super();
        this.idDivision = idDivision;
        this.nombre = nombre;
        this.categoria = categoria;
        this.nivel = nivel;
        
    }
    public Division() {
        this.idDivision=0L;
    }
    public Long getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(Long idDivision) {
        this.idDivision = idDivision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
   
    
}
