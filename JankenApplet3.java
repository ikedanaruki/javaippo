import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class JankenApplet3 extends Applet
    implements ActionListener {
  Image img;
  String msg = "";
  Button b1 = new Button("ぐー");
  Button b2 = new Button("ちょき");
  Button b3 = new Button("ぱー");

  public void init() {
    img = getImage(getDocumentBase(),"image1.gif");
    add(b1);
    add(b2);
    add(b3);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }

  public void paint(Graphics g) {
    g.drawImage(img,10,30,this);
    g.drawImage(img,500,30,this);
    g.drawString("わたし", 45,180);
    g.drawString("あなた", 535,180);
    g.drawString(msg,50,300);
  }

  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == b1) {
      msg = "ぐー";
    }
    else if(e.getSource() == b2) {
      msg = "ちょき";
    }
    else if(e.getSource() == b3) {
      msg = "ぱー";
    }
    repaint();
  }
}