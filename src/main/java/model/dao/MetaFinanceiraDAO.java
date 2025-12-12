/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.MetaFinanceira;

/**
 *
 * @author CHARLES
 */
public class MetaFinanceiraDAO extends PersistenciaJPA {

    public List<MetaFinanceira> listaMetas() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<MetaFinanceira> query
                    = em.createQuery("SELECT m FROM MetaFinanceira m", MetaFinanceira.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
