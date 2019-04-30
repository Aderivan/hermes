
package br.com.apsinformatica.dao;
import br.com.apsinformatica.domain.Status;
import java.util.ArrayList;
import java.util.List;

public class StatusDao extends MyDao{
    public List <Status> getListar() {
        List<Status> lista = new ArrayList<Status>();
                try {
            open();
            lista = getEntityManager().createQuery("select u from Status u").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return lista;
    }
    
       public Status getListaPorId(String sId) {
        Status entidade = null;
        try {
            open();
            entidade = getEntityManager().find(Status.class, sId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return entidade;
    }
        public void inserir(Status pStatus) {
         try {
            open();
            beginTransaction();
            getEntityManager().persist(pStatus);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void atualizar(Status pStatus) {
        try {
            open();
            beginTransaction();
            getEntityManager().merge(pStatus);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }
    
    public void remover(Status pStatus) {
        try {
            open();
            beginTransaction();
            getEntityManager().remove(pStatus);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }
}
