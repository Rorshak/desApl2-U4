/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Salario;

/**
 *
 * @author sarai
 */

public class SalarioDAO extends DAO<Salario> {
     public SalarioDAO() {
        super(new Salario());
    }

    
    public Salario getOneById(Salario salario) throws HibernateException {
        return super.getOneById(salario.getIdSalario()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
