import java.applet.*;
import java.awt.*;
public class Mylineapplet extends Applet
 {
   public void paint(Graphics g)
   {
    g.setColor(Color.red);
    g.drawLine(20,20,100,20);
     g.setColor(Color.blue);
    g.drawLine(20,20,20,100);
     g.setColor(Color.green);
    g.drawLine(20,100,100,20);  // to draw a line
    g.drawRect(40,40,127,130);    //to graw a rectangele
      g.setColor(Color.pink);
     g.fillRect(100,100,150,200);  //for fill color in rectangle
     g.drawOval(276,256,400,600);   //draw an oval
      g.fillOval(467,467,500,600);
   }
}
//<applet code="Mylineapplet.class" width="200",height="100"></applet>