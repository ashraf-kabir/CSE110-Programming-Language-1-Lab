package Practices.eidMubarak;

import java.applet.*;
import java.awt.*;

public class EidalAdha extends Applet {

	final Font f = new Font("Cambria", Font.BOLD, 30);

	public void paint(Graphics g) {
		
		Dimension d = this.getSize();
		g.setColor(Color.lightGray);
		g.fillRect(0, 0, d.width, d.height);
		g.setColor(Color.darkGray);
		g.setFont(f);
		drawCenteredString("EID MUBARAK", d.width, d.height, g);
	}

	public void drawCenteredString(String s, int w, int h, Graphics g) {

		FontMetrics fm = g.getFontMetrics();
		int x = (w - fm.stringWidth(s)) / 2;
		int y = (fm.getAscent() + (h - (fm.getAscent() + fm.getDescent())) / 2);
		g.drawString(s, x, y);
	}
}
