/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apsinformatica.domain;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Montezuma
 */
@Entity
@Table(name = "sprint")
public class Sprint implements Serializable {

    @Id
    @Column(name = "codsprint")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codsprint;

    @Column(name = "dt_aberto")
    @Temporal(TemporalType.DATE)
    private Date dtaberto;

    @Column(name = "dt_prev")
    @Temporal(TemporalType.DATE)
    private Date dtprev;

    @Column(name = "status_sprint")
    private String status;
    
    /**
     * Campos virtuais
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sprint", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<SprintOcorrencia> ocorrencias;

    public Integer getCodsprint() {
        return codsprint;
    }

    public void setCodsprint(Integer codsprint) {
        this.codsprint = codsprint;
    }

    public Date getDtaberto() {
        return dtaberto;
    }

    public void setDtaberto(Date dtaberto) {
        this.dtaberto = dtaberto;
    }

    public Date getDtprev() {
        return dtprev;
    }

    public void setDtprev(Date dtprev) {
        this.dtprev = dtprev;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<SprintOcorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<SprintOcorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }
    
}
