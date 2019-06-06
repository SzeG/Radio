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

/**
 *
 * @author Mi
 */
public class JavaApplication151 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String[] x = new String[1000];
        try {
            String s;
            int osszsor;
            FileReader buta = new FileReader("musor.txt");
            BufferedReader okos = new BufferedReader(buta);
            s = okos.readLine();
            s = s.trim();
            osszsor = Integer.parseInt(s);

            for (int i = 0; i < osszsor; i++) {
                x[i] = okos.readLine();

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Nincs ilyen file!");
        } catch (IOException ex) {
            System.out.println("Hiba az olvasásnál!");
        }
    }
    
}
