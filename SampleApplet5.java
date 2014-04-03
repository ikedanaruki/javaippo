import java.applet.Applet;
import java.awt.*;

public class SampleApplet5 extends Applet {
  public void paint(Graphics g) {
    g.setColor(new Color(128,128,128));
    g.drawOval(200,200,100,200);
    g.setColor(Color.blue);
    g.fillOval(300,300,50,50);
  }
}