import java.applet.Applet;
import java.awt.*;

public class JankenApplet1 extends Applet {
  Image img;
  Button b1 = new Button("ぐー");
  Button b2 = new Button("ちょき");
  Button b3 = new Button("ぱー");
  
  public void init() {
    img = getImage(getDocumentBase(),"image1.gif");
    add(b1);
    add(b2);
    add(b3);
  }

  public void paint(Graphics g) {
    g.drawImage(img,10,30,this);
    g.drawImage(img,500,30,this);
    g.drawString("わたし", 45,180);
    g.drawString("あなた", 535,180);
  }
} 