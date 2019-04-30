package br.com.apsinformatica.domain;

import br.com.apsinformatica.domain.AberturaDeOcorrencia;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-02T18:16:04")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> area;
    public static volatile SingularAttribute<Usuario, String> naoenchamdo;
    public static volatile ListAttribute<Usuario, AberturaDeOcorrencia> ocorrencias;
    public static volatile SingularAttribute<Usuario, String> nome;
    public static volatile SingularAttribute<Usuario, String> login;
    public static volatile SingularAttribute<Usuario, Integer> flagativo;
    public static volatile SingularAttribute<Usuario, Integer> userid;
    public static volatile SingularAttribute<Usuario, String> fone;
    public static volatile SingularAttribute<Usuario, String> password;
    public static volatile ListAttribute<Usuario, AberturaDeOcorrencia> ocorrencia;
    public static volatile SingularAttribute<Usuario, Integer> useradmin;
    public static volatile SingularAttribute<Usuario, String> nivel;
    public static volatile SingularAttribute<Usuario, String> equipe;
    public static volatile SingularAttribute<Usuario, String> email;

}