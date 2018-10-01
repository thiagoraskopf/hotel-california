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
@Table(name = "PESSOA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pessoa.findAll", query = "SELECT p FROM Pessoa p")
    , @NamedQuery(name = "Pessoa.findByPessId", query = "SELECT p FROM Pessoa p WHERE p.pessId = :pessId")
    , @NamedQuery(name = "Pessoa.findByPessNome", query = "SELECT p FROM Pessoa p WHERE p.pessNome = :pessNome")
    , @NamedQuery(name = "Pessoa.findByPessCpf", query = "SELECT p FROM Pessoa p WHERE p.pessCpf = :pessCpf")
    , @NamedQuery(name = "Pessoa.findByPessSenha", query = "SELECT p FROM Pessoa p WHERE p.pessSenha = :pessSenha")
    , @NamedQuery(name = "Pessoa.findByPessFuncionario", query = "SELECT p FROM Pessoa p WHERE p.pessFuncionario = :pessFuncionario")})
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "PESS_ID")
    private Integer pessId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "PESS_NOME")
    private String pessNome;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "PESS_CPF")
    private String pessCpf;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "PESS_SENHA")
    private String pessSenha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PESS_FUNCIONARIO")
    private Character pessFuncionario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hosPessId")
    private Collection<Hospedagem> hospedagemCollection;

    public Pessoa() {
    }

    public Pessoa(Integer pessId) {
        this.pessId = pessId;
    }

    public Pessoa(Integer pessId, String pessNome, String pessCpf, String pessSenha, Character pessFuncionario) {
        this.pessId = pessId;
        this.pessNome = pessNome;
        this.pessCpf = pessCpf;
        this.pessSenha = pessSenha;
        this.pessFuncionario = pessFuncionario;
    }

    public Integer getPessId() {
        return pessId;
    }

    public void setPessId(Integer pessId) {
        this.pessId = pessId;
    }

    public String getPessNome() {
        return pessNome;
    }

    public void setPessNome(String pessNome) {
        this.pessNome = pessNome;
    }

    public String getPessCpf() {
        return pessCpf;
    }

    public void setPessCpf(String pessCpf) {
        this.pessCpf = pessCpf;
    }

    public String getPessSenha() {
        return pessSenha;
    }

    public void setPessSenha(String pessSenha) {
        this.pessSenha = pessSenha;
    }

    public Character getPessFuncionario() {
        return pessFuncionario;
    }

    public void setPessFuncionario(Character pessFuncionario) {
        this.pessFuncionario = pessFuncionario;
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
        hash += (pessId != null ? pessId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.pessId == null && other.pessId != null) || (this.pessId != null && !this.pessId.equals(other.pessId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Pessoa[ pessId=" + pessId + " ]";
    }
    
}
