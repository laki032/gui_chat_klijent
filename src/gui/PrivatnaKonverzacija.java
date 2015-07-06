package gui;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Lazar Vujadinovic
 */
public class PrivatnaKonverzacija extends javax.swing.JFrame {

    /**
     * Creates new form PrivatnaKonverzacija
     */
    private final String sagovornik;
    private final Socket s;
    private GlavnaForma glavna;
    
    public PrivatnaKonverzacija(String sagovornik, GlavnaForma gf) {
        initComponents();
        this.sagovornik = sagovornik;
        glavna = gf;
        s = gf.getS();
        jtxtUsername.setText(sagovornik);
        jtxtUsername.setEnabled(false);
        jtxtAreaPoruke.setEditable(false);
    }
    
    public String getSagovornik() {
        return sagovornik;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblUsername = new javax.swing.JLabel();
        jtxtUsername = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAreaPoruke = new javax.swing.JTextArea();
        jlblPoruka = new javax.swing.JLabel();
        jtxtPoruka = new javax.swing.JTextField();
        jbtSend = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jlblUsername.setText("Sagovornik:");

        jtxtAreaPoruke.setColumns(20);
        jtxtAreaPoruke.setRows(5);
        jScrollPane1.setViewportView(jtxtAreaPoruke);

        jlblPoruka.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblPoruka.setText("Poruka:");

        jbtSend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtSend.setText("->");
        jbtSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSendActionPerformed(evt);
            }
        });

        jButton1.setText("Prekini");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblPoruka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtSend, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlblUsername)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtUsername)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblUsername)
                    .addComponent(jtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblPoruka)
                        .addComponent(jbtSend))
                    .addComponent(jtxtPoruka))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSendActionPerformed
        if (s != null) {
            try {
                PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
                String poruka = jtxtPoruka.getText();
                String prefix = "Privatna poruka za [" + sagovornik + "] od {" + glavna.getMojeIme() + "}: ";
                pw.println(prefix + poruka);
                jtxtAreaPoruke.append("[[JA kazem:]] " + poruka + "\n");
                
                jtxtPoruka.setText("");
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_jbtSendActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtSend;
    private javax.swing.JLabel jlblPoruka;
    private javax.swing.JLabel jlblUsername;
    private javax.swing.JTextArea jtxtAreaPoruke;
    private javax.swing.JTextField jtxtPoruka;
    private javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables

    /**
     * metoda u jtxtAreaPoruke upisuje privatnu poruku od sagovornika
     * @param substring - privatna poruka
     */
    void novaPoruka(String substring) {
        jtxtAreaPoruke.append("<<" + sagovornik + ">> " + substring + "\n");
    }
}