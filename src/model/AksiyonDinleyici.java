/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.OyunYonetici;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

/**
 *
 * @author Muhammed
 */
public class AksiyonDinleyici implements ActionListener {

    JToggleButton befor, current;
    OyunYonetici yonetici = new OyunYonetici();
    
    @Override
    public void actionPerformed(ActionEvent e) {

        current = (JToggleButton) e.getSource(); //basılan tuşu değişkene atar
        String name = current.getName();//secilen tusun icindeki degeri al
        current.setText(name);//o degeri goster

        if (yonetici.checkIf(Integer.parseInt(name))) {
            current.setEnabled(false); // tuşu kilitler
            current.setForeground(Color.darkGray);//backround darkgray yap
            
        } else {
            
            current.setSelected(false);//ayni dgilse secilmemis yap
            current.setText(" ");//tekrar gizle
            befor.setSelected(false);//oncekide secilmemis yap
            befor.setEnabled(true); //onceki tus basılabilir hale getir
            befor.setText(" ");//onceki kutunun icerdeki sayi gizle
        }
        befor =  (JToggleButton) e.getSource(); // onceki tuşu kaydet
        
    }

}
