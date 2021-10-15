package classes;


/**
 *
 * @author Aline Buchino
 */
public class Menu extends javax.swing.JFrame {
    
    public Menu() {
        initComponents();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCadastrar = new javax.swing.JMenuItem();
        jVisualizar = new javax.swing.JMenuItem();
        jListar = new javax.swing.JMenuItem();
        jSaque = new javax.swing.JMenuItem();
        jDeposito = new javax.swing.JMenuItem();
        jSair = new javax.swing.JMenu();
        jFechar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classes/imagens/BancoMenu.png"))); // NOI18N

        jMenu1.setText("Menu");

        jCadastrar.setText("Cadastrar contas");
        jCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarActionPerformed(evt);
            }
        });
        jMenu1.add(jCadastrar);

        jVisualizar.setText("Visualizar / Alterar contas");
        jVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVisualizarActionPerformed(evt);
            }
        });
        jMenu1.add(jVisualizar);

        jListar.setText("Listar saldos negativos");
        jListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListarActionPerformed(evt);
            }
        });
        jMenu1.add(jListar);

        jSaque.setText("Realizar saque");
        jSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaqueActionPerformed(evt);
            }
        });
        jMenu1.add(jSaque);

        jDeposito.setText("Realizar depósito");
        jDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDepositoActionPerformed(evt);
            }
        });
        jMenu1.add(jDeposito);

        jMenuBar1.add(jMenu1);

        jSair.setText("Sair");

        jFechar.setText("Fechar");
        jFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFecharActionPerformed(evt);
            }
        });
        jSair.add(jFechar);

        jMenuBar1.add(jSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFecharActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jFecharActionPerformed

    private void jCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarActionPerformed
        this.dispose(); 
        Cadastro x = new Cadastro();
        x.setVisible(true);
    }//GEN-LAST:event_jCadastrarActionPerformed

    private void jVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVisualizarActionPerformed
        this.dispose(); 
        VisualizarContas x = new VisualizarContas();
        x.setVisible(true);
    }//GEN-LAST:event_jVisualizarActionPerformed

    private void jListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListarActionPerformed
        this.dispose();
        ListarSaldosNegativos x = new ListarSaldosNegativos();
        x.setVisible(true);
        
    }//GEN-LAST:event_jListarActionPerformed

    private void jSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaqueActionPerformed
        this.dispose();
        Saque x = new Saque();
        x.setVisible(true);
    }//GEN-LAST:event_jSaqueActionPerformed

    private void jDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDepositoActionPerformed
        this.dispose();
        Deposito x = new Deposito();
        x.setVisible(true);
    }//GEN-LAST:event_jDepositoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jCadastrar;
    private javax.swing.JMenuItem jDeposito;
    private javax.swing.JMenuItem jFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jListar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jSair;
    private javax.swing.JMenuItem jSaque;
    private javax.swing.JMenuItem jVisualizar;
    // End of variables declaration//GEN-END:variables
}
