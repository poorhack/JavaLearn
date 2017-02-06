package com.LearnJava;

import javax.swing.*;
import java.awt.*;

public class LearnFlowLayout extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4103195301787490479L;
	JButton[] Btn={null,null,null,null,null,null,null,null};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LearnFlowLayout();
	}
	public LearnFlowLayout()
	{
		Btn[0]=	new JButton("Button 0");
		Btn[1]=	new JButton("Button 1");
		Btn[2]=	new JButton("Button 2");
		Btn[3]=	new JButton("Button 3");
		Btn[4]=	new JButton("Button 4");
		Btn[5]=	new JButton("Button 5");
		Btn[6]=	new JButton("Button 6");
		Btn[7]=	new JButton("Button 7");
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		for(int i=0;i<8;i++)
		{
			this.add(Btn[i]);
		}
		this.setTitle("LearnFlowLayout");
	    this.setSize(380,120);
	    this.setLocation(200,200);
	    this.setResizable(false);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	}
}
