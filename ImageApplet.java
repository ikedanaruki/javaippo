import java.applet.Applet;
import java.awt.*;

public class ImageApplet extends Applet {
	Image img;

	public void init() {
		img = getImage(getDocumentBase(),"image1.gif");
	}
	
	public void paint(Graphics g){
		g.drawImage(img,100,200,this);
	}
}