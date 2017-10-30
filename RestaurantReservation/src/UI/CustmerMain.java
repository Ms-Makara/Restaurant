/**
 * A simple students management
 * Model2模式
 */
package UI;

import javax.swing.*;
//import java.awt.*;
//import java.util.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;



public class CustmerMain extends JFrame implements ActionListener
{
	
	JPanel jp1,jp2;		//define controls
	JLabel jl1;
	JButton jb1, jb2, jb3, jb4;
	JTable jt1;
	JScrollPane jsp;
	JTextField jtf;
//	RestauratModel rm = null;
	
	public static void main(String[] args) 
	{
		CustmerMain test = new CustmerMain();
	}
	
	public CustmerMain()
	{
		jp1 = new JPanel();		//upper part
		jtf = new JTextField(10);
		jb1 = new JButton("search");
		jb1.addActionListener(this);
		jl1 = new JLabel("Input name:");
		jp1.add(jl1);
		jp1.add(jtf);		
		jp1.add(jb1);
		
		jp2 = new JPanel();		//under part
		jb2 = new JButton("Reserve");
		jb2.addActionListener(this);
		jb3 = new JButton("Comment");
		jb3.addActionListener(this);
		jb4 = new JButton("More");
		jb4.addActionListener(this);
		jp2.add(jb2);		
		jp2.add(jb3);
		jp2.add(jb4);
		
		
		String [] paras = {"1"};
		
		
		jt1 = new JTable();
		jsp = new JScrollPane(jt1);	
		this.add(jsp);
		this.add(jp1,"North");
		this.add(jp2,"South");
		this.setSize(400, 300);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(500, 300);
	}
	
	public void fflush()
	{
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 	//TO judge which button was clicking
	{
		
		
	}
	
}
