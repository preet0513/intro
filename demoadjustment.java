import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class demoadjustment extends Applet implements AdjustmentListener
{
	Scrollbar s;
	public void init()
	{
		s=new Scrollbar();
		s.addAdjustmentListener(this);
		add(s);
	}
	public void adjustmentValueChanged(AdjustmentEvent ae)
	{
		System.out.println("Scroll Bar:"+ae.getValue());
	}
}