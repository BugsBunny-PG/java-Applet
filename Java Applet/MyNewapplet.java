import java.applet.Applet;
import java.awt.Graphics;
public class MyNewapplet extends Applet
   {
    int count=1;
    public void init()
     {
      System.out.println("init method"+count++);
     }
    public void start(){
      System.out.println("start method"+count++);
      }
    public void stop(){
    System.out.println("stop method"+count++);
     }
   public void destroy(){
     System.out.println("destroy method"+count++);
       }
   public void paint(Graphics g)
     {
       System.out.println("paint method"+count++);
       g.drawString("my name is pragya gupta",50,20);
     }
    }
//<Applet code="MyNewapplet.class" width="200" height="150"></Applet>