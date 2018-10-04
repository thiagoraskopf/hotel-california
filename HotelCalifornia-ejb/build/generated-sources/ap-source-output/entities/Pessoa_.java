package entities;

import entities.Hospedagem;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T20:03:35")
@StaticMetamodel(Pessoa.class)
public class Pessoa_ { 

    public static volatile SingularAttribute<Pessoa, String> pessSenha;
    public static volatile SingularAttribute<Pessoa, Integer> pessId;
    public static volatile SingularAttribute<Pessoa, Character> pessFuncionario;
    public static volatile CollectionAttribute<Pessoa, Hospedagem> hospedagemCollection;
    public static volatile SingularAttribute<Pessoa, String> pessCpf;
    public static volatile SingularAttribute<Pessoa, String> pessNome;

}