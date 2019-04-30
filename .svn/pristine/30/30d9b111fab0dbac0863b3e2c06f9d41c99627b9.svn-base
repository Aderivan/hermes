package br.com.apsinformatica.bean;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.apsinformatica.domain.SoftwarePerfil;
import br.com.apsinformatica.dao.SoftwarePerfilDao;
import br.com.apsinformatica.infra.JSFUtil;

@ManagedBean(name = "MBSoftwarePerfil")
@ViewScoped
public class SoftwarePerfilBean implements Serializable {

    private SoftwarePerfil perfil;
    private List<SoftwarePerfil> perfis;
    private List<SoftwarePerfil> perfilPesq;

    public SoftwarePerfil getPerfil() {
        return perfil;
    }

    public void setPerfil(SoftwarePerfil perfil) {
        this.perfil = perfil;
    }

    public List<SoftwarePerfil> getPerfis() {
        return perfis;
    }

    public void setPerfis(List<SoftwarePerfil> perfis) {
        this.perfis = perfis;
    }

    public List<SoftwarePerfil> getPerfilPesq() {
        return perfilPesq;
    }

    public void setPerfilPesq(List<SoftwarePerfil> perfilPesq) {
        this.perfilPesq = perfilPesq;
    }

   

    @PostConstruct
    public void init() {
        pesquisar();
    }

    public void pesquisar() {
        SoftwarePerfilDao softPerfilDao = new SoftwarePerfilDao();
        this.perfis = softPerfilDao.getListar();
    }

    public void inserir() {
        perfil = new SoftwarePerfil();
    }

    public void gravar() {
        SoftwarePerfilDao softPerfilDao = new SoftwarePerfilDao();
        if (perfil.getIdsoftwareperfil() == 0) {
            softPerfilDao.inserir(perfil);
        } else {
            softPerfilDao.atualizar(perfil);
        }
        pesquisar();
        JSFUtil.addMsgSucesso("Registro atualizado com sucesso!");
    }

    public void executarExcluir() {
        SoftwarePerfilDao softPerfilDao = new SoftwarePerfilDao();
        softPerfilDao.remover(perfil);
        pesquisar();
        JSFUtil.addMsgSucesso("Registro excluido com sucesso!");
    }

}
