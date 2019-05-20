/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import view.OyunScreen;
import view.puan;

/**
 *
 * @author Muhammed
 */
public class OyunYonetici {
static private JLabel puan1;
    OyunScreen screen;
    static boolean x;
    static int sayac = 0;
    static int bitis = 0;
    int oncekiButton = 0;
    static int dogru = 0;
    static  int yanlis = 0;
    public static int puan =0;
   

    public boolean checkIf(int value) {
        if (oncekiButton == 0) { // oyunun baslangicinda bir tusun gösterilmesi icin
            oncekiButton = value;
            
            return true;
        } else if (oncekiButton == value) {
            
            oncekiButton = 0;
            
            sayac++;
            dogru +=50;oyunbitti();
            oyunBittiMi();//oyun bitip bitmedigini kontrol ediyor
            
            return true;
        } else {
            yanlis -=20;
            oncekiButton = 0;
            return false;
        }
    }
    
    public void oyunBittiMi(){
        if(sayac == bitis){
            puan =( dogru + yanlis)*(bitis *2);
           puan p = null;
           p.setpuan();
            
            
            System.out.println("puan"+puan);
   JOptionPane.showMessageDialog(screen, "OYUN BITMISTIR -_-", "Mesaj", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public boolean oyunbitti(){
       
         if(sayac == bitis) x = true;
         return x;
    }
     public void setAdet(int adet) {
        bitis = adet / 2;
        
    }
   
}
