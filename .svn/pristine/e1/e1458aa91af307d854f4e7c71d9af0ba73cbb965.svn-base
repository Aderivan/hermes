package br.com.apsinformatica.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "instituicao")
public class Instituicao implements java.io.Serializable {

    @Id
    @GeneratedValue
    @Column(name = "inst_cod")
    private Integer instcod;
    @Column(name = "inst_cnpj")
    private String instcnpj;
    @Column(name = "razao_social")
    private String razaosocial;
    @Column(name = "inst_ie")
    private String instie;
    @Column(name = "inst_nome")
    private String instnome;
    @Column(name = "cep")
    private String cep;
    @Column(name = "logradrouro")
    private String logradrouro;
    @Column(name = "numero")
    private String numero;
    @Column(name = "bairro")
    private String bairro;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "uf")
    private String uf;    
    @Column(name = "contato")
    private String contato;
    @Column(name = "fone")
    private String fone;
    @Column(name = "email")
    private String email;
    @Column(name = "inst_status")
    private Integer inststatus;
    @Column(name = "codmatriz")
    private Integer codmatriz;
    @Column(name = "cont_email")
    private String contemail;
    @Column(name = "equipe")
    private String equipe;
    @Column(name = "setor_Equipe")
    private Integer setorEquipe;
    @Column(name = "cod_seg")
    private Integer codseg;
    @Column(name = "contato_fone")
    private String contatofone;
    @Column(name = "status_dll")
    private String statusdll;
    @Column(name = "inst_qtdestacoes")
    private Integer instqtdestacoes;
    @Column(name = "inst_chavedinamica")
    private String instchavedinamica;
    @Column(name = "inst_tipocontrato")
    private String insttipocontrato;
    @Column(name = "inst_diavencimento")
    private Integer instdiavencimento;

    /**
     * Campos Virtuais
     */
//    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<InstituicaoSoftware> softwares;
        
//    @ManyToOne
//    @PrimaryKeyJoinColumn(name = "cod_seg", referencedColumnName = "cod_seg")
//    private Segmento segmento;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "instituicao", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<AberturaDeOcorrencia> ocorrencias;


    public Instituicao() {
        statusdll  = "INATIVO";
        inststatus = 0;
    }

//    public Segmento getSegmento() {
//        return segmento;
//    }
//
//    public void setSegmento(Segmento segmento) {
//        this.segmento = segmento;
//    }

//    public List<InstituicaoSoftware> getSoftwares() {
//        return softwares;
//    }
//
//    public void setSoftwares(List<InstituicaoSoftware> softwares) {
//        this.softwares = softwares;
//    }

    public Integer getInstcod() {
        return instcod;
    }

    public void setInstcod(Integer instcod) {
        this.instcod = instcod;
    }

    public String getInstnome() {
        return instnome;
    }

    public void setInstnome(String instnome) {
        this.instnome = instnome;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Integer getInststatus() {
        return inststatus;
    }

    public void setInststatus(Integer inststatus) {
        this.inststatus = inststatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCodmatriz() {
        return codmatriz;
    }

    public void setCodmatriz(Integer codmatriz) {
        this.codmatriz = codmatriz;
    }

    public String getContemail() {
        return contemail;
    }

    public void setContemail(String contemail) {
        this.contemail = contemail;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public Integer getSetorEquipe() {
        return setorEquipe;
    }

    public void setSetorEquipe(Integer setorEquipe) {
        this.setorEquipe = setorEquipe;
    }

    public Integer getCodseg() {
        return codseg;
    }

    public void setCodseg(Integer codseg) {
        this.codseg = codseg;
    }

    public String getContatofone() {
        return contatofone;
    }

    public void setContatofone(String contatofone) {
        this.contatofone = contatofone;
    }

    public String getInstcnpj() {
        return instcnpj;
    }

    public void setInstcnpj(String instcnpj) {
        this.instcnpj = instcnpj;
    }

    public String getInstie() {
        return instie;
    }

    public void setInstie(String instie) {
        this.instie = instie;
    }

    public String getStatusdll() {
        return statusdll;
    }

    public void setStatusdll(String statusdll) {
        this.statusdll = statusdll;
    }

    public Integer getInstqtdestacoes() {
        return instqtdestacoes;
    }

    public void setInstqtdestacoes(Integer instqtdestacoes) {
        this.instqtdestacoes = instqtdestacoes;
    }

    public String getInstchavedinamica() {
        return instchavedinamica;
    }

    public void setInstchavedinamica(String instchavedinamica) {
        this.instchavedinamica = instchavedinamica;
    }

    public String getInsttipocontrato() {
        return insttipocontrato;
    }

    public void setInsttipocontrato(String insttipocontrato) {
        this.insttipocontrato = insttipocontrato;
    }

    public Integer getInstdiavencimento() {
        return instdiavencimento;
    }

    public void setInstdiavencimento(Integer instdiavencimento) {
        this.instdiavencimento = instdiavencimento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradrouro() {
        return logradrouro;
    }

    public void setLogradrouro(String logradrouro) {
        this.logradrouro = logradrouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<AberturaDeOcorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<AberturaDeOcorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }


    
    
}
