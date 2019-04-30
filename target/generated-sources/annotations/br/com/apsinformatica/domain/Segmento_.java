package br.com.apsinformatica.domain;

import br.com.apsinformatica.domain.Instituicao;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-02T18:16:04")
@StaticMetamodel(Segmento.class)
public class Segmento_ { 

    public static volatile ListAttribute<Segmento, Instituicao> instituicoes;
    public static volatile SingularAttribute<Segmento, Integer> codseg;
    public static volatile SingularAttribute<Segmento, String> descseg;

}