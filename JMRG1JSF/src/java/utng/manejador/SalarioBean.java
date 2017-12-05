package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.SalarioDAO;
import utng.modelo.Salario;

@ManagedBean
@SessionScoped
public class SalarioBean implements Serializable {
    private List<Salario>salarios;
    private Salario salario;
    public SalarioBean(){}

    public Salario getSalario() {
        return salario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }

    public List<Salario> getSalarios() {
        return salarios;
    }

    public void setSalarios(List<Salario> salarios) {
        this.salarios = salarios;
    }
    
    public String listar(){
        SalarioDAO dao = new SalarioDAO();
        try {
            salarios=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Salario";
    }
    
    public String eliminar(){
         SalarioDAO dao = new SalarioDAO();
        try {
            dao.delete(salario);
            salarios=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";//no me queda claro si este es es lo que devuelve 
    }
    
    public String iniciar(){
        salario= new Salario();
        return "Iniciar";
    }
    
    public String guardar(){
        SalarioDAO dao = new SalarioDAO();
        try {
            if(salario.getIdSalario()!= 0){
                dao.update(salario);
            }else {
                dao.insert(salario);
            }
            salarios=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Salario salario){
        this.salario=salario;
        return "Editar";
    }
        
}
