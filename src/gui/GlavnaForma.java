package gui;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import niti.NitPrijem;

/**
 *
 * @author Lazar Vujadinovic
 */
public class GlavnaForma extends javax.swing.JFrame {

    /**
     * Creates new form GlavnaForma
     */
    public GlavnaForma() {
        initComponents();
        jtxtAreaPoruke.setEditable(false);
        pk = new ArrayList<>();
        jListKorisnici.setModel(new DefaultListModel());
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
        jtxtUsername = new javax.swing.JTextField();
        jtxtPoruka = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAreaPoruke = new javax.swing.JTextArea();
        jlblUsername = new javax.swing.JLabel();
        jlblPoruka = new javax.swing.JLabel();
        jbtPoveziSe = new javax.swing.JButton();
        jbtSend = new javax.swing.JButton();
        jlblAdresa = new javax.swing.JLabel();
        jtxtAdresa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListKorisnici = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chat sa svima:"));

        jtxtAreaPoruke.setColumns(20);
        jtxtAreaPoruke.setRows(5);
        jScrollPane1.setViewportView(jtxtAreaPoruke);

        jlblUsername.setText("Username: ");

        jlblPoruka.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblPoruka.setText("Poruka:");

        jbtPoveziSe.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtPoveziSe.setText("Povezi se");
        jbtPoveziSe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtPoveziSeActionPerformed(evt);
            }
        });

        jbtSend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbtSend.setText("->");
        jbtSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSendActionPerformed(evt);
            }
        });

        jlblAdresa.setText("Adresa servera:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblPoruka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtSend, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jlblAdresa))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbtPoveziSe, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlblUsername)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtUsername)
                            .addComponent(jtxtAdresa))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblUsername)
                            .addComponent(jtxtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblAdresa)
                            .addComponent(jtxtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbtPoveziSe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtPoruka, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblPoruka)
                        .addComponent(jbtSend)))
                .addGap(19, 19, 19))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Online korisnici:"));

        jListKorisnici.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListKorisniciMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jListKorisnici);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Socket s;
    NitPrijem np;
    private void jbtPoveziSeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtPoveziSeActionPerformed
        if (jtxtUsername.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "MORATE UNETI USERNAME!!!");
            return;
        }
        jbtPoveziSe.setEnabled(false);
        jtxtUsername.setEnabled(false);
        try {
            //ukoliko nije uneta adresa servera u odgovarajucem formatu, dodeljuje se podrazumevana adresa
            String adr = jtxtAdresa.getText().trim();
            if (!adr.matches("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$")) {
                adr = "127.0.0.1";
            }
            s = new Socket(adr, 9000);
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            pw.println(jtxtUsername.getText());
            jtxtAreaPoruke.append("Uspesno ste se povezali sa serverom.\nZa kraj otkucajte \"KRAJ\".\n");
            jtxtAdresa.setEnabled(false);
            jlblAdresa.setEnabled(false);
        } catch (IOException ex) {
        }
        np = new NitPrijem(this);
    }//GEN-LAST:event_jbtPoveziSeActionPerformed

    private void jbtSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSendActionPerformed
        if (s != null) {
            try {
                PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
                String poruka = jtxtPoruka.getText();
                if (poruka.isEmpty()) {
                    return;
                }
                pw.println(poruka);
                jtxtAreaPoruke.append("[[JA kazem:]] " + poruka + "\n");
                if (poruka.equals("KRAJ")) {
                    jbtSend.setEnabled(true);
                    jtxtUsername.setEnabled(true);
                    np = null;//treba prekinuti vec pokrenutu nit za prijem
                    s.close();
                    s = null;
                }
                jtxtPoruka.setText("");
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_jbtSendActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (s != null) {
            try {
                PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
                pw.println("KRAJ");
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void jListKorisniciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListKorisniciMouseClicked
        if (evt.getClickCount() > 1 && jListKorisnici.getSelectedIndex() >= 0) {
            String sagovornik = jListKorisnici.getSelectedValue().toString();
            if (!sagovornik.equals(jtxtUsername.getText().trim())) {
                for (PrivatnaKonverzacija k : pk) {
                    if (k.getSagovornik().equals(sagovornik)) {
                        k.setVisible(true);
                        return;
                    }
                }
                PrivatnaKonverzacija nova = new PrivatnaKonverzacija(sagovornik, this);
                nova.setVisible(true);
                pk.add(nova);
            }
        }
    }//GEN-LAST:event_jListKorisniciMouseClicked

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
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlavnaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlavnaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList jListKorisnici;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtPoveziSe;
    private javax.swing.JButton jbtSend;
    private javax.swing.JLabel jlblAdresa;
    private javax.swing.JLabel jlblPoruka;
    private javax.swing.JLabel jlblUsername;
    private javax.swing.JTextField jtxtAdresa;
    private javax.swing.JTextArea jtxtAreaPoruke;
    private javax.swing.JTextField jtxtPoruka;
    private javax.swing.JTextField jtxtUsername;
    // End of variables declaration//GEN-END:variables

    public Socket getS() {
        return s;
    }

    public JList getjListKorisnici() {
        return jListKorisnici;
    }

    public JTextArea getJtxtAreaPoruke() {
        return jtxtAreaPoruke;
    }

    String getMojeIme() {
        return jtxtUsername.getText();
    }

    List<PrivatnaKonverzacija> pk;

    /**
     * metoda koju poziva nitPrijem ukoliko je stigla nova privatna poruka
     * metoda otvara novu privatnu konverzaciju ili prikazuje postojecu i u nju
     * upisuje pristiglu poruku
     *
     * @param poruka privatna poruka koja sadrzi ime posiljaoca
     */
    public void stiglaPrivatnaPoruka(String poruka) {
        //Privatna poruka za [ime] od {imena}: tekst poruke
        String sagovornik = poruka.substring(poruka.indexOf("{") + 1, poruka.indexOf("}"));
        for (PrivatnaKonverzacija k : pk) {
            if (k.getSagovornik().equals(sagovornik)) {
                k.novaPoruka(poruka.substring(poruka.indexOf("}") + 1));
                k.setVisible(true);
                return;
            }
        }
        PrivatnaKonverzacija nova = new PrivatnaKonverzacija(sagovornik, this);
        nova.setVisible(true);
        pk.add(nova);
        nova.novaPoruka(poruka.substring(poruka.indexOf("}") + 1));
    }

}
