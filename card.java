import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class card extends Applet implements ActionListener
{
	CardLayout c;
	Panel p1,p2;
	Button button1,button2;
	
	public void init()
	{
		c=new CardLayout();

		button1=new Button("Next");
		button2=new Button("Previous");
		
		p1=new Panel();
		p2=new Panel();
		
		p1.setLayout(c);
		p1.add(button1);
		p2.add(button2);
		p1.add(p2,"card 2");
		add(p1);

		button1.addActionListener(this);
		button2.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==button1)
	{
		c.next(p1);
		c.show(p2,"Card2");
	}
	else if(e.getSource()==button2)
	{
		c.previous(p1);
		c.show(p1,"Card1");
	}
}
}