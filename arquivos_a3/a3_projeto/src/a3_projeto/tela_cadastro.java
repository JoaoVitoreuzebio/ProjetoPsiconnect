
package a3_projeto;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;


public class tela_cadastro extends javax.swing.JFrame {


    public tela_cadastro() {
        initComponents();
        addBackgroundImage();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_emailC = new javax.swing.JTextField();
        txt_senhaC = new javax.swing.JTextField();
        continuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_emailC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailCActionPerformed(evt);
            }
        });

        txt_senhaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_senhaCActionPerformed(evt);
            }
        });

        continuar.setBackground(new java.awt.Color(133, 109, 199));
        continuar.setText("Continuar");
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1257, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_emailC, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_senhaC, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(txt_emailC, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(txt_senhaC, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(continuar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_senhaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_senhaCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_senhaCActionPerformed

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
       
    String email = txt_emailC.getText();
    String senha = txt_senhaC.getText();
    
    DB db = new DB("acesso.db");
    String query = "INSERT INTO entrada(email, senha) VALUES ('" + email + "', '" + senha + "');";

    // Chamar o método execQuery com a instrução INSERT e indicar que é uma inserção
    int rowsAffected = db.execQuery(query);

    // Verificar se a inserção foi bem-sucedida
    if (rowsAffected > 0) {
        System.out.println("Inserção bem-sucedida!");
    } else {
        System.out.println("Erro ao inserir dados!");
    }

    // Fechar a conexão com o banco de dados
    db.closeConnection();

    // Fechar a janela de login
    this.dispose();
     
        
        tela_cadastro01 cadastro2 = new tela_cadastro01();
        cadastro2.setVisible(true);
    }//GEN-LAST:event_continuarActionPerformed

    private void txt_emailCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailCActionPerformed
private void addBackgroundImage() {
        // Criar um JLabel para a imagem de fundo
        JLabel background = new JLabel();

        // Carregar a imagem (substitua o nome_do_arquivo pela imagem real com a extensão)
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\joaoe\\OneDrive\\Documentos\\arquivos_a3\\a3_projeto\\Cadastro01.jpg");
        Image scaledImage = imageIcon.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        background.setIcon(scaledIcon);

    // Adicionar o JLabel ao JLayeredPane com o índice de camada 0 (fundo)
    JLayeredPane layeredPane = getLayeredPane();
    layeredPane.add(background, Integer.valueOf(0));

    // Definir as dimensões e a posição do JLabel para corresponder ao tamanho da janela
    background.setBounds(0, 0, getWidth(), getHeight());
    }

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(tela_cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new tela_cadastro().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continuar;
    private javax.swing.JTextField txt_emailC;
    private javax.swing.JTextField txt_senhaC;
    // End of variables declaration//GEN-END:variables
}
