/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import valemobi.mercadoria;

/**
 *
 * @author Thiago Mascarenhas
 */
public class jfmercadoria extends javax.swing.JFrame {
     mercadoria obj;
     

    /**
     * Creates new form jfmercadoria
     */
    public jfmercadoria() {
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

        jLabel1 = new javax.swing.JLabel();
        jtcodigodamercadoria = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtnomedamercadoria = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtquantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtpreço = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbtipodenegocio = new javax.swing.JComboBox();
        jbnovo = new javax.swing.JButton();
        jbsalvar = new javax.swing.JButton();
        jbcancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jttipodemercadoria = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("codigo da mercadoria");

        jtcodigodamercadoria.setEditable(false);

        jLabel2.setText("nome da mercadoria");

        jtnomedamercadoria.setEditable(false);

        jLabel3.setText("quantidade");

        jtquantidade.setEditable(false);

        jLabel4.setText("preço");

        jtpreço.setEditable(false);

        jLabel5.setText("tipo de negócio");

        jcbtipodenegocio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<selecione>", "compra", "venda" }));
        jcbtipodenegocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbtipodenegocioActionPerformed(evt);
            }
        });

        jbnovo.setText("novo");
        jbnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnovoActionPerformed(evt);
            }
        });

        jbsalvar.setText("salvar");
        jbsalvar.setEnabled(false);
        jbsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalvarActionPerformed(evt);
            }
        });

        jbcancelar.setText("cancelar");
        jbcancelar.setEnabled(false);
        jbcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("tipo de mercadoria");

        jttipodemercadoria.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbnovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jbsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jbcancelar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtcodigodamercadoria)
                    .addComponent(jtnomedamercadoria)
                    .addComponent(jtquantidade)
                    .addComponent(jtpreço)
                    .addComponent(jcbtipodenegocio, 0, 150, Short.MAX_VALUE)
                    .addComponent(jttipodemercadoria))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtcodigodamercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtnomedamercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtpreço, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jttipodemercadoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jcbtipodenegocio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnovo)
                    .addComponent(jbsalvar)
                    .addComponent(jbcancelar))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbtipodenegocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbtipodenegocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbtipodenegocioActionPerformed

    private void jbsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalvarActionPerformed
       try {
        if(validarCampos()){
           if(preencherobjetos()){
            //salvar no banco - chamo o metodo conexao
            JOptionPane.showMessageDialog(this, "Resgistro Salvo");
            limparCampos();
            jtcodigodamercadoria.setEditable(false);
            jtnomedamercadoria.setEditable(false);
            jtpreço.setEditable(false);
            jtquantidade.setEditable(false);
            jttipodemercadoria.setEditable(false);
            jcbtipodenegocio.setEditable(false);
            jbnovo.setEnabled(true);
            jbsalvar.setEnabled(false);
            jbcancelar.setEnabled(false);
           
           }
    }//GEN-LAST:event_jbsalvarActionPerformed
       }catch (Exception erro){JOptionPane.showMessageDialog(this, "Erro: " + 
               erro.getMessage());}
       
    }
    private void jbnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnovoActionPerformed
        limparCampos();
        jtcodigodamercadoria.setEditable(true);
        jtnomedamercadoria.setEditable(true);
        jtpreço.setEditable(true);
        jtquantidade.setEditable(true);
        jttipodemercadoria.setEditable(true);
        jcbtipodenegocio.setEditable(true);
        jbnovo.setEnabled(false);
        jbsalvar.setEnabled(true);
        jbcancelar.setEnabled(true);
          
    }//GEN-LAST:event_jbnovoActionPerformed

    private void jbcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcancelarActionPerformed
        
        limparCampos();
        jtcodigodamercadoria.setEditable(false);
        jtnomedamercadoria.setEditable(false);
        jtpreço.setEditable(false);
        jtquantidade.setEditable(false);
        jttipodemercadoria.setEditable(false);
        jcbtipodenegocio.setEditable(false);
        jbnovo.setEnabled(true);
        jbsalvar.setEnabled(false);
        jbcancelar.setEnabled(false); 
        
    }//GEN-LAST:event_jbcancelarActionPerformed

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
            java.util.logging.Logger.getLogger(jfmercadoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfmercadoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfmercadoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfmercadoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfmercadoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbcancelar;
    private javax.swing.JButton jbnovo;
    private javax.swing.JButton jbsalvar;
    private javax.swing.JComboBox jcbtipodenegocio;
    private javax.swing.JTextField jtcodigodamercadoria;
    private javax.swing.JTextField jtnomedamercadoria;
    private javax.swing.JTextField jtpreço;
    private javax.swing.JTextField jtquantidade;
    private javax.swing.JTextField jttipodemercadoria;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos(){
    if(jtcodigodamercadoria.getText().equals("")){
    JOptionPane.showMessageDialog(this,"digite o código da mercadoria");
            jtcodigodamercadoria.requestFocus();
            return false;
    }
    
    if(jtnomedamercadoria.getText().equals("")){
    JOptionPane.showMessageDialog(this,"digite o nome da mercadoria");
            jtnomedamercadoria.requestFocus();
            return false;
    }
    
    if(jtpreço.getText().equals("")){
    JOptionPane.showMessageDialog(this,"digite o preço da mercadoria");
            jtpreço.requestFocus();
            return false;
    }
    if(jtquantidade.getText().equals("")){
    JOptionPane.showMessageDialog(this,"digite a quantidade de mercadoria");
            jtquantidade.requestFocus();
            return false;
    }
    
    if(jttipodemercadoria.getText().equals("")){
    JOptionPane.showMessageDialog(this,"digite a quantidade de mercadoria");
            jttipodemercadoria.requestFocus();
            return false;
    }
    
    if(jcbtipodenegocio.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(this, "selecio o tipo de negócio");
        jcbtipodenegocio.requestFocus();
        return false;
    }
    
        
        return true;
    }
    
    private boolean preencherobjetos() throws Exception{
        obj = new mercadoria();
        obj.setCodigo_mercadoria(jtcodigodamercadoria.getText());
        obj.setNome_da_mercadoria(jtnomedamercadoria.getText());
        obj.setPreço(jtpreço.getText());
        obj.setQuantidade(jtquantidade.getText());
        obj.setTipo_de_mercadoria(jttipodemercadoria.getText());
        obj.setTipo_negocio(jcbtipodenegocio.getSelectedIndex());
    
        
        return true; 
}
    
    private void limparCampos(){
        jtcodigodamercadoria.setText("");
        jtnomedamercadoria.setText("");
        jtpreço.setText("");
        jtquantidade.setText("");
        jttipodemercadoria.setText("");
        jcbtipodenegocio.setSelectedIndex(0);
    
    }

}