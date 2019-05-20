/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author MH
 */
public class PerfectTimer {
    public PerfectTimer() throws InterruptedException {
  
    boolean x = true;
    long displayMinutes=0;
    long starttime=System.currentTimeMillis();
    
    System.out.println("Timer:");
    while(x)
    {
  
        TimeUnit.SECONDS.sleep(1);
        
        
    
        long timepassed=System.currentTimeMillis()-starttime;
        long secondspassed=timepassed/1000;
        if(secondspassed==60)
        {
            secondspassed=0;
            starttime=System.currentTimeMillis();
        }
        if((secondspassed%60)==0)
        displayMinutes++;
        
        
        System.out.println(displayMinutes+":"+secondspassed);
        
    
    }
    
}
}
    
