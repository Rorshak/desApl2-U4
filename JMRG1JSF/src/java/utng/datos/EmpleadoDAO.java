package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Empleado;


public class EmpleadoDAO extends DAO<Empleado> {
     public EmpleadoDAO() {
        super(new Empleado());
    }

    
    public Empleado getOneById(Empleado empleado) throws HibernateException {
        return super.getOneById(empleado.getIdEmpleado()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
