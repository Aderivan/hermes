package br.com.apsinformatica.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.apsinformatica.domain.Software;
import br.com.apsinformatica.dao.SoftwareDao;
import br.com.apsinformatica.infra.JSFUtil;

@ManagedBean(name = "MBSoftware")
@ViewScoped
public class SoftwareBean implements Serializable {

    private Software software;
    private List<Software> softwares;
    private List<Software> softwaresPesq;

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software usuario) {
        this.software = usuario;
    }

    public List<Software> getSoftwares() {
        return softwares;
    }

    public void setSoftwares(List<Software> usuarios) {
        this.softwares = usuarios;
    }

    public List<Software> getSoftwaresPesq() {
        return softwaresPesq;
    }

    public void setSoftwaresPesq(List<Software> usuariosPesq) {
        this.softwaresPesq = usuariosPesq;
    }

    @PostConstruct
    public void init() {
        pesquisar();
    }

     public void pesquisar() {
        SoftwareDao softwareDao = new SoftwareDao();
        this.softwares = softwareDao.getListar();
    }

    public void inserir() {
        software = new Software();
    }

    public void gravar() {
        SoftwareDao softwareDao = new SoftwareDao();
        if (software.getSoft_cod() == 0) {
            softwareDao.inserir(software);
        } else {
            softwareDao.atualizar(software);
        }
        pesquisar();
        JSFUtil.addMsgSucesso("Registro atualizado com sucesso!");
    }

    public void executarInativar() {
        SoftwareDao softwareDao = new SoftwareDao();
        //Criar campo para inativar o software
        softwareDao.atualizar(software);
        pesquisar();
        JSFUtil.addMsgSucesso("Registro excluido com sucesso!");
    }

}
