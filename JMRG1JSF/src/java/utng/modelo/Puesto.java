package utng.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="puesto")
public class Puesto implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_puesto")
    private Long idPuesto;
    
    @ManyToOne(cascade =CascadeType.REMOVE)
    @JoinColumn(name="id_division")    
    private Division division;
    
    @Column(name="nombre",length=30)
    private String nombre;
    
    @Column(name="area",length=30)
    private String area;
    
    @Column(name="nivel",length=30)
    private String nivel;
   
    @Column(name="rango",length=30)
    private String rango;
    
    
    
    public Puesto(Long idPuesto, String nombre, String area,Division division, String nivel, String rango) {
        this.idPuesto = idPuesto;
        this.nombre = nombre;
        this.area = area;
        this.division = division;
        this.nivel = nivel;
        this.rango = rango;
        
    }
    public Puesto() {
        this.idPuesto=0L;
    }

    public Long getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(Long idPuesto) {
        this.idPuesto = idPuesto;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }
    
    
    
}
