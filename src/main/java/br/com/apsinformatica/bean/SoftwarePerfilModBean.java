package br.com.apsinformatica.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.apsinformatica.domain.SoftwarePerfilMod;
import br.com.apsinformatica.dao.SoftwarePerfilModDao;
import br.com.apsinformatica.infra.JSFUtil;

@ManagedBean(name = "MBSoftwarePerfilMod")
@ViewScoped
public class SoftwarePerfilModBean implements Serializable {

    private SoftwarePerfilMod softPerfilMod;
    private List<SoftwarePerfilMod> perfilMods;
    private List<SoftwarePerfilMod> perfilModsPesq;

    public SoftwarePerfilMod getSoftPerfilMod() {
        return softPerfilMod;
    }

    public void setSoftPerfilMod(SoftwarePerfilMod softPerfilMod) {
        this.softPerfilMod = softPerfilMod;
    }

    public List<SoftwarePerfilMod> getPerfilMods() {
        return perfilMods;
    }

    public void setPerfilMods(List<SoftwarePerfilMod> perfilMods) {
        this.perfilMods = perfilMods;
    }

    public List<SoftwarePerfilMod> getPerfilModsPesq() {
        return perfilModsPesq;
    }

    public void setPerfilModsPesq(List<SoftwarePerfilMod> perfilModsPesq) {
        this.perfilModsPesq = perfilModsPesq;
    }

    
    
    @PostConstruct
    public void init() {
        pesquisar();
    }

     public void pesquisar() {
        SoftwarePerfilModDao softwarePerfilModDao = new SoftwarePerfilModDao();
        this.perfilMods = softwarePerfilModDao.getListar();
    }

    public void inserir() {
        softPerfilMod = new SoftwarePerfilMod();
    }

    public void gravar() {
        SoftwarePerfilModDao softwarePerfilModDao = new SoftwarePerfilModDao();
        if (softPerfilMod.getIdmodulo()== 0) {
            softwarePerfilModDao.inserir(softPerfilMod);
        } else {
            softwarePerfilModDao.atualizar(softPerfilMod);
        }
        pesquisar();
        JSFUtil.addMsgSucesso("Registro atualizado com sucesso!");
    }

    public void executarExcluir() {
        SoftwarePerfilModDao softwarePerfilModDao = new SoftwarePerfilModDao();
        softwarePerfilModDao.remover(softPerfilMod);
        pesquisar();
        JSFUtil.addMsgSucesso("Registro excluido com sucesso!");
    }

}
