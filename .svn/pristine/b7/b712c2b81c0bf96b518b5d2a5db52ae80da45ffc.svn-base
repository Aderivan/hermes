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
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Dan - Web
 */
@Entity
@Table(name="software_perfil_mod")
public class SoftwarePerfilMod implements Serializable{
    @Id
    @Column(name="idsoftwareperfilmod")
    @GeneratedValue
    private Integer idsoftwareperfilmod;
    @Column(name="idsoftwareperfil")
    private Integer idsoftwareperfil;
    @Column(name="idmodulo")
    private Integer idmodulo;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "modulos", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private SoftwarePerfil perfil;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "modulosDoPerfil", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private SoftwareModulos modulo;
    


    public Integer getIdsoftwareperfilmod() {
        return idsoftwareperfilmod;
    }

    public void setIdsoftwareperfilmod(Integer idsoftwareperfilmod) {
        this.idsoftwareperfilmod = idsoftwareperfilmod;
    }

    public Integer getIdsoftwareperfil() {
        return idsoftwareperfil;
    }

    public void setIdsoftwareperfil(Integer idsoftwareperfil) {
        this.idsoftwareperfil = idsoftwareperfil;
    }

    public Integer getIdmodulo() {
        return idmodulo;
    }

    public void setIdmodulo(Integer idmodulo) {
        this.idmodulo = idmodulo;
    }

    public SoftwarePerfil getPerfil() {
        return perfil;
    }

    public void setPerfil(SoftwarePerfil perfil) {
        this.perfil = perfil;
    }

    public SoftwareModulos getModulo() {
        return modulo;
    }

    public void setModulo(SoftwareModulos modulo) {
        this.modulo = modulo;
    }
    
    
}
