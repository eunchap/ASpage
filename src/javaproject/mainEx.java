package javaproject;
import database.*;
//import database.DBConnection;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

 

public class mainEx extends JFrame {


	public mainEx() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JLabel label = new JLabel("ID : ");
		
		JLabel password = new JLabel("PW : ");
		
		JTextField txtID = new JTextField(10);
		
		JPasswordField txtPass = new JPasswordField(10);
		
		JLabel result = new JLabel("ID,PW 입력후 로그인!");
		
		JButton logbtn = new JButton("로그인");
		
		
		JPanel panel1 = new JPanel();
		
		JPanel panel2 = new JPanel();
		
		JPanel panel3 = new JPanel();
		
		
		GridLayout grid = new GridLayout(2,2);
		
		grid.setVgap(5);
		
		panel1.setLayout(grid);
		
		
		panel1.add(label);
		
		panel1.add(txtID);
		
		panel1.add(password);
		
		panel1.add(txtPass);
		
		panel2.add(result);
		
		panel3.add(logbtn);
		
		
		logbtn.addActionListener(new ActionListener() {
		
		@Override
		
			public void actionPerformed(ActionEvent e) {
			
				String ID = txtID.getText();
			
				String PW = txtPass.getText();
			
				DBConnection connection = new DBConnection();
			
				if(connection.isAdmin(ID,PW)) {
				
					result.setText("로그인 성공!");
				
				} else {
				
					result.setText("로그인 실패!");
				
				}
			
			}
		
		});
		
		
		JFrame Recruit = new JFrame();
		
		Recruit.getContentPane().add(BorderLayout.NORTH, panel1);
		
		Recruit.getContentPane().add(BorderLayout.CENTER, panel2);
		
		Recruit.getContentPane().add(BorderLayout.SOUTH, panel3);
		
		Recruit.setTitle("관리자 로그인");
		
		Recruit.setSize(250,150);
		
		Recruit.setVisible(true);
	
	}


	public static void main(String[] args) {
	
		new mainEx();
	
	}

}

 

