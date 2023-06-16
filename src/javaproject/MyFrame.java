package javaproject;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import javaproject.customerpage;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {
    private JPanel customerPanel;
    private JPanel adminPanel;

    
    private JLabel modeName;
    // 고객모드
    private JLabel apartmentLabel;
    private JLabel buildingLabel;
    private JLabel unitLabel;
    private JLabel phoneNumberLabel;
    //private JTextField apartmentField;
    private String [] apartmentField = {"동의대학교","b","c"};
    private JTextField buildingField;
    private JTextField unitField;
    private JTextField phoneNumberField;
    private JButton customerModeButton;

    // 관리자모드 
    private JLabel adminNumberLabel;
    private JLabel passwordLabel;
    private JTextField adminNumberField;
    private JPasswordField passwordField;
    private JButton adminModeButton;

    public MyFrame() {
        setTitle("DEU AS System");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));
        

        // 고객 panel
        
        customerPanel = new JPanel();
        customerPanel.setLayout(null);
        customerPanel.setBackground(Color.WHITE);
        customerPanel.setPreferredSize(new Dimension(450, 600));

        apartmentLabel = new JLabel("아파트 명 :");
        apartmentLabel.setBounds(50, 225, 150, 30);
        customerPanel.add(apartmentLabel);
        
        
        
//        apartmentField = new JTextField();
//        apartmentField.setBounds(200, 225, 200, 30);
//        customerPanel.add(apartmentField);
        
        JComboBox<String> apartmentCombo = new JComboBox<String>(apartmentField);
        apartmentCombo.setBounds(200,225,200,30);
        customerPanel.add(apartmentCombo);
        
        buildingLabel = new JLabel("동 입력 :");
        buildingLabel.setBounds(50, 275, 150, 30);
        customerPanel.add(buildingLabel);
        
        

        buildingField = new JTextField();
        buildingField.setBounds(200, 275, 200, 30);
        customerPanel.add(buildingField);

        unitLabel = new JLabel("호수 입력 :");
        unitLabel.setBounds(50, 325, 150, 30);
        customerPanel.add(unitLabel);

        unitField = new JTextField();
        unitField.setBounds(200, 325, 200, 30);
        customerPanel.add(unitField);

        phoneNumberLabel = new JLabel("전화번호 입력 : ");
        phoneNumberLabel.setBounds(50, 375, 150, 30);
        customerPanel.add(phoneNumberLabel);

        phoneNumberField = new JTextField();
        phoneNumberField.setBounds(200, 375, 200, 30);
        customerPanel.add(phoneNumberField);

        customerModeButton = new JButton("고객 페이지 이동");
        customerModeButton.setBounds(150, 425, 150, 30);
        customerPanel.add(customerModeButton);
        
        /// 버튼 클릭시 페이지 이동
        customerModeButton.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                // 버튼을 눌렀을 때 실행되는 코드
                customerpage customerPage = new customerpage();
                customerPage.setVisible(true);
                
                dispose(); // 현재 프레임을 닫습니다.
            }
        });
        ///
        
        modeName = new JLabel("고객모드");
        modeName.setBounds(50, 125, 350, 60);
        modeName.setBackground(Color.gray);
        Font a = modeName.getFont();
        Font newFont = a.deriveFont(30.0f); //글자크기 늘리기 
        modeName.setFont(newFont);
        modeName.setHorizontalAlignment(SwingConstants.CENTER); //가운데 정렬
        modeName.setOpaque(true);
        customerPanel.add(modeName);

        // 관리자 panel
        adminPanel = new JPanel();
        adminPanel.setLayout(null);
        adminPanel.setBackground(Color.GRAY);
        adminPanel.setPreferredSize(new Dimension(450, 600));

        adminNumberLabel = new JLabel("관리자 번호 :");
        adminNumberLabel.setBounds(50, 275, 150, 30);
        adminPanel.add(adminNumberLabel);

        adminNumberField = new JTextField();
        adminNumberField.setBounds(200, 275, 200, 30);
        adminPanel.add(adminNumberField);

        passwordLabel = new JLabel("비밀번호 :");
        passwordLabel.setBounds(50, 325, 150, 30);
        adminPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(200, 325, 200, 30);
        adminPanel.add(passwordField);
        
        
        adminModeButton = new JButton("관리자 페이지 이동");
        adminModeButton.setBounds(150, 425, 150, 30);
        adminPanel.add(adminModeButton);

      //관리자 / 고객 
        modeName = new JLabel("관리자모드");
        modeName.setBounds(50, 125, 350, 60);
        modeName.setBackground(Color.white);
        //Font a = modeName.getFont();
        //Font newFont = a.deriveFont(30.0f); //글자크기 늘리기 
        modeName.setFont(newFont);
        modeName.setHorizontalAlignment(SwingConstants.CENTER); //가운데 정렬
        modeName.setOpaque(true);
        adminPanel.add(modeName);
        //customerPanel.add(modeName);
        
        add(customerPanel);
        add(adminPanel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}
