/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

/**
 *
 * @author 822158424
 */
public class A4_TelaDeAdiçãoDeODS extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeAdiçãoDeODS
     */
    public A4_TelaDeAdiçãoDeODS() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtDia = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        TxtMes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtAno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtEmail4 = new javax.swing.JTextField();
        TxtEmail1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TxtEmail2 = new javax.swing.JTextField();
        BtnCadastrar_se = new javax.swing.JButton();
        BtnCadastrar_se1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtnCadastrar_se2 = new javax.swing.JButton();
        BtnCadastrar_se3 = new javax.swing.JButton();
        BtnCadastrar_se4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Projeto de ODS");

        jPanel1.setBackground(new java.awt.Color(3, 175, 239));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setBackground(new java.awt.Color(3, 175, 239));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setText("Cadastro de Projeto de ODS");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Responsável do Projeto");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Erradicação da pobreza", "Erradicação da fome", "Saúde e Bem-Estar", "Educação de qualidade", "Igualdade de gênero", "Água Potável e Saneamento", "Energia acessível e limpa", "Trabalho decente e crescimento econômico", "Inovação e infraestrutura", "Redução das desigualdades", "Cidades e comunidades sustentáveis", "Consumo e produção responsáveis", "Ação contra a Mudança Global do Clima", "Vida na Água", "Vida Terrestre", "Paz, Justiça e Instituições Eficazes", "Parcerias e Meios de Implementação" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Telefone do Responsável");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Data de Criação");

        TxtDia.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtDia.setText("Dia");
        TxtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDiaActionPerformed(evt);
            }
        });

        TxtEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        TxtMes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtMes.setText("Mes");
        TxtMes.setPreferredSize(new java.awt.Dimension(50, 23));
        TxtMes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtMesFocusGained(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Código do Projeto");

        TxtAno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtAno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtAno.setText("Ano");
        TxtAno.setPreferredSize(new java.awt.Dimension(50, 23));
        TxtAno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtAnoFocusGained(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Status do Projeto");

        TxtEmail4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        TxtEmail1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Iniciado", "Em andamento", "Concluido" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Descrição do Projeto");

        TxtEmail2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7)
                    .addComponent(TxtEmail)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(TxtEmail2)
                    .addComponent(TxtEmail1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(TxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TxtEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtEmail4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        BtnCadastrar_se.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnCadastrar_se.setText("Cadastrar");
        BtnCadastrar_se.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnCadastrar_se.setPreferredSize(new java.awt.Dimension(120, 24));
        BtnCadastrar_se.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCadastrar_seMouseClicked(evt);
            }
        });
        BtnCadastrar_se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrar_seActionPerformed(evt);
            }
        });

        BtnCadastrar_se1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnCadastrar_se1.setText("Cancelar");
        BtnCadastrar_se1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnCadastrar_se1.setPreferredSize(new java.awt.Dimension(120, 24));
        BtnCadastrar_se1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCadastrar_se1MouseClicked(evt);
            }
        });
        BtnCadastrar_se1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrar_se1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        BtnCadastrar_se2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnCadastrar_se2.setText("Pesquisar");
        BtnCadastrar_se2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnCadastrar_se2.setPreferredSize(new java.awt.Dimension(120, 24));
        BtnCadastrar_se2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCadastrar_se2MouseClicked(evt);
            }
        });
        BtnCadastrar_se2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrar_se2ActionPerformed(evt);
            }
        });

        BtnCadastrar_se3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnCadastrar_se3.setText("Atualizar");
        BtnCadastrar_se3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnCadastrar_se3.setPreferredSize(new java.awt.Dimension(120, 24));
        BtnCadastrar_se3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCadastrar_se3MouseClicked(evt);
            }
        });
        BtnCadastrar_se3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrar_se3ActionPerformed(evt);
            }
        });

        BtnCadastrar_se4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnCadastrar_se4.setText("Excluir");
        BtnCadastrar_se4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnCadastrar_se4.setPreferredSize(new java.awt.Dimension(120, 24));
        BtnCadastrar_se4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCadastrar_se4MouseClicked(evt);
            }
        });
        BtnCadastrar_se4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCadastrar_se4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(BtnCadastrar_se, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCadastrar_se1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCadastrar_se2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCadastrar_se3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCadastrar_se4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCadastrar_se, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCadastrar_se1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCadastrar_se2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCadastrar_se3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnCadastrar_se4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCadastrar_seMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCadastrar_seMouseClicked

    }//GEN-LAST:event_BtnCadastrar_seMouseClicked

    private void BtnCadastrar_seActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrar_seActionPerformed

      
    }//GEN-LAST:event_BtnCadastrar_seActionPerformed

    private void BtnCadastrar_se1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCadastrar_se1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCadastrar_se1MouseClicked

    private void BtnCadastrar_se1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrar_se1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCadastrar_se1ActionPerformed

    private void TxtMesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtMesFocusGained

        TxtMes.setText("");

    }//GEN-LAST:event_TxtMesFocusGained

    private void TxtAnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtAnoFocusGained

        TxtAno.setText("");

    }//GEN-LAST:event_TxtAnoFocusGained

    private void TxtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDiaActionPerformed

    private void BtnCadastrar_se2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCadastrar_se2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCadastrar_se2MouseClicked

    private void BtnCadastrar_se2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrar_se2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCadastrar_se2ActionPerformed

    private void BtnCadastrar_se3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCadastrar_se3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCadastrar_se3MouseClicked

    private void BtnCadastrar_se3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrar_se3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCadastrar_se3ActionPerformed

    private void BtnCadastrar_se4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCadastrar_se4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCadastrar_se4MouseClicked

    private void BtnCadastrar_se4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCadastrar_se4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCadastrar_se4ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(A4_TelaDeAdiçãoDeODS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A4_TelaDeAdiçãoDeODS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A4_TelaDeAdiçãoDeODS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A4_TelaDeAdiçãoDeODS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A4_TelaDeAdiçãoDeODS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCadastrar_se;
    private javax.swing.JButton BtnCadastrar_se1;
    private javax.swing.JButton BtnCadastrar_se2;
    private javax.swing.JButton BtnCadastrar_se3;
    private javax.swing.JButton BtnCadastrar_se4;
    public static javax.swing.JTextField TxtAno;
    public static javax.swing.JTextField TxtDia;
    public static javax.swing.JTextField TxtEmail;
    public static javax.swing.JTextField TxtEmail1;
    public static javax.swing.JTextField TxtEmail2;
    public static javax.swing.JTextField TxtEmail4;
    public static javax.swing.JTextField TxtMes;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
