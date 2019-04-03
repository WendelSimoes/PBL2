
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        labelPrice.setText(String.valueOf(sliderPrice.getValue()));
        this.setTitle("MENU");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox5 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        sliderPrice = new javax.swing.JSlider();
        buttonDetail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboItem = new javax.swing.JComboBox();
        comboHelices = new javax.swing.JComboBox();
        comboTampa = new javax.swing.JComboBox();
        comboMes = new javax.swing.JComboBox();
        comboVolts = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        comboMarca = new javax.swing.JComboBox();
        comboLitros = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboCapacidade = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jComboBox5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sliderPrice.setMaximum(3000);
        sliderPrice.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPriceStateChanged(evt);
            }
        });

        buttonDetail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        buttonDetail.setText("Detalhes");
        buttonDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDetailActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Preço: R$");

        labelPrice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelPrice.setText("00");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText(",00");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setText("MENU");

        comboItem.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboItem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Batedeira", "Ferro de passar", "Liquidificador" }));
        comboItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboItemActionPerformed(evt);
            }
        });

        comboHelices.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboHelices.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        comboTampa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboTampa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Azul", "Amarela ", "Branca", "Preta", "Verde" }));
        comboTampa.setEnabled(false);

        comboMes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));

        comboVolts.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboVolts.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "220", "110", "5" }));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("V");

        comboMarca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboMarca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Marca X", "Marca Y", "Marca Z" }));

        comboLitros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Hélices:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Tampa:");

        comboCapacidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboCapacidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Capacidade:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Litros:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(comboItem, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboHelices, 0, 54, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTampa, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPrice)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))
                            .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboVolts, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboMarca, 0, 87, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCapacidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboLitros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(41, 41, 41))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(sliderPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDetail)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboHelices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTampa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboVolts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(labelPrice)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(comboCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sliderPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDetail))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderPriceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPriceStateChanged
        labelPrice.setText(String.valueOf(sliderPrice.getValue()));
    }//GEN-LAST:event_sliderPriceStateChanged

    private void comboItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboItemActionPerformed
        if(comboItem.getSelectedIndex() == 0){
            comboHelices.enable(true);
            comboTampa.enable(false);
            comboLitros.enable(true);
            comboCapacidade.enable(true);
        }
        if(comboItem.getSelectedIndex() == 1){
            comboHelices.enable(false);
            comboTampa.enable(false);
            comboLitros.enable(false);
            comboCapacidade.enable(false);
        }
        if(comboItem.getSelectedIndex() == 2){
            comboHelices.enable(false);
            comboTampa.enable(true);
            comboLitros.enable(true);
            comboCapacidade.enable(true);
        }
        if(comboItem.getSelectedIndex() == 1 && comboVolts.getItemCount() == 2){
            comboVolts.addItem("5");
        }
        if(comboItem.getSelectedIndex() == 0 && comboVolts.getItemCount() == 3){
            comboVolts.removeItemAt(2);
        }
        if(comboItem.getSelectedIndex() == 2 && comboVolts.getItemCount() == 3){
            comboVolts.removeItemAt(2);
        }
    }//GEN-LAST:event_comboItemActionPerformed

    private Batedeira batedeira;
    private Ferro ferro;
    private Liquidificador liquidificador;
    private Tampa tampa;
    
    private void buttonDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDetailActionPerformed
        if(comboItem.getSelectedIndex() == 0){
            batedeira = new Batedeira(String.valueOf(comboMarca.getSelectedItem()), sliderPrice.getValue(), Integer.parseInt(comboVolts.getSelectedItem().toString()));
            batedeira.setCapacidade(Integer.parseInt(comboCapacidade.getSelectedItem().toString()));
            batedeira.setQtdHelices(Integer.parseInt(comboHelices.getSelectedItem().toString()));
            batedeira.setQuantidadeLitros(Integer.parseInt(comboLitros.getSelectedItem().toString()));
            batedeira.setLitrosPorSegundo();
            batedeira.setDesconto(comboMes.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "Marca: " + batedeira.getMarca() + "\n" +
                                                "Helices: " + batedeira.getQtdHelices() + "\n" +
                                                "Voltagem: " + batedeira.getVoltagem() + "\n" +
                                                "Capacidade: " + batedeira.getCapacidade() + "\n" +
                                                "Litros/s: " + batedeira.getLitrosPorSegundo() + "\n" +
                                                "Preço: R$ " + batedeira.getPreco() + "\n" +
                                                "Desconto: R$ " + batedeira.getDesconto() + "\n" +
                                                "___________________________________" + "\n" +
                                                "Preço final: R$ " + batedeira.getPrecoFinal(), "DETALHES", JOptionPane.PLAIN_MESSAGE);
        }
        if(comboItem.getSelectedIndex() == 1){
            ferro = new Ferro(String.valueOf(comboMarca.getSelectedItem()), sliderPrice.getValue(), Integer.parseInt(comboVolts.getSelectedItem().toString()));
            ferro.setDesconto(comboMes.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null, "Marca: " + ferro.getMarca() + "\n" +
                                                "Voltagem: " + ferro.getVoltagem() + "\n" +
                                                "Preço: R$ " + ferro.getPreco() + "\n" +
                                                "Desconto: R$ " + ferro.getDesconto() + "\n" +
                                                "___________________________________" + "\n" +
                                                "Preço final: R$ " + ferro.getPrecoFinal(), "DETALHES", JOptionPane.PLAIN_MESSAGE);
        }
        if(comboItem.getSelectedIndex() == 2){
            liquidificador = new Liquidificador(String.valueOf(comboMarca.getSelectedItem()), sliderPrice.getValue(), Integer.parseInt(comboVolts.getSelectedItem().toString()));
            tampa = new Tampa(comboTampa.getSelectedItem().toString());
            liquidificador.setTampa(tampa);
            liquidificador.setCapacidade(Integer.parseInt(comboCapacidade.getSelectedItem().toString()));
            liquidificador.setQuantidadeLitros(Integer.parseInt(comboLitros.getSelectedItem().toString()));
            liquidificador.setLitrosPorSegundo();
            liquidificador.setDesconto(comboMes.getSelectedItem().toString());
            JOptionPane.showMessageDialog(null,"Marca: " + liquidificador.getMarca() + "\n" +
                                               "Voltagem: " + liquidificador.getVoltagem() + "\n" +
                                               "Capacidade: " + liquidificador.getCapacidade() + "\n" +
                                               "Litros/s: " + liquidificador.getLitrosPorSegundo() + "\n" +
                                               "Cor da tampa: " + liquidificador.getTampa().getCor() + "\n" +
                                               "Preço: R$ " + liquidificador.getPreco() + "\n" + 
                                               "Desconto: R$ " + liquidificador.getDesconto() + "\n" +
                                               "___________________________________" + "\n" +
                                               "Preço final: R$ " + liquidificador.getPrecoFinal(), "DETALHES", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_buttonDetailActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDetail;
    private javax.swing.JComboBox comboCapacidade;
    private javax.swing.JComboBox comboHelices;
    private javax.swing.JComboBox comboItem;
    private javax.swing.JComboBox comboLitros;
    private javax.swing.JComboBox comboMarca;
    private javax.swing.JComboBox comboMes;
    private javax.swing.JComboBox comboTampa;
    private javax.swing.JComboBox comboVolts;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JSlider sliderPrice;
    // End of variables declaration//GEN-END:variables
}