/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesBasicas;

import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.Transient;

/**
 *
 * @author user
 */
@Entity
@Table(name = "TBL_CONTACTO")
public class Contacto implements Comparator<Contacto>{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "CONT_ID")
    private Long id;
    @Column(name = "CONT_NOMBRE")
    private String nombre;
    @Column(name = "CONT_AP_PATERNO")
    private String apPaterno;
    @Column(name = "CONT_AP_MATERNO")
    private String apMaterno;
    @Enumerated(EnumType.STRING)
    @Column(name = "CONT_SEXO")
    private Sexo sexo;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private GregorianCalendar fechaNac;
    @Transient
    private int edad;
    @Embedded
    private Direccion direccion;

    public Contacto() {

    }

    public Contacto(String juan, String perez, String benites) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public GregorianCalendar getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(GregorianCalendar fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getEdad() {
        return Calendar.getInstance().get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
                    + "Ap Paterno: " + apPaterno + "\n"
                    + "Ap Materno: " + apMaterno + "\n"
                    + "Sexo: " + sexo + "\n"
                    + "Fecha Nac. : " + fechaNac.getTime() + "\n"
                    + "Edad: " + getEdad() + "\n"
                    + "Direccion: " + "\n" + direccion;
    }

    @Override
    public int compare(Contacto o1, Contacto o2) {
        if(o1.apPaterno.compareTo(o2.apPaterno) != 0){
            return o1.apPaterno.compareTo(o2.apPaterno);
        }
        if(o1.apMaterno.compareTo(o2.apMaterno) != 0){
            return o1.apMaterno.compareTo(o2.apPaterno);
        }
        return o1.nombre.compareTo(o2.nombre);
    }

}
