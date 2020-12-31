package Views;

import ClasesBasicas.Contacto;
import Conexion.Conectar;
import static Views.Interface_Agenda.em;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Show_Agenda extends javax.swing.JFrame {

    public static Long ident;
    public static List<Contacto> contactos;
    public static DefaultTableModel model;
    public static Object tabla[];

    public Show_Agenda() {
        initComponents();
        this.setLocationRelativeTo(null);

        String jpql = "SELECT c FROM Contacto c";
        Query query = em.createQuery(jpql);
        contactos = query.getResultList();

        ActualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        cbxOrder = new javax.swing.JComboBox<>();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AGENDA");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CONTACT LIST");

        tablaDatos.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("REGISTER APPOINTMENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setText("REGISTER CONTACT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("SHOW APPOINTMENT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cbxOrder.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        cbxOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<seleccionar>", "Edad", "Apellido" }));
        cbxOrder.setToolTipText("");
        cbxOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOrderActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jButton2)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addGap(50, 50, 50)
                .addComponent(jButton4)
                .addGap(0, 164, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbxOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnImprimir)
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImprimir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        Interface_Agenda.registerCont.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        Interface_Agenda.showAppointment.ActualizarTabla();
        Interface_Agenda.showAppointment.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            int seleccion;
            seleccion = tablaDatos.getSelectedRow();
            if (seleccion >= 0) {
                Long id = new Long(String.valueOf(tablaDatos.getValueAt(seleccion, 0)));
                ident = id;

                DefaultTableModel modelo = (DefaultTableModel) tablaDatos.getModel();
                dispose();
                Interface_Agenda.registerAppointment.Cambiar();
                Interface_Agenda.registerAppointment.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Primero seleccione un contacto");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbxOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOrderActionPerformed
        String result = cbxOrder.getSelectedItem().toString();

        switch (result) {
            case "Edad":
                ordenarEdad();
                break;
            case "Apellido":
                ordenarContactos();
                break;
        }

    }//GEN-LAST:event_cbxOrderActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed

        Map parametros = new HashMap();
        Conectar cc = new Conectar();
        int seleccionar = tablaDatos.getSelectedRow();

        try {
            Connection con = cc.conectarse();
            
            if (seleccionar >= 0) {
                String apPaterno = String.valueOf(tablaDatos.getValueAt(seleccionar, 2));
                parametros.put("CONTACTO", apPaterno);
            }

            Interface_Agenda.imprimirReporte("relacionContactos.jasper", parametros, con);
        } catch (Exception e) {
            Logger.getLogger(Show_Agenda.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    public static void ActualizarTabla() {
        model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Apellido Paterno");
        model.addColumn("Apellido Materno");
        model.addColumn("Sexo");
        model.addColumn("Fecha de Nacimiento");
        model.addColumn("Ciudad");
        model.addColumn("Distrito");
        model.addColumn("Calle");
        model.addColumn("Nro");

        tabla = new Object[10];

        for (int i = 0; i < contactos.size(); i++) {
            tabla[0] = contactos.get(i).getId();
            tabla[1] = contactos.get(i).getNombre();
            tabla[2] = contactos.get(i).getApPaterno();
            tabla[3] = contactos.get(i).getApMaterno();
            tabla[4] = contactos.get(i).getSexo();
            tabla[5] = formatoFecha(contactos.get(i).getFechaNac().getTime());
            tabla[6] = contactos.get(i).getDireccion().getCiudad();
            tabla[7] = contactos.get(i).getDireccion().getDistrito();
            tabla[8] = contactos.get(i).getDireccion().getCalle();
            tabla[9] = contactos.get(i).getDireccion().getNro();
            model.addRow(tabla);
        }
        tablaDatos.setModel(model);
    }

    private static String formatoFecha(Date fecha) {
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        return s.format(fecha.getTime());
    }

    private static void ordenarContactos() {
        Collections.sort(contactos, new Contacto());

        ActualizarTabla();
    }

    private static void ordenarEdad() {
        Collections.sort(contactos, new OrdenarEdad());

        ActualizarTabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JComboBox<String> cbxOrder;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
