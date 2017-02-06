package com.LearnJava;

import javax.swing.*;
import java.awt.*;

public class LearnBorderLayout extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2903818095416549525L;
	JButton BtnEast,BtnWast,BtnNorth,BtnSouth,BtnCenter;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnBorderLayout Layout = new LearnBorderLayout();
	}
	public LearnBorderLayout(){
		BtnEast=new JButton("East");
		BtnWast=new JButton("Wast");
		BtnNorth=new JButton("North");
		BtnSouth=new JButton("South");
		BtnCenter=new JButton("Center");
		this.add(BtnEast,BorderLayout.EAST);
		this.add(BtnNorth, BorderLayout.NORTH);
		this.add(BtnSouth, BorderLayout.SOUTH);
		this.add(BtnWast, BorderLayout.WEST);
		this.add(BtnCenter,BorderLayout.CENTER);
		this.setTitle("LearnBorderLayout");
	    this.setSize(380,320);
	    this.setLocation(200,200);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	}

}
