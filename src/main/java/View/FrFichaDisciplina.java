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
public class FrFichaDisciplina extends javax.swing.JFrame {

    /**
     * Creates new form FrFichaDisciplina
     */
    public FrFichaDisciplina() {
        initComponents();
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jblTitulo1 = new javax.swing.JLabel();
        jlbNome = new javax.swing.JLabel();
        jlbSala = new javax.swing.JLabel();
        jlbTurma = new javax.swing.JLabel();
        jlbProfessor = new javax.swing.JLabel();
        jlbHorario = new javax.swing.JLabel();
        jlbCurso = new javax.swing.JLabel();
        jlbDepartamento = new javax.swing.JLabel();
        jlbMatriz = new javax.swing.JLabel();
        labDepartamento = new javax.swing.JLabel();
        labMatriz = new javax.swing.JLabel();
        labCurso = new javax.swing.JLabel();
        labHorario = new javax.swing.JLabel();
        labProfessor = new javax.swing.JLabel();
        labTurma = new javax.swing.JLabel();
        labSala = new javax.swing.JLabel();
        labNome = new javax.swing.JLabel();
        btnEditar = new javax.swing.JToggleButton();
        btnExcluir = new javax.swing.JToggleButton();
        btnCancelar2 = new javax.swing.JButton();
        jlbPeriodo = new javax.swing.JLabel();
        labPeriodo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jblTitulo1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jblTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblTitulo1.setText("Ficha Disciplina");

        jlbNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbNome.setText("Nome");

        jlbSala.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbSala.setText("Sala");

        jlbTurma.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbTurma.setText("Turma");

        jlbProfessor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbProfessor.setText("Professor");

        jlbHorario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbHorario.setText("Horário");

        jlbCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbCurso.setText("Curso");

        jlbDepartamento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbDepartamento.setText("Departamento");

        jlbMatriz.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbMatriz.setText("Matriz Curricular");

        labDepartamento.setText("Departamento");

        labMatriz.setText("Matriz Curricular");

        labCurso.setText("Ciência da Computação");

        labHorario.setText("Segunda 09:00 - 10:00 e Terça 07:00 - 09:00 ");

        labProfessor.setText("Professor");

        labTurma.setText("2019.1");

        labSala.setText("2 DACC");

        labNome.setText("Linguagem de Programação Web");

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar2.setText("Cancelar");
        btnCancelar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar2ActionPerformed(evt);
            }
        });

        jlbPeriodo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlbPeriodo.setText("Período");

        labPeriodo.setText("2º");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnCancelar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbDepartamento)
                    .addComponent(jlbCurso)
                    .addComponent(jlbMatriz)
                    .addComponent(jlbProfessor)
                    .addComponent(jlbHorario)
                    .addComponent(jlbNome)
                    .addComponent(jlbSala)
                    .addComponent(jlbTurma)
                    .addComponent(jlbPeriodo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labPeriodo)
                    .addComponent(labDepartamento)
                    .addComponent(labCurso)
                    .addComponent(labMatriz)
                    .addComponent(labProfessor)
                    .addComponent(labHorario)
                    .addComponent(labNome)
                    .addComponent(labSala)
                    .addComponent(labTurma))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jblTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlbNome)
                        .addGap(14, 14, 14)
                        .addComponent(jlbSala, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlbTurma)
                        .addGap(18, 18, 18)
                        .addComponent(jlbProfessor)
                        .addGap(18, 18, 18)
                        .addComponent(jlbHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbCurso)
                        .addGap(18, 18, 18)
                        .addComponent(jlbDepartamento)
                        .addGap(20, 20, 20)
                        .addComponent(jlbMatriz))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labNome)
                        .addGap(14, 14, 14)
                        .addComponent(labSala, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labTurma)
                        .addGap(18, 18, 18)
                        .addComponent(labProfessor)
                        .addGap(18, 18, 18)
                        .addComponent(labHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labCurso)
                        .addGap(18, 18, 18)
                        .addComponent(labDepartamento)
                        .addGap(20, 20, 20)
                        .addComponent(labMatriz)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbPeriodo)
                    .addComponent(labPeriodo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir))
                .addGap(6, 6, 6)
                .addComponent(btnCancelar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        FrEditarDisciplina telaEditDisciplina = new FrEditarDisciplina();
        telaEditDisciplina.setVisible(true);

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Realmente deseja excluir o horário?");
        // 0=yes, 1=no, 2=cancel

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar2ActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnCancelar2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrFichaDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrFichaDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrFichaDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrFichaDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrFichaDisciplina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar2;
    private javax.swing.JToggleButton btnEditar;
    private javax.swing.JToggleButton btnExcluir;
    private javax.swing.JLabel jblTitulo1;
    private javax.swing.JLabel jlbCurso;
    private javax.swing.JLabel jlbDepartamento;
    private javax.swing.JLabel jlbHorario;
    private javax.swing.JLabel jlbMatriz;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JLabel jlbPeriodo;
    private javax.swing.JLabel jlbProfessor;
    private javax.swing.JLabel jlbSala;
    private javax.swing.JLabel jlbTurma;
    private javax.swing.JLabel labCurso;
    private javax.swing.JLabel labDepartamento;
    private javax.swing.JLabel labHorario;
    private javax.swing.JLabel labMatriz;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labPeriodo;
    private javax.swing.JLabel labProfessor;
    private javax.swing.JLabel labSala;
    private javax.swing.JLabel labTurma;
    // End of variables declaration//GEN-END:variables
}
