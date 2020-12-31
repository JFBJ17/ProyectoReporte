/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prueba;

import ClasesBasicas.Cita;
import ClasesBasicas.Contacto;
import ClasesBasicas.Direccion;
import ClasesBasicas.Sexo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author user
 */
public class PruebaAgenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String up = "PxAgendaPU";
        EntityManager em;
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(up, System.getProperties());
        em = emf.createEntityManager();
        Calendar fecha = Calendar.getInstance();
        fecha.set(1986, 9, 4);
        /*em.getTransaction().begin();
        Contacto c = new Contacto();
        Direccion d = new Direccion();
        c.setNombre("Luis José");
        c.setApPaterno("Saldaña");
        c.setApMaterno("Calderón");
        c.setFechaNac((GregorianCalendar) fecha);
        c.setSexo(Sexo.MASCULINO);
        d.setCalle("Av. Perez Aranibar");
        d.setNro("437");
        d.setDistrito("Miraflores");
        d.setCiudad("Lima");
        c.setDireccion(d);
        em.persist(c);
        em.flush();
        em.getTransaction().commit();
        
        //Creando Cita
        em.getTransaction().begin();
        Cita cita = new Cita();
        cita.setContacto(c);
        cita.setFecha(Calendar.getInstance());
        cita.setMotivo("Reunión extraordinaria");
        em.persist(cita);
        em.flush();
        em.getTransaction().commit();
         */

        String jpql = "SELECT c FROM Contacto c";
        Query query = em.createQuery(jpql);
        List<Contacto> contactos = query.getResultList();
        System.out.println("Relacion de contactos:");
        for (int i = 0; i < contactos.size(); i++) {
            System.out.println(contactos.get(i));
        }
        jpql = "SELECT ci from Cita ci INNER JOIN ci.contacto co";
        query = em.createQuery(jpql);
        List<Cita> citas = query.getResultList();
        System.out.println("Relacion de Citas");
        int j = 0;
        for (Cita cita1 : citas) {
            System.out.println("Cita " + j++);
            System.out.println(cita1);
        }
        em.close();
    }

    /*private static void ordenarContactos() {
        Collections.sort(list, new Contacto());
        int pos = Collections.binarySearch(list, new Contacto("Juan", "Perez", "Benites"), new Contacto());
        c = list.get(pos);
    
    }*/

}
