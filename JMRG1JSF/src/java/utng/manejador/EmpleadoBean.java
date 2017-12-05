package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.EmpleadoDAO;
import utng.datos.SalarioDAO;
import utng.modelo.Empleado;
import utng.modelo.Salario;

@ManagedBean
@SessionScoped
public class EmpleadoBean implements Serializable {
    private List<Empleado>empleados;
    private Empleado empleado;
    private List<Salario> salarios;
    public EmpleadoBean(){
        empleado = new Empleado();
        empleado.setSalario(new Salario());
    }

    public List<Salario> getSalarios(){
        return salarios;
    }
    
    public void setSalarios(List<Salario> salarios){
        this.salarios = salarios;
    }
    
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    public String listar(){
        EmpleadoDAO dao = new EmpleadoDAO();
        try {
            empleados=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Empleado";
    }
    
    public String eliminar(){
         EmpleadoDAO dao = new EmpleadoDAO();
        try {
            dao.delete(empleado);
            empleados=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";//no me queda claro si este es es lo que devuelve 
    }
    
    public String iniciar(){
        empleado= new Empleado();
        empleado.setSalario(new Salario());
        try{
            salarios = new SalarioDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Iniciar";
    }
    
    public String guardar(){
        EmpleadoDAO dao = new EmpleadoDAO();
        try {
            if(empleado.getIdEmpleado()!= 0){
                dao.update(empleado);
            }else {
                dao.insert(empleado);
            }
            empleados=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Empleado empleado){
        this.empleado=empleado;
        try{
            salarios = new SalarioDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Editar";
    }
        
}
