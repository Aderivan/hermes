/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Dan
 */
@Entity
@Table(name = "sistemas")
public class Sistemas implements Serializable{
    
    @Id
    @Column(name = "sis_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idsistema;
    
    @Column(name = "sis_status")
    private Integer status;
    
    @Column(name = "sis_email")
    private String email;
    
    @Column(name = "sis_atende")
    private String sis_atende;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "sistema", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<AberturaDeOcorrencia> ocorrencias;

    public Integer getIdsistema() {
        return idsistema;
    }

    public void setIdsistema(Integer idsistema) {
        this.idsistema = idsistema;
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

    public String getSis_atende() {
        return sis_atende;
    }

    public void setSis_atende(String sis_atende) {
        this.sis_atende = sis_atende;
    }

    public List<AberturaDeOcorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<AberturaDeOcorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }
    
    
    
    
}
