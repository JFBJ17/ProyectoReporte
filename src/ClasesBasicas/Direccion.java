package ClasesBasicas;

import javax.persistence.Embeddable;


@Embeddable
public class Direccion {
    private String calle;
    private String nro;
    private String distrito;
    private String ciudad;
    
    public Direccion(){
        
    }
    
    public Direccion(String calle, String nro, String distrito, String ciudad){
        this.calle = calle;
        this.nro = nro;
        this.ciudad = ciudad;
        this.distrito = distrito;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNro() {
        return nro;
    }

    public void setNro(String nro) {
        this.nro = nro;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
}
