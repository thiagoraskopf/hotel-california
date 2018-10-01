/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alan
 */
@Stateless
@LocalBean
public class PessoaSessionBean {

    @PersistenceContext (name = "HotelCalifornia-ejbPU") 
    EntityManager em;  

    public void persist(Object object) {
       em.persist(object);
    }
}
