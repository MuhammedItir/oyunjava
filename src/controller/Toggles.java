/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.AksiyonDinleyici;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import view.OyunScreen;

/**
 *
 * @author Muhammed
 */
public final class Toggles extends JToggleButton {

    RandomRakam db = new RandomRakam(); //gönderilen adet kadar random değerler gönderiyor
    OyunScreen screen;

    private int miktar;
    private JPanel panel;
    private String layout;//UNUTMA: kullanci iki farkli layouttan secebilir

    public Toggles(String rakam, JPanel panel, String layout) throws InterruptedException {

        OyunYonetici oy = new OyunYonetici();
        AksiyonDinleyici listener = new AksiyonDinleyici();

        int miktar = Integer.parseInt(rakam);//rakam string oldugu icin int e cevirmemiz lazim
        
        if (miktar <= 0 ) {//kullanci sifir yada eksi sayi girirse uyari ver
            JOptionPane.showMessageDialog(screen, "Lutfen sifirden buyuk bir sayi giriniz", "DIKKAT", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (miktar % 2 != 0) {//kullanci tek sayi girdigi takdirde
            miktar++;
        }
        oy.setAdet(miktar);//bitis girilen rakam / 2 olacak

        JToggleButton buttons[] = new JToggleButton[miktar];//kutular dizisi olusturuluyor
        int degerler[] = db.randomRakam(miktar);

        this.miktar = miktar;
        this.panel = panel;
        this.layout = layout;

        panel.removeAll(); //onceki kutuları siliyor
        panel.repaint();

        for (int i = 0; i < buttons.length; ++i) {

            buttons[i] = new JToggleButton();

            buttons[i].addActionListener(listener);

            panel.add(buttons[i]);
            buttons[i].setText(Integer.toString(degerler[i]));
            System.out.print(degerler[i] + "  ");//output
            
            buttons[i].setName(Integer.toString(degerler[i]));//değerler yedek olarak isme atandı

        }
        System.out.println("");
        if (layout == "FlowLayout") {
            panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        } else {
            panel.setLayout(new GridLayout(3, 4));
        }
        gizle gz=new gizle();
        gz.gizle(miktar, buttons);
        
       
       
    }

   
}
