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
 * Tabela que verifica se a ocorrência é interna ou visita técnica
 * @author Dan
 */

@Entity
@Table(name = "localizacao")
public class LocalDaOcorrencia implements Serializable{
    
    @Id
    @Column(name = "loc-id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idlocalizacao;
    
    @Column(name = "local")
    private String local;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "localdaocorrencia", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<AberturaDeOcorrencia> ocorrencias;

    public Integer getIdlocalizacao() {
        return idlocalizacao;
    }

    public void setIdlocalizacao(Integer idlocalizacao) {
        this.idlocalizacao = idlocalizacao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public List<AberturaDeOcorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<AberturaDeOcorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }
    
    
}
