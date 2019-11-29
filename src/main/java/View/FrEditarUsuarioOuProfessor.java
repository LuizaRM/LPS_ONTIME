/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.EnderecoController;
import Controller.UsuarioController;
import Model.Endereco;
import Model.Usuario;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author luikt
 */
public class FrEditarUsuarioOuProfessor extends javax.swing.JFrame {

    UsuarioController usuarioController = new UsuarioController();

    /**
     * Creates new form FrMenuUsuario
     */
    public FrEditarUsuarioOuProfessor(Usuario aux) {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
       

        buttonGroup1.add(rbtNivel2Prof);
        buttonGroup1.add(rbtNivel1Admin);
        edtLoginId.setVisible(false);
        edtLoginU.setVisible(false);

        edtLoginId.setText(Integer.toString(aux.getIdUsuario()));
        edtLoginU.setText(Integer.toString(aux.getEndereco().getIdEndereco()));
        edtNome.setText(aux.getNome());
        edtCPF.setText(aux.getCpf());
        edtEmail.setText(aux.getEmail());
        edtSenha.setText(aux.getSenha());
        edtTelefone.setText(aux.getTelefone());
        edtDepartamento.setText(aux.getDepartamento());
        edtRua.setText(aux.getEndereco().getRuaEndereco());
        edtEstado.setText(aux.getEndereco().getEstadoEndereco());
        edtCidade.setText(aux.getEndereco().getCidadeEndereco());
        edtBairro.setText(aux.getEndereco().getBairroEndereco());
        edtNumero.setText(aux.getEndereco().getNumeroEndereco());
        edtComplemento.setText(aux.getEndereco().getComplementoEndereco());
        if (aux.getNivelDeAcesso() == 1) {
            rbtNivel1Admin.setSelected(rootPaneCheckingEnabled);
        } else {
            rbtNivel2Prof.setSelected(rootPaneCheckingEnabled);
        }
    }

    public FrEditarUsuarioOuProfessor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panDadosPessoais = new javax.swing.JPanel();
        jlbTelefone = new javax.swing.JLabel();
        jlbNome = new javax.swing.JLabel();
        jlbCPF = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        jlbSenha = new javax.swing.JLabel();
        edtCPF = new javax.swing.JTextField();
        edtEmail = new javax.swing.JTextField();
        edtTelefone = new javax.swing.JTextField();
        edtSenha = new javax.swing.JTextField();
        edtNome = new javax.swing.JTextField();
        edtLoginId = new javax.swing.JTextField();
        edtLoginU = new javax.swing.JTextField();
        panTipoUsuario = new javax.swing.JPanel();
        jlbDepartamento = new javax.swing.JLabel();
        edtDepartamento = new javax.swing.JTextField();
        rbtNivel2Prof = new javax.swing.JRadioButton();
        rbtNivel1Admin = new javax.swing.JRadioButton();
        paEndereco = new javax.swing.JPanel();
        jlbRua = new javax.swing.JLabel();
        jblNumero = new javax.swing.JLabel();
        jblComplemento = new javax.swing.JLabel();
        jblBairro = new javax.swing.JLabel();
        jblCidade = new javax.swing.JLabel();
        jblEstado = new javax.swing.JLabel();
        edtEstado = new javax.swing.JTextField();
        edtCidade = new javax.swing.JTextField();
        edtBairro = new javax.swing.JTextField();
        edtRua = new javax.swing.JTextField();
        edtNumero = new javax.swing.JTextField();
        edtComplemento = new javax.swing.JTextField();
        jblTitulo = new javax.swing.JLabel();
        btnEditUser = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlbTelefone.setText("Telefone");

        jlbNome.setText("Nome");

        jlbCPF.setText("CPF");

        jlbEmail.setText("Email");

        jlbSenha.setText("Senha");

        edtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtTelefoneActionPerformed(evt);
            }
        });

        edtLoginId.setText("jTextField1");
        edtLoginId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtLoginIdActionPerformed(evt);
            }
        });

        edtLoginU.setText("jTextField1");
        edtLoginU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtLoginUActionPerformed(evt);
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
                    .addComponent(edtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                    .addComponent(edtCPF)
                    .addComponent(edtEmail)
                    .addComponent(edtSenha)
                    .addComponent(edtNome))
                .addGap(18, 18, 18)
                .addComponent(edtLoginU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edtLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        panDadosPessoaisLayout.setVerticalGroup(
            panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosPessoaisLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(edtLoginId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosPessoaisLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbNome)
                            .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlbCPF)
                            .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panDadosPessoaisLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(edtLoginU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEmail)
                    .addComponent(edtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbSenha)
                    .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTelefone)
                    .addComponent(edtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados Pessoais", panDadosPessoais);

        jlbDepartamento.setText("Departamento");

        edtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtDepartamentoActionPerformed(evt);
            }
        });

        rbtNivel2Prof.setText("Professor");
        rbtNivel2Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNivel2ProfActionPerformed(evt);
            }
        });

        rbtNivel1Admin.setText("Administrador");
        rbtNivel1Admin.setToolTipText("");
        rbtNivel1Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNivel1AdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panTipoUsuarioLayout = new javax.swing.GroupLayout(panTipoUsuario);
        panTipoUsuario.setLayout(panTipoUsuarioLayout);
        panTipoUsuarioLayout.setHorizontalGroup(
            panTipoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTipoUsuarioLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panTipoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTipoUsuarioLayout.createSequentialGroup()
                        .addComponent(rbtNivel2Prof)
                        .addGap(62, 62, 62)
                        .addComponent(rbtNivel1Admin))
                    .addGroup(panTipoUsuarioLayout.createSequentialGroup()
                        .addComponent(jlbDepartamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
        );
        panTipoUsuarioLayout.setVerticalGroup(
            panTipoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTipoUsuarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panTipoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbDepartamento)
                    .addComponent(edtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(panTipoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtNivel2Prof)
                    .addComponent(rbtNivel1Admin))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tipo de usuário", panTipoUsuario);

        jlbRua.setText("Rua");

        jblNumero.setText("Numero");

        jblComplemento.setText("Complemento");

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
                    .addComponent(edtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jblComplemento))
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("Endereço", paEndereco);

        jblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblTitulo.setText("Editar Usuário");

        btnEditUser.setText("Editar");
        btnEditUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEditUserMousePressed(evt);
            }
        });
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
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
                    .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        getDadosForm();
    }//GEN-LAST:event_btnEditUserActionPerformed

    public void getDadosForm() {
        Usuario user = new Usuario();
        user.setIdUsuario(Integer.parseInt(edtLoginId.getText()));
        user.setNome(edtNome.getText());
        
        user.setCpf(edtCPF.getText());
        user.setEmail(edtEmail.getText());
        user.setSenha(edtSenha.getText());
        user.setTelefone(edtTelefone.getText());
        user.setDepartamento(edtDepartamento.getText());
        int nivelUsuario;
        if (rbtNivel1Admin.isSelected()) {
            nivelUsuario = 1;
        } else {
            nivelUsuario = 0;
        }
        user.setNivelDeAcesso(nivelUsuario);

        Endereco aux = new Endereco();
        aux.setIdEndereco(Integer.parseInt(edtLoginU.getText()));
        aux.setEstadoEndereco(edtEstado.getText());
        aux.setCidadeEndereco(edtCidade.getText());
        aux.setBairroEndereco(edtBairro.getText());
        aux.setRuaEndereco(edtRua.getText());
        aux.setNumeroEndereco(edtNumero.getText());
        aux.setComplementoEndereco(edtComplemento.getText());

        user.setEndereco(aux);
       
        //Dados do login do usuário
        if (edtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos!", "", 1);
        } else {
            //Passando todos os dados para o controlador
            usuarioController.editar(user);
            FrListarUsuarios x = new FrListarUsuarios();
            x.setVisible(true);
            this.dispose();
        }
    }

    public String validaCampos() {
        String nome = edtNome.getText();
        String cpf = edtCPF.getText();
        String email = edtEmail.getText();
        //String senha = pswSenha.getText();
        String telefone = edtTelefone.getText();
        String departamento = edtDepartamento.getText();
//        String nivelDeAcessoA = rbtNivel1Admin.getActionCommand();
//        String nivelDeAcessoP = rbtNivel2Prof.getActionCommand();
        String estado = edtEstado.getText();
        String cidade = edtCidade.getText();
        String bairro = edtBairro.getText();
        String rua = edtRua.getText();
        String numero = edtNumero.getText();
        String complemento = edtComplemento.getText();

        String msgErro = "";
        if (nome.isEmpty()) {
            msgErro += "Nome não informado\n";
        }
        if (cpf.isEmpty()) {
            msgErro += "CPF não informado\n";
        }
        if (email.isEmpty()) {
            msgErro += "Email não informado\n";
        }
//        if (senha.isEmpty()) {
//            msgErro += "Senha não informada\n";
//        }
        if (telefone.isEmpty()) {
            msgErro += "Telefone não informado\n";
        }
        if (departamento.isEmpty()) {
            msgErro += "Departamento não informado\n";
        }
        if (!rbtNivel1Admin.isSelected() || !rbtNivel2Prof.isSelected()) {
            msgErro += "Escolha um nivel de acesso\n";
        }
        //EDERECO
        if (estado.isEmpty()) {
            msgErro += "Estado não informado\n";
        }
        if (cidade.isEmpty()) {
            msgErro += "Cidade não informado\n";
        }
        if (bairro.isEmpty()) {
            msgErro += "Bairro não informado\n";
        }
        if (rua.isEmpty()) {
            msgErro += "Rua não informada\n";
        }
        if (numero.isEmpty()) {
            msgErro += "Numero do Endereço não informado\n";
        }

        return msgErro;
    }

    private void rbtNivel2ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNivel2ProfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtNivel2ProfActionPerformed

    private void rbtNivel1AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNivel1AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtNivel1AdminActionPerformed

    private void edtDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDepartamentoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
          FrListarUsuarios x = new FrListarUsuarios();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditUserMousePressed
        // TODO add your handling code here:
        //heereeee
    }//GEN-LAST:event_btnEditUserMousePressed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void edtLoginUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtLoginUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtLoginUActionPerformed

    private void edtLoginIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtLoginIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtLoginIdActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditUser;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField edtBairro;
    private javax.swing.JTextField edtCPF;
    private javax.swing.JTextField edtCidade;
    private javax.swing.JTextField edtComplemento;
    private javax.swing.JTextField edtDepartamento;
    private javax.swing.JTextField edtEmail;
    private javax.swing.JTextField edtEstado;
    private javax.swing.JTextField edtLoginId;
    private javax.swing.JTextField edtLoginU;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtNumero;
    private javax.swing.JTextField edtRua;
    private javax.swing.JTextField edtSenha;
    private javax.swing.JTextField edtTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jblBairro;
    private javax.swing.JLabel jblCidade;
    private javax.swing.JLabel jblComplemento;
    private javax.swing.JLabel jblEstado;
    private javax.swing.JLabel jblNumero;
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
    private javax.swing.JRadioButton rbtNivel1Admin;
    private javax.swing.JRadioButton rbtNivel2Prof;
    // End of variables declaration//GEN-END:variables
}
