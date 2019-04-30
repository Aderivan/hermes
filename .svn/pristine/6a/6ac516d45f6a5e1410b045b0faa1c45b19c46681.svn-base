/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apsinformatica.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Dan
 */
@Entity
@Table(name = "ocorrencias")
public class AberturaDeOcorrencia implements Serializable {

    @Id
    @Column(name = "numero")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer numero;

    @Column(name = "problema")
    private Integer idproblema;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "sistema")
    private String idsistema;

    @Column(name = "contato")
    private String contato;

    @Column(name = "telefone")
    private Integer telefone;

    @Column(name = "operador")
    private Integer idoperador;

    @Column(name = "local")
    private Integer local;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_abertura")
    private Date data_abertura;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_fechamento")
    private Date data_fechamento;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_atendimento")
    private Date data_atendimento;

    @Column(name = "status")
    private Integer idstatus;

    @Column(name = "instituicao")
    private Integer idinstituicao;

    @Column(name = "software")
    private Integer idsoftware;

    @Column(name = "aberto_por")
    private Integer idaberto_por;

    @Inject
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "problema", referencedColumnName = "prob_id")
    private Problema problema;
    
    @Inject
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "local", referencedColumnName = "loc-id")
    private LocalDaOcorrencia localdaocorrencia;
    
    @Inject
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "sistema", referencedColumnName = "sis_id")
    private Sistemas sistema;
    
    @Inject
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "operador", referencedColumnName = "user_id")
    private Usuario operador;
    
    
    @Inject
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "status", referencedColumnName = "stat_id")
    private Status status;
    
    @Inject
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "instituicao", referencedColumnName = "inst_cod")
    private Instituicao instituicao;
    
    @Inject
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "software", referencedColumnName = "soft_cod")
    private Software software;
    
    @Inject
    @ManyToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "aberto_por", referencedColumnName = "user_id")
    private Usuario abertopor;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getIdproblema() {
        return idproblema;
    }

    public void setIdproblema(Integer idproblema) {
        this.idproblema = idproblema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIdsistema() {
        return idsistema;
    }

    public void setIdsistema(String idsistema) {
        this.idsistema = idsistema;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Integer getIdoperador() {
        return idoperador;
    }

    public void setIdoperador(Integer idoperador) {
        this.idoperador = idoperador;
    }

    public Integer getLocal() {
        return local;
    }

    public void setLocal(Integer local) {
        this.local = local;
    }

    public Date getData_abertura() {
        return data_abertura;
    }

    public void setData_abertura(Date data_abertura) {
        this.data_abertura = data_abertura;
    }

    public Date getData_fechamento() {
        return data_fechamento;
    }

    public void setData_fechamento(Date data_fechamento) {
        this.data_fechamento = data_fechamento;
    }

    public Date getData_atendimento() {
        return data_atendimento;
    }

    public void setData_atendimento(Date data_atendimento) {
        this.data_atendimento = data_atendimento;
    }

    public Integer getIdstatus() {
        return idstatus;
    }

    public void setIdstatus(Integer idstatus) {
        this.idstatus = idstatus;
    }

    public Integer getIdinstituicao() {
        return idinstituicao;
    }

    public void setIdinstituicao(Integer idinstituicao) {
        this.idinstituicao = idinstituicao;
    }

    public Integer getIdsoftware() {
        return idsoftware;
    }

    public void setIdsoftware(Integer idsoftware) {
        this.idsoftware = idsoftware;
    }

    public Integer getIdaberto_por() {
        return idaberto_por;
    }

    public void setIdaberto_por(Integer idaberto_por) {
        this.idaberto_por = idaberto_por;
    }

    public Problema getProblema() {
        return problema;
    }

    public void setProblema(Problema problema) {
        this.problema = problema;
    }

    public LocalDaOcorrencia getLocaldaocorrencia() {
        return localdaocorrencia;
    }

    public void setLocaldaocorrencia(LocalDaOcorrencia localdaocorrencia) {
        this.localdaocorrencia = localdaocorrencia;
    }

    public Sistemas getSistema() {
        return sistema;
    }

    public void setSistema(Sistemas sistema) {
        this.sistema = sistema;
    }

    public Usuario getOperador() {
        return operador;
    }

    public void setOperador(Usuario operador) {
        this.operador = operador;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    public Usuario getAbertopor() {
        return abertopor;
    }

    public void setAbertopor(Usuario abertopor) {
        this.abertopor = abertopor;
    }
    
    
    
}
