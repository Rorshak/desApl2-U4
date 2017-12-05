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
@Table(name="empleado")
public class Empleado implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_empleado")
    private Long idEmpleado;
    
    @ManyToOne(cascade =CascadeType.REMOVE)
    @JoinColumn(name="id_salario")    
    private Salario salario;
    
    @Column(name="nombre",length=30)
    private String nombre;
    
    @Column(name="apellido",length=30)
    private String apellido;
    
    @Column(name="ocupacion",length=30)
    private String ocupacion;
   
    @Column(name="años_de_experiencia",length=30)
    private String experiencia;

    public Empleado(Long idEmpleado, Salario salario, String nombre, String apellido, String ocupacion, String experiencia) {
        this.idEmpleado = idEmpleado;
        this.salario = salario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ocupacion = ocupacion;
        this.experiencia = experiencia;
    }
    
    
    
    
    public Empleado() {
        this.idEmpleado=0L;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Salario getSalario() {
        return salario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

   
    
    
    
}
