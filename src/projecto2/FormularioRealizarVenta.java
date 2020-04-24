/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto2;

import entities.Customer;
import entities.Product;
import entities.Sale;
import entities.SaleItem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.swing.table.DefaultTableModel;
import Implementations.CustomerRepositoryImpl;
import Implementations.ProductRepositoryImpl;
import Implementations.SaleItemRepositoryImpl;
import Implementations.SaleRepositoryImpl;
import persistence.CustomerRepository;
import persistence.ProductRepository;
import persistence.SaleItemRepository;
import persistence.SaleRepository;

/**
 *
 * @author carls
 */
public class FormularioRealizarVenta extends javax.swing.JFrame {

    ArrayList<Sale> sales = new ArrayList();

    public FormularioRealizarVenta() {
        initComponents();

    }

  
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    
        CustomerRepository brcm = new CustomerRepositoryImpl(em);
        SaleRepository brsl = new SaleRepositoryImpl(em);
        ProductRepository brpd = new ProductRepositoryImpl(em);
        SaleItemRepository brsi = new SaleItemRepositoryImpl(em);
        
    static EntityManager em;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        campoDate = new javax.swing.JTextField();
        campoDiscount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoTotal = new javax.swing.JTextField();
        campoCustomerID = new javax.swing.JTextField();
        botonRealizarVenta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoProductID = new javax.swing.JTextField();
        campoQuantity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSaleItems = new javax.swing.JTable();
        botonAgregarProducto = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Date");

        jLabel3.setText("Discount");

        jLabel4.setText("Total");

        jLabel5.setText("CustomerID");

        campoTotal.setEditable(false);

        botonRealizarVenta.setText("Realizar Venta");
        botonRealizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRealizarVentaActionPerformed(evt);
            }
        });

        jLabel6.setText("ProductID");

        jLabel7.setText("Quantity");

        jLabel8.setText("Products to purchase");

        tablaSaleItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
        }

        botonAgregarProducto.setText("Agregar producto");
        botonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarProductoActionPerformed(evt);
            }
        });

        jLabel10.setText("Información de la Venta");

        jLabel11.setText("Items");

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(532, 532, 532))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoDiscount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoCustomerID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(botonAgregarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRealizarVenta)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(campoDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(campoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(botonRealizarVenta)
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addComponent(botonAgregarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRealizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRealizarVentaActionPerformed

        if (tablaSaleItems.getRowCount() == 0) {
            return;
        }

        Sale sale = new Sale();
        Customer cm;


        cm = (Customer) brcm.find(Integer.parseInt(campoCustomerID.getText()));
        if (cm == null) {
            return;
        }
        sale.setCustomer(cm);
        sale.setCustomerId(cm.getId());

        try {
            sale.setDate(sdf.parse(campoDate.getText()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        sale.setDiscount(Float.parseFloat(campoDiscount.getText()));

        float total = 0;
        for (int i = 0; i < tablaSaleItems.getRowCount(); i++) {
            total = total + (float) tablaSaleItems.getValueAt(i, 3);

        }
        total = total - (total * Float.parseFloat(campoDiscount.getText()));
        sale.setTotal(total);

        brsl.save(sale);
        sale = (Sale) brsl.find(sale.getId());

        for (int i = 0; i < tablaSaleItems.getRowCount(); i++) {
            SaleItem si = new SaleItem();
            si.setProduct((Product) brpd.find((int) tablaSaleItems.getValueAt(i, 0)));
            si.setProductId(si.getProduct().getId());
            si.setPrice((float) tablaSaleItems.getValueAt(i, 1));
            si.setQuantity((int) tablaSaleItems.getValueAt(i, 2));
            si.setTotal((float) tablaSaleItems.getValueAt(i, 3));
            si.setSale(sale);
            si.setSaleId(si.getSale().getId());
            brsi.save(si);
        }


    }//GEN-LAST:event_botonRealizarVentaActionPerformed

    private void botonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarProductoActionPerformed

       
        Product product = (Product) brpd.find(Integer.parseInt(campoProductID.getText()));
        if (product == null) {
            return;
        }
        int cantidad = Integer.parseInt(campoQuantity.getText());

        DefaultTableModel tableModel ;

        tableModel = (DefaultTableModel) tablaSaleItems.getModel();
        Object[] objs = {product.getId(), product.getPrice(), cantidad, cantidad * product.getPrice()};

        tableModel.addRow(objs);
        float total = 0;
        for (int i = 0; i < tablaSaleItems.getRowCount(); i++) {
            total = total + (float) tablaSaleItems.getValueAt(i, 3);
        }


    }//GEN-LAST:event_botonAgregarProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarProducto;
    private javax.swing.JButton botonRealizarVenta;
    private javax.swing.JTextField campoCustomerID;
    private javax.swing.JTextField campoDate;
    private javax.swing.JTextField campoDiscount;
    private javax.swing.JTextField campoProductID;
    private javax.swing.JTextField campoQuantity;
    private javax.swing.JTextField campoTotal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tablaSaleItems;
    // End of variables declaration//GEN-END:variables
}
