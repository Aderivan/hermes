package br.com.apsinformatica.domain;

import br.com.apsinformatica.domain.AberturaDeOcorrencia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-02T18:16:04")
@StaticMetamodel(Software.class)
public class Software_ { 

    public static volatile SingularAttribute<Software, String> soft_desc;
    public static volatile ListAttribute<Software, AberturaDeOcorrencia> ocorrencias;
    public static volatile SingularAttribute<Software, Integer> soft_cod;

}