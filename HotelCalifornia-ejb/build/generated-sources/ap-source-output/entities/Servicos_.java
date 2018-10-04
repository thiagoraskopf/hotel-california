package entities;

import entities.Hospedagem;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T20:03:35")
@StaticMetamodel(Servicos.class)
public class Servicos_ { 

    public static volatile SingularAttribute<Servicos, String> serTipo;
    public static volatile CollectionAttribute<Servicos, Hospedagem> hospedagemCollection;
    public static volatile SingularAttribute<Servicos, String> serNome;
    public static volatile SingularAttribute<Servicos, Double> serValor;
    public static volatile SingularAttribute<Servicos, Integer> serId;

}