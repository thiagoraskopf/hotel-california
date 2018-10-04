/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessions;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author alan
 */
@Stateless
@LocalBean
public class QuartoSessionBean {

    @PersistenceContext (name = "HotelCalifornia-ejbPU") 
    EntityManager em;  

    public void persist(Object object) {
       em.persist(object);
    }
    
    public List<entities.Quarto> getListaQuartos() {
        Query query = em.createNamedQuery("Quarto.findAll");
        return query.getResultList();
    }
    
    public void cadastrarQuarto () {
        Query query = em.createNativeQuery("INSERT INTO QUARTO (QUA_NUMERO, QUA_TIPO, QUA_VALORDIARIA, QUA_TIPOCAMA, QUA_STATUS, QUA_BANHEIRA, QUA_FRIGOBAR, QUA_TV, QUA_AC) VALUES (103, 'Premium', 300.0, 'Casal', 'Liberado', 'S', 'S', 'S', 'S')");
        query.executeUpdate();
//        em.persist(query);
    }
}
