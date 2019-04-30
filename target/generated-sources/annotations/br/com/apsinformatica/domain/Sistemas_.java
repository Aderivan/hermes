package br.com.apsinformatica.domain;

import br.com.apsinformatica.domain.AberturaDeOcorrencia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-02T18:16:04")
@StaticMetamodel(Sistemas.class)
public class Sistemas_ { 

    public static volatile SingularAttribute<Sistemas, String> sis_atende;
    public static volatile ListAttribute<Sistemas, AberturaDeOcorrencia> ocorrencias;
    public static volatile SingularAttribute<Sistemas, Integer> idsistema;
    public static volatile SingularAttribute<Sistemas, String> email;
    public static volatile SingularAttribute<Sistemas, Integer> status;

}