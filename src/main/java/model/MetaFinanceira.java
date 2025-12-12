/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import java.util.*;
import javax.persistence.*;

/**
 *
 * @author CHARLES
 */
@Entity
@Table(name = "meta_financeira")
public class MetaFinanceira {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(length = 500)
    private String descricao;

    private BigDecimal valorObjetivo;

    @Temporal(TemporalType.DATE)
    private Date dataLimite;

    private String tipo;       // ex: "VIAGEM", "CASA", "APOSENTADORIA"
    private String prioridade; // ex: "ALTA", "MEDIA", "BAIXA"

    @Column(nullable = false)
    private boolean ativo = true;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao = new Date();

    public MetaFinanceira() {
    
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValorObjetivo() {
        return valorObjetivo;
    }

    public void setValorObjetivo(BigDecimal valorObjetivo) {
        this.valorObjetivo = valorObjetivo;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public List<InvestimentoMeta> getInvestimentosMeta() {
        return investimentosMeta;
    }

    public void setInvestimentosMeta(List<InvestimentoMeta> investimentosMeta) {
        this.investimentosMeta = investimentosMeta;
    }
    
    // --- RELACIONAMENTO: 1 Meta -> N InvestimentoMeta
    @OneToMany(mappedBy = "meta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InvestimentoMeta> investimentosMeta = new ArrayList<>();


}
