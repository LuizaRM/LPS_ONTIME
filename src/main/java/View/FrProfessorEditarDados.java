
package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author luikt
 */
public class FrProfessorEditarDados extends javax.swing.JFrame {

   
    public FrProfessorEditarDados() {
        initComponents();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panDadosPessoais = new javax.swing.JPanel();
        jlbTelefone = new javax.swing.JLabel();
        jlbNome = new javax.swing.JLabel();
        jlbCPF = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        jlbSenha = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtCPF = new javax.swing.JTextField();
        edtEmail = new javax.swing.JTextField();
        pswSenha = new javax.swing.JPasswordField();
        edtTelefone = new javax.swing.JTextField();
        paEndereco = new javax.swing.JPanel();
        jlbRua = new javax.swing.JLabel();
        jlbNumero = new javax.swing.JLabel();
        jlbComplemento = new javax.swing.JLabel();
        jlbBairro = new javax.swing.JLabel();
        jlbCidade = new javax.swing.JLabel();
        jlbEstado = new javax.swing.JLabel();
        edtEstado = new javax.swing.JTextField();
        edtCidade = new javax.swing.JTextField();
        edtBairro = new javax.swing.JTextField();
        edtRua = new javax.swing.JTextField();
        edtNumero = new javax.swing.JTextField();
        edtComplemento = new javax.swing.JTextField();
        jblTitulo = new javax.swing.JLabel();
        btnCadastrarUsuario = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbTelefone.setText("Telefone");

        jlbNome.setText("Nome");

        jlbCPF.setText("CPF");

        jlbEmail.setText("Email");

        jlbSenha.setText("Senha");

        edtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edtNomeMouseExited(evt);
            }
        });

        pswSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswSenhaActionPerformed(evt);
            }
        });

        edtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panDadosPessoaisLayout = new javax.swing.GroupLayout(panDadosPessoais);
        panDadosPessoais.setLayout(panDadosPessoaisLayout);
        panDadosPessoaisLayout.setHorizontalGroup(
            panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbNome)
                    .addComponent(jlbCPF)
                    .addComponent(jlbEmail)
                    .addComponent(jlbSenha)
                    .addComponent(jlbTelefone))
                .addGap(14, 14, 14)
                .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pswSenha)
                    .addComponent(edtTelefone)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCPF)
                    .addComponent(edtEmail))
                .addGap(71, 71, 71))
        );
        panDadosPessoaisLayout.setVerticalGroup(
            panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosPessoaisLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNome)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCPF)
                    .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEmail)
                    .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSenha)
                    .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTelefone)
                    .addComponent(edtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados Pessoais", panDadosPessoais);

        jlbRua.setText("Rua");

        jlbNumero.setText("Numero");

        jlbComplemento.setText("Complemento");

        jlbBairro.setText("Bairro");

        jlbCidade.setText("Cidade");

        jlbEstado.setText("Estado");

        edtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEstadoActionPerformed(evt);
            }
        });

        edtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paEnderecoLayout = new javax.swing.GroupLayout(paEndereco);
        paEndereco.setLayout(paEnderecoLayout);
        paEnderecoLayout.setHorizontalGroup(
            paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbRua)
                    .addComponent(jlbNumero)
                    .addComponent(jlbComplemento)
                    .addComponent(jlbEstado)
                    .addComponent(jlbCidade)
                    .addComponent(jlbBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtEstado)
                    .addComponent(edtCidade)
                    .addComponent(edtBairro)
                    .addComponent(edtRua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtNumero)
                    .addComponent(edtComplemento))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        paEnderecoLayout.setVerticalGroup(
            paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paEnderecoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbEstado)
                    .addComponent(edtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCidade)
                    .addComponent(edtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbComplemento))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Endereço", paEndereco);

        jblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblTitulo.setText("Editar Dados ");

        btnCadastrarUsuario.setText("Cadastrar");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtTelefoneActionPerformed

    private void edtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtEstadoActionPerformed

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        String msgErro = this.validaCampos();
        JOptionPane.showMessageDialog(this, msgErro);
        
        
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    public String validaCampos(){
        String nome = edtNome.getText();
        String cpf = edtCPF.getText();
        String email = edtEmail.getText();
        String senha = pswSenha.getText();
        String telefone = edtTelefone.getText();
        
        String estado = edtEstado.getText();
        String cidade = edtCidade.getText();
        String bairro = edtBairro.getText();
        String rua = edtRua.getText();
        String numero = edtNumero.getText();
        String complemento = edtComplemento.getText();
       
       
        String msgErro = "";
            if(nome.isEmpty())
                msgErro += "Nome não informado\n";
            if(cpf.isEmpty())
                 msgErro += "CPF não informado\n";
            if(email.isEmpty())
                 msgErro += "Email não informado\n";
            if(senha.isEmpty())
                 msgErro += "Senha não informada\n";
            if(telefone.isEmpty())
                 msgErro += "Telefone não informado\n";
           
            //EDERECO
            if(estado.isEmpty())
                msgErro += "Estado não informado\n";
            if(cidade.isEmpty())
                 msgErro += "Cidade não informado\n";
            if(bairro.isEmpty())
                 msgErro += "Bairro não informado\n";
            if(rua.isEmpty())
                 msgErro += "Rua não informada\n";
            if(numero.isEmpty())
                 msgErro += "Numero do Endereço não informado\n";
            
            
            return msgErro;
    }
    
    private void edtNomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtNomeMouseExited
             // TODO add your handling code here:
    }//GEN-LAST:event_edtNomeMouseExited

    private void pswSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswSenhaActionPerformed

    private void edtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtNumeroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrProfessorEditarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrProfessorEditarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrProfessorEditarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrProfessorEditarDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrProfessorEditarDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JTextField edtBairro;
    private javax.swing.JTextField edtCPF;
    private javax.swing.JTextField edtCidade;
    private javax.swing.JTextField edtComplemento;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtEstado;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtNumero;
    private javax.swing.JTextField edtRua;
    private javax.swing.JTextField edtTelefone;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jblTitulo;
    private javax.swing.JLabel jlbBairro;
    private javax.swing.JLabel jlbCPF;
    private javax.swing.JLabel jlbCidade;
    private javax.swing.JLabel jlbComplemento;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbEstado;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JLabel jlbNumero;
    private javax.swing.JLabel jlbRua;
    private javax.swing.JLabel jlbSenha;
    private javax.swing.JLabel jlbTelefone;
    private javax.swing.JPanel paEndereco;
    private javax.swing.JPanel panDadosPessoais;
    private javax.swing.JPasswordField pswSenha;
    // End of variables declaration//GEN-END:variables
}
