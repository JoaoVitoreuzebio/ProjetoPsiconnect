
package a3_projeto;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;


public class tela_login extends javax.swing.JFrame {


    public tela_login() {
        initComponents();
        addBackgroundImage();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelar01 = new javax.swing.JButton();
        entrar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        txt_email = new javax.swing.JTextField();
        txt_senha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cancelar01.setBackground(new java.awt.Color(133, 109, 199));
        cancelar01.setText("Cancelar");
        cancelar01.setToolTipText("");
        cancelar01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar01ActionPerformed(evt);
            }
        });

        entrar.setBackground(new java.awt.Color(133, 109, 199));
        entrar.setText("Entrar");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        txt_senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_senhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(1268, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(entrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cancelar01, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cadastrar)
                        .addGap(248, 248, 248))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(txt_senha, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelar01, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrar)
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelar01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar01ActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelar01ActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        tela_cadastro cadastro1 = new tela_cadastro();
        cadastro1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cadastrarActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
     String email = txt_email.getText();
    String senha = txt_senha.getText();
    
    // Consultar o banco de dados para verificar as credenciais
    DB db = new DB("acesso.db");
    String query = "SELECT * FROM entrada WHERE email='" + email + "' AND senha='" + senha + "';";
    db.query(query);

    // Verificar se há uma correspondência nos resultados da consulta
    if (db.next()) {
        // Se houver correspondência, abrir a janela de acesso
        tela_acesso telaAcesso = new tela_acesso();
        telaAcesso.setVisible(true);
        this.dispose();
    } else {
        // Se não houver correspondência, exibir uma mensagem de erro
        System.out.println("Credenciais inválidas. Tente novamente.");
    }

    // Fechar a conexão com o banco de dados
    db.closeConnection();


    }//GEN-LAST:event_entrarActionPerformed

    private void txt_senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_senhaActionPerformed

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed
private void addBackgroundImage() {
        // Criar um JLabel para a imagem de fundo
        JLabel background = new JLabel();

        // Carregar a imagem (substitua o nome_do_arquivo pela imagem real com a extensão)
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\joaoe\\OneDrive\\Documentos\\arquivos_a3\\a3_projeto\\Login.jpg");
        Image scaledImage = imageIcon.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        background.setIcon(scaledIcon);

    // Adicionar o JLabel ao JLayeredPane com o índice de camada 0 (fundo)
    JLayeredPane layeredPane = getLayeredPane();
    layeredPane.add(background, Integer.valueOf(0));

    // Definir as dimensões e a posição do JLabel para corresponder ao tamanho da janela
    background.setBounds(0, 0, getWidth(), getHeight());
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton cancelar01;
    private javax.swing.JButton entrar;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_senha;
    // End of variables declaration//GEN-END:variables
}
