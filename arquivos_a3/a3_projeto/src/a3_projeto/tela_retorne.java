
package a3_projeto;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;


public class tela_retorne extends javax.swing.JFrame {


    public tela_retorne() {
        initComponents();
        addBackgroundImage();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        retorno_login = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        retorno_login.setBackground(new java.awt.Color(133, 109, 199));
        retorno_login.setText("Retornar ao login");
        retorno_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retorno_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(retorno_login, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(691, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(679, Short.MAX_VALUE)
                .addComponent(retorno_login, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(302, 302, 302))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retorno_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retorno_loginActionPerformed
       tela_login loginJanela = new tela_login();
       loginJanela.setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_retorno_loginActionPerformed
private void addBackgroundImage() {
        // Criar um JLabel para a imagem de fundo
        JLabel background = new JLabel();

        // Carregar a imagem (substitua o nome_do_arquivo pela imagem real com a extensão)
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\joaoe\\OneDrive\\Documentos\\arquivos_a3\\a3_projeto\\retornar_img.jpg");
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
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new tela_retorne().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton retorno_login;
    // End of variables declaration//GEN-END:variables
}
