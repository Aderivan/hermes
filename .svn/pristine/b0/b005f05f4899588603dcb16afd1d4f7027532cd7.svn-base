package br.com.apsinformatica.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.apsinformatica.domain.SoftwarePerfilMod;

/**
 *
 * @author Montezuma
 */
public class SoftwarePerfilModDao extends MyDao {

    public List<SoftwarePerfilMod> getListar() {
        List<SoftwarePerfilMod> lista = new ArrayList<SoftwarePerfilMod>();
        try {
            open();
            lista = getEntityManager().createQuery("select u from SoftwarePerfilMod u").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return lista;
    }

    public SoftwarePerfilMod getListaPorId(String uId) {
        SoftwarePerfilMod entidade = null;
        try {
            open();
            entidade = getEntityManager().find(SoftwarePerfilMod.class, uId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return entidade;
    }

    public void inserir(SoftwarePerfilMod pSoftwarePerfilMod) {
        try {
            open();
            beginTransaction();
            getEntityManager().persist(pSoftwarePerfilMod);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void atualizar(SoftwarePerfilMod pSoftwarePerfilMod) {
        try {
            open();
            beginTransaction();
            getEntityManager().merge(pSoftwarePerfilMod);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void remover(SoftwarePerfilMod pSoftwarePerfilMod) {
        try {
            open();
            beginTransaction();
            getEntityManager().remove(pSoftwarePerfilMod);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

}
