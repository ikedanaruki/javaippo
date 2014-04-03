import java.applet.Applet;
import java.awt.Graphics;
public class SampleApplet3 extends Applet {
  public void paint(Graphics g) {
    g.drawRect(20,20,300,300);
    g.fillRect(200,200,500,400);
  }
}