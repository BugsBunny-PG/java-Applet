import java.awt.*;
import java.applet.*;
public class Mypolygon extends Applet
  {
    int x[]={20,50,80};
    int y[]={80,20,80};
    public void paint(Graphics g)
     { 
         g.setColor(Color.blue);
      g.drawPolygon(x,y,3);
     }
   }
  //<applet code="Mypolygon.class" width="200"height="150"></applet>