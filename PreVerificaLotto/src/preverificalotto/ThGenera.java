/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preverificalotto;

import java.util.Random;
import java.util.Vector;

/**
 *
 * @author type6
 */
public class ThGenera extends Thread{
    DatiCondivisi dati;
    private int nEstrazioni;    //numero delle estrazioni chiesto dal main all'utente
    private int[] estrazione;   //estrazione corrente

    public ThGenera(DatiCondivisi dati) {
        this.dati = dati;
        estrazione = new int[5];
    }
    
    public void run(){
        Random rn = new Random();
        for (int j = 0; j < nEstrazioni; j++) {
            for (int i = 0; i < 5; i++) {
                estrazione[i] = rn.nextInt(5);
            }
            dati.AddEstrazione(estrazione);
        }
        
    }
    
    
}
