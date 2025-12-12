/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author CHARLES
 */
@Entity
@Table(name = "investimento_meta")
public class InvestimentoMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    
    private BigDecimal percentualContribuicao; // ex: 25% do investimento vai pra essa meta
    private BigDecimal valorDestinado;

    @Temporal(TemporalType.DATE)
    private Date dataVinculo = new Date();

    @Column(length = 500)
    private String observacao;

    public InvestimentoMeta() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPercentualContribuicao() {
        return percentualContribuicao;
    }

    public void setPercentualContribuicao(BigDecimal percentualContribuicao) {
        this.percentualContribuicao = percentualContribuicao;
    }

    public BigDecimal getValorDestinado() {
        return valorDestinado;
    }

    public void setValorDestinado(BigDecimal valorDestinado) {
        this.valorDestinado = valorDestinado;
    }

    public Date getDataVinculo() {
        return dataVinculo;
    }

    public void setDataVinculo(Date dataVinculo) {
        this.dataVinculo = dataVinculo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Investimento getInvestimento() {
        return investimento;
    }

    public void setInvestimento(Investimento investimento) {
        this.investimento = investimento;
    }

    public MetaFinanceira getMeta() {
        return meta;
    }

    public void setMeta(MetaFinanceira meta) {
        this.meta = meta;
    }
    
    // --- RELACIONAMENTO: N -> 1 com Investimento
    @ManyToOne
    @JoinColumn(name = "investimento_id")
    private Investimento investimento;

    // --- RELACIONAMENTO: N -> 1 com MetaFinanceira
    @ManyToOne
    @JoinColumn(name = "meta_id")
    private MetaFinanceira meta;
}
