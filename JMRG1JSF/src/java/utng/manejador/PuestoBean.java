package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.PuestoDAO;
import utng.datos.DivisionDAO;
import utng.modelo.Puesto;
import utng.modelo.Division;

@ManagedBean
@SessionScoped
public class PuestoBean implements Serializable {
    private List<Puesto>puestos;
    private Puesto puesto;
    private List<Division> divisiones;
    public PuestoBean(){
        puesto = new Puesto();
        puesto.setDivision(new Division());
    }

    public List<Division> getDivisiones(){
        return divisiones;
    }
    
    public void setDivisones(List<Division> divisiones){
        this.divisiones = divisiones;
    }
    
    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public List<Puesto> getPuestos() {
        return puestos;
    }

    public void setPuestos(List<Puesto> puestos) {
        this.puestos = puestos;
    }
    
    public String listar(){
        PuestoDAO dao = new PuestoDAO();
        try {
            puestos=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Puesto";
    }
    
    public String eliminar(){
         PuestoDAO dao = new PuestoDAO();
        try {
            dao.delete(puesto);
            puestos=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";//no me queda claro si este es es lo que devuelve 
    }
    
    public String iniciar(){
        puesto= new Puesto();
        puesto.setDivision(new Division());
        try{
            divisiones = new DivisionDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Iniciar";
    }
    
    public String guardar(){
        PuestoDAO dao = new PuestoDAO();
        try {
            if(puesto.getIdPuesto()!= 0){
                dao.update(puesto);
            }else {
                dao.insert(puesto);
            }
            puestos=dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    
    public String cancelar(){
    return "Cancelar";
    }
    
    public String editar(Puesto puesto){
        this.puesto=puesto;
        try{
            divisiones = new DivisionDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Editar";
    }
        
}
