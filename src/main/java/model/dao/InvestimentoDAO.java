/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Investimento;

/**
 *
 * @author CHARLES
 */
public class InvestimentoDAO extends PersistenciaJPA{

    public List<Investimento> listaInvestimentos() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Investimento> query
                    = em.createQuery("SELECT i FROM Investimento i", Investimento.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
