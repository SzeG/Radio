
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication151.ZeneiAgy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gergő
 */
public class ZeneiEljarasok {

    private List<ZeneiEljarasok> adas;

    public ZeneiEljarasok() {

        this.adas = new ArrayList<>();
    }

    public void betoltes() {

        FileReader buta;
        String beolv;
        try {
            buta = new FileReader("musor.txt");
            BufferedReader okos = new BufferedReader(buta);
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                beolv = okos.readLine();
                if (beolv == null) {
                    break;
                }
                String[] szamok=beolv.split(" ");
                String[] cim=beolv.split(":");
                String[] eloado=cim[0].split(" ");
                //ZeneiAgy za= new ZeneiAgy(Integer.parseInt(szamok[0]),Integer.parseInt((szamok[1]*60)+szamok[2]),eloado[3].concat(eloado[4]),cim[1], KEZDIDO);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Nem található a file!");
        } catch (IOException ex) {
            System.out.println("Hiba a file olvasásánál!");
        }

    }
}
