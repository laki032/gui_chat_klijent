package niti;

import gui.GlavnaForma;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextArea;

/**
 *
 * @author Lazar Vujadinovic
 */
public class NitPrijem extends Thread {
    
    //text area u koju nit upisuje pristiglu poruku
    JTextArea jText;
    
    Socket s;
    JList listaOnlineKorisnika;
    GlavnaForma glavnaforma;
    
    public NitPrijem(GlavnaForma gf) {
        glavnaforma = gf;
        jText = gf.getJtxtAreaPoruke();
        s = gf.getS();
        listaOnlineKorisnika = gf.getjListKorisnici();
        start();
    }
    
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            while (true) {
                String poruka = br.readLine();
                if (poruka.startsWith("Klijenti:{")) {
                    String[] klijenti = poruka.substring(10, poruka.length() - 1).split(";");
                    DefaultListModel dlm = (DefaultListModel) listaOnlineKorisnika.getModel();
                    dlm.removeAllElements();
                    
                    for (int i = 0; i < klijenti.length; i++) {
                        dlm.add(i, klijenti[i]);
                    }
                } else if (poruka.startsWith("Privatna poruka")) {
                    glavnaforma.stiglaPrivatnaPoruka(poruka);
                } else {
                    jText.append(poruka + "\n");
                }
            }
        } catch (IOException ex) {
            jText.append("Nije uspelo povezivanje sa serverom." + "\n");
        }
        
    }
    
}
