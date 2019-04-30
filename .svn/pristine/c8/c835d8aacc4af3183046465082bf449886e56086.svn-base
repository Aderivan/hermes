package br.com.apsinformatica.dao;

import br.com.apsinformatica.domain.Problema;
import java.util.ArrayList;
import java.util.List;

public class ProblemaDao extends MyDao {

    public List<Problema> getListar() {
        List<Problema> lista = new ArrayList<Problema>();
        try {
            open();
            lista = getEntityManager().createQuery("select u from Problema u").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return lista;
    }

    public Problema getListaPorId(String sId) {
        Problema entidade = null;
        try {
            open();
            entidade = getEntityManager().find(Problema.class, sId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }

        return entidade;
    }

    public void inserir(Problema pProblemas) {
        try {
            open();
            beginTransaction();
            getEntityManager().persist(pProblemas);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void atualizar(Problema pProblemas) {
        try {
            open();
            beginTransaction();
            getEntityManager().merge(pProblemas);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void remover(Problema pProblemas) {
        try {
            open();
            beginTransaction();
            getEntityManager().remove(pProblemas);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }
}
