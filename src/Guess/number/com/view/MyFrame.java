package Guess.number.com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Guess.number.com.main.MyMain;

import java.awt.Window.Type;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class MyFrame extends JFrame {
	int xh;//��������
	int sv;//������Χ
	
	int a=0;
	int b;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JButton button;
	private JButton button_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public MyFrame() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} 
		
		
		setResizable(false);
		setTitle("\u731C\u6570\u5B57");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 231);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u6E38\u620F");
		menuBar.add(menu);
		
		JMenuItem mntmF = new JMenuItem("\u5F00\u59CB/\u6682\u505C        F2");
		mntmF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(a%2==0){
					button.setEnabled(false);
					button_1.setEnabled(false);
					textField.setEnabled(false);
					textField_1.setText("��Ϸ��ͣ��");
					a++;
					b=0;
				}else{ 
					button.setEnabled(true);
					button_1.setEnabled(true);
					textField.setEnabled(true);
					textField_1.setText("");
					a++;
					b=1;
				}
			}
		});
		menu.add(mntmF);
		
		JMenuItem mntmF_1 = new JMenuItem("\u65B0\u6E38\u620F            F3\r\n\r\n");
		mntmF_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		menu.add(mntmF_1);
		
		JSeparator separator_1 = new JSeparator();
		menu.add(separator_1);
		
		JMenuItem menuItem_4 = new JMenuItem("\u4FDD\u5B58\u8BB0\u5F55");
		menu.add(menuItem_4);
		
		JMenuItem mntmAltf = new JMenuItem("\u9000\u51FA         Alt+F4");
		mntmAltf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menu.add(mntmAltf);
		
		JMenu menu_1 = new JMenu("\u8BBE\u7F6E");
		menuBar.add(menu_1);
		
		JMenu menu_2 = new JMenu("\u8303\u56F4\u8BBE\u7F6E");
		buttonGroup.add(menu_2);
		menu_1.add(menu_2);
		
		JRadioButtonMenuItem radioButtonMenuItem = new JRadioButtonMenuItem("0-10");
		buttonGroup.add(radioButtonMenuItem);
		menu_2.add(radioButtonMenuItem);
		
		JRadioButtonMenuItem radioButtonMenuItem_1 = new JRadioButtonMenuItem("0-100");
		radioButtonMenuItem_1.setSelected(true);
		buttonGroup.add(radioButtonMenuItem_1);
		menu_2.add(radioButtonMenuItem_1);
		
		JRadioButtonMenuItem radioButtonMenuItem_5 = new JRadioButtonMenuItem("0-1000");
		buttonGroup.add(radioButtonMenuItem_5);
		menu_2.add(radioButtonMenuItem_5);
		
		JSeparator separator = new JSeparator();
		menu_2.add(separator);
		
		JRadioButtonMenuItem radioButtonMenuItem_7 = new JRadioButtonMenuItem("\u81EA\u5B9A\u4E49");
		buttonGroup.add(radioButtonMenuItem_7);
		menu_2.add(radioButtonMenuItem_7);
		
		JMenu menu_3 = new JMenu("\u6B21\u6570\u8BBE\u7F6E");
		buttonGroup_1.add(menu_3);
		menu_1.add(menu_3);
		
		JRadioButtonMenuItem radioButtonMenuItem_2 = new JRadioButtonMenuItem("1");
		buttonGroup_1.add(radioButtonMenuItem_2);
		menu_3.add(radioButtonMenuItem_2);
		
		JRadioButtonMenuItem radioButtonMenuItem_3 = new JRadioButtonMenuItem("3");
		buttonGroup_1.add(radioButtonMenuItem_3);
		menu_3.add(radioButtonMenuItem_3);
		
		JRadioButtonMenuItem radioButtonMenuItem_4 = new JRadioButtonMenuItem("5");
		radioButtonMenuItem_4.setSelected(true);
		buttonGroup_1.add(radioButtonMenuItem_4);
		menu_3.add(radioButtonMenuItem_4);
		
		JRadioButtonMenuItem radioButtonMenuItem_6 = new JRadioButtonMenuItem("10");
		buttonGroup_1.add(radioButtonMenuItem_6);
		menu_3.add(radioButtonMenuItem_6);
		
		JSeparator separator_3 = new JSeparator();
		menu_3.add(separator_3);
		
		JRadioButtonMenuItem radioButtonMenuItem_8 = new JRadioButtonMenuItem("\u81EA\u5B9A\u4E49");
		buttonGroup_1.add(radioButtonMenuItem_8);
		menu_3.add(radioButtonMenuItem_8);
		
		JSeparator separator_2 = new JSeparator();
		menu_3.add(separator_2);
		
		JMenu menu_4 = new JMenu("\u5173\u4E8E");
		menuBar.add(menu_4);
		
		JMenuItem mntmv = new JMenuItem("\u6E38\u620F\u7248\u672C");
		menu_4.add(mntmv);
		
		JMenuItem menuItem_1 = new JMenuItem("\u8054\u7CFB\u4F5C\u8005");
		menu_4.add(menuItem_1);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u4F60\u7684\u731C\u6D4B\uFF1A");
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(b==1){
					if(e.getKeyCode()==10){
						inTo();
					}
				}
			}
		});
		textField.setColumns(10);
		
		button = new JButton("\u786E\u5B9A");
		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(b==1){
					if(e.getKeyCode()==10){
						inTo();
					}
				}
			}
		});
	
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(b==1){
					inTo();
				}
			}
		});
		
		button_1 = new JButton("\u6E05\u7A7A");
		button_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(b==1){
					if(e.getKeyCode()==10){
						textArea.setText("");
					}
				}
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(b==1){
					textArea.setText("");
				}
			}
		});
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
						.addComponent(textField_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(button)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_1, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(label)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1)
						.addComponent(button))
					.addGap(8)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
		);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
		contentPane.setLayout(gl_contentPane);
	}
	
	
	
	
	public  void inTo(){
		textArea.append("��"+(a+1)+"�β£�    ");
		textArea.append(textField.getText()+"   ");
		textArea.append("����\n");
		a++;
	}
	
	public  void getvalue(){
		
	}
}
