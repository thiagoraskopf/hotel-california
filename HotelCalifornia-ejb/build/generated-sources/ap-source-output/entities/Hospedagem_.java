package entities;

import entities.Pessoa;
import entities.Quarto;
import entities.Servicos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-10-03T20:03:35")
@StaticMetamodel(Hospedagem.class)
public class Hospedagem_ { 

    public static volatile SingularAttribute<Hospedagem, Date> hosCheckin;
    public static volatile SingularAttribute<Hospedagem, Servicos> hosSerId;
    public static volatile SingularAttribute<Hospedagem, Date> hosCheckout;
    public static volatile SingularAttribute<Hospedagem, Pessoa> hosPessId;
    public static volatile SingularAttribute<Hospedagem, Integer> hosId;
    public static volatile SingularAttribute<Hospedagem, Quarto> hosQuaId;

}