/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.publishers;

import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;

import control.CtrPublishers;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Publisher;

public class FmrDeletePublishers extends javax.swing.JFrame {

    CtrPublishers ctrPublisher;
    Publisher publisher;
    
    public FmrDeletePublishers() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        publisher_id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        updatePublisher = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Publisher_id", "Nome", "Url"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        publisher_id.setEnabled(false);
        publisher_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisher_idActionPerformed(evt);
            }
        });

        jLabel5.setText("Publisher_id");

        updatePublisher.setText("Deletar");
        updatePublisher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatePublisherMouseClicked(evt);
            }
        });
        updatePublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePublisherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updatePublisher)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(publisher_id, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publisher_id))
                .addGap(18, 18, 18)
                .addComponent(updatePublisher)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint( evt.getPoint() );
        publisher_id.setText(source.getModel().getValueAt(row, 0)+"");
    }//GEN-LAST:event_jTable1MouseClicked

    private void publisher_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisher_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisher_idActionPerformed

    private void updatePublisherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatePublisherMouseClicked

    }//GEN-LAST:event_updatePublisherMouseClicked

    private void updatePublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePublisherActionPerformed
        // TODO add your handling code here:
        ctrPublisher = new CtrPublishers();
        publisher = new Publisher();
        publisher.setPublisherID(Integer.parseInt(publisher_id.getText()));
        if(!"".equals(publisher_id.getText().trim()) || !publisher.getPublisherID().equals(publisher_id.getText().trim())){
            if (ctrPublisher.excluirPulisher(publisher) == 1) {
                this.listPublisher();
                JOptionPane.showMessageDialog(null, "Editor  deletado com sucesso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi deletar o editor");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um editor para deletar");
        }
    }//GEN-LAST:event_updatePublisherActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ctrPublisher = new CtrPublishers();
        publisher = new Publisher();
        this.listPublisher();
    }//GEN-LAST:event_formWindowOpened
    
    private void listPublisher(){
        List listPublisher = new ArrayList();
        listPublisher = ctrPublisher.carregarPulishers();
        if (listPublisher != null && !listPublisher.isEmpty()) {
            Iterator i = listPublisher.iterator();
            DefaultTableModel tableModelPublisher = (DefaultTableModel) jTable1.getModel();
            tableModelPublisher.setRowCount(0);
            while (i.hasNext()) {
                publisher = (Publisher) i.next();
                tableModelPublisher.addRow(new Object[] {publisher.getPublisherID(), publisher.getName(),publisher.getUrl()});
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum Editor disponível para listar!!");
        }
    }
    
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
            java.util.logging.Logger.getLogger(FmrDeletePublishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrDeletePublishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrDeletePublishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrDeletePublishers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrDeletePublishers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField publisher_id;
    private javax.swing.JButton updatePublisher;
    // End of variables declaration//GEN-END:variables
}
