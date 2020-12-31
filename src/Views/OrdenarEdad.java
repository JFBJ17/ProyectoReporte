package Views;

import ClasesBasicas.Contacto;
import java.util.Comparator;

public class OrdenarEdad implements Comparator<Contacto>{

    @Override
    public int compare(Contacto o1, Contacto o2) {
        
        return o2.getEdad() - o1.getEdad();
        
    }
}
