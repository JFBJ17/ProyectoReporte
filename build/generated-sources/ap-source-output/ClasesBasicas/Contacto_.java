package ClasesBasicas;

import ClasesBasicas.Direccion;
import ClasesBasicas.Sexo;
import java.util.GregorianCalendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-30T20:22:22")
@StaticMetamodel(Contacto.class)
public class Contacto_ { 

    public static volatile SingularAttribute<Contacto, GregorianCalendar> fechaNac;
    public static volatile SingularAttribute<Contacto, String> apMaterno;
    public static volatile SingularAttribute<Contacto, Direccion> direccion;
    public static volatile SingularAttribute<Contacto, Long> id;
    public static volatile SingularAttribute<Contacto, Sexo> sexo;
    public static volatile SingularAttribute<Contacto, String> nombre;
    public static volatile SingularAttribute<Contacto, String> apPaterno;

}