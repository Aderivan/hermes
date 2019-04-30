
package br.com.apsinformatica.dao;
import br.com.apsinformatica.domain.Setor;
import java.util.ArrayList;
import java.util.List;

public class SetorDao extends MyDao{
    public List <Setor> getListar() {
        List<Setor> lista = new ArrayList<Setor>();
                try {
            open();
            lista = getEntityManager().createQuery("select u from Setor u").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return lista;
    }
    
       public Setor getListaPorId(String sId) {
        Setor entidade = null;
        try {
            open();
            entidade = getEntityManager().find(Setor.class, sId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return entidade;
    }
        public void inserir(Setor pSetor) {
         try {
            open();
            beginTransaction();
            getEntityManager().persist(pSetor);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void atualizar(Setor pSetor) {
        try {
            open();
            beginTransaction();
            getEntityManager().merge(pSetor);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }
    
    public void remover(Setor pSetor) {
        try {
            open();
            beginTransaction();
            getEntityManager().remove(pSetor);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }
}
