/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.CarteiraInvestimentos;

/**
 *
 * @author CHARLES
 */
public class CarteiraInvestimentosDAO extends PersistenciaJPA {

    public List<CarteiraInvestimentos> listaCarteiras() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<CarteiraInvestimentos> query
                    = em.createQuery("SELECT c FROM CarteiraInvestimentos c", CarteiraInvestimentos.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
