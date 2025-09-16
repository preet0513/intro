//An Applet to find the sum,multipication and Average of two integer number using Textbox,Label and Button component*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class AA extends Applet implements ActionListener
{
	TextField t1,t2,t3,t4;
	Label l1,l2,l3,l4;
	Button b1,b2,b3,b4;
	Font f;
	
	public void init()
	{
		this.setLayout(null);
		
		f=new Font("Arial",Font.BOLD,24);
		setFont(f);

		l1=new Label("Enter First Number");
		t1=new TextField(20);

		l2=new Label("Enter Second Number");
		t2=new TextField(20);

		l3=new label("Enter Third Number");
		t3=new TextField(20);

		l4=new Label("Result");
		t4=new TextField(20);
		t4=setEditable(false);
		
		b1=new Button("Sum");
		b2=new Button("average");
		b3=new Button("multiply");
		
		l1.setBounds(100,50,100,50);
		t1.setBounds(250,50,100,50);
		l2.setBounds(100,50,100,50);
		t2.setBounds(250,100,100,50);
		l3.setBounds(100,200,100,50);
		t3.setBounds(250,200,100,50);
		l4.setBounds(100,200,100,50);
		t4.setBounds(300,150,100,50);
		
		b1.setBounds(100,50,100,50);
		b2.setBounds(100,50,100,50);
		b3.setBounds(100,50,100,50);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(b1);
		add(b2);
		add(b3);

	}
	public void actionPerformed(ActionEvent e)
	{
				int num1=Integer.parseInt(t1.getText());
				int num2=Integer.parseInt(t2.getText());
				int num3=Integer.parseInt(t3.getText());
				
				if(e.getSource()==b1)
			{

				int sum=num1+num2+num3;
				t4.setText(Integer.toString(sum));
				l4.setText("SUM");
			}
			if(e.getSource()==b2)
			{
			int avg=(num1+num2+num3)/3;
			t4.setText(Integer.toString(avg));
			l4.setText("average")
		}
				if(e.getSource()==b3)
			{
			int mul=num1*num2*num3;
			t4.setText(Integer.toString(mul));
			l4.setText("multiply")
	}
}

			