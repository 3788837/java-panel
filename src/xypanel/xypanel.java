package xypanel;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class xypanel {
	public static void main(String[] args) {
		xypanel win = new xypanel();
		JFrame jf = new JFrame();
		win.creatWindows(jf, 600, 500, "HH");
		JPanel jp = new JPanel();
		win.panel(jf, jp, 100, 200);
	}
	public void creatWindows(JFrame jf, int w, int h, String title) {  //���������ڷ���
		jf.setSize(w, h);          // ��w ��h
		jf.setTitle(title);       //���ڱ���
		jf.setResizable(false);  //���ܸı��С
		jf.setVisible(true);
	}
	public void panel(JFrame jf, JPanel jp, int w, int h) {  //����JPanle
//		jp.setSize(w, h);   //������setsize����JPanel�Ĵ�С������������Ч
		jp.setBackground(Color.BLUE);  //����JPanel�ı�����ɫ
		Dimension dim = new Dimension(w, h);
		jp.setPreferredSize(dim);
		jf.add(jp, BorderLayout.NORTH);
	}
}
//package myfist;
//import java.awt.*;  
//import javax.swing.*;  
//  
//public class win {  
//      
//    public static void main(String[] args) {  
//          
//        JFrame frame = new JFrame("Frame With Panel");  
//        Container contentPane = frame.getContentPane();  
//        contentPane.setBackground(Color.CYAN); // ��JFrameʵ����������Ϊ����ɫ  
//        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // ����һ��JPanel��ʵ��  
//        panel.setBackground(Color.yellow); // ��JPanel��ʵ����������Ϊ��ɫ  
//
//        //JButton button = new JButton("Press me");  
//       // panel.add(button); // ��JButtonʵ����ӵ�JPanel��  
//        panel.setPreferredSize(new Dimension(0, 50));
//        
//        contentPane.add(panel, BorderLayout.SOUTH); // ��JPanelʵ����ӵ�JFrame���ϲ�  
//        frame.setSize(300, 200);  
//        frame.setVisible(true);  
//    }  
//}  