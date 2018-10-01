/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alan
 */
@Entity
@Table(name = "HOSPEDAGEM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hospedagem.findAll", query = "SELECT h FROM Hospedagem h")
    , @NamedQuery(name = "Hospedagem.findByHosId", query = "SELECT h FROM Hospedagem h WHERE h.hosId = :hosId")
    , @NamedQuery(name = "Hospedagem.findByHosCheckin", query = "SELECT h FROM Hospedagem h WHERE h.hosCheckin = :hosCheckin")
    , @NamedQuery(name = "Hospedagem.findByHosCheckout", query = "SELECT h FROM Hospedagem h WHERE h.hosCheckout = :hosCheckout")})
public class Hospedagem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "HOS_ID")
    private Integer hosId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "HOS_CHECKIN")
    @Temporal(TemporalType.DATE)
    private Date hosCheckin;
    @Column(name = "HOS_CHECKOUT")
    @Temporal(TemporalType.DATE)
    private Date hosCheckout;
    @JoinColumn(name = "HOS_PESS_ID", referencedColumnName = "PESS_ID")
    @ManyToOne(optional = false)
    private Pessoa hosPessId;
    @JoinColumn(name = "HOS_QUA_ID", referencedColumnName = "QUA_NUMERO")
    @ManyToOne(optional = false)
    private Quarto hosQuaId;
    @JoinColumn(name = "HOS_SER_ID", referencedColumnName = "SER_ID")
    @ManyToOne(optional = false)
    private Servicos hosSerId;

    public Hospedagem() {
    }

    public Hospedagem(Integer hosId) {
        this.hosId = hosId;
    }

    public Hospedagem(Integer hosId, Date hosCheckin) {
        this.hosId = hosId;
        this.hosCheckin = hosCheckin;
    }

    public Integer getHosId() {
        return hosId;
    }

    public void setHosId(Integer hosId) {
        this.hosId = hosId;
    }

    public Date getHosCheckin() {
        return hosCheckin;
    }

    public void setHosCheckin(Date hosCheckin) {
        this.hosCheckin = hosCheckin;
    }

    public Date getHosCheckout() {
        return hosCheckout;
    }

    public void setHosCheckout(Date hosCheckout) {
        this.hosCheckout = hosCheckout;
    }

    public Pessoa getHosPessId() {
        return hosPessId;
    }

    public void setHosPessId(Pessoa hosPessId) {
        this.hosPessId = hosPessId;
    }

    public Quarto getHosQuaId() {
        return hosQuaId;
    }

    public void setHosQuaId(Quarto hosQuaId) {
        this.hosQuaId = hosQuaId;
    }

    public Servicos getHosSerId() {
        return hosSerId;
    }

    public void setHosSerId(Servicos hosSerId) {
        this.hosSerId = hosSerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hosId != null ? hosId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hospedagem)) {
            return false;
        }
        Hospedagem other = (Hospedagem) object;
        if ((this.hosId == null && other.hosId != null) || (this.hosId != null && !this.hosId.equals(other.hosId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Hospedagem[ hosId=" + hosId + " ]";
    }
    
}
