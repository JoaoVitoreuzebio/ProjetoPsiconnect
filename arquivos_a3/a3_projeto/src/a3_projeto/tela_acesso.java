
package a3_projeto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class tela_acesso extends javax.swing.JFrame {


    public tela_acesso() {
        initComponents();
        addBackgroundImage();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botao_agenda = new javax.swing.JButton();
        botao_historico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botao_agenda.setBackground(new java.awt.Color(133, 109, 199));
        botao_agenda.setText("Agenda");
        botao_agenda.setBorderPainted(false);
        botao_agenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_agendaActionPerformed(evt);
            }
        });

        botao_historico.setBackground(new java.awt.Color(133, 109, 199));
        botao_historico.setText("Histórico");
        botao_historico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_historicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(671, Short.MAX_VALUE)
                .addComponent(botao_agenda, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(347, 347, 347)
                .addComponent(botao_historico, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(705, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_historico, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_agenda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(229, 229, 229))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_historicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_historicoActionPerformed
        JanelaHistorico historico = new JanelaHistorico();
        historico.setVisible(true);
    }//GEN-LAST:event_botao_historicoActionPerformed

    private void botao_agendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_agendaActionPerformed
                
        JanelaAgenda agenda = new JanelaAgenda();
        agenda.setVisible(true);
    }//GEN-LAST:event_botao_agendaActionPerformed
private void addBackgroundImage() {
        // Criar um JLabel para a imagem de fundo
        JLabel background = new JLabel();

        // Carregar a imagem (substitua o nome_do_arquivo pela imagem real com a extensão)
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\joaoe\\OneDrive\\Documentos\\arquivos_a3\\a3_projeto\\menu_principal.jpg");
        Image scaledImage = imageIcon.getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);

        background.setIcon(scaledIcon);

    // Adicionar o JLabel ao JLayeredPane com o índice de camada 0 (fundo)
    JLayeredPane layeredPane = getLayeredPane();
    layeredPane.add(background, Integer.valueOf(0));

    // Definir as dimensões e a posição do JLabel para corresponder ao tamanho da janela
    background.setBounds(0, 0, getWidth(), getHeight());
    }

    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tela_acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela_acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela_acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela_acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela_acesso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_agenda;
    private javax.swing.JButton botao_historico;
    // End of variables declaration//GEN-END:variables

     class JanelaHistorico extends JFrame {

   
    private JTable tabelaAgendamentos;
    private DB db;

    public JanelaHistorico() {
        initComponents();
        addBackgroundImage();
    }

    private void initComponents() {
        setTitle("Histórico de Agendamentos");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        tabelaAgendamentos = new JTable(new DefaultTableModel(new Object[]{"ID", "Data", "Horário"}, 0));
        tabelaAgendamentos.setFont(new Font("Arial", Font.PLAIN, 16));
        tabelaAgendamentos.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
        tabelaAgendamentos.getColumnModel().getColumn(0).setMaxWidth(100);

        JScrollPane scrollPane = new JScrollPane(tabelaAgendamentos);
        add(scrollPane, BorderLayout.CENTER);

        JButton fecharButton = new JButton("Fechar");
        fecharButton.addActionListener(e -> dispose());

        JLabel infoLabel = new JLabel("Clique duas vezes em um agendamento para ver detalhes ou cancelar.");
        infoLabel.setFont(new Font("Arial", Font.ITALIC, 16));

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(fecharButton, BorderLayout.WEST);
        bottomPanel.add(infoLabel, BorderLayout.CENTER);

        add(bottomPanel, BorderLayout.SOUTH);

        tabelaAgendamentos.addMouseListener(new DoubleClickMouseListener() {
            @Override
            public void onDoubleClick(MouseEvent e) {
                int row = tabelaAgendamentos.rowAtPoint(e.getPoint());
                if (row >= 0) {
                    String idAgendamento = (String) tabelaAgendamentos.getValueAt(row, 0);
                    exibirDetalhesAgendamento(idAgendamento);
                }
            }
        });

        carregarAgendamentos();
    }

    private void carregarAgendamentos() {
        db = new DB("acesso.db");
        String queryAgendamentos = "SELECT * FROM agendamentos";
        db.query(queryAgendamentos);

        DefaultTableModel model = (DefaultTableModel) tabelaAgendamentos.getModel();
        model.setRowCount(0);

        try {
            while (db.next()) {
                String id = db.getString("id");
                String data = db.getString("data_selecionada");
                String horario = db.getString("horario_selecionado");
                model.addRow(new String[]{id, data, horario});
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            db.closeConnection();
        }
    }

    private void exibirDetalhesAgendamento(String idAgendamento) {
        // Use a mesma instância 'db' criada em carregarAgendamentos
        try {
            // Lógica para obter detalhes do agendamento com base no idAgendamento
            String queryDetalhes = "SELECT * FROM agendamentos WHERE id = '" + idAgendamento + "'";
            db.query(queryDetalhes);

            if (db.next()) {
                String data = db.getString("data_selecionada");
                String horario = db.getString("horario_selecionado");

                // Exibir uma janela de detalhes com a opção de cancelar
                int opcao = JOptionPane.showConfirmDialog(this,
                        "Detalhes do Agendamento:\nData: " + data + "\nHorário: " + horario,
                        "Detalhes do Agendamento",
                        JOptionPane.OK_CANCEL_OPTION);

                if (opcao == JOptionPane.OK_OPTION) {
                    // Usuário escolheu OK, então cancela o agendamento
                    cancelarAgendamento(idAgendamento);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void cancelarAgendamento(String idAgendamento) {
        // Lógica para cancelar o agendamento e atualizar o banco de dados
        String queryCancelar = "DELETE FROM agendamentos WHERE id = '" + idAgendamento + "'";

        try {
            if (db.execQuery(queryCancelar) > 0) {
                JOptionPane.showMessageDialog(this, "Agendamento cancelado com sucesso!");
                carregarAgendamentos(); // Recarregar os agendamentos após o cancelamento
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao cancelar o agendamento.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private abstract class DoubleClickMouseListener extends MouseAdapter {
        private long lastClickTime;
        private int clickCount;

        @Override
        public void mouseClicked(MouseEvent e) {
            long currentTime = System.currentTimeMillis();

            if (currentTime - lastClickTime > 500) {
                clickCount = 1;
            } else {
                clickCount++;
                if (clickCount == 2) {
                    onDoubleClick(e);
                    clickCount = 0;
                }
            }

            lastClickTime = currentTime;
        }

        public abstract void onDoubleClick(MouseEvent e);
    }
}
}



 class JanelaAgenda extends JFrame {

    private int anoAtual = 2023; // Substitua pelo ano atual
    private String dataSelecionada;
    private String horarioSelecionado;

    public JanelaAgenda() {
        initComponentsAgenda();
    }

    private void initComponentsAgenda() {
        setTitle("Agenda");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Adiciona o painel principal à janela
        add(new CalendarPanel());
    }

    private class CalendarPanel extends JPanel {
        public CalendarPanel() {
            setLayout(new BorderLayout());

            // Painel para exibir o mês e o ano
            JPanel headerPanel = new JPanel(new BorderLayout());
            JLabel mesAnoLabel = new JLabel("Novembro " + anoAtual, JLabel.CENTER); // Substitua pelo mês atual
            mesAnoLabel.setFont(new Font("Arial", Font.BOLD, 20));
            headerPanel.add(mesAnoLabel, BorderLayout.CENTER);
            add(headerPanel, BorderLayout.NORTH);

            // Painel para o calendário
            JPanel calendarPanel = new JPanel(new GridLayout(6, 7, 5, 5));

            // Adiciona os dias da semana
            String[] diasSemana = {"Dom", "Seg", "Ter", "Qua", "Qui", "Sex", "Sáb"};
            for (String diaSemana : diasSemana) {
                JLabel label = new JLabel(diaSemana, JLabel.CENTER);
                label.setForeground(Color.BLUE);
                calendarPanel.add(label);
            }

            // Adiciona os dias do mês
            int diaInicio = 3; // Dia da semana em que o mês inicia (01 de novembro é quarta-feira)
            for (int i = 1; i <= 30; i++) { // Altere conforme necessário para o mês atual
                JButton dayButton = new JButton(Integer.toString(i));
                dayButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        mostrarHorariosDisponiveis(Integer.parseInt(dayButton.getText()));
                    }
                });
                calendarPanel.add(dayButton);
            }

            add(calendarPanel, BorderLayout.CENTER);
        }

        private void mostrarHorariosDisponiveis(int dia) {
        // Lógica para mostrar horários disponíveis
        JComboBox<String> horariosComboBox = new JComboBox<>(new String[]{"08:00", "10:00", "13:00", "15:00"});
        int escolha = JOptionPane.showConfirmDialog(this, horariosComboBox, "Escolha o horário", JOptionPane.OK_CANCEL_OPTION);

        if (escolha == JOptionPane.OK_OPTION) {
            horarioSelecionado = (String) horariosComboBox.getSelectedItem();
            dataSelecionada = "01/11/" + anoAtual + " " + horarioSelecionado; // Ajuste conforme necessário

            // Mostra a confirmação do agendamento
            JOptionPane.showMessageDialog(this, "Horário escolhido: " + horarioSelecionado + " - Dia: " + dia);

            // Lógica para salvar o agendamento no banco de dados
            salvarAgendamento();
        }
    }
        private void salvarAgendamento() {
    // Consultar o banco de dados para obter o ID do usuário
    DB db = new DB("acesso.db");
    String emailUsuario = "joaoeuzebio2003@gmail.com"; // Substitua pelo e-mail do usuário
    String queryUsuario = "SELECT id_usuario FROM entrada WHERE email='" + emailUsuario + "';";

    // Consulta para obter o ID do usuário
    db.query(queryUsuario);

    try {
        if (db.next()) {
            int idUsuario = db.getInt("id_usuario");

            // Verifica se o ID do usuário é válido
            if (idUsuario != 0) {
                // Salva o agendamento na tabela de agendamentos
                String queryAgendamento = "INSERT INTO agendamentos (id_usuario, data_selecionada, horario_selecionado) " +
                                         "VALUES (" + idUsuario + ", '" + dataSelecionada + "', '" + horarioSelecionado + "');";
                db.execQuery(queryAgendamento);
            } else {
                System.out.println("Erro: ID do usuário não encontrado.");
            }
        }
    } catch (Exception e ) {
        e.printStackTrace();
    } finally {
        db.closeConnection();
    }
}

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaAgenda().setVisible(true);
            }
        });
    }

      
}
 }