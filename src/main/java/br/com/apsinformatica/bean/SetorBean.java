
package br.com.apsinformatica.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.apsinformatica.domain.Setor;
import br.com.apsinformatica.dao.SetorDao;
import br.com.apsinformatica.infra.JSFUtil;
import java.util.List;
import javax.annotation.PostConstruct;

@ManagedBean(name="MBSetor")
@ViewScoped

public class SetorBean implements Serializable{
    private Setor setor;
    private List<Setor> setores;
    private List<Setor> setoresPesq;

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public List<Setor> getSetores() {
        return setores;
    }

    public void setSetores(List<Setor> setores) {
        this.setores = setores;
    }

    public List<Setor> getSetoresPesq() {
        return setoresPesq;
    }

    public void setSetoresPesq(List<Setor> setoresPesq) {
        this.setoresPesq = setoresPesq;
    }
    
    @PostConstruct
	public void init() {
		pesquisar();
	}
        
        public void pesquisar(){
            SetorDao setorDao = new SetorDao();
            this.setores = setorDao.getListar();            
        }   
        
        public void inserir(){
            setor = new Setor();
        }
        
        public void gravar() {
		SetorDao setorDao = new SetorDao();
		if (setor.getSis_id() == 0) {
			setorDao.inserir(setor);
		} else {
			setorDao.atualizar(setor);
		}
		pesquisar();
		          JSFUtil.addMsgSucesso("Registro atualizado com sucesso!");
	}        
        
         public void executarExcluir(){
      SetorDao setorDao = new SetorDao();
      setorDao.remover(setor);
      pesquisar();
       JSFUtil.addMsgSucesso("Registro excluído com sucesso");
   }
        
}
