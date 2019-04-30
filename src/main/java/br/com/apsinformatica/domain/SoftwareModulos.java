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
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table(name = "modimp")
public class SoftwareModulos implements Serializable {
	@Id
	@Column(name="idmodimp")
	@GeneratedValue
	private Integer idmodimp;
        @Column(name="descrimod")
        private String descrimod;
        @Column (name="tipomod")
        private Integer tipomod;
        @Column (name="obsmod")
        private String obsmod;
        
    @Inject
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "idmodimp", referencedColumnName = "idmodulo")
    private List<SoftwarePerfilMod> modulosDoPerfil;

    public SoftwareModulos() {
        obsmod = "";
        tipomod = 1;
        idmodimp = 0;
    }

            
    public Integer getIdmodimp() {
        return idmodimp;
    }

    public void setIdmodimp(Integer idmodimp) {
        this.idmodimp = idmodimp;
    }

    public String getDescrimod() {
        return descrimod;
    }

    public void setDescrimod(String descrimod) {
        this.descrimod = descrimod;
    }

    public Integer getTipomod() {
        return tipomod;
    }

    public void setTipomod(Integer tipomod) {
        this.tipomod = tipomod;
    }

    public String getObsmod() {
        return obsmod;
    }

    public void setObsmod(String obsmod) {
        this.obsmod = obsmod;
    } 

    public List<SoftwarePerfilMod> getModulosDoPerfil() {
        return modulosDoPerfil;
    }

    public void setModulosDoPerfil(List<SoftwarePerfilMod> modulosDoPerfil) {
        this.modulosDoPerfil = modulosDoPerfil;
    }
    
    
    
}
