package Views;

import java.sql.Connection;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Interface_Agenda {

    public static Register_Contact registerCont;
    public static Show_Agenda showAgenda;
    public static Show_Cita showAppointment;
    public static Register_Cita registerAppointment;
    public static String up = "PxAgendaPU";
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory(up, System.getProperties());
    public static EntityManager em = emf.createEntityManager();

    public static void main(String[] args) {
        registerCont = new Register_Contact();
        showAgenda = new Show_Agenda();

        showAppointment = new Show_Cita();
        registerAppointment = new Register_Cita();

        showAgenda.setVisible(true);

    }

    public static EntityManager crearConexion() {
        return em = emf.createEntityManager();
    }

    public static void imprimirReporte(String reporte, Map parametros, Connection cc) {
        try {

            JasperReport jr = (JasperReport) JRLoader.loadObject(Show_Agenda.class.getResource("/reporte/" + reporte));
            JasperPrint jp = JasperFillManager.fillReport(jr, parametros, cc);
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Show_Agenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
