/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBasicas;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author user
 */
@Entity
@Table (name = "TBL_CITA")
public class Cita {

    @Id
    @Column (name = "CITA_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column (name = "CITA_MOTIVO")
    private String motivo;
    @Column (name = "CITA_FECHA")
    @Temporal (TemporalType.TIMESTAMP)
    private Calendar fecha;
    @ManyToOne
    @JoinColumn (name = "CONT_ID")
    private Contacto contacto;
    
    public Cita() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Motivo: " + motivo + "\n"
                    + "Fecha: " + fecha.getTime() + "\n"
                    + "Datos del Contacto\n" + contacto;
    }
    
}
