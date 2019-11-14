
package labguide10_q2;

import javax.swing.ImageIcon;


public class MainFrame extends javax.swing.JFrame {

    Book b =null ;
    ImageIcon ok = new ImageIcon(getClass().getResource("ok.png"));
    ImageIcon not = new ImageIcon(getClass().getResource("not.png"));

    public MainFrame() {
        initComponents();
        id_label.setVisible(false);
        id_TF.setVisible(false);
        delete_JButton.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBookPanel = new javax.swing.JPanel();
        addBook_JButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name_TF = new javax.swing.JTextField();
        year_TF = new javax.swing.JTextField();
        price_TF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        deleteRadioButon = new javax.swing.JRadioButton();
        id_TF = new javax.swing.JTextField();
        id_label = new javax.swing.JLabel();
        delete_JButton = new javax.swing.JButton();
        info_Label = new javax.swing.JLabel();
        DisplayPanel = new javax.swing.JPanel();
        display_JButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display_TA = new javax.swing.JTextArea();
        maxPrice_JButton = new javax.swing.JButton();
        findBook_JButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        name_find_TF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Book");

        AddBookPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Add & Delete Book"));

        addBook_JButton.setText("Add Book");
        addBook_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBook_JButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Name:");

        jLabel3.setText("Year:");

        jLabel4.setText("Price:");

        jLabel5.setText("Author:");

        deleteRadioButon.setText("Delete");
        deleteRadioButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRadioButonActionPerformed(evt);
            }
        });

        id_label.setText("Id:");

        delete_JButton.setText("Delete");
        delete_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddBookPanelLayout = new javax.swing.GroupLayout(AddBookPanel);
        AddBookPanel.setLayout(AddBookPanelLayout);
        AddBookPanelLayout.setHorizontalGroup(
            AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBookPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddBookPanelLayout.createSequentialGroup()
                        .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addBook_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(info_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)))
                    .addGroup(AddBookPanelLayout.createSequentialGroup()
                        .addComponent(deleteRadioButon)
                        .addGap(51, 51, 51)
                        .addComponent(id_label)))
                .addGap(25, 25, 25)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id_TF)
                    .addComponent(jTextField1)
                    .addComponent(name_TF, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddBookPanelLayout.createSequentialGroup()
                        .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(28, 28, 28)
                        .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(price_TF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(year_TF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)))
                    .addComponent(delete_JButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AddBookPanelLayout.setVerticalGroup(
            AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddBookPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(addBook_JButton))
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddBookPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(price_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AddBookPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(info_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AddBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_label)
                    .addComponent(delete_JButton)
                    .addComponent(deleteRadioButon))
                .addContainerGap())
        );

        DisplayPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Display"));

        display_JButton.setText("Display Book List");
        display_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display_JButtonActionPerformed(evt);
            }
        });

        display_TA.setColumns(20);
        display_TA.setRows(5);
        jScrollPane1.setViewportView(display_TA);

        maxPrice_JButton.setText("See Max. Price");
        maxPrice_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxPrice_JButtonActionPerformed(evt);
            }
        });

        findBook_JButton.setText("Find Book");
        findBook_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBook_JButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Book name:");

        javax.swing.GroupLayout DisplayPanelLayout = new javax.swing.GroupLayout(DisplayPanel);
        DisplayPanel.setLayout(DisplayPanelLayout);
        DisplayPanelLayout.setHorizontalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(maxPrice_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(display_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(findBook_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(name_find_TF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addContainerGap())
        );
        DisplayPanelLayout.setVerticalGroup(
            DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayPanelLayout.createSequentialGroup()
                .addGroup(DisplayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DisplayPanelLayout.createSequentialGroup()
                        .addComponent(display_JButton)
                        .addGap(29, 29, 29)
                        .addComponent(maxPrice_JButton)
                        .addGap(36, 36, 36)
                        .addComponent(findBook_JButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(name_find_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddBookPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddBookPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DisplayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBook_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBook_JButtonActionPerformed
        String name, author;
        int year;
        double price;
        boolean val;
        //get the variables from user by using the textfields
        name = name_TF.getText();
        author = jTextField1.getText();
        year = Integer.parseInt(year_TF.getText());
        price = Double.parseDouble(price_TF.getText());

        b = new Book(name, author, year, price);
        

        val = BookList.addBook(b);
        if (val) {
            info_Label.setIcon(ok);
        } else {
            info_Label.setIcon(not);
        }

    }//GEN-LAST:event_addBook_JButtonActionPerformed

    private void display_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display_JButtonActionPerformed
        display_TA.setText(BookList.display());
    }//GEN-LAST:event_display_JButtonActionPerformed

    private void deleteRadioButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRadioButonActionPerformed
        if (deleteRadioButon.isSelected()) {
            id_label.setVisible(true);
            id_TF.setVisible(true);
            delete_JButton.setVisible(true);
        } else {
            id_label.setVisible(false);
            id_TF.setVisible(false);
            delete_JButton.setVisible(false);
        }
    }//GEN-LAST:event_deleteRadioButonActionPerformed

    private void delete_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_JButtonActionPerformed

        boolean val = BookList.removeBook(id_TF.getText());
        if (val) {
            display_TA.setText("Book with " + id_TF.getText() + " id is removed");
        } else {
            display_TA.setText("Book with " + id_TF.getText() + " id could not be removed");
        }

    }//GEN-LAST:event_delete_JButtonActionPerformed

    private void maxPrice_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxPrice_JButtonActionPerformed
        display_TA.setText("The maximum price is " + BookList.getMaximumPriceBook());
    }//GEN-LAST:event_maxPrice_JButtonActionPerformed

    private void findBook_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBook_JButtonActionPerformed
        String name = name_find_TF.getText();
        Book b = BookList.getBook(name);
        if (b != null) {
            display_TA.setText("Searched Book:\n" + b.toString());
        } else {
            display_TA.setText("Searched Book is not found\n");
        }


    }//GEN-LAST:event_findBook_JButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddBookPanel;
    private javax.swing.JPanel DisplayPanel;
    private javax.swing.JButton addBook_JButton;
    private javax.swing.JRadioButton deleteRadioButon;
    private javax.swing.JButton delete_JButton;
    private javax.swing.JButton display_JButton;
    private javax.swing.JTextArea display_TA;
    private javax.swing.JButton findBook_JButton;
    private javax.swing.JTextField id_TF;
    private javax.swing.JLabel id_label;
    private javax.swing.JLabel info_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton maxPrice_JButton;
    private javax.swing.JTextField name_TF;
    private javax.swing.JTextField name_find_TF;
    private javax.swing.JTextField price_TF;
    private javax.swing.JTextField year_TF;
    // End of variables declaration//GEN-END:variables
}
