
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JToggleButton;
import view.timer;



public class gizle {
    
    private static int mik;
    private static JToggleButton[] but ;
     public  gizle() {
         
         gizleme(mik, but);
        

        }
     public void gizle(int miktar, JToggleButton[] buttons){
         mik = miktar;
          but = buttons;
          
          
     }
     
     
      public void gizleme(int miktar, JToggleButton[] buttons) {
          
    for (int i = 0; i < miktar; ++i) {
            buttons[i].setText(" ");//değerler görünmesin diye
            
}
    
    }
    
      
}

