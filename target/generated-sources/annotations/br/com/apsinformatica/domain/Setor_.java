package br.com.apsinformatica.domain;

import br.com.apsinformatica.domain.Problema;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-02T18:16:04")
@StaticMetamodel(Setor.class)
public class Setor_ { 

    public static volatile SingularAttribute<Setor, String> sistema;
    public static volatile SingularAttribute<Setor, Integer> sis_id;
    public static volatile ListAttribute<Setor, Problema> problemas;
    public static volatile SingularAttribute<Setor, String> email;
    public static volatile SingularAttribute<Setor, Integer> status;

}