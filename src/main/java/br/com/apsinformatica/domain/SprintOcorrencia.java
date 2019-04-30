/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apsinformatica.domain;

import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Montezuma
 */
@Entity
@Table(name = "sprintitens")
public class SprintOcorrencia implements Serializable {

    @Id
    @Column(name = "codsprintns")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codsprintns;

    @Column(name = "codsprin")
    private Integer codsprin;

    @Column(name = "ocorrencia")
    private Integer ocorrencia;

    @Column(name = "cod_user")
    private Integer coduser;

    @Column(name = "status_itens")
    private String status;

    @Column(name = "nivel")
    private Integer nivel;

    @Column(name = "versao")
    private String versao;
    
    
    @Inject
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "codsprint", referencedColumnName = "codsprin")
    private Sprint sprint;

    public Integer getCodsprintns() {
        return codsprintns;
    }

    public void setCodsprintns(Integer codsprintns) {
        this.codsprintns = codsprintns;
    }

    public Integer getCodsprin() {
        return codsprin;
    }

    public void setCodsprin(Integer codsprin) {
        this.codsprin = codsprin;
    }

    public Integer getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Integer ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public Integer getCoduser() {
        return coduser;
    }

    public void setCoduser(Integer coduser) {
        this.coduser = coduser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Sprint getSprint() {
        return sprint;
    }

    public void setSprint(Sprint sprint) {
        this.sprint = sprint;
    }
       
}
