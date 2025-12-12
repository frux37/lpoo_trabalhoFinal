/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import model.Usuario;

/**
 *
 * @author CHARLES
 */
public class UsuarioDAO extends PersistenciaJPA{
    public List<Usuario> listaUsuario() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Usuario> query
                    = em.createQuery("SELECT v FROM Usuario v", Usuario.class);
            return query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
