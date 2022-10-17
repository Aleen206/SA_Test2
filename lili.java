package ll;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Test1.LiLing;

import java.awt.Color;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JMenuItem;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ImageIcon;

public class lili extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lili frame = new lili();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public lili() {
		getContentPane().setBackground(new Color(128, 128, 192));
		setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		setTitle("软件结构体系风格");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 384);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		Label label = new Label("主程序-子程序");
		label.setAlignment(Label.CENTER);
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				Image imgOne = new ImageIcon("D:\\Tools\\Image\\主程序-子程序_原理图.png").getTmage();
//				frame.getContentPane().add(new IPanel());
//				InputStream input = new FileInputStream("E:/SA/output01.txt");
//				LiLing kwic = new LiLing();
//		        kwic.input("E:\\SA\\input.txt");
//		        kwic.shift();
//		        kwic.alphabetizer();
//		        kwic.output("E:\\SA\\output01.txt");

			}
		});
		label.setForeground(new Color(255, 255, 255));
		label.setBackground(new Color(128, 128, 192));
		label.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		getContentPane().add(label, BorderLayout.NORTH);
		
		Label label_1 = new Label("面向对象");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				Image imgOne = new ImageIcon("D:\\Tools\\Image\\面向对象原理图.png").getTmage();
			}
		});
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		label_1.setBackground(new Color(128, 128, 192));
		getContentPane().add(label_1, BorderLayout.WEST);
		
		Label label_1_1 = new Label("管道-过滤器");
		label_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				Image imgOne = new ImageIcon("D:\\Tools\\Image\\管道-过滤器原理图.png").getTmage();
			}
		});
		label_1_1.setAlignment(Label.CENTER);
		label_1_1.setForeground(Color.WHITE);
		label_1_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		label_1_1.setBackground(new Color(128, 128, 192));
		getContentPane().add(label_1_1, BorderLayout.SOUTH);
		
		Label label_1_2 = new Label("事件系统");
		label_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				Image imgOne = new ImageIcon("D:\\Tools\\Image\\事件系统原理图.png").getTmage();
			}
		});
		label_1_2.setForeground(Color.WHITE);
		label_1_2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 16));
		label_1_2.setBackground(new Color(128, 128, 192));
		getContentPane().add(label_1_2, BorderLayout.EAST);
	}

}
