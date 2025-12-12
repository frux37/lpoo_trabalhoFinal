/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
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
@Table(name = "investimento")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Investimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Enumerated(EnumType.STRING)
    private TipoInvestimento tipo;

    private BigDecimal valorInicial;

    private BigDecimal rentabilidadeAnual;

    @Enumerated(EnumType.STRING)
    private RiscoInvestimento risco;

    private LocalDate dataAplicacao;
    
    
    @ManyToOne
    @JoinColumn(name = "carteira_id")
    private CarteiraInvestimentos carteira;
    
    // ADICIONE GETTER E SETTER:
    public CarteiraInvestimentos getCarteira() {
        return carteira;
    }
    
    public void setCarteira(CarteiraInvestimentos carteira) {
        this.carteira = carteira;
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoInvestimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoInvestimento tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(BigDecimal valorInicial) {
        this.valorInicial = valorInicial;
    }

    public BigDecimal getRentabilidadeAnual() {
        return rentabilidadeAnual;
    }

    public void setRentabilidadeAnual(BigDecimal rentabilidadeAnual) {
        this.rentabilidadeAnual = rentabilidadeAnual;
    }

    public RiscoInvestimento getRisco() {
        return risco;
    }

    public void setRisco(RiscoInvestimento risco) {
        this.risco = risco;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<InvestimentoMeta> getMetasAssociadas() {
        return metasAssociadas;
    }

    public void setMetasAssociadas(List<InvestimentoMeta> metasAssociadas) {
        this.metasAssociadas = metasAssociadas;
    }

    private boolean ativo = true;

    @OneToMany(mappedBy = "investimento", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InvestimentoMeta> metasAssociadas = new ArrayList<>();

}
