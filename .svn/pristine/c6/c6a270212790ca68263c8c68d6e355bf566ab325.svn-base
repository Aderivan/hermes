package br.com.apsinformatica.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.apsinformatica.domain.Software;

/**
 *
 * @author Montezuma
 */
public class SoftwareDao extends MyDao {

    public List<Software> getListar() {
        List<Software> lista = new ArrayList<Software>();
        try {
            open();
            lista = getEntityManager().createQuery("select u from Software u").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return lista;
    }

    public Software getListaPorId(String uId) {
        Software entidade = null;
        try {
            open();
            entidade = getEntityManager().find(Software.class, uId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return entidade;
    }

    public void inserir(Software pSoftware) {
        try {
            open();
            beginTransaction();
            getEntityManager().persist(pSoftware);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void atualizar(Software pSoftware) {
        try {
            open();
            beginTransaction();
            getEntityManager().merge(pSoftware);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void remover(Software pSoftware) {
        try {
            open();
            beginTransaction();
            getEntityManager().remove(pSoftware);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

}
