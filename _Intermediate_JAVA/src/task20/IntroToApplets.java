package task20;

import javax.swing.*;
import java.awt.*;

public class IntroToApplets extends JApplet {
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Wow this actually worked?", 25, 25);
    }
}
