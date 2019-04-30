package br.com.apsinformatica.domain;

import br.com.apsinformatica.domain.AberturaDeOcorrencia;
import br.com.apsinformatica.domain.Setor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-02T18:16:04")
@StaticMetamodel(Problema.class)
public class Problema_ { 

    public static volatile SingularAttribute<Problema, Setor> setor;
    public static volatile ListAttribute<Problema, AberturaDeOcorrencia> ocorrencias;
    public static volatile SingularAttribute<Problema, Integer> prob_id;
    public static volatile SingularAttribute<Problema, Integer> prob_area;
    public static volatile SingularAttribute<Problema, Integer> prob_sla;
    public static volatile SingularAttribute<Problema, String> descricao;

}