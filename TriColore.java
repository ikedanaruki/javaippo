import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class TriColore extends Applet {
  public void paint(Graphics g) {
	g.drawRect(20,20,150,100);
	g.setColor(Color.blue);
	g.fillRect(21,21,49,99);
	g.setColor(Color.white);
	g.fillRect(71,21,49,99);
	g.setColor(Color.red);
	g.fillRect(120,21,50,99);
  }
}
