package com.LearnJava;
//import java.awt.*;
import javax.swing.*;
public class FrameLearn extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3485470812050096768L;
	JButton an1=null;   //����Ҫ�����ȫ�������ﶨ��
	
	public static void main(String[] args)
	{
		new FrameLearn();   //������ֻ����ü��ɡ�
	}
	
	public FrameLearn()         //�ѳ�ʼ����ȫ�������ŵ����캯������ɡ��������ô�С�����⡢λ�õȵȡ�
	{
		this.setTitle("�û�����");  //���ô��ڱ���
		this.setSize(350, 180);     //���ô�С��λ��
		this.setLocation(100, 260);
		an1= new JButton("һ����ť");   //�������
		this.add(an1);                  //������
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
