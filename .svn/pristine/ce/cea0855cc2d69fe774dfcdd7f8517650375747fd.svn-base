package br.com.apsinformatica.dao;

import br.com.apsinformatica.domain.SoftwareModulos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dan
 */
public class softwareModulosDao extends MyDao {

    public List<SoftwareModulos> getListar() {
        List<SoftwareModulos> lista = new ArrayList<SoftwareModulos>();
        try {
            open();
            lista = getEntityManager().createQuery("select m from SoftwareModulos m").getResultList();
        } finally {
            close();
        }
        return lista;
    }

    public SoftwareModulos getListaPorId(String uId) {

        SoftwareModulos entidade = new SoftwareModulos();
        try {
            open();
            entidade = getEntityManager().find(SoftwareModulos.class, uId);
        } finally {
            close();
        }
        return entidade;
    }

    public void inserir(SoftwareModulos pSoftwareModulos) {
        try {
            open();
            beginTransaction();
            getEntityManager().persist(pSoftwareModulos);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void atualizar(SoftwareModulos pSoftwareModulos) {
        try {
            open();
            beginTransaction();
            getEntityManager().merge(pSoftwareModulos);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }

    public void remove(SoftwareModulos pSoftwareModulos) {
        try {
            open();
            beginTransaction();
            getEntityManager().remove(pSoftwareModulos);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }
}
