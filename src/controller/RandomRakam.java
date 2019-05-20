/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Random;

/**
 *
 * @author Muhammed
 */
public class RandomRakam {

  

    public int[] randomRakam(int adet) {
        int dizi[] = new int[adet];
        Random rnd = new Random();

        for (int i = 0; i < adet; i++) {
            int n = 1 + rnd.nextInt(adet / 2);//+1 deme sebebimiz:
                            //random adet eksi 1 uretir
            if (uretilecekRandomRakamlar(dizi, n) < 2) {
                dizi[i] = n;
            } else {
                i--;
            }
        }

        return dizi;
    }
      public int uretilecekRandomRakamlar(int[] dizi, int deger) {
        int count = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == deger) {
                count++;
            }
        }

        return count;
    }
}
