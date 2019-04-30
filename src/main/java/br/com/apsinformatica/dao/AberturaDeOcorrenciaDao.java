/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apsinformatica.dao;

import java.util.List;
import br.com.apsinformatica.domain.AberturaDeOcorrencia;
import java.util.ArrayList;

/**
 *
 * @author Dan
 */
public class AberturaDeOcorrenciaDao extends MyDao{
    public List<AberturaDeOcorrencia> getListar() {
        List<AberturaDeOcorrencia> lista = new ArrayList<AberturaDeOcorrencia>();
        try {
            open();
            lista = getEntityManager().createQuery("select u from AberturaDeOcorrencia u").getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return lista;
    }
    
    public AberturaDeOcorrenciaDao getListaPorId(String uId) {
        AberturaDeOcorrenciaDao ocorrencia = null;
        try {
            open();
            ocorrencia = getEntityManager().find(AberturaDeOcorrenciaDao.class, uId);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return ocorrencia;
    }
    
    public void inserir(AberturaDeOcorrencia pAberturaDeOcorrencia) {
        try {
            open();
            beginTransaction();
            getEntityManager().persist(pAberturaDeOcorrencia);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }
    
    public void atualizar(AberturaDeOcorrencia pAberturaDeOcorrencia) {
        try {
            open();
            beginTransaction();
            getEntityManager().merge(pAberturaDeOcorrencia);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }
    
    public void remover(AberturaDeOcorrencia pAberturaDeOcorrencia) {
        try {
            open();
            beginTransaction();
            getEntityManager().remove(pAberturaDeOcorrencia);
            commit();
        } catch (Exception e) {
            rollback();
            e.printStackTrace();
        } finally {
            close();
        }
    }
}
