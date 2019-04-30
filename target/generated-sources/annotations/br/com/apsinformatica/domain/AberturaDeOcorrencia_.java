package br.com.apsinformatica.domain;

import br.com.apsinformatica.domain.Instituicao;
import br.com.apsinformatica.domain.LocalDaOcorrencia;
import br.com.apsinformatica.domain.Problema;
import br.com.apsinformatica.domain.Sistemas;
import br.com.apsinformatica.domain.Software;
import br.com.apsinformatica.domain.Status;
import br.com.apsinformatica.domain.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-02T18:16:04")
@StaticMetamodel(AberturaDeOcorrencia.class)
public class AberturaDeOcorrencia_ { 

    public static volatile SingularAttribute<AberturaDeOcorrencia, Integer> telefone;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Integer> numero;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Software> software;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Sistemas> sistema;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Instituicao> instituicao;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Date> data_fechamento;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Integer> idaberto_por;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Problema> problema;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Integer> idoperador;
    public static volatile SingularAttribute<AberturaDeOcorrencia, String> idsistema;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Integer> local;
    public static volatile SingularAttribute<AberturaDeOcorrencia, String> descricao;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Date> data_abertura;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Date> data_atendimento;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Integer> idstatus;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Integer> idinstituicao;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Integer> idproblema;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Integer> idsoftware;
    public static volatile SingularAttribute<AberturaDeOcorrencia, String> contato;
    public static volatile SingularAttribute<AberturaDeOcorrencia, LocalDaOcorrencia> localdaocorrencia;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Usuario> operador;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Status> status;
    public static volatile SingularAttribute<AberturaDeOcorrencia, Usuario> abertopor;

}