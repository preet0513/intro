//Gridbag layout
import java.awt.*;
import java.applet.*;
public class gb extends Applet 
{
	public void init()
	{
		Label l=new Label("Name");
		Button b=new Button("OK");

		GridBagConstraints gbc=new GridBagConstraints();
		GridBagLayout gbl=new GridBagLayout();

		Frame f=new Frame("New Frame");
		f.setSize(200,100);
		f.setLayout(gbl);

		gbc.gridx=0;
		gbc.gridy=0;
		gbc.weightx=150;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		f.add(l,gbc);

		gbc.fill=GridBagConstraints.VERTICAL;
		gbc.gridheight=3;
		gbc.weightx=26;
		gbc.gridx++;
		f.add(b,gbc);
		
		f.setVisible(true);
	}
}