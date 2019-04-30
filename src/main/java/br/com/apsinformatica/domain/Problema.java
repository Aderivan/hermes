package br.com.apsinformatica.domain;

import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "problemas")
public class Problema implements Serializable {

    @Id
    @Column(name = "prob_id")
    @GeneratedValue
    private Integer prob_id;

    @Column(name = "problema")
    private String descricao;

    @Column(name = "prob_area")
    private Integer prob_area;

    @Column(name = "prob_sla")
    private Integer prob_sla;

    @Inject
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "prob_area", referencedColumnName = "sis_id")
    private Setor setor;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "problema", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<AberturaDeOcorrencia> ocorrencias;
    
    
    public Integer getProb_id() {
        return prob_id;
    }

    public void setProb_id(Integer prob_id) {
        this.prob_id = prob_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getProb_area() {
        return prob_area;
    }

    public void setProb_area(Integer prob_area) {
        this.prob_area = prob_area;
    }

    public Integer getProb_sla() {
        return prob_sla;
    }

    public void setProb_sla(Integer prob_sla) {
        this.prob_sla = prob_sla;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public List<AberturaDeOcorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<AberturaDeOcorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }
    
    

}
