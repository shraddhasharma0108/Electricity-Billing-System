
package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable{
    Splash(){ //constructor
         Thread t;
        ImageIcon i1;
        i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2 = i1.getImage().getScaledInstance(730,550,Image.SCALE_DEFAULT);
        ImageIcon i3;
        i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i1);
        add(image); 
        setVisible(true);
        int x = 1;
        for(int i=2;i<600;i+=4,x+=1){
        setSize(i+x,i);
        setLocation(700-((i+x)/2),400-(i/2));
        }
        setVisible(true);
        setSize(600,400);  
        // frame-size and its visibility so we can true to make function.
       //  setLocation(300,200); set opening location of the frame like center or x-axis.y-axis.
       try{
            Thread.sleep(5);
        } catch (Exception e){
            e.printStackTrace();

        }
    t = new Thread(this);
        t.start();
        setVisible(true);
    }
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            //Login Frame
            new Login();
        } catch (Exception e){
            e.printStackTrace();

        }
    }
        
    
    
    public static void main(String[] args){
       new Splash();
    } 
}




