package UI;

import Login.LoginModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LoginListener implements ActionListener
{
	
	LoginModel lm = null;
	LoginWindow lw;
	String username,pwd;
	
	public LoginListener(LoginWindow lw)
	{
		this.lw = lw;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getActionCommand().equals("Login"))
		{
			username = lw.jtf.getText();
			pwd = lw.jpf.getText();
			
			lm = new LoginModel(username,pwd);
			
			System.out.println(lm.verify());
		}
		
		if(e.getActionCommand().equals("Register"))
		{

		}
	}

}
