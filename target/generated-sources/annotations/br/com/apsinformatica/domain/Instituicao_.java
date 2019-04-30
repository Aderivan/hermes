package br.com.apsinformatica.domain;

import br.com.apsinformatica.domain.AberturaDeOcorrencia;
import br.com.apsinformatica.domain.Segmento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-02T18:16:04")
@StaticMetamodel(Instituicao.class)
public class Instituicao_ { 

    public static volatile SingularAttribute<Instituicao, String> cidade;
    public static volatile ListAttribute<Instituicao, AberturaDeOcorrencia> ocorrencias;
    public static volatile SingularAttribute<Instituicao, String> instnome;
    public static volatile SingularAttribute<Instituicao, String> numero;
    public static volatile SingularAttribute<Instituicao, Integer> instqtdestacoes;
    public static volatile SingularAttribute<Instituicao, String> cep;
    public static volatile SingularAttribute<Instituicao, String> uf;
    public static volatile SingularAttribute<Instituicao, String> contemail;
    public static volatile SingularAttribute<Instituicao, String> instie;
    public static volatile SingularAttribute<Instituicao, String> instchavedinamica;
    public static volatile SingularAttribute<Instituicao, Integer> setorEquipe;
    public static volatile SingularAttribute<Instituicao, String> logradrouro;
    public static volatile SingularAttribute<Instituicao, Integer> instcod;
    public static volatile SingularAttribute<Instituicao, String> contato;
    public static volatile SingularAttribute<Instituicao, String> email;
    public static volatile SingularAttribute<Instituicao, String> contatofone;
    public static volatile SingularAttribute<Instituicao, String> bairro;
    public static volatile SingularAttribute<Instituicao, Integer> codseg;
    public static volatile SingularAttribute<Instituicao, String> statusdll;
    public static volatile SingularAttribute<Instituicao, Integer> codmatriz;
    public static volatile SingularAttribute<Instituicao, String> razaosocial;
    public static volatile SingularAttribute<Instituicao, String> fone;
    public static volatile SingularAttribute<Instituicao, Segmento> segmento;
    public static volatile SingularAttribute<Instituicao, Integer> inststatus;
    public static volatile SingularAttribute<Instituicao, String> instcnpj;
    public static volatile SingularAttribute<Instituicao, String> equipe;
    public static volatile SingularAttribute<Instituicao, String> insttipocontrato;
    public static volatile SingularAttribute<Instituicao, Integer> instdiavencimento;

}