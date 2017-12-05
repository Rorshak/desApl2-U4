package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.DivisionDAO;
import utng.modelo.Division;

@ManagedBean
@SessionScoped
public class DivisionBean implements Serializable {
    private List<Division>divisiones;
    private Division division;
    public DivisionBean(){}

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public List<Division> getDivisiones() {
        return divisiones;
    }

    public void setDivisiones(List<Division> divisiones) {
        this.divisiones = divisiones;
    }
    
    public String listar(){
        DivisionDAO dao = new DivisionDAO();
        try {
            divisiones=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Division";
    }
    
    public String eliminar(){
         DivisionDAO dao = new DivisionDAO();
        try {
            dao.delete(division);
            divisiones=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";//no me queda claro si este es es lo que devuelve 
    }
    
    public String iniciar(){
        division= new Division();
        return "Iniciar";
    }
    
    public String guardar(){
        DivisionDAO dao = new DivisionDAO();
        try {
            if(division.getIdDivision()!= 0){
                dao.update(division);
            }else {
                dao.insert(division);
            }
            divisiones=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Division division){
        this.division=division;
        return "Editar";
    }
        
}
