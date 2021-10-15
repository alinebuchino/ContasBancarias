package classes;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aline Buchino
 */
public class ListarSaldosNegativos extends javax.swing.JFrame {

    DefaultTableModel tableModelo = new DefaultTableModel();
    
    public void attSaldoNegativo() {
        tableModelo = (DefaultTableModel) tblNegativos.getModel();
        tableModelo.setRowCount(0);
        if (DadosClientes.vetor_clientes.get(0).getSaldo() < 0){           
            tableModelo.addRow(new Object[]{
                DadosClientes.vetor_clientes.get(0).getNomeCliente(),
                DadosClientes.vetor_clientes.get(0).getNumeroConta(),
                DadosClientes.vetor_clientes.get(0).getSaldo(), 
                });
        
    } 
    }
            
    public void Buscar() {    
        tableModelo = (DefaultTableModel) tblNegativos.getModel();
        tableModelo.setRowCount(0);
 
        for (int i = 0; i < DadosClientes.vetor_clientes.size(); i++) {   
            if (DadosClientes.vetor_clientes.get(0).getSaldo() < 0){
            tableModelo.addRow(new Object[]{
                DadosClientes.vetor_clientes.get(i).getNomeCliente(),
                DadosClientes.vetor_clientes.get(i).getNumeroConta(),
                DadosClientes.vetor_clientes.get(i).getSaldo(),
});             
           }
        }
            attSaldoNegativo();
    }
    
    
    public ListarSaldosNegativos() {
        initComponents();
        attSaldoNegativo();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblNegativos = new javax.swing.JTable();
        jButtonVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        tblNegativos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tblNegativos.setForeground(new java.awt.Color(102, 102, 102));
        tblNegativos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome do cliente", "Número da conta", "Saldo"
            }
        ));
        jScrollPane1.setViewportView(tblNegativos);

        jButtonVoltar.setBackground(new java.awt.Color(153, 0, 0));
        jButtonVoltar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classes/imagens/ValorNegativo¹.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
        Menu x = new Menu();
        x.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    
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
            java.util.logging.Logger.getLogger(ListarSaldosNegativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarSaldosNegativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarSaldosNegativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarSaldosNegativos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarSaldosNegativos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNegativos;
    // End of variables declaration//GEN-END:variables
}
