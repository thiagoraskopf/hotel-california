/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author alan
 */
@Entity
@Table(name = "SERVICOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicos.findAll", query = "SELECT s FROM Servicos s")
    , @NamedQuery(name = "Servicos.findBySerId", query = "SELECT s FROM Servicos s WHERE s.serId = :serId")
    , @NamedQuery(name = "Servicos.findBySerTipo", query = "SELECT s FROM Servicos s WHERE s.serTipo = :serTipo")
    , @NamedQuery(name = "Servicos.findBySerNome", query = "SELECT s FROM Servicos s WHERE s.serNome = :serNome")
    , @NamedQuery(name = "Servicos.findBySerValor", query = "SELECT s FROM Servicos s WHERE s.serValor = :serValor")})
public class Servicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SER_ID")
    private Integer serId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "SER_TIPO")
    private String serTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "SER_NOME")
    private String serNome;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SER_VALOR")
    private double serValor;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hosSerId")
    private Collection<Hospedagem> hospedagemCollection;

    public Servicos() {
    }

    public Servicos(Integer serId) {
        this.serId = serId;
    }

    public Servicos(Integer serId, String serTipo, String serNome, double serValor) {
        this.serId = serId;
        this.serTipo = serTipo;
        this.serNome = serNome;
        this.serValor = serValor;
    }

    public Integer getSerId() {
        return serId;
    }

    public void setSerId(Integer serId) {
        this.serId = serId;
    }

    public String getSerTipo() {
        return serTipo;
    }

    public void setSerTipo(String serTipo) {
        this.serTipo = serTipo;
    }

    public String getSerNome() {
        return serNome;
    }

    public void setSerNome(String serNome) {
        this.serNome = serNome;
    }

    public double getSerValor() {
        return serValor;
    }

    public void setSerValor(double serValor) {
        this.serValor = serValor;
    }

    @XmlTransient
    public Collection<Hospedagem> getHospedagemCollection() {
        return hospedagemCollection;
    }

    public void setHospedagemCollection(Collection<Hospedagem> hospedagemCollection) {
        this.hospedagemCollection = hospedagemCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serId != null ? serId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicos)) {
            return false;
        }
        Servicos other = (Servicos) object;
        if ((this.serId == null && other.serId != null) || (this.serId != null && !this.serId.equals(other.serId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Servicos[ serId=" + serId + " ]";
    }
    
}
