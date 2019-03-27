/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preverificalotto;

import java.util.Vector;

/**
 *
 * @author type6
 */
public class Ruota {
//    private int[] numeri;
    private Vector<Integer> numeri = new Vector<Integer>(5);

    public Ruota() {}
    
    
    public void AddElement(int n){
        numeri.add(n);
    }
}
