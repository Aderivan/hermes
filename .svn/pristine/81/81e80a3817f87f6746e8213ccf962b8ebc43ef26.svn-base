package br.com.apsinformatica.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.apsinformatica.domain.Problema;
import br.com.apsinformatica.dao.ProblemaDao;
import br.com.apsinformatica.infra.JSFUtil;
import java.util.List;
import javax.annotation.PostConstruct;

@ManagedBean(name = "MBProblemas")
@ViewScoped
public class ProblemaBean implements Serializable {
    private Problema problema;
    private List<Problema> problemas;
    private List<Problema> problemasPesq;

    public Problema getProblema() {
        return problema;
    }

    public void setProblema(Problema problema) {
        this.problema = problema;
    }

    public List<Problema> getProblemas() {
        return problemas;
    }

    public void setProblemas(List<Problema> problemas) {
        this.problemas = problemas;
    }

    public List<Problema> getProblemasPesq() {
        return problemasPesq;
    }

    public void setProblemasPesq(List<Problema> problemasPesq) {
        this.problemasPesq = problemasPesq;
    }
    
    @PostConstruct
    public void init() {
        pesquisar();
    }

    public void pesquisar() {
        ProblemaDao problemaDao = new ProblemaDao();
        this.problemas = problemaDao.getListar();
    }

    public void inserir() {
        problema = new Problema();
    }

    public void gravar() {
        ProblemaDao problemaDao = new ProblemaDao();
        if (problema.getProb_id() == 0) {
            problemaDao.inserir(problema);
        } else {
            problemaDao.atualizar(problema);
        }
        pesquisar();
        JSFUtil.addMsgSucesso("Registro atualizado com sucesso!");
    }

    public void executarExcluir() {
        ProblemaDao problemaDao = new ProblemaDao();
        problemaDao.remover(problema);
        pesquisar();
        JSFUtil.addMsgSucesso("Registro excluído com sucesso");
    }
}
