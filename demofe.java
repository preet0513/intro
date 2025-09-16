import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class demofe extends Applet implements FocusListener
{
	TextField t;
	Button b;
	
	public void init()
	{
		t=new TextField(25);
		b=new Button("Click here");
		t.addFocusListener(this);
		add(t);
		add(b);
	}
	public void focusGained(FocusEvent fe)
	{
		System.out.println("Cursor is in Text Field");
	
	}
	public void focusLost(FocusEvent fe)
	{
		System.out.println("Cursor is on Button");
	}
} 