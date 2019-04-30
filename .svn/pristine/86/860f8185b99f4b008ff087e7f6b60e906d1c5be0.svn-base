
package br.com.apsinformatica.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import br.com.apsinformatica.domain.Status;
import br.com.apsinformatica.dao.StatusDao;
import br.com.apsinformatica.infra.JSFUtil;
import java.util.List;
import javax.annotation.PostConstruct;

@ManagedBean(name="MBStatus")
@ViewScoped

public class StatusBean implements Serializable{
    private Status status;
    private List<Status> listStatus;
    private List<Status> statusPesq;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Status> getListStatus() {
        return listStatus;
    }

    public void setListStatus(List<Status> listStatus) {
        this.listStatus = listStatus;
    }

    public List<Status> getStatusPesq() {
        return statusPesq;
    }

    public void setStatusPesq(List<Status> statusPesq) {
        this.statusPesq = statusPesq;
    }

   @PostConstruct
	public void init() {
		pesquisar();
	}
        
        public void pesquisar() {
            StatusDao statusDao = new StatusDao();
            this.listStatus = statusDao.getListar();
        }
        
        public void insetir() {
            status = new Status();
        }
        
         public void gravar() {
		StatusDao statusDao = new StatusDao();
		if (status.getStat_id() == 0) {
			statusDao.inserir(status);
		} else {
			statusDao.atualizar(status);
		}
		pesquisar();
		          JSFUtil.addMsgSucesso("Registro atualizado com sucesso!");
	}     
         
         public void executarExcluir(){
            StatusDao statusDao = new StatusDao();
            statusDao.remover(status);
            pesquisar();
            JSFUtil.addMsgSucesso("Registro excluído com sucesso");
   }
   }
