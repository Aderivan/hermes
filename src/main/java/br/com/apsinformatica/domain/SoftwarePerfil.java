/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apsinformatica.domain;

import java.io.Serializable;
import java.util.List;
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

@Entity
@Table(name = "software_perfil")
public class SoftwarePerfil implements Serializable {

    @Id
    @Column(name = "idsoftwareperfil")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idsoftwareperfil;
   
    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "idsoftware")
    private Integer idsoftware;
    
    @Inject
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "idsoftwareperfil", referencedColumnName = "soft_cod")
    private Software software;  
    
    @Inject
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "idsoftwareperfil", referencedColumnName = "idsoftwareperfil")
    private List<SoftwarePerfilMod> modulos;

    public Integer getIdsoftwareperfil() {
        return idsoftwareperfil;
    }

    public void setIdsoftwareperfil(Integer idsoftwareperfil) {
        this.idsoftwareperfil = idsoftwareperfil;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getIdsoftware() {
        return idsoftware;
    }

    public void setIdsoftware(Integer idsoftware) {
        this.idsoftware = idsoftware;
    }

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    public List<SoftwarePerfilMod> getModulos() {
        return modulos;
    }

    public void setModulos(List<SoftwarePerfilMod> modulos) {
        this.modulos = modulos;
    }

    
}
