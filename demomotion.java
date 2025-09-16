import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class demomotion extends Applet implements MouseMotionListener
{
	int x,y;

	public void init()
	{
		addMouseMotionListener(this);
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		repaint();
	}
	
	public void mouseMoved(MouseEvent me)
	{
	}
	public void udate(Graphics g)
	{
		paint(g);
	}
	public void paint(Graphics g)
	{
		g.fillOval(x,y,15,15);
	}
}