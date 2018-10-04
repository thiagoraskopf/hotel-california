package entities;

import entities.Hospedagem;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T20:03:35")
@StaticMetamodel(Quarto.class)
public class Quarto_ { 

    public static volatile SingularAttribute<Quarto, Character> quaBanheira;
    public static volatile SingularAttribute<Quarto, Character> quaTv;
    public static volatile SingularAttribute<Quarto, Character> quaAc;
    public static volatile SingularAttribute<Quarto, Integer> quaNumero;
    public static volatile SingularAttribute<Quarto, String> quaStatus;
    public static volatile SingularAttribute<Quarto, String> quaTipo;
    public static volatile SingularAttribute<Quarto, Double> quaValordiaria;
    public static volatile CollectionAttribute<Quarto, Hospedagem> hospedagemCollection;
    public static volatile SingularAttribute<Quarto, Character> quaFrigobar;
    public static volatile SingularAttribute<Quarto, String> quaTipocama;

}