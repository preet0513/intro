import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class demomouse extends Applet implements MouseListener
{
	
	String msg="";
	int x,y;

	public void init()
	{
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent me)
	{
	
	x=me.getX();
	y=me.getY();
	msg="X and Y Coordinate of clicked Place are:"+x+":"+y;
	
	repaint();
}
	public void mouseEntered(MouseEvent me)
	{
	}
	public void mouseExited(MouseEvent me)
	{
	}
	public void mousePressed(MouseEvent me)
	{
	}
	public void mouseReleased(MouseEvent me)
	{
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}
	
	
	