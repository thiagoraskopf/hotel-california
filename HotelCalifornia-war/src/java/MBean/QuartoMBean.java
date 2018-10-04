package MBean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entities.Quarto;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import sessions.QuartoSessionBean;

/**
 *
 * @author alan
 */
@Named(value = "quartoMBean")
@RequestScoped
public class QuartoMBean {
    
    public QuartoMBean() {
    }
    
    @EJB
    private QuartoSessionBean quartoSessionBean;

    public List<Quarto> getListaQuartos() {
        return quartoSessionBean.getListaQuartos();
    }
    
    public void cadastrarQuarto() {
       quartoSessionBean.cadastrarQuarto();   
    }
}
