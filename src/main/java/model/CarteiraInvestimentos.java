/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "carteiras")
public class CarteiraInvestimentos implements Serializable {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "carteira_id")
    private Long id;

    @Column(name = "carteira_nome")
    private String nome;

    @Column(name = "carteira_descricao")
    private String descricao;

    @Column(name = "data_criacao")
    private LocalDate dataCriacao = LocalDate.now();

    @Column(name = "ativo")
    private boolean ativo = true;
    
    public CarteiraInvestimentos()
    {
        
    }
    
    // GETTERS e SETTERS BÁSICOS
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // REMOVA ou COMENTE por enquanto
    // public List<Investimento> getInvestimentos() {
    //     return investimentos;
    // }
    //
    // public void setInvestimentos(List<Investimento> investimentos) {
    //     this.investimentos = investimentos;
    // }
    
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // COMENTE TEMPORARIAMENTE
    // @OneToMany(mappedBy = "carteira", cascade = CascadeType.ALL, orphanRemoval = false)
    // private List<Investimento> investimentos = new ArrayList<>();
}