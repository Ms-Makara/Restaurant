package UI;

import javax.swing.JDialog;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class ReservationDialog extends JDialog implements ActionListener
{
	JLabel jl1, jl2, jl3, jl4, jl5, jl6;
	JButton jb1, jb2;
	JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtf6;
	JPanel jp1, jp2, jp3;
	

	public ReservationDialog(Frame owner, String title, boolean model)
	{
		
		super(owner, title, model);		
		jl1 = new JLabel("ID");
		jl2 = new JLabel("Name");
		jl3 = new JLabel("Number");
		jl4 = new JLabel("Date");
		jl5 = new JLabel("Restaurant Name");
		jl6 = new JLabel("More");
		
		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jtf3 = new JTextField();
		jtf4 = new JTextField();
		jtf5 = new JTextField();
		jtf6 =  new JTextField();
		
		jb1 = new JButton("Confirm");
		jb1.addActionListener(this);
		jb2 = new JButton("Cancel");
		jb2.addActionListener(this);
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		
		jp1.setLayout(new GridLayout(6,1));
		jp2.setLayout(new GridLayout(6,1));
		
		jp1.add(jl1);
		jp1.add(jl2);
		jp1.add(jl3);
		jp1.add(jl4);
		jp1.add(jl5);
		jp1.add(jl6);
		
		jp2.add(jtf1);
		jp2.add(jtf2);
		jp2.add(jtf3);
		jp2.add(jtf4);
		jp2.add(jtf5);
		jp2.add(jtf6);
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1, BorderLayout.WEST);
		this.add(jp2, BorderLayout.CENTER);
		this.add(jp3, BorderLayout.SOUTH);
		
		this.setSize(300, 200);
		this.setResizable(false);
		this.setLocation(500, 300);
		this.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
	}
}
