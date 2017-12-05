package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Puesto;


public class PuestoDAO extends DAO<Puesto> {
     public PuestoDAO() {
        super(new Puesto());
    }

    
    public Puesto getOneById(Puesto puesto) throws HibernateException {
        return super.getOneById(puesto.getIdPuesto()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
