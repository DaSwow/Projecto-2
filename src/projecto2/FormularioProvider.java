/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto2;

import entities.Provider;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.swing.table.DefaultTableModel;
import Implementations.BaseRepository;
import Implementations.CategoryRepositoryImpl;
import Implementations.ProviderRepositoryImpl;
import persistence.CategoryRepository;
import persistence.ProviderRepository;

/**
 *
 * @author carls
 */
public class FormularioProvider extends javax.swing.JFrame {

    ArrayList<Provider> proveedores = new ArrayList();

    CategoryRepository brcg = new CategoryRepositoryImpl(em);
    ProviderRepository brpv = new ProviderRepositoryImpl(em);

    public FormularioProvider() {
        initComponents();

        poblarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProviders = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        botonModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoId = new javax.swing.JTextField();
        campoAddress = new javax.swing.JTextField();
        campoPhone = new javax.swing.JTextField();
        campoWebsite = new javax.swing.JTextField();
        campoName = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaProviders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Phone", "Website"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProviders);
        if (tablaProviders.getColumnModel().getColumnCount() > 0) {
            tablaProviders.getColumnModel().getColumn(0).setResizable(false);
            tablaProviders.getColumnModel().getColumn(1).setResizable(false);
            tablaProviders.getColumnModel().getColumn(2).setResizable(false);
            tablaProviders.getColumnModel().getColumn(3).setResizable(false);
            tablaProviders.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setText("Lista");

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel3.setText("Name");

        jLabel4.setText("Address");

        jLabel5.setText("Phone");

        jLabel6.setText("Website");

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonActualizar.setText("Actualizar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(botonActualizar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(botonModificar)
                                                .addGap(149, 149, 149))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel2)))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(campoName, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(185, 185, 185)
                                        .addComponent(botonAgregar)
                                        .addGap(66, 66, 66)
                                        .addComponent(botonEditar)
                                        .addGap(63, 63, 63)
                                        .addComponent(botonBorrar))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 717, Short.MAX_VALUE)
                                .addComponent(botonCerrar)
                                .addGap(95, 95, 95))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCerrar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(botonActualizar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(botonModificar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(campoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(campoName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(campoAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(campoPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(campoWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botonAgregar)
                                    .addComponent(botonEditar)
                                    .addComponent(botonBorrar))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        poblarTabla();

    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed

        Provider pv = new Provider();
        pv.setAddress(campoAddress.getText());
        pv.setName(campoName.getText());
        pv.setPhone(campoPhone.getText());
        pv.setWebsite(campoWebsite.getText());

        brpv.save(pv);

        poblarTabla();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        if (!campoId.getText().equals("")) {
            Provider pv = new Provider();
            pv.setName(campoName.getText());
            pv.setId(Integer.parseInt(campoId.getText()));
            pv.setAddress(campoAddress.getText());
            pv.setPhone(campoPhone.getText());
            pv.setWebsite(campoWebsite.getText());


            brpv.edit(pv);

        }

        poblarTabla();
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        if (!campoId.getText().equals("")) {

          
            Provider pv = new Provider();
            pv.setName(campoName.getText());
            pv.setId(Integer.parseInt(campoId.getText()));
            pv.setAddress(campoAddress.getText());
            pv.setPhone(campoPhone.getText());
            pv.setWebsite(campoWebsite.getText());
            brpv.delete(pv);
            campoAddress.setText("");
            campoId.setText("");
            campoName.setText("");
            campoPhone.setText("");
            campoWebsite.setText("");
        }

        poblarTabla();
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if (tablaProviders.getSelectedRow() != (-1)) {
            if (tablaProviders.getValueAt(tablaProviders.getSelectedRow(), 0) != null) {
                campoId.setText(tablaProviders.getValueAt(tablaProviders.getSelectedRow(), 0).toString());
            }
            if (tablaProviders.getValueAt(tablaProviders.getSelectedRow(), 1) != null) {
                campoName.setText(tablaProviders.getValueAt(tablaProviders.getSelectedRow(), 1).toString());
            }
            if (tablaProviders.getValueAt(tablaProviders.getSelectedRow(), 2) != null) {
                campoAddress.setText(tablaProviders.getValueAt(tablaProviders.getSelectedRow(), 2).toString());
            }
            if (tablaProviders.getValueAt(tablaProviders.getSelectedRow(), 3) != null) {
                campoPhone.setText(tablaProviders.getValueAt(tablaProviders.getSelectedRow(), 3).toString());
            }
            if (tablaProviders.getValueAt(tablaProviders.getSelectedRow(), 4) != null) {
                campoWebsite.setText(tablaProviders.getValueAt(tablaProviders.getSelectedRow(), 4).toString());
            }
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    static EntityManager em;

    public void poblarTabla() {
        DefaultTableModel tm = (DefaultTableModel) tablaProviders.getModel();
        int rowCount = tm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {

            tm.removeRow(i);

        }

      
        proveedores = brpv.getAll();
        DefaultTableModel tableModel ;

        for (Provider proveedor : proveedores) {
            tableModel = (DefaultTableModel) tablaProviders.getModel();
            Object[] objs = {proveedor.getId(), proveedor.getName(), proveedor.getAddress(), proveedor.getPhone(), proveedor.getWebsite()};

            tableModel.addRow(objs);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField campoAddress;
    private javax.swing.JTextField campoId;
    private javax.swing.JTextField campoName;
    private javax.swing.JTextField campoPhone;
    private javax.swing.JTextField campoWebsite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProviders;
    // End of variables declaration//GEN-END:variables
}
