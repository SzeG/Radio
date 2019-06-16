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
                ZeneiAgy za = new ZeneiAgy(Integer.parseInt(szamok[0]), Integer.parseInt(szamok[1]) * 60 + Integer.parseInt(szamok[2]), osszefuzo(eloado), cim[1], Integer.parseInt(szamok[0]));
                adas.add(za);
            }
            buta.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Nem található a file!");
        } catch (IOException ex) {
            System.out.println("Hiba a file olvasásánál!");
        }

    }

    public void összkiiro() {
        for (int i = 0; i < adas.size(); i++) {
            System.out.println(adas.get(i).toString());
        }
    }

    public String osszefuzo(String[] eloado) {

        if (eloado.length == 5) {
            return eloado[3].concat(" " + eloado[4]);
        } else {
            return eloado[3];
        }

    }

    public void kezdesekbeall() {
        Integer egyes = 0;
        Integer kettes = 0;
        Integer harmas = 0;
        for (int i = 0; i < adas.size(); i++) {

            if (adas.get(i).getAdo() == 1) {
                egyes = egyes + adas.get(i).getIdotartam();
                adas.get(i).setKezdido(egyes);

            }
            if (adas.get(i).getAdo() == 2) {
                kettes = kettes + adas.get(i).getIdotartam();
                adas.get(i).setKezdido(kettes);
            }
            if (adas.get(i).getAdo() == 3) {
                harmas = harmas + adas.get(i).getIdotartam();
                adas.get(i).setKezdido(harmas);
            }
        }

    }

    public void adasszamolo() {
        Integer egyes = 0;
        Integer kettes = 0;
        Integer harmas = 0;
        for (int i = 0; i < adas.size(); i++) {

            if (adas.get(i).getAdo() == 1) {
                egyes++;
            }
            if (adas.get(i).getAdo() == 2) {
                kettes++;
            }
            if (adas.get(i).getAdo() == 3) {
                harmas++;
            }
        }
        System.out.println("Az egyes adón "+egyes+"db szám, a kettes adón "+kettes+"db szám, a hármas adón "+harmas+" db szám hangzott el az adás folyamán.");
    }
    public void claptonokkozott(){
        Integer eleje=0;
        Integer vege=0;
        Integer osszeg=0;
        Integer orak;
        Integer percek;
                
        for (int i = 0; i < adas.size(); i++) {
            if (adas.get(i).getAdo()==1 && adas.get(i).getEloado().equals("Eric Clapton")) {
                eleje=adas.get(i).getKezdido();
                break;
            }
        }
        for (int i = adas.size()-1; i > 0; i--) {
            if (adas.get(i).getAdo()==1 && adas.get(i).getEloado().equals("Eric Clapton")) {
                vege=adas.get(i).getKezdido();
                break;
            }
        }
        osszeg=(vege-eleje);
        orak=osszeg/3600;
        osszeg=osszeg%3600;
        percek=osszeg/60;
        osszeg=osszeg%60;
        System.out.println("A két Eric Clapton szám között "+orak+":"+percek+":"+osszeg+" idő telt el.");
    }
    public void omlegkereses(){
        Integer omlegado=0;
        Integer omlegido=0;
        Integer masikado=0;
        String masikeloado=null;
        String masikcim=null;
        Integer utolsoado=0;
        String utolsoeloado=null;
        String utolsocim=null;
        for (int i = 0; i < adas.size(); i++) {
            if (adas.get(i).getCim()=="Legenda" && adas.get(i).getEloado()=="Omega") {
                omlegido=adas.get(i).getKezdido();
                omlegado=adas.get(i).getAdo();
                break;
            }
        }
        
        for (int i = adas.size()-1; i > 0; i--) {
            if (adas.get(i).getAdo()!=omlegado && adas.get(i).getKezdido()<omlegido) {
                masikado=adas.get(i).getAdo();
                masikeloado=adas.get(i).getEloado();
                masikcim=adas.get(i).getCim();
                break;
            }
        }
        utolsoado= 6-(omlegado+masikado);
        for (int i = adas.size()-1; i > 0; i--) {
            if (adas.get(i).getAdo()==utolsoado && adas.get(i).getKezdido()<omlegido) {
                utolsoeloado=adas.get(i).getEloado();
                utolsocim=adas.get(i).getCim();
                break;
            }
        }
        System.out.println("Mikor Eszter elkapcsolt, a "+masikado+". adón "+masikeloado+": "+masikcim+" szólt, a "+utolsoado+". adón pedig "+utolsoeloado+": "+utolsocim+" szólt.");
    }
    

}
