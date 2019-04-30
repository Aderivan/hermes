
package br.com.apsinformatica.bean;

import br.com.apsinformatica.dao.softwareModulosDao;
import br.com.apsinformatica.domain.SoftwareModulos;
import br.com.apsinformatica.infra.JSFUtil;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "MBsoftwareModulos")
@ViewScoped
public class softwareModulosBean implements Serializable{
    private SoftwareModulos softwareModulos;
    private List<SoftwareModulos> softModulos;
    private List<SoftwareModulos> softwareModulosPesq;

    public SoftwareModulos getSoftwareModulos() {
        return softwareModulos;
    }

    public void setSoftwareModulos(SoftwareModulos softwareModulos) {
        this.softwareModulos = softwareModulos;
    }

    public List<SoftwareModulos> getSoftModulos() {
        return softModulos;
    }

    public void setSoftModulos(List<SoftwareModulos> softModulos) {
        this.softModulos = softModulos;
    }

    public List<SoftwareModulos> getSoftwareModulosPesq() {
        return softwareModulosPesq;
    }

    public void setSoftwareModulosPesq(List<SoftwareModulos> softwareModulosPesq) {
        this.softwareModulosPesq = softwareModulosPesq;
    }
    
   @PostConstruct
   public void init(){
       pesquisar();
   }
   
   public void pesquisar(){
       softwareModulosDao usuarioDao = new softwareModulosDao();
       this.softModulos = usuarioDao.getListar();
   }
   
   public void inserir(){
       softwareModulos = new SoftwareModulos();
   }
   
   public void gravar(){
       softwareModulosDao dao = new softwareModulosDao();
       
       if(softwareModulos.getIdmodimp()== 0){
           dao.inserir(softwareModulos);
       }else{
           dao.atualizar(softwareModulos);
       }
       pesquisar();
       JSFUtil.addMsgSucesso("Registro atualizado com sucesso");
   }
   
   public void executarExcluir(){
      softwareModulosDao dao = new softwareModulosDao();
      dao.remove(softwareModulos);
      pesquisar();
       JSFUtil.addMsgSucesso("Registro excluído com sucesso");
   }
}


