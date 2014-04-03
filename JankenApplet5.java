import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class JankenApplet5 extends Applet
    implements Runnable, ActionListener {
  Image image[] = new Image[3];
  Thread t;
  int index1 = 0;
  int index2 = 0;
  String msg = "";

  boolean state = false;
  Button b1 = new Button("ぐー");
  Button b2 = new Button("ちょき");
  Button b3 = new Button("ぱー");

  public void init() {
    for(int i = 0; i <= 2; i++) {
      image[i] = getImage(getDocumentBase(),"image" + (i+1) + ".gif");
    }
    add(b1);
    add(b2);
    add(b3);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }

  public void paint(Graphics g) {
    g.drawImage(image[index1],10,30,this);
    g.drawImage(image[index2],500,30,this);
    g.drawString("わたし", 45,180);
    g.drawString("あなた", 535,180);
    g.drawString(msg,50,300);
  }
  
  public void start() {
    state = true;
    t = new Thread(this);
    t.start();
  }

  public void run() {
    while(state) {
      index1++;
      if(index1 == 3) {
        index1 = 0;
      }
      index2++;
      if(index2 == 3) {
        index2 = 0;
      }
      repaint();
      try {
        Thread.sleep(70);
      } catch(InterruptedException e) { }
    }
  }

  public void actionPerformed(ActionEvent e) {
   state = false;
   if(e.getSource() == b1) {
      msg = "ぐー";
      index2 = 0;
    }
    else if(e.getSource() == b2) {
      msg = "ちょき";
      index2 = 1;
    }
    else if(e.getSource() == b3) {
      msg = "ぱー";
      index2 = 2;	  
    }
    repaint();
  }
}