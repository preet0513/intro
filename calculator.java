/* a Program to implement Calculator in An Applet using Appropriate layout manager*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class calculator extends Applet implements ActionListener
{
	TextField display;
	Button numbut[];
	Button addb,sub,mil,div,eq,clr;
	Font f;
	String op=" ";
	double num1,num2,result;
	
	public void init()
	{
		setLayout(new BorderLayout());	
		
		f=new Font("Arial",Font.BOLD,24);
		setFont(f);
		
		display=new TextField(30);
		display.setEditable(false);
		
		add(display,BorderLayout.NORTH);
						
		Panel p=new Panel();
		p.setLayout(new GridLayout(4,4));
		numbut=new Button[10];
			
		for(int i=0;i<10;i++);
		{
			numbut[i]=new Button(String.valueOf(i));
			numbut[i].addActionListener(this);
			p.add(numbut[i]);
		}
		
		addb=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		eq=new Button("=");
		clr=new Button("C");
	
		addb.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		eq.addActionListener(this);
		clr.addActionListener(this);
		
		p.add(addb);
		p.add(sub);
		p.add(mul);
		p.add(div);
		p.add(eq);
		p.add(clr);

		add(p,BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String cmd=e.getActionCommand();
		if(cmd.charAt(0)=='C')
		{
			display.setText(" ");
			op=" ";
			num1=num2=result=0;
		}
		else if(cmd.charAt(0)== '=')
		{
			num2=Double.parseDouble(display.getText());
			switch(op)
			{
				case"+":
					result=num1+num2;
					break;
				
				case"-":
					result=num1-num2;
					break;

				case"*":
					result=num1*num2;
					break;
			
				case"/":
					if(num2 !=0)
					{
						result=num1/num2;
					}
					else
					{
						display.setText("Error");
						return;
					}
					break;
			}//end of switch case

			display.setText(String.valueOf(result));
			op=" ";
		}
		else if(cmd.charAt(0)='0'&& cmd.charAt(0)<='9')
		{
			if(op==" ")
			{	
				display.setText(cmd);
			}
			else
			{
				//if a number is pressed then append it to display
				display.setText(display.getText()+cmd);
			}
		}
		else
		{
			//if an operator is Pressed,store the current number and operator
			num1=Double.parseDouble(display.getText());
			op=cmd;					
			display.setText(" ");
		}
	}
}