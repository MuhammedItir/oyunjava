package view;

import controller.OyunYonetici;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class timer {
    private JLabel timeLabel;
    
    public timer(JLabel timeLabel){
        this.timeLabel=timeLabel;
    }
    
   long displayMinutes = 0;
   long starttime = System.currentTimeMillis();
   
    Timer myTimer = new Timer();
    
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            
            
         
        
          
            boolean x = true;
    long displayMinutes=0;
    long saat =0;
    long starttime=System.currentTimeMillis();
    
    System.out.println("Timer:");
    while(x)
    {
  
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(timer.class.getName()).log(Level.SEVERE, null, ex);
                }
        
        
    
        long timepassed=System.currentTimeMillis()-starttime;
        long secondspassed=timepassed/1000;
        if(secondspassed==60)
        {
            secondspassed=0;
            starttime=System.currentTimeMillis();
        }
        if((secondspassed%60)==0)
        displayMinutes++;
        if(displayMinutes == 60){
            saat++;
            displayMinutes=0;
            secondspassed = 0;
            starttime = System.currentTimeMillis();
        }
        
       
       if(secondspassed>=10)
           timeLabel.setText("0"+saat+":"+"0"+displayMinutes+":"+secondspassed);
       else
           timeLabel.setText("0"+saat+":"+"0"+displayMinutes+":"+"0"+secondspassed);
        System.out.println(saat+":"+displayMinutes+":"+secondspassed);
        OyunYonetici oy = new OyunYonetici();
            System.out.println(oy.oyunbitti());
         if(oy.oyunbitti()){
             
            myTimer.cancel();  myTimer.purge(); return; 
         }
         task.cancel();
      
    
    }
       /*     long timepassed = System.currentTimeMillis() - starttime;
            long secondspassed = timepassed / 1000;
            if(secondspassed==60)
        {
            secondspassed=0;
            starttime=System.currentTimeMillis();
        }
        if((secondspassed%60)==0)
        displayMinutes++;
        
        
        System.out.println(displayMinutes+":"+secondspassed);
        */    
        }
    };

    public void start()  {
        
        myTimer.scheduleAtFixedRate(task, 1000, 1000);
        
    }
}
