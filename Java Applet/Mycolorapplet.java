import java.applet.*;
import java.awt.*;
public class Mycolorapplet extends Applet
  {
    public void paint(Graphics g)
     {
      g.setColor(Color.blue);
      g.drawString("welcome",20,40);
          g.drawString("welcome",80,100);
             g.drawString("welcome",120,140);
     }
  }
//<Applet code ="Mycolorapplet"width="200"height="100"></Applet>