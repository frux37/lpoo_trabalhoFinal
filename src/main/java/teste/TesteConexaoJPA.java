/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

import model.dao.PersistenciaJPA;
import javax.swing.JOptionPane;

public class TesteConexaoJPA {

    public static void main(String[] args) {
        try {
            PersistenciaJPA jpa = new PersistenciaJPA();
            boolean conectado = jpa.conexaoAberta();

            if (conectado) {
                JOptionPane.showMessageDialog(null, "✅ JPA CONECTADO!");
                System.out.println("EntityManager: " + jpa.getEntityManager());
            } else {
                JOptionPane.showMessageDialog(null, "❌ JPA NÃO CONECTADO");
            }

            jpa.fecharConexao();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "❌ ERRO JPA:\n" + e.getMessage());
        }
    }
}
