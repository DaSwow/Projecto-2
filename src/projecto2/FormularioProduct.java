/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto2;

import entities.Category;
import entities.Product;
import entities.Provider;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.swing.table.DefaultTableModel;
import Implementations.BaseRepositoryImpl;
import Implementations.CategoryRepositoryImpl;
import Implementations.ProductRepositoryImpl;
import Implementations.ProviderRepositoryImpl;

/**
 *
 * @author carls
 */
public class FormularioProduct extends javax.swing.JFrame {

    ArrayList<Product> products = new ArrayList();

    public FormularioProduct() {
        initComponents();
        Principal principal = new Principal();
        em = principal.getEntityManager();

        poblarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProduct = new javax.swing.JTable();
        botonModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoCategoryID = new javax.swing.JTextField();
        campoID = new javax.swing.JTextField();
        campoProviderID = new javax.swing.JTextField();
        campoStock = new javax.swing.JTextField();
        campoPrice = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        botonAgregar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lista");

        tablaProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Price", "Stock", "ProviderID", "CategoryID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProduct);
        if (tablaProduct.getColumnModel().getColumnCount() > 0) {
            tablaProduct.getColumnModel().getColumn(0).setResizable(false);
            tablaProduct.getColumnModel().getColumn(1).setResizable(false);
            tablaProduct.getColumnModel().getColumn(2).setResizable(false);
            tablaProduct.getColumnModel().getColumn(3).setResizable(false);
            tablaProduct.getColumnModel().getColumn(4).setResizable(false);
            tablaProduct.getColumnModel().getColumn(5).setResizable(false);
        }

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        jLabel3.setText("Nombre");

        jLabel4.setText("Price");

        jLabel5.setText("Stock");

        jLabel6.setText("ProviderID");

        jLabel7.setText("CategoryID");

        campoID.setEditable(false);

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

        jButton4.setText("Actualizar");

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
                        .addComponent(jButton4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonModificar)
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(botonAgregar))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botonEditar)
                                        .addGap(47, 47, 47)
                                        .addComponent(botonBorrar))
                                    .addComponent(campoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoProviderID, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 636, Short.MAX_VALUE)
                                .addComponent(botonCerrar)
                                .addGap(62, 62, 62))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonCerrar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton4))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonModificar)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(campoCategoryID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(campoProviderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(campoStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoNombre)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(campoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(botonAgregar)
                                    .addComponent(botonEditar)
                                    .addComponent(botonBorrar))))))
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed

        BaseRepositoryImpl brpd = new ProductRepositoryImpl(em);
        BaseRepositoryImpl brcg = new CategoryRepositoryImpl(em);
        BaseRepositoryImpl brpv = new ProviderRepositoryImpl(em);

        Product pd = new Product();
        try {
            pd.setCategory((Category) brcg.find(Integer.parseInt(campoCategoryID.getText())));
            if (pd.getCategory() != null) {
                pd.setCategoryId(pd.getCategory().getId());
            }
            pd.setProvider((Provider) brpv.find(Integer.parseInt(campoProviderID.getText())));
            if (pd.getProvider() != null) {
                pd.setProviderId(pd.getProvider().getId());
            }
            if (pd.getCategory() == null || pd.getProvider() == null) {
                return;
            }

        } catch (NumberFormatException e) {
            return;
        }

        pd.setName(campoNombre.getText());
        pd.setPrice(Float.parseFloat(campoPrice.getText()));
        pd.setStock(Integer.parseInt(campoStock.getText()));
        brpd.save(pd);

        poblarTabla();
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        if (!campoID.getText().equals("")) {
            BaseRepositoryImpl brpd = new ProductRepositoryImpl(em);
            BaseRepositoryImpl brcg = new CategoryRepositoryImpl(em);
            BaseRepositoryImpl brpv = new ProviderRepositoryImpl(em);

            Product pd = new Product();
            pd.setName(campoNombre.getText());
            pd.setPrice(Float.parseFloat(campoPrice.getText()));
            pd.setStock(Integer.parseInt(campoStock.getText()));

            try {
                pd.setCategory((Category) brcg.find(Integer.parseInt(campoCategoryID.getText())));
                if (pd.getCategory() != null) {
                    pd.setCategoryId(pd.getCategory().getId());
                }
                pd.setProvider((Provider) brpv.find(Integer.parseInt(campoProviderID.getText())));
                if (pd.getProvider() != null) {
                    pd.setProviderId(pd.getProvider().getId());
                }
                if (pd.getCategory() == null || pd.getProvider() == null) {
                    return;
                }

            } catch (NumberFormatException e) {
                return;
            }
            pd.setId(Integer.parseInt(campoID.getText()));

            brpd.save(pd);

        }

        poblarTabla();
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        if (!campoID.getText().equals("")) {
            BaseRepositoryImpl brpd = new ProductRepositoryImpl(em);
            BaseRepositoryImpl brcg = new CategoryRepositoryImpl(em);
            BaseRepositoryImpl brpv = new ProviderRepositoryImpl(em);

            Product pd = new Product();
            pd.setName(campoNombre.getText());
            pd.setPrice(Float.parseFloat(campoPrice.getText()));
            pd.setStock(Integer.parseInt(campoStock.getText()));

            try {
                pd.setCategory((Category) brcg.find(Integer.parseInt(campoCategoryID.getText())));
                if (pd.getCategory() != null) {
                    pd.setCategoryId(pd.getCategory().getId());
                }
                pd.setProvider((Provider) brpv.find(Integer.parseInt(campoProviderID.getText())));
                if (pd.getProvider() != null) {
                    pd.setProviderId(pd.getProvider().getId());
                }
                if (pd.getCategory() == null || pd.getProvider() == null) {
                    return;
                }

            } catch (NumberFormatException e) {
                return;
            }
            pd.setId(Integer.parseInt(campoID.getText()));

            brpd.delete(pd);
            campoID.setText("");
            campoCategoryID.setText("");
            campoNombre.setText("");
            campoPrice.setText("");
            campoProviderID.setText("");
            campoStock.setText("");

        }

        poblarTabla();

    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if (tablaProduct.getSelectedRow() != (-1)) {
            if (tablaProduct.getValueAt(tablaProduct.getSelectedRow(), 0) != null) {
                campoID.setText(tablaProduct.getValueAt(tablaProduct.getSelectedRow(), 0).toString());
            }
            if (tablaProduct.getValueAt(tablaProduct.getSelectedRow(), 1) != null) {
                campoNombre.setText(tablaProduct.getValueAt(tablaProduct.getSelectedRow(), 1).toString());
            }
            if (tablaProduct.getValueAt(tablaProduct.getSelectedRow(), 2) != null) {
                campoPrice.setText(tablaProduct.getValueAt(tablaProduct.getSelectedRow(), 2).toString());
            }
            if (tablaProduct.getValueAt(tablaProduct.getSelectedRow(), 3) != null) {
                campoStock.setText(tablaProduct.getValueAt(tablaProduct.getSelectedRow(), 3).toString());
            }
            if (tablaProduct.getValueAt(tablaProduct.getSelectedRow(), 4) != null) {
                campoProviderID.setText(tablaProduct.getValueAt(tablaProduct.getSelectedRow(), 4).toString());
            }
            if (tablaProduct.getValueAt(tablaProduct.getSelectedRow(), 5) != null) {
                campoCategoryID.setText(tablaProduct.getValueAt(tablaProduct.getSelectedRow(), 5).toString());
            }
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    static EntityManager em;

    public void poblarTabla() {
        DefaultTableModel tm = (DefaultTableModel) tablaProduct.getModel();
        int rowCount = tm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {

            tm.removeRow(i);

        }

        BaseRepositoryImpl br = new ProductRepositoryImpl(em);
        products = br.getAll(Product.class);
        DefaultTableModel tableModel = new DefaultTableModel();

        for (Product producto : products) {
            tableModel = (DefaultTableModel) tablaProduct.getModel();
            Object[] objs = {producto.getId(), producto.getName(), producto.getPrice(), producto.getStock(), producto.getCategoryId(), producto.getProviderId()};

            tableModel.addRow(objs);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField campoCategoryID;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoPrice;
    private javax.swing.JTextField campoProviderID;
    private javax.swing.JTextField campoStock;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProduct;
    // End of variables declaration//GEN-END:variables
}
