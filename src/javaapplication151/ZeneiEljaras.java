/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication151;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gergő
 */
public class ZeneiEljaras {

    private List<ZeneiAgy> adas;

    public ZeneiEljaras() {

        this.adas = new ArrayList<>();
    }

    public void betoltes() {

        FileReader buta;
        String beolv = " ";
        String s;
        Integer osszsor;
        try {
            buta = new FileReader("musor.txt");
            BufferedReader okos = new BufferedReader(buta);
            s = okos.readLine();
            s = s.trim();
            osszsor = Integer.parseInt(s);
            for (int i = 0; i < osszsor; i++) {
                beolv = okos.readLine();
                String[] szamok = beolv.split(" ");
                String[] cim = beolv.split(":");
                String[] eloado = cim[0].split(" ");
                ZeneiAgy za = new ZeneiAgy(Integer.parseInt(szamok[0]), Integer.parseInt(szamok[1]) * 60 + Integer.parseInt(szamok[2]), eloado[3], cim[1], Integer.parseInt(szamok[0]));
                adas.add(za);
            }
            buta.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Nem található a file!");
        } catch (IOException ex) {
            System.out.println("Hiba a file olvasásánál!");
        }

    }
    public void kiiro(){
        for (int i = 0; i < adas.size(); i++) {
            System.out.println(?);
        }
    }

}
