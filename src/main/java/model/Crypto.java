/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.persistence.*;

/**
 *
 * @author CHARLES
 */
@Entity
@Table(name = "crypto")
public class Crypto extends Investimento {

    private String sigla;

    public Crypto() {
    
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
