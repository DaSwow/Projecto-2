/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto2;

import entities.Sale;
import entities.SaleItem;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Implementations.BaseRepositoryImpl;
import Implementations.SaleRepositoryImpl;
import static projecto2.FormularioProvider.em;

public class FormularioSales extends javax.swing.JFrame {

    private ArrayList<Sale> sales;
    private ArrayList<SaleItem> saleItems;

    public FormularioSales() {
        initComponents();
  
        poblarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaSales = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSaleItems = new javax.swing.JTable();
        botonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        tablaSales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Discount", "Total", "CustomerID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaSales);
        if (tablaSales.getColumnModel().getColumnCount() > 0) {
            tablaSales.getColumnModel().getColumn(0).setResizable(false);
            tablaSales.getColumnModel().getColumn(1).setResizable(false);
            tablaSales.getColumnModel().getColumn(2).setResizable(false);
            tablaSales.getColumnModel().getColumn(3).setResizable(false);
            tablaSales.getColumnModel().getColumn(4).setResizable(false);
        }

        tablaSaleItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ProductID", "SaleID", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaSaleItems);
        if (tablaSaleItems.getColumnModel().getColumnCount() > 0) {
            tablaSaleItems.getColumnModel().getColumn(0).setResizable(false);
            tablaSaleItems.getColumnModel().getColumn(1).setResizable(false);
            tablaSaleItems.getColumnModel().getColumn(2).setResizable(false);
            tablaSaleItems.getColumnModel().getColumn(3).setResizable(false);
            tablaSaleItems.getColumnModel().getColumn(4).setResizable(false);
            tablaSaleItems.getColumnModel().getColumn(5).setResizable(false);
        }

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Sale");

        jLabel2.setText("Sale Items");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(botonCerrar))
                    .addComponent(jLabel2))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(botonCerrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(botonBuscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if (tablaSales.getSelectedRow() == (-1)) {
            return;
        }

        DefaultTableModel tm = (DefaultTableModel) tablaSaleItems.getModel();
        int rowCount = tm.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {

            tm.removeRow(i);

        }

        SaleRepositoryImpl br = new SaleRepositoryImpl(em);

        saleItems = br.findAllItemSales((Integer) tablaSales.getValueAt(tablaSales.getSelectedRow(), 0));

        for (SaleItem saleItem : saleItems) {
            tm = (DefaultTableModel) tablaSaleItems.getModel();
            Object[] objs = {saleItem.getId(), saleItem.getProductId(), saleItem.getSaleId(), saleItem.getPrice(), saleItem.getQuantity(), saleItem.getTotal()};

            tm.addRow(objs);
        }


    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    public void poblarTabla() {

        BaseRepositoryImpl br = new SaleRepositoryImpl(em);

        sales = br.getAll(Sale.class);

        DefaultTableModel tableModel = new DefaultTableModel();

        for (Sale sale : sales) {
            tableModel = (DefaultTableModel) tablaSales.getModel();
            Object[] objs = {sale.getId(), sale.getDate(), sale.getDiscount(), sale.getTotal(), sale.getCustomerId()};

            tableModel.addRow(objs);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaSaleItems;
    private javax.swing.JTable tablaSales;
    // End of variables declaration//GEN-END:variables
}
