import java.awt.*;
import java.applet.*;
public class Mycomponent extends Applet
  {
   Button b1=new Button("submit");
   Label l1=new Label("enter first name");
   TextField t1=new TextField();
   public void init()
    {
     add(b1);
     add(l1);
     add(t1);
    }
   }
// <APPLET code="Mycomponent.class" width="200" height="150"></APPLET>