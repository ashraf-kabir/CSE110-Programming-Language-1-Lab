package awt001;

//Create a child frame window from within an applet.
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="AppletFrame" width=300 height=50>
</applet>
*/
//Create a subclass of Frame.

public class SampleFrame extends Frame {

	SampleFrame(String title) {
		super(title);
		// create an object to handle window events
		MyWindowAdapter adapter = new MyWindowAdapter(this);

		// register it to receive those events
		addWindowListener(adapter);
	}

	public void paint(Graphics g) {
		g.drawString("This is in frame window", 10, 40);
	}
}

class MyWindowAdapter extends WindowAdapter {
	SampleFrame sampleFrame;

	public MyWindowAdapter(SampleFrame sampleFrame) {
		this.sampleFrame = sampleFrame;
	}

	public void windowClosing(WindowEvent we) {
		sampleFrame.setVisible(false);
	}
}
