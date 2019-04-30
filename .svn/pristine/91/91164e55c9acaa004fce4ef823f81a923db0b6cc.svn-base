package br.com.apsinformatica.bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.apsinformatica.domain.Instituicao;
import br.com.apsinformatica.dao.InstituicaoDao;
import br.com.apsinformatica.infra.JSFUtil;

@ManagedBean(name = "MBInstituicao")
@ViewScoped
public class InstituicaoBean implements Serializable {

    private Instituicao instituicao;
    private List<Instituicao> instituicoes;
    private List<Instituicao> instituicoesPesq;

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public List<Instituicao> getInstituicoes() {
        return instituicoes;
    }

    public void setInstituicoes(List<Instituicao> instituicoes) {
        this.instituicoes = instituicoes;
    }

    public List<Instituicao> getInstituicoesPesq() {
        return instituicoesPesq;
    }

    public void setInstituicoesPesq(List<Instituicao> instituicoesPesq) {
        this.instituicoesPesq = instituicoesPesq;
    }

    @PostConstruct
    public void init() {
        pesquisar();
    }

     public void pesquisar() {
        InstituicaoDao instituicaoDao = new InstituicaoDao();
        this.instituicoes = instituicaoDao.getListar();
    }

    public void inserir() {
        instituicao = new Instituicao();
    }

    public void gravar() {
        InstituicaoDao instituicaoDao = new InstituicaoDao();
        if (instituicao.getInstcod() == 0) {
            instituicaoDao.inserir(instituicao);
        } else {
            instituicaoDao.atualizar(instituicao);
        }
        pesquisar();
        JSFUtil.addMsgSucesso("Registro atualizado com sucesso!");
    }

    public void executarInativar() {
        InstituicaoDao instituicaoDao = new InstituicaoDao();
        instituicao.setStatusdll("INATIVO");
        instituicao.setInststatus(0);               
        instituicaoDao.atualizar(instituicao);
        pesquisar();
        JSFUtil.addMsgSucesso("Registro excluido com sucesso!");
    }

}
