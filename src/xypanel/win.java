package xypanel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Choice;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.Button;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JSlider;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class win {

	private JFrame frmXypanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					win window = new win();
					window.frmXypanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public win() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmXypanel = new JFrame();
		frmXypanel.setTitle("XYPanel");
		frmXypanel.setBounds(100, 100, 580, 450);
		frmXypanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmXypanel.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JLabel lblXypanel = new JLabel("XYPanel");
		panel.add(lblXypanel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setForeground(new Color(255, 255, 255));
		tabbedPane.setBackground(new Color(34, 139, 34));
		tabbedPane.setFont(new Font("宋体", Font.PLAIN, 16));
		tabbedPane.setToolTipText("");
		frmXypanel.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("\u9996\u9875", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(10, 10, 146, 44);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel label = new JLabel("     \u7F51\u7AD9\uFF1A");
		label.setForeground(Color.WHITE);
		label.setOpaque(true);
		label.setBackground(new Color(34, 139, 34));
		label.setBounds(0, 0, 60, 44);
		panel_4.add(label);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(165, 10, 146, 44);
		panel_1.add(panel_5);
		
		JLabel lblFtp = new JLabel("     FTP\uFF1A");
		lblFtp.setOpaque(true);
		lblFtp.setForeground(Color.WHITE);
		lblFtp.setBackground(new Color(34, 139, 34));
		lblFtp.setBounds(0, 0, 60, 44);
		panel_5.add(lblFtp);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(320, 10, 146, 44);
		panel_1.add(panel_6);
		
		JLabel label_2 = new JLabel("  \u6570\u636E\u5E93\uFF1A");
		label_2.setOpaque(true);
		label_2.setForeground(Color.WHITE);
		label_2.setBackground(new Color(34, 139, 34));
		label_2.setBounds(0, 0, 60, 44);
		panel_6.add(label_2);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(10, 64, 456, 129);
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "CPU", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_8.setBackground(new Color(255, 255, 255));
		panel_8.setBounds(10, 10, 78, 109);
		panel_7.add(panel_8);
		panel_8.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new TitledBorder(null, "\u5185\u5B58", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_9.setBackground(Color.WHITE);
		panel_9.setBounds(109, 10, 78, 109);
		panel_7.add(panel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new TitledBorder(null, "\u786C\u76D8", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(217, 10, 229, 109);
		panel_7.add(panel_10);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(255, 255, 255));
		panel_12.setToolTipText("");
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_12.setBounds(10, 203, 456, 154);
		panel_1.add(panel_12);
		panel_12.setLayout(null);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_11.setBackground(new Color(255, 255, 255));
		panel_11.setBounds(10, 10, 436, 33);
		panel_12.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblApache = new JLabel("Apache");
		lblApache.setBounds(10, 0, 54, 33);
		panel_11.add(lblApache);
		
		JButton btnNewButton = new JButton("\u542F\u52A8");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(34, 139, 34));
		btnNewButton.setBounds(209, 5, 66, 23);
		panel_11.add(btnNewButton);
		
		JButton button = new JButton("\u505C\u6B62");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(34, 139, 34));
		button.setBounds(285, 5, 66, 23);
		panel_11.add(button);
		
		JButton button_1 = new JButton("\u91CD\u542F");
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(new Color(34, 139, 34));
		button_1.setBounds(361, 5, 66, 23);
		panel_11.add(button_1);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(10, 53, 436, 33);
		panel_12.add(panel_13);
		
		JLabel lblMysql = new JLabel("Mysql");
		lblMysql.setBounds(10, 0, 54, 33);
		panel_13.add(lblMysql);
		
		JButton button_2 = new JButton("\u542F\u52A8");
		button_2.setForeground(Color.WHITE);
		button_2.setBackground(new Color(34, 139, 34));
		button_2.setBounds(209, 5, 66, 23);
		panel_13.add(button_2);
		
		JButton button_3 = new JButton("\u505C\u6B62");
		button_3.setForeground(Color.WHITE);
		button_3.setBackground(new Color(34, 139, 34));
		button_3.setBounds(285, 5, 66, 23);
		panel_13.add(button_3);
		
		JButton button_4 = new JButton("\u91CD\u542F");
		button_4.setForeground(Color.WHITE);
		button_4.setBackground(new Color(34, 139, 34));
		button_4.setBounds(361, 5, 66, 23);
		panel_13.add(button_4);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_14.setBackground(Color.WHITE);
		panel_14.setBounds(10, 96, 436, 33);
		panel_12.add(panel_14);
		
		JLabel lblFilezillserver = new JLabel("FileZillServer");
		lblFilezillserver.setBounds(10, 0, 84, 33);
		panel_14.add(lblFilezillserver);
		
		JButton button_5 = new JButton("\u542F\u52A8");
		button_5.setForeground(Color.WHITE);
		button_5.setBackground(new Color(34, 139, 34));
		button_5.setBounds(209, 5, 66, 23);
		panel_14.add(button_5);
		
		JButton button_6 = new JButton("\u505C\u6B62");
		button_6.setForeground(Color.WHITE);
		button_6.setBackground(new Color(34, 139, 34));
		button_6.setBounds(285, 5, 66, 23);
		panel_14.add(button_6);
		
		JButton button_7 = new JButton("\u91CD\u542F");
		button_7.setForeground(Color.WHITE);
		button_7.setBackground(new Color(34, 139, 34));
		button_7.setBounds(361, 5, 66, 23);
		panel_14.add(button_7);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("\u7F51\u7AD9", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("FTP", null, panel_3, null);
		
		JPanel panel_15 = new JPanel();
		tabbedPane.addTab("\u73AF\u5883", null, panel_15, null);
		panel_15.setLayout(null);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_16.setBackground(new Color(255, 255, 255));
		panel_16.setBounds(16, 10, 477, 316);
		panel_15.add(panel_16);
		panel_16.setLayout(null);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "FTP Server", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(246, 166, 218, 133);
		panel_16.add(panel_17);
		
		JLabel lblFtp_1 = new JLabel("FileZillServer");
		lblFtp_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFtp_1.setBounds(11, 32, 197, 15);
		panel_17.add(lblFtp_1);
		
		JButton button_8 = new JButton("\u5B89\u88C5");
		button_8.setForeground(Color.WHITE);
		button_8.setBackground(new Color(34, 139, 34));
		button_8.setBounds(59, 100, 93, 23);
		panel_17.add(button_8);
		
		JButton button_23 = new JButton("\u542F\u52A8");
		button_23.setForeground(Color.WHITE);
		button_23.setBackground(new Color(34, 139, 34));
		button_23.setBounds(7, 67, 60, 23);
		panel_17.add(button_23);
		
		JButton button_24 = new JButton("\u505C\u6B62");
		button_24.setForeground(Color.WHITE);
		button_24.setBackground(new Color(34, 139, 34));
		button_24.setBounds(78, 67, 60, 23);
		panel_17.add(button_24);
		
		JButton button_25 = new JButton("\u91CD\u542F");
		button_25.setForeground(Color.WHITE);
		button_25.setBackground(new Color(34, 139, 34));
		button_25.setBounds(148, 67, 60, 23);
		panel_17.add(button_25);
		
		JButton button_26 = new JButton("\u5378\u8F7D");
		button_26.setForeground(Color.WHITE);
		button_26.setBackground(new Color(34, 139, 34));
		button_26.setBounds(148, 100, 60, 23);
		panel_17.add(button_26);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Mysql", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_18.setBackground(Color.WHITE);
		panel_18.setBounds(10, 166, 218, 133);
		panel_16.add(panel_18);
		
		JLabel lblMysql_1 = new JLabel("Mysql");
		lblMysql_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMysql_1.setBounds(21, 32, 64, 15);
		panel_18.add(lblMysql_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"5.5\u7248\u672C"}));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(84, 29, 102, 21);
		panel_18.add(comboBox_1);
		
		JButton button_9 = new JButton("\u5B89\u88C5");
		button_9.setForeground(Color.WHITE);
		button_9.setBackground(new Color(34, 139, 34));
		button_9.setBounds(59, 100, 93, 23);
		panel_18.add(button_9);
		
		JButton button_19 = new JButton("\u542F\u52A8");
		button_19.setForeground(Color.WHITE);
		button_19.setBackground(new Color(34, 139, 34));
		button_19.setBounds(10, 67, 60, 23);
		panel_18.add(button_19);
		
		JButton button_20 = new JButton("\u505C\u6B62");
		button_20.setForeground(Color.WHITE);
		button_20.setBackground(new Color(34, 139, 34));
		button_20.setBounds(81, 67, 60, 23);
		panel_18.add(button_20);
		
		JButton button_21 = new JButton("\u91CD\u542F");
		button_21.setForeground(Color.WHITE);
		button_21.setBackground(new Color(34, 139, 34));
		button_21.setBounds(151, 67, 60, 23);
		panel_18.add(button_21);
		
		JButton button_22 = new JButton("\u5378\u8F7D");
		button_22.setForeground(Color.WHITE);
		button_22.setBackground(new Color(34, 139, 34));
		button_22.setBounds(151, 100, 60, 23);
		panel_18.add(button_22);
		
		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Apache", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_19.setBackground(Color.WHITE);
		panel_19.setBounds(10, 10, 218, 133);
		panel_16.add(panel_19);
		
		JLabel label_4 = new JLabel("Apache");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(21, 32, 64, 15);
		panel_19.add(label_4);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"2.4\u7248\u672C"}));
		comboBox_2.setBackground(Color.WHITE);
		comboBox_2.setBounds(84, 29, 102, 21);
		panel_19.add(comboBox_2);
		
		JButton btnNewButton_1 = new JButton("\u542F\u52A8");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Cmd.bat("bat/startApache.bat");  //调用bat启动apache
			}
		});
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(34, 139, 34));
		btnNewButton_1.setBounds(10, 67, 60, 23);
		panel_19.add(btnNewButton_1);
		
		JButton button_12 = new JButton("\u505C\u6B62");
		button_12.setBackground(new Color(34, 139, 34));
		button_12.setForeground(new Color(255, 255, 255));
		button_12.setBounds(81, 67, 60, 23);
		panel_19.add(button_12);
		
		JButton button_13 = new JButton("\u91CD\u542F");
		button_13.setForeground(new Color(255, 255, 255));
		button_13.setBackground(new Color(34, 139, 34));
		button_13.setBounds(151, 67, 60, 23);
		panel_19.add(button_13);
		
		JButton button_14 = new JButton("\u5378\u8F7D");
		button_14.setBackground(new Color(34, 139, 34));
		button_14.setForeground(new Color(255, 255, 255));
		button_14.setBounds(151, 100, 60, 23);
		panel_19.add(button_14);
		
		JButton button_10 = new JButton("\u5B89\u88C5");
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {   //安装apache
				download d = new download();
				UnZipFile unzip = new UnZipFile();
		        try{
		            d.downLoadFromUrl("http://www.wangchongyun.com/Apache2.4.zip",  
		                    "apache2.4.zip","D:/XYPanel/");
		        }catch (Exception c) { 
		            // TODO: handle exception  
		        }
		        try {  
		        	unzip.unZipFiles(new File("D:/XYPanel/apache2.4.zip"), "D:/XYPanel/");  
		        } catch (IOException b) {  
		            b.printStackTrace();  
		        }
		        String file = "D:/XYPanel/apache2.4/conf/httpd.conf";
		        String reg = "(.*)/Apache24(.*)";
		        String content = "Define SRVROOT \"D:/XYPanel/Apache2.4/\"";
		        FileOperation.replaceApache(file,reg,content); //apache的conf文本里面的路径替换
		        Cmd.bat("bat/installApache.bat"); //调用bat安装apache
		        //Cmd.bat("G:/java/java-panel/bat/startApache.bat");  //调用bat启动apache
		        button_10.setText("已安装");
		        button_10.setVisible(true);
		        btnNewButton_1.setVisible(true);
		        button_12.setVisible(true);
		        button_13.setVisible(true);
		        button_14.setVisible(true);
			}
		});

		button_10.setForeground(Color.WHITE);
		button_10.setBackground(new Color(34, 139, 34));
		button_10.setBounds(59, 100, 93, 23);
		panel_19.add(button_10);
		
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "PHP", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_20.setBackground(Color.WHITE);
		panel_20.setBounds(246, 10, 218, 133);
		panel_16.add(panel_20);
		
		JLabel lblPhp = new JLabel("PHP");
		lblPhp.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhp.setBounds(21, 32, 64, 15);
		panel_20.add(lblPhp);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"7.1\u7248\u672C"}));
		comboBox_3.setBackground(Color.WHITE);
		comboBox_3.setBounds(84, 29, 102, 21);
		panel_20.add(comboBox_3);
		
		JButton button_11 = new JButton("\u5B89\u88C5");
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {  //安装php
				download down = new download();
				UnZipFile unzip = new UnZipFile();
		        try{
		        	down.downLoadFromUrl("http://www.wangchongyun.com/php7.1.zip",  
		                    "php7.1.zip","D:/XYPanel/");
		        }catch (Exception c) { 
		            // TODO: handle exception  
		        }
		        try {  
		        	unzip.unZipFiles(new File("D:/XYPanel/php7.1.zip"), "D:/XYPanel/");  
		        } catch (IOException b) {  
		            b.printStackTrace();  
		        }
		        //FileOperation.replaceApache(file, reg, content);
			}
		});
		button_11.setForeground(Color.WHITE);
		button_11.setBackground(new Color(34, 139, 34));
		button_11.setBounds(59, 100, 93, 23);
		panel_20.add(button_11);
		
		JButton button_15 = new JButton("\u542F\u52A8");
		button_15.setForeground(Color.WHITE);
		button_15.setBackground(new Color(34, 139, 34));
		button_15.setBounds(10, 67, 60, 23);
		panel_20.add(button_15);
		
		JButton button_16 = new JButton("\u505C\u6B62");
		button_16.setForeground(Color.WHITE);
		button_16.setBackground(new Color(34, 139, 34));
		button_16.setBounds(81, 67, 60, 23);
		panel_20.add(button_16);
		
		JButton button_17 = new JButton("\u91CD\u542F");
		button_17.setForeground(Color.WHITE);
		button_17.setBackground(new Color(34, 139, 34));
		button_17.setBounds(151, 67, 60, 23);
		panel_20.add(button_17);
		
		JButton button_18 = new JButton("\u5378\u8F7D");
		button_18.setForeground(Color.WHITE);
		button_18.setBackground(new Color(34, 139, 34));
		button_18.setBounds(151, 100, 60, 23);
		panel_20.add(button_18);
		
	}
}
