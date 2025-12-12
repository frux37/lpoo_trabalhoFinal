/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

/**
 *
 * @author CHARLES
 */
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "usu_id")
    private int id;

    @Column(name = "usu_nome")
    private String nome;

    @Column(name = "usu_email")
    private String email;

    @Column(name = "usu_senha")
    private String senha;

    @Enumerated(EnumType.STRING)
    @Column(name = "usu_perfil")
    private Perfil perfil;

    //construtor
    public Usuario() {

    }

    //getters e setters (APENAS OS BÁSICOS)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return nome;
    }

    // REMOVA ou COMENTE o relacionamento por enquanto
    // @OneToMany(mappedBy = "usuario")
    // private List<CarteiraInvestimentos> carteiras = new ArrayList<>();
}
