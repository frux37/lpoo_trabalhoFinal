/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

/**
 *
 * @author CHARLES
 */
import model.dao.PersistenciaJPA;

public class testeMinimo {
    public static void main(String[] args) {
        try {
            PersistenciaJPA jpa = new PersistenciaJPA();
            System.out.println("✅ JPA inicializado!");
            jpa.fecharConexao();
        } catch (Exception e) {
            System.err.println("❌ ERRO:");
            e.printStackTrace();
        }
    }
}