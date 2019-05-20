/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.OyunYonetici;
import javax.swing.JLabel;

 
public class puan {
    private static JLabel puann;
    public puan(JLabel puan){
    this.puann = puan;
    }
    public static void setpuan(){
       puann.setText(Integer.toString(OyunYonetici.puan));
   }
    
}
