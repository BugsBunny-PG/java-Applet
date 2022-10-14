import java.applet.*;
import java.awt.*;
public class Myfirstapplet extends Applet
  {
   Font obj=new Font("KUX BHII",Font.ITALIC,100);
   public void paint(Graphics g)
    {
     g.setFont(obj);
     g.drawString("P.G",100,80);
     g.drawString("welcome"+g.getFont(),200,200);
    }
  }
//<Applet code="Myfirstapplet.class" width="200" height="150"></Applet>

