/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author luikt
 */
public class FrEditarProfessor extends javax.swing.JFrame {

    /**
     * Creates new form FrMenuUsuario
     */
    public FrEditarProfessor() {
        initComponents();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
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
        panTipoUsuario = new javax.swing.JPanel();
        jlbDepartamento = new javax.swing.JLabel();
        edtDepartamento = new javax.swing.JTextField();
        paEndereco = new javax.swing.JPanel();
        jlbRua = new javax.swing.JLabel();
        jblNumero = new javax.swing.JLabel();
        jblComplemento = new javax.swing.JLabel();
        jblReferencia = new javax.swing.JLabel();
        jblBairro = new javax.swing.JLabel();
        jblCidade = new javax.swing.JLabel();
        jblEstado = new javax.swing.JLabel();
        edtEstado = new javax.swing.JTextField();
        edtCidade = new javax.swing.JTextField();
        edtBairro = new javax.swing.JTextField();
        edtRua = new javax.swing.JTextField();
        edtNumero = new javax.swing.JTextField();
        edtReferencia = new javax.swing.JTextField();
        edtComplemento = new javax.swing.JTextField();
        jblTitulo = new javax.swing.JLabel();
        btnCadastrarUsuario = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jButton1.setText("jButton1");

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
                    .addComponent(pswSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                    .addComponent(edtTelefone)
                    .addComponent(edtCPF)
                    .addComponent(edtEmail)
                    .addComponent(edtNome))
                .addGap(71, 71, 71))
        );
        panDadosPessoaisLayout.setVerticalGroup(
            panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosPessoaisLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNome)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados Pessoais", panDadosPessoais);

        jlbDepartamento.setText("Departamento");

        edtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDepartamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panTipoUsuarioLayout = new javax.swing.GroupLayout(panTipoUsuario);
        panTipoUsuario.setLayout(panTipoUsuarioLayout);
        panTipoUsuarioLayout.setHorizontalGroup(
            panTipoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTipoUsuarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlbDepartamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        panTipoUsuarioLayout.setVerticalGroup(
            panTipoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTipoUsuarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panTipoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbDepartamento)
                    .addComponent(edtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Outros", panTipoUsuario);

        jlbRua.setText("Rua");

        jblNumero.setText("Numero");

        jblComplemento.setText("Complemento");

        jblReferencia.setText("Referência");

        jblBairro.setText("Bairro");

        jblCidade.setText("Cidade");

        jblEstado.setText("Estado");

        edtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtEstadoActionPerformed(evt);
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
                    .addComponent(jblNumero)
                    .addComponent(jblComplemento)
                    .addComponent(jblReferencia)
                    .addComponent(jblBairro)
                    .addComponent(jblEstado)
                    .addComponent(jblCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtEstado)
                    .addComponent(edtCidade)
                    .addComponent(edtBairro)
                    .addComponent(edtRua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtNumero)
                    .addComponent(edtReferencia)
                    .addComponent(edtComplemento))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        paEnderecoLayout.setVerticalGroup(
            paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paEnderecoLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblEstado)
                    .addComponent(edtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jblCidade)
                    .addComponent(edtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblReferencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblComplemento))
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Endereço", paEndereco);

        jblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblTitulo.setText("Editar Professor");

        btnCadastrarUsuario.setText("Editar");
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
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(9, 9, 9))
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
    
    private void edtDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDepartamentoActionPerformed

    private void edtNomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtNomeMouseExited
             // TODO add your handling code here:
    }//GEN-LAST:event_edtNomeMouseExited

    private void pswSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(FrEditarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrEditarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrEditarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrEditarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FrEditarProfessor().setVisible(true);
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
    private javax.swing.JTextField edtDepartamento;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtEstado;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtNumero;
    private javax.swing.JTextField edtReferencia;
    private javax.swing.JTextField edtRua;
    private javax.swing.JTextField edtTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jblBairro;
    private javax.swing.JLabel jblCidade;
    private javax.swing.JLabel jblComplemento;
    private javax.swing.JLabel jblEstado;
    private javax.swing.JLabel jblNumero;
    private javax.swing.JLabel jblReferencia;
    private javax.swing.JLabel jblTitulo;
    private javax.swing.JLabel jlbCPF;
    private javax.swing.JLabel jlbDepartamento;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JLabel jlbRua;
    private javax.swing.JLabel jlbSenha;
    private javax.swing.JLabel jlbTelefone;
    private javax.swing.JPanel paEndereco;
    private javax.swing.JPanel panDadosPessoais;
    private javax.swing.JPanel panTipoUsuario;
    private javax.swing.JPasswordField pswSenha;
    // End of variables declaration//GEN-END:variables
}
