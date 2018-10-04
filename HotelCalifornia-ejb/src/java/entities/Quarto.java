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
@Table(name = "QUARTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quarto.findAll", query = "SELECT q FROM Quarto q")
    , @NamedQuery(name = "Quarto.findByQuaNumero", query = "SELECT q FROM Quarto q WHERE q.quaNumero = :quaNumero")
    , @NamedQuery(name = "Quarto.findByQuaTipo", query = "SELECT q FROM Quarto q WHERE q.quaTipo = :quaTipo")
    , @NamedQuery(name = "Quarto.findByQuaValordiaria", query = "SELECT q FROM Quarto q WHERE q.quaValordiaria = :quaValordiaria")
    , @NamedQuery(name = "Quarto.findByQuaTipocama", query = "SELECT q FROM Quarto q WHERE q.quaTipocama = :quaTipocama")
    , @NamedQuery(name = "Quarto.findByQuaStatus", query = "SELECT q FROM Quarto q WHERE q.quaStatus = :quaStatus")
    , @NamedQuery(name = "Quarto.findByQuaBanheira", query = "SELECT q FROM Quarto q WHERE q.quaBanheira = :quaBanheira")
    , @NamedQuery(name = "Quarto.findByQuaFrigobar", query = "SELECT q FROM Quarto q WHERE q.quaFrigobar = :quaFrigobar")
    , @NamedQuery(name = "Quarto.findByQuaTv", query = "SELECT q FROM Quarto q WHERE q.quaTv = :quaTv")
    , @NamedQuery(name = "Quarto.findByQuaAc", query = "SELECT q FROM Quarto q WHERE q.quaAc = :quaAc")})
//    , @NamedQuery(name = "Quarto.insert", query = "INSERT INTO APP.QUARTO (QUA_NUMERO, QUA_TIPO, QUA_VALORDIARIA, QUA_TIPOCAMA, QUA_STATUS, QUA_BANHEIRA, QUA_FRIGOBAR, QUA_TV, QUA_AC) VALUES (102, 'Premium', 300.0, 'Casal', 'Liberado', 'S', 'S', 'S', 'S')")})

public class Quarto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUA_NUMERO")
    private Integer quaNumero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "QUA_TIPO")
    private String quaTipo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUA_VALORDIARIA")
    private double quaValordiaria;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "QUA_TIPOCAMA")
    private String quaTipocama;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "QUA_STATUS")
    private String quaStatus;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUA_BANHEIRA")
    private Character quaBanheira;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUA_FRIGOBAR")
    private Character quaFrigobar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUA_TV")
    private Character quaTv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUA_AC")
    private Character quaAc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hosQuaId")
    private Collection<Hospedagem> hospedagemCollection;

    public Quarto() {
    }

    public Quarto(Integer quaNumero) {
        this.quaNumero = quaNumero;
    }

    public Quarto(Integer quaNumero, String quaTipo, double quaValordiaria, String quaTipocama, String quaStatus, Character quaBanheira, Character quaFrigobar, Character quaTv, Character quaAc) {
        this.quaNumero = quaNumero;
        this.quaTipo = quaTipo;
        this.quaValordiaria = quaValordiaria;
        this.quaTipocama = quaTipocama;
        this.quaStatus = quaStatus;
        this.quaBanheira = quaBanheira;
        this.quaFrigobar = quaFrigobar;
        this.quaTv = quaTv;
        this.quaAc = quaAc;
    }

    public Integer getQuaNumero() {
        return quaNumero;
    }

    public void setQuaNumero(Integer quaNumero) {
        this.quaNumero = quaNumero;
    }

    public String getQuaTipo() {
        return quaTipo;
    }

    public void setQuaTipo(String quaTipo) {
        this.quaTipo = quaTipo;
    }

    public double getQuaValordiaria() {
        return quaValordiaria;
    }

    public void setQuaValordiaria(double quaValordiaria) {
        this.quaValordiaria = quaValordiaria;
    }

    public String getQuaTipocama() {
        return quaTipocama;
    }

    public void setQuaTipocama(String quaTipocama) {
        this.quaTipocama = quaTipocama;
    }

    public String getQuaStatus() {
        return quaStatus;
    }

    public void setQuaStatus(String quaStatus) {
        this.quaStatus = quaStatus;
    }

    public Character getQuaBanheira() {
        return quaBanheira;
    }

    public void setQuaBanheira(Character quaBanheira) {
        this.quaBanheira = quaBanheira;
    }

    public Character getQuaFrigobar() {
        return quaFrigobar;
    }

    public void setQuaFrigobar(Character quaFrigobar) {
        this.quaFrigobar = quaFrigobar;
    }

    public Character getQuaTv() {
        return quaTv;
    }

    public void setQuaTv(Character quaTv) {
        this.quaTv = quaTv;
    }

    public Character getQuaAc() {
        return quaAc;
    }

    public void setQuaAc(Character quaAc) {
        this.quaAc = quaAc;
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
        hash += (quaNumero != null ? quaNumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quarto)) {
            return false;
        }
        Quarto other = (Quarto) object;
        if ((this.quaNumero == null && other.quaNumero != null) || (this.quaNumero != null && !this.quaNumero.equals(other.quaNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Quarto[ quaNumero=" + quaNumero + " ]";
    }
    
}
