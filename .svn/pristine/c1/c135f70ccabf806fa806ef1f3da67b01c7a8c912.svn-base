package br.com.apsinformatica.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.apsinformatica.domain.AberturaDeOcorrencia;
import br.com.apsinformatica.dao.AberturaDeOcorrenciaDao;
import br.com.apsinformatica.infra.JSFUtil;
import java.util.List;
import javax.annotation.PostConstruct;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dan
 */
@ManagedBean(name = "MBOcorrencia")
@ViewScoped
public class AberturaDeOcorrenciaBean implements Serializable{
    
    private AberturaDeOcorrencia ocorrencia;
    private List<AberturaDeOcorrencia> ocorrencias;
    private List<AberturaDeOcorrencia> ocorrenciasPesq;

    public AberturaDeOcorrencia getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(AberturaDeOcorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public List<AberturaDeOcorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<AberturaDeOcorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public List<AberturaDeOcorrencia> getOcorrenciasPesq() {
        return ocorrenciasPesq;
    }

    public void setOcorrenciasPesq(List<AberturaDeOcorrencia> ocorrenciasPesq) {
        this.ocorrenciasPesq = ocorrenciasPesq;
    }
    
    @PostConstruct
    public void init() {
        pesquisar();
    }
    
    public void pesquisar() {
        AberturaDeOcorrenciaDao aberturaDeOcorrenciaDao = new AberturaDeOcorrenciaDao();
        this.ocorrencias = aberturaDeOcorrenciaDao.getListar();
    }
    
    public void inserir() {
        ocorrencia = new AberturaDeOcorrencia();
    }
    
    public void gravar() {
        AberturaDeOcorrenciaDao aberturaDeOcorrenciaDao = new AberturaDeOcorrenciaDao();
        if (ocorrencia.getNumero() == 0) {
            aberturaDeOcorrenciaDao.inserir(ocorrencia);
        } else {
            aberturaDeOcorrenciaDao.atualizar(ocorrencia);
        }
        pesquisar();
        JSFUtil.addMsgSucesso("Registro atualizado com sucesso!");
    }
    
    public void executarExcluir(){
      AberturaDeOcorrenciaDao aberturaDeOcorrenciaDao = new AberturaDeOcorrenciaDao();
      aberturaDeOcorrenciaDao.remover(ocorrencia);
      pesquisar();
       JSFUtil.addMsgSucesso("Registro excluído com sucesso");
   }
}
