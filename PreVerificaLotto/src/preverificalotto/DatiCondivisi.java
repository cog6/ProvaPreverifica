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
public class DatiCondivisi {

    private Ruota[] estrazioni;
    private int[] estrCorrente;     //salvo l'estrazione corrente per facilitare il lavoro del datiCondivisi
    private int numEl, nEstrazioni;     //numEl è di estrazioni
    private boolean trovato1, trovato2;

    

    public DatiCondivisi(int nEstrazioni) {
        numEl = 0;
        estrazioni = new Ruota[nEstrazioni];
        estrCorrente = new int[5];
    }

    //metodo che prende un vettore di interi dal ThGenera e lo mette in coda al 
    //vettore dele estrazioni    
    public void AddEstrazione(int[] n) {
        for (int i = 0; i < 5; i++) {
            estrazioni[numEl].AddElement(n[i]);
            estrCorrente[i] = n[i];
        }
        numEl++;
    }

    public int[] getEstrCorrente() {
        return estrCorrente;
    }

    public void setTrovato1(boolean trovato1) {
        this.trovato1 = trovato1;
    }

    public void setTrovato2(boolean trovato2) {
        this.trovato2 = trovato2;
    }
}
