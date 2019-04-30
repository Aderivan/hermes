package br.com.apsinformatica.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.apsinformatica.domain.Instituicao;

/**
 *
 * @author Montezuma
 */
public class InstituicaoDao extends MyDao {

    public List<Instituicao> getListar() {
        List<Instituicao> lista = new ArrayList<Instituicao>();
        try {
            open();
            lista = getEntityManager().createQuery("select u from Instituicao u").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return lista;
    }

    public Instituicao getListaPorId(String uId) {
        Instituicao entidade = null;
        try {
            open();
            entidade = getEntityManager().find(Instituicao.class, uId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return entidade;
    }

    public void inserir(Instituicao pInstituicao) {
        try {
            open();
            beginTransaction();
            getEntityManager().persist(pInstituicao);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void atualizar(Instituicao pInstituicao) {
        try {
            open();
            beginTransaction();
            getEntityManager().merge(pInstituicao);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void remover(Instituicao pInstituicao) {
        try {
            open();
            beginTransaction();
            getEntityManager().remove(pInstituicao);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

}
