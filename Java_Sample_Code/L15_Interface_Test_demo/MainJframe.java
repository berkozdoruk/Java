package labguide15_q1;

public class MainJframe extends javax.swing.JFrame {

    public MainJframe() {
        initComponents();

        technologyPanel.setVisible(false);
        foodPanel.setVisible(false);
        textilePanel.setVisible(false);
    }

    public void clear() {
        pId_TF.setText("");
        pName_TF.setText("");
        price_TF.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        productPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pName_TF = new javax.swing.JTextField();
        pId_TF = new javax.swing.JTextField();
        price_TF = new javax.swing.JTextField();
        technology_RB = new javax.swing.JRadioButton();
        food_RB = new javax.swing.JRadioButton();
        textile_RB = new javax.swing.JRadioButton();
        allProductsPanel = new javax.swing.JPanel();
        technologyPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        opSystem_CB = new javax.swing.JComboBox();
        foodPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        diabetic_ChB = new javax.swing.JCheckBox();
        textilePanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        alergicTest_ChB = new javax.swing.JCheckBox();
        addButton = new javax.swing.JButton();
        displayButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArea_TA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product");

        productPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Add Product"));

        jLabel1.setText("Product Id:");

        jLabel2.setText("Product Name:");

        jLabel3.setText("Price:");

        pName_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pName_TFActionPerformed(evt);
            }
        });

        pId_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pId_TFActionPerformed(evt);
            }
        });

        price_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_TFActionPerformed(evt);
            }
        });

        buttonGroup1.add(technology_RB);
        technology_RB.setText("Technology");
        technology_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                technology_RBActionPerformed(evt);
            }
        });

        buttonGroup1.add(food_RB);
        food_RB.setText("Food");
        food_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                food_RBActionPerformed(evt);
            }
        });

        buttonGroup1.add(textile_RB);
        textile_RB.setText("Textile");
        textile_RB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textile_RBActionPerformed(evt);
            }
        });

        allProductsPanel.setLayout(new javax.swing.OverlayLayout(allProductsPanel));

        jLabel4.setText("Operating System:");

        opSystem_CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IOS", "Windows" }));

        javax.swing.GroupLayout technologyPanelLayout = new javax.swing.GroupLayout(technologyPanel);
        technologyPanel.setLayout(technologyPanelLayout);
        technologyPanelLayout.setHorizontalGroup(
            technologyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(technologyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(opSystem_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        technologyPanelLayout.setVerticalGroup(
            technologyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(technologyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(technologyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(opSystem_CB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        allProductsPanel.add(technologyPanel);

        jLabel5.setText("Diabetic:");

        javax.swing.GroupLayout foodPanelLayout = new javax.swing.GroupLayout(foodPanel);
        foodPanel.setLayout(foodPanelLayout);
        foodPanelLayout.setHorizontalGroup(
            foodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(diabetic_ChB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        foodPanelLayout.setVerticalGroup(
            foodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(foodPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(foodPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(diabetic_ChB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        allProductsPanel.add(foodPanel);

        jLabel6.setText("Allergic Test:");

        javax.swing.GroupLayout textilePanelLayout = new javax.swing.GroupLayout(textilePanel);
        textilePanel.setLayout(textilePanelLayout);
        textilePanelLayout.setHorizontalGroup(
            textilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alergicTest_ChB)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        textilePanelLayout.setVerticalGroup(
            textilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textilePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(textilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alergicTest_ChB, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        allProductsPanel.add(textilePanel);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        displayButton.setText("Display");
        displayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout productPanelLayout = new javax.swing.GroupLayout(productPanel);
        productPanel.setLayout(productPanelLayout);
        productPanelLayout.setHorizontalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(productPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(allProductsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(displayButton)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1))
                    .addGroup(productPanelLayout.createSequentialGroup()
                        .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, productPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(pId_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(pName_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(productPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(technology_RB)
                                .addGap(76, 76, 76)
                                .addComponent(food_RB)
                                .addGap(91, 91, 91)
                                .addComponent(textile_RB)))
                        .addGap(18, 18, 18)
                        .addComponent(price_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        productPanelLayout.setVerticalGroup(
            productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pId_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(pName_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(price_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(technology_RB)
                    .addComponent(food_RB)
                    .addComponent(textile_RB))
                .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(productPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(displayButton)
                            .addComponent(jButton1)))
                    .addGroup(productPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(allProductsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(234, 234, 234))
        );

        displayArea_TA.setColumns(20);
        displayArea_TA.setRows(5);
        jScrollPane1.setViewportView(displayArea_TA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pName_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pName_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pName_TFActionPerformed

    private void pId_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pId_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pId_TFActionPerformed

    private void price_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_TFActionPerformed

    private void technology_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_technology_RBActionPerformed
        technologyPanel.setVisible(true);
        foodPanel.setVisible(false);
        textilePanel.setVisible(false);
    }//GEN-LAST:event_technology_RBActionPerformed

    private void food_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_food_RBActionPerformed
        foodPanel.setVisible(true);
        textilePanel.setVisible(false);
        technologyPanel.setVisible(false);
     }//GEN-LAST:event_food_RBActionPerformed

    private void textile_RBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textile_RBActionPerformed
        textilePanel.setVisible(true);
        foodPanel.setVisible(false);
        technologyPanel.setVisible(false);
    }//GEN-LAST:event_textile_RBActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int pId;
        String pname;
        double price;
        boolean val = false;
        pId = Integer.parseInt(pId_TF.getText());
        pname = pName_TF.getText();
        price = Double.parseDouble(price_TF.getText());

        if (technology_RB.isSelected()) {
            String oName = (String) opSystem_CB.getSelectedItem();
            Technology tech = new Technology(pId, pname, price, oName);
            val = ProductSys.addProduct(tech);
        } else if (food_RB.isSelected()) {
            boolean val2 = diabetic_ChB.isSelected();
            Food p = new Food(pId, pname, price, val2);
            val = ProductSys.addProduct(p);
        } else if (textile_RB.isSelected()) {
            boolean val2 = alergicTest_ChB.isSelected();
            Textile t = new Textile(pId, pname, price, val2);
            val = ProductSys.addProduct(t);
        }
        if (!val) {
            displayArea_TA.setText("Same id can not be enter. Please enter different id.");
        } else {
            displayArea_TA.setText("Product is added!!");
        }

    }//GEN-LAST:event_addButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void displayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayButtonActionPerformed
        displayArea_TA.setText(ProductSys.displayWithCost());
    }//GEN-LAST:event_displayButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JCheckBox alergicTest_ChB;
    private javax.swing.JPanel allProductsPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox diabetic_ChB;
    private javax.swing.JTextArea displayArea_TA;
    private javax.swing.JButton displayButton;
    private javax.swing.JPanel foodPanel;
    private javax.swing.JRadioButton food_RB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox opSystem_CB;
    private javax.swing.JTextField pId_TF;
    private javax.swing.JTextField pName_TF;
    private javax.swing.JTextField price_TF;
    private javax.swing.JPanel productPanel;
    private javax.swing.JPanel technologyPanel;
    private javax.swing.JRadioButton technology_RB;
    private javax.swing.JPanel textilePanel;
    private javax.swing.JRadioButton textile_RB;
    // End of variables declaration//GEN-END:variables
}
