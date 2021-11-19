package view;

import view.author.FrmListAuthors;
import view.author.FrmAuthor;
import view.author.FrmUpdateAuthor;
import dao.HibernateConfiguracao;
import view.author.FrmDeleteAuthor;

public class Principal extends javax.swing.JFrame {
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        HibernateConfiguracao configuracao = new HibernateConfiguracao();
        configuracao.criaSessionFactory();
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

        jMenuBar = new javax.swing.JMenuBar();
        Arquivo = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();
        Novo = new javax.swing.JMenu();
        NovoAuthor = new javax.swing.JMenuItem();
        Listar = new javax.swing.JMenu();
        ListarAuthor = new javax.swing.JMenuItem();
        Atualizar = new javax.swing.JMenu();
        AtualizarAuthor = new javax.swing.JMenuItem();
        Deletar = new javax.swing.JMenu();
        DeletarAuthor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Arquivo.setText("Arquivo");

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Arquivo.add(Sair);

        jMenuBar.add(Arquivo);

        Novo.setText("Novo");

        NovoAuthor.setText("Autor");
        NovoAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoAuthorActionPerformed(evt);
            }
        });
        Novo.add(NovoAuthor);

        jMenuBar.add(Novo);

        Listar.setText("Listar");

        ListarAuthor.setText("Autor");
        ListarAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarAuthorActionPerformed(evt);
            }
        });
        Listar.add(ListarAuthor);

        jMenuBar.add(Listar);

        Atualizar.setText("Atualizar");

        AtualizarAuthor.setText("Autor");
        AtualizarAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtualizarAuthorActionPerformed(evt);
            }
        });
        Atualizar.add(AtualizarAuthor);

        jMenuBar.add(Atualizar);

        Deletar.setText("Deletar");

        DeletarAuthor.setText("Autor");
        DeletarAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarAuthorActionPerformed(evt);
            }
        });
        Deletar.add(DeletarAuthor);

        jMenuBar.add(Deletar);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void NovoAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoAuthorActionPerformed
        FrmAuthor telaDepartamento = new
        FrmAuthor();
        telaDepartamento.setVisible(true);
        telaDepartamento.setLocationRelativeTo(this);
    }//GEN-LAST:event_NovoAuthorActionPerformed

    private void ListarAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarAuthorActionPerformed
        FrmListAuthors listagemAutor = new
        FrmListAuthors();
        listagemAutor.setVisible(true);
        listagemAutor.setLocationRelativeTo(this);
    }//GEN-LAST:event_ListarAuthorActionPerformed

    private void AtualizarAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarAuthorActionPerformed
        FrmUpdateAuthor updateAuthor = new
        FrmUpdateAuthor();
        updateAuthor.setVisible(true);
        updateAuthor.setLocationRelativeTo(this);
    }//GEN-LAST:event_AtualizarAuthorActionPerformed

    private void DeletarAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarAuthorActionPerformed
        FrmDeleteAuthor deeleteAuthor = new
        FrmDeleteAuthor();
        deeleteAuthor.setVisible(true);
        deeleteAuthor.setLocationRelativeTo(this);
    }//GEN-LAST:event_DeletarAuthorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JMenu Arquivo;
    private javax.swing.JMenu Atualizar;
    private javax.swing.JMenuItem AtualizarAuthor;
    private javax.swing.JMenu Deletar;
    private javax.swing.JMenuItem DeletarAuthor;
    private javax.swing.JMenu Listar;
    private javax.swing.JMenuItem ListarAuthor;
    private javax.swing.JMenu Novo;
    private javax.swing.JMenuItem NovoAuthor;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuBar jMenuBar;
    // End of variables declaration//GEN-END:variables
}
