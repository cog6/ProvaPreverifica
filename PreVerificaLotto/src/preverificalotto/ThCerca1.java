/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preverificalotto;

/**
 *
 * @author type6
 */
public class ThCerca1 extends Thread {

    private int numDaCercare;
    private int[] estrCorrente;
    private DatiCondivisi dati;

    public ThCerca1(int numDaCercare, DatiCondivisi dati) {
        this.numDaCercare = numDaCercare;
        this.dati = dati;
        estrCorrente = new int[5];
    }

    public void run() {
        estrCorrente = dati.getEstrCorrente();
        dati.setTrovato1(false);
        for (int i = 0; i < 5; i++) {
            if(estrCorrente[i] == numDaCercare){
                dati.setTrovato1(true);
            }
        }
    }

}
