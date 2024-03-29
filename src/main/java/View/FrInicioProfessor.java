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
public class FrInicioProfessor extends javax.swing.JFrame {

    /**
     * Creates new form FrIniciarAdm
     */
    public FrInicioProfessor() {
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

        panUsuario = new javax.swing.JPanel();
        jlbImage = new javax.swing.JLabel();
        jlbNome = new javax.swing.JLabel();
        jlbCPF = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        jlbTelefone = new javax.swing.JLabel();
        jlbDepartamento = new javax.swing.JLabel();
        jlbEndereco = new javax.swing.JLabel();
        labNome = new javax.swing.JLabel();
        labDepartamento = new javax.swing.JLabel();
        labEmail = new javax.swing.JLabel();
        labCPF = new javax.swing.JLabel();
        labTelefone = new javax.swing.JLabel();
        labPEC = new javax.swing.JLabel();
        labBEN = new javax.swing.JLabel();
        jlbTitulo = new javax.swing.JLabel();
        tpaneMeusHorarios = new javax.swing.JTabbedPane();
        tabHorarioProf = new javax.swing.JScrollPane();
        tabHorarioProfessor = new javax.swing.JTable();
        tpnCadastrarHorarioDisponivel = new javax.swing.JPanel();
        panTabelaCadastrarHorario = new javax.swing.JPanel();
        tabHorarioProf1 = new javax.swing.JScrollPane();
        tabHorarioProfessor1 = new javax.swing.JTable();
        btnCadastrarHorario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbrProfessor = new javax.swing.JMenu();
        mniOutrosProfessores = new javax.swing.JMenuItem();
        mniEditarDAdos = new javax.swing.JMenuItem();
        mniExcluirConta = new javax.swing.JMenuItem();
        mniTrocarSenha = new javax.swing.JMenuItem();
        mniSair = new javax.swing.JMenuItem();
        mbrTurmas = new javax.swing.JMenu();
        mniTurmas = new javax.swing.JMenuItem();
        mbrDisciplinas = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panUsuario.setBackground(new java.awt.Color(204, 204, 255));

        jlbImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\luikt.LAPTOP-S3M3GVQN\\Desktop\\user.png")); // NOI18N

        jlbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbNome.setText("Nome");

        jlbCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbCPF.setText("CPF");

        jlbEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbEmail.setText("Email");

        jlbTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbTelefone.setText("Telefone");

        jlbDepartamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbDepartamento.setText("Departamento");

        jlbEndereco.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbEndereco.setText("Endereço");

        labNome.setText("Luiza");

        labDepartamento.setText("DACC");

        labEmail.setText("luikta@gmail.com");

        labCPF.setText("099,555,666-25");

        labTelefone.setText("(32) 98480-5202");

        labPEC.setText("Brasil, MG, Rio Pomba");

        labBEN.setText("Centro, Rua Doutor Queiroz, 193");

        javax.swing.GroupLayout panUsuarioLayout = new javax.swing.GroupLayout(panUsuario);
        panUsuario.setLayout(panUsuarioLayout);
        panUsuarioLayout.setHorizontalGroup(
            panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUsuarioLayout.createSequentialGroup()
                .addGroup(panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbCPF))
                    .addGroup(panUsuarioLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jlbImage))
                    .addGroup(panUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbDepartamento)
                            .addComponent(jlbNome)
                            .addComponent(jlbEmail)
                            .addComponent(jlbTelefone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labTelefone)
                            .addComponent(labEmail)
                            .addComponent(labNome)
                            .addComponent(labDepartamento)
                            .addComponent(labCPF)))
                    .addGroup(panUsuarioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbEndereco)
                        .addGap(37, 37, 37)
                        .addGroup(panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labBEN)
                            .addComponent(labPEC))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panUsuarioLayout.setVerticalGroup(
            panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbImage)
                .addGap(18, 18, 18)
                .addGroup(panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNome)
                    .addComponent(labNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbDepartamento)
                    .addComponent(labDepartamento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEmail)
                    .addComponent(labEmail))
                .addGap(3, 3, 3)
                .addGroup(panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCPF)
                    .addComponent(labCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTelefone)
                    .addComponent(labTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEndereco)
                    .addComponent(labPEC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labBEN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlbTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTitulo.setText(" OnTime");

        tabHorarioProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Horario", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"
            }
        ));
        tabHorarioProf.setViewportView(tabHorarioProfessor);

        tpaneMeusHorarios.addTab("Meus Horarios", tabHorarioProf);

        tabHorarioProfessor1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Horario", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado", "Domingo"
            }
        ));
        tabHorarioProf1.setViewportView(tabHorarioProfessor1);

        javax.swing.GroupLayout panTabelaCadastrarHorarioLayout = new javax.swing.GroupLayout(panTabelaCadastrarHorario);
        panTabelaCadastrarHorario.setLayout(panTabelaCadastrarHorarioLayout);
        panTabelaCadastrarHorarioLayout.setHorizontalGroup(
            panTabelaCadastrarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panTabelaCadastrarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabHorarioProf1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
        );
        panTabelaCadastrarHorarioLayout.setVerticalGroup(
            panTabelaCadastrarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(panTabelaCadastrarHorarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabHorarioProf1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE))
        );

        btnCadastrarHorario.setText("Cadastrar");
        btnCadastrarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarHorarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tpnCadastrarHorarioDisponivelLayout = new javax.swing.GroupLayout(tpnCadastrarHorarioDisponivel);
        tpnCadastrarHorarioDisponivel.setLayout(tpnCadastrarHorarioDisponivelLayout);
        tpnCadastrarHorarioDisponivelLayout.setHorizontalGroup(
            tpnCadastrarHorarioDisponivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tpnCadastrarHorarioDisponivelLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(btnCadastrarHorario, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addGap(220, 220, 220))
            .addComponent(panTabelaCadastrarHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tpnCadastrarHorarioDisponivelLayout.setVerticalGroup(
            tpnCadastrarHorarioDisponivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tpnCadastrarHorarioDisponivelLayout.createSequentialGroup()
                .addComponent(panTabelaCadastrarHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrarHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpaneMeusHorarios.addTab("Cadastrar Horarios Disponiveis", tpnCadastrarHorarioDisponivel);

        mbrProfessor.setText("Professor");

        mniOutrosProfessores.setText("Outros Professores");
        mniOutrosProfessores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOutrosProfessoresActionPerformed(evt);
            }
        });
        mbrProfessor.add(mniOutrosProfessores);

        mniEditarDAdos.setText("Editar Meus Dados");
        mniEditarDAdos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEditarDAdosActionPerformed(evt);
            }
        });
        mbrProfessor.add(mniEditarDAdos);

        mniExcluirConta.setText("Excluir conta");
        mniExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExcluirContaActionPerformed(evt);
            }
        });
        mbrProfessor.add(mniExcluirConta);

        mniTrocarSenha.setText("Trocar Senha");
        mniTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTrocarSenhaActionPerformed(evt);
            }
        });
        mbrProfessor.add(mniTrocarSenha);

        mniSair.setText("Sair");
        mniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSairActionPerformed(evt);
            }
        });
        mbrProfessor.add(mniSair);

        jMenuBar1.add(mbrProfessor);

        mbrTurmas.setText("Turmas");
        mbrTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbrTurmasActionPerformed(evt);
            }
        });

        mniTurmas.setText("Verificar Turmas");
        mniTurmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTurmasActionPerformed(evt);
            }
        });
        mbrTurmas.add(mniTurmas);

        jMenuBar1.add(mbrTurmas);

        mbrDisciplinas.setText(" Disciplinas");
        mbrDisciplinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbrDisciplinasActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Verificar Disciplinas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mbrDisciplinas.add(jMenuItem1);

        jMenuBar1.add(mbrDisciplinas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addComponent(panUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpaneMeusHorarios))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tpaneMeusHorarios)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniOutrosProfessoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOutrosProfessoresActionPerformed
        FrHorarioProfessor telaHorarioProfessor = new FrHorarioProfessor();
        telaHorarioProfessor.setVisible(true);
    }//GEN-LAST:event_mniOutrosProfessoresActionPerformed

    private void mbrTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbrTurmasActionPerformed
        
        
    }//GEN-LAST:event_mbrTurmasActionPerformed

    private void mbrDisciplinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbrDisciplinasActionPerformed

        
        
     }//GEN-LAST:event_mbrDisciplinasActionPerformed

    private void mniEditarDAdosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEditarDAdosActionPerformed
        FrProfessorEditarDados telaEditarDados = new FrProfessorEditarDados();
        telaEditarDados.setVisible(true);
        
    }//GEN-LAST:event_mniEditarDAdosActionPerformed

    private void mniExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExcluirContaActionPerformed
        
        int opcao = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir a conta?");
        // 0=yes, 1=no, 2=cancel
       
                

    }//GEN-LAST:event_mniExcluirContaActionPerformed

    private void btnCadastrarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarHorarioActionPerformed

    private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, 
                "Deseja sair?", "Sair", 
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        // 0=ok, 2=cancel
        
    }//GEN-LAST:event_mniSairActionPerformed

    private void mniTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTrocarSenhaActionPerformed
       
        FrMudarSenhaLogado telaMudarSenhaLogado = new FrMudarSenhaLogado();
        telaMudarSenhaLogado.setVisible(true);
    }//GEN-LAST:event_mniTrocarSenhaActionPerformed

    private void mniTurmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTurmasActionPerformed
        FrHorarioTurma telamostrarHorario = new FrHorarioTurma();
        telamostrarHorario.setVisible(true);
    }//GEN-LAST:event_mniTurmasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrListarDisciplinas telaMostrarDisciplinas = new FrListarDisciplinas();
        telaMostrarDisciplinas.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(FrInicioProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrInicioProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrInicioProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrInicioProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrInicioProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarHorario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel jlbCPF;
    private javax.swing.JLabel jlbDepartamento;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbEndereco;
    private javax.swing.JLabel jlbImage;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JLabel jlbTelefone;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JLabel labBEN;
    private javax.swing.JLabel labCPF;
    private javax.swing.JLabel labDepartamento;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labPEC;
    private javax.swing.JLabel labTelefone;
    private javax.swing.JMenu mbrDisciplinas;
    private javax.swing.JMenu mbrProfessor;
    private javax.swing.JMenu mbrTurmas;
    private javax.swing.JMenuItem mniEditarDAdos;
    private javax.swing.JMenuItem mniExcluirConta;
    private javax.swing.JMenuItem mniOutrosProfessores;
    private javax.swing.JMenuItem mniSair;
    private javax.swing.JMenuItem mniTrocarSenha;
    private javax.swing.JMenuItem mniTurmas;
    private javax.swing.JPanel panTabelaCadastrarHorario;
    private javax.swing.JPanel panUsuario;
    private javax.swing.JScrollPane tabHorarioProf;
    private javax.swing.JScrollPane tabHorarioProf1;
    private javax.swing.JTable tabHorarioProfessor;
    private javax.swing.JTable tabHorarioProfessor1;
    private javax.swing.JTabbedPane tpaneMeusHorarios;
    private javax.swing.JPanel tpnCadastrarHorarioDisponivel;
    // End of variables declaration//GEN-END:variables
}
