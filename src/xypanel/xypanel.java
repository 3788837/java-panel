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
	public void creatWindows(JFrame jf, int w, int h, String title) {  //创建主窗口方法
		jf.setSize(w, h);          // 长w 高h
		jf.setTitle(title);       //窗口标题
		jf.setResizable(false);  //不能改变大小
		jf.setVisible(true);
	}
	public void panel(JFrame jf, JPanel jp, int w, int h) {  //创建JPanle
//		jp.setSize(w, h);   //不能用setsize设置JPanel的大小，这样设置无效
		jp.setBackground(Color.BLUE);  //设置JPanel的背景颜色
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
//        contentPane.setBackground(Color.CYAN); // 将JFrame实例背景设置为蓝绿色  
//        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // 创建一个JPanel的实例  
//        panel.setBackground(Color.yellow); // 将JPanel的实例背景设置为黄色  
//
//        //JButton button = new JButton("Press me");  
//       // panel.add(button); // 将JButton实例添加到JPanel中  
//        panel.setPreferredSize(new Dimension(0, 50));
//        
//        contentPane.add(panel, BorderLayout.SOUTH); // 将JPanel实例添加到JFrame的南侧  
//        frame.setSize(300, 200);  
//        frame.setVisible(true);  
//    }  
//}  