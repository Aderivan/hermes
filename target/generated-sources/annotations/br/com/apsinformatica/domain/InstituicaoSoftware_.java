package br.com.apsinformatica.domain;

import br.com.apsinformatica.domain.Instituicao;
import br.com.apsinformatica.domain.Software;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-02T18:16:04")
@StaticMetamodel(InstituicaoSoftware.class)
public class InstituicaoSoftware_ { 

    public static volatile SingularAttribute<InstituicaoSoftware, Integer> instituicaoid;
    public static volatile SingularAttribute<InstituicaoSoftware, Integer> softwareid;
    public static volatile SingularAttribute<InstituicaoSoftware, Software> software;
    public static volatile SingularAttribute<InstituicaoSoftware, Instituicao> instituicao;
    public static volatile SingularAttribute<InstituicaoSoftware, Integer> id;

}