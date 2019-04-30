package br.com.apsinformatica.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sistemas")
public class Setor implements Serializable {

    @Id
    @Column(name = "sis_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer sis_id;

    @Column(name = "sistema")
    private String sistema;

    @Column(name = "sis_status")
    private Integer status;

    @Column(name = "sis_email")
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "setor", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Problema> problemas;

    public Integer getSis_id() {
        return sis_id;
    }

    public void setSis_id(Integer sis_id) {
        this.sis_id = sis_id;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Problema> getProblemas() {
        return problemas;
    }

    public void setProblemas(List<Problema> problemas) {
        this.problemas = problemas;
    }

}
