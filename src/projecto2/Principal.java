/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecto2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author carls
 */
public class Principal extends javax.swing.JFrame {

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("Projecto2PU");
        EntityManager entityManager = managerFactory.createEntityManager();

     

    public Principal() {
             entityManager.getTransaction().begin();

        entityManager
                .createNativeQuery("ALTER TABLE `category` AUTO_INCREMENT = 1;")
                .executeUpdate();
        entityManager
                .createNativeQuery("ALTER TABLE `customer` AUTO_INCREMENT = 1;")
                .executeUpdate();
         entityManager
                .createNativeQuery("ALTER TABLE `product` AUTO_INCREMENT = 1;")
                .executeUpdate();
        entityManager
                .createNativeQuery("ALTER TABLE `provider` AUTO_INCREMENT = 1;")
                .executeUpdate();
        
        entityManager
                .createNativeQuery("ALTER TABLE `sale` AUTO_INCREMENT = 1;")
                .executeUpdate();
        entityManager
                .createNativeQuery("ALTER TABLE `saleitem` AUTO_INCREMENT = 1;")
                .executeUpdate();
       entityManager.getTransaction().commit();
        
        initComponents();
        
   
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonCategory = new javax.swing.JButton();
        botonProduct = new javax.swing.JButton();
        botonProvider = new javax.swing.JButton();
        botonCustomer = new javax.swing.JButton();
        botonVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modificar o revisar");

        botonCategory.setText("Category");
        botonCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCategoryActionPerformed(evt);
            }
        });

        botonProduct.setText("Product");
        botonProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProductActionPerformed(evt);
            }
        });

        botonProvider.setText("Provider");
        botonProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProviderActionPerformed(evt);
            }
        });

        botonCustomer.setText("Customer");
        botonCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCustomerActionPerformed(evt);
            }
        });

        botonVenta.setText("Realizar Venta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonCategory)
                        .addGap(148, 148, 148)
                        .addComponent(botonVenta))
                    .addComponent(botonProduct)
                    .addComponent(botonProvider)
                    .addComponent(botonCustomer))
                .addContainerGap(300, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCategory)
                    .addComponent(botonVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonProvider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCustomer)
                .addContainerGap(217, Short.MAX_VALUE))
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

    private void botonProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductActionPerformed
     FormularioProduct fp=new FormularioProduct();
     fp.setVisible(true);
    }//GEN-LAST:event_botonProductActionPerformed

    private void botonCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCategoryActionPerformed
      FormularioCategory fc=new FormularioCategory();
      fc.setVisible(true);
    }//GEN-LAST:event_botonCategoryActionPerformed

    private void botonProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProviderActionPerformed
      FormularioProvider fp=new FormularioProvider();
      fp.setVisible(true);
      
    }//GEN-LAST:event_botonProviderActionPerformed

    private void botonCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCustomerActionPerformed
     FormularioCustomer fc=new FormularioCustomer();
     fc.setVisible(true);
    }//GEN-LAST:event_botonCustomerActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCategory;
    private javax.swing.JButton botonCustomer;
    private javax.swing.JButton botonProduct;
    private javax.swing.JButton botonProvider;
    private javax.swing.JButton botonVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
