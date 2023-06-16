package javaproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class customerpage extends JFrame {
    private JPanel customerInfo;
    private JPanel NorthBar; // 상단
    private JPanel SouthBar; // 하단

    // NorthBar
    private JPanel infoA;
    private JPanel infoB;
    // infoA
    private JLabel infoALabel;
    private JButton Logout;
    // infoB
    private JLabel infoBDate;
    private JLabel infoBDateValue;
    private JLabel infoBVersion;
    private JLabel infoBScreenPath;
    private JLabel infoBScreenValue;
    
    ////////////////

    // SouthBar
    private JPanel listPanel;
    private JPanel pagePanel;
    private JPanel asDoc; // 서류
    private JPanel MyPage; // 마이페이지 
    
    // listPanel
    private JPanel asApply; // as신청 
    private JPanel asChange; //as변경
    
    //asApply - as신청
    private JButton asApplyTitle;
//    private JButton asApplyAll;
//    private JButton asApplyFin;
//    private JButton asApplyNotFin;
    
    // asChange - as변경
    private JLabel asChangeTitle; //as변경 타이틀
    private JButton asChangeCancel; // 변경취소 
    private JButton asChangeDateChange; // 날짜변경 
    
    
    //asDoc - 서류
    private JLabel asDocTitle; //서류타이틀
    private JButton asDocCash; // 현금영수증 
    private JButton asDocDetail; //거래명세서 
    private JButton asDocBusiness; //사업자등록증 
    
    //MyPage- 마이페이지
    private JLabel MyPageTitle; //마이페이지 타이틀 
    private JButton MyPageAsList; //as내역
    private JButton MyPagePay; //결제내역

    public customerpage() {
        setTitle("DEU AS System");
        setSize(910, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        customerInfo = new JPanel();
        setLayout(new BorderLayout());
        // NorthBar
        NorthBar = new JPanel();
        NorthBar.setBackground(Color.lightGray);
        NorthBar.setPreferredSize(new Dimension(900, 80));
        customerInfo.add(NorthBar, BorderLayout.NORTH);
        // infoA
        infoA = new JPanel();
        infoA.setBackground(Color.white);
        infoA.setPreferredSize(new Dimension(900, 20));
        NorthBar.add(infoA, BorderLayout.NORTH);

        infoALabel = new JLabel("아파트 : 동의대학교 | 동호수 : 101-1102");
        infoALabel.setOpaque(true);// 배경색 설정을 위해 불투명하도록 설정
        infoA.setLayout(new FlowLayout(FlowLayout.RIGHT));
        infoA.add(infoALabel);

        Logout = new JButton("로그아웃");
        Logout.setPreferredSize(new Dimension(100, 15));
        Logout.setLayout(new FlowLayout(FlowLayout.RIGHT));
        infoA.add(Logout);

        // 버튼 클릭시 페이지 이동
        Logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 버튼을 눌렀을 때 실행되는 코드
                MyFrame frame = new MyFrame();
                frame.setVisible(true);

                dispose(); // 현재 프레임을 닫습니다.
            }
        });

        // infoB
        infoB = new JPanel();
        infoB.setPreferredSize(new Dimension(900, 60));
        NorthBar.add(infoB, BorderLayout.SOUTH);

        infoBDate = new JLabel("DATE");
        infoBDate.setOpaque(true);
        infoB.setLayout(null);
        infoBDate.setBounds(20, 5, 150, 20);
        infoBDate.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        infoBDate.setHorizontalAlignment(SwingConstants.CENTER);
        infoB.add(infoBDate);

        infoBDateValue = new JLabel("2023-03-20");
        infoBDateValue.setOpaque(true);
        infoBDateValue.setBounds(170, 5, 150, 20);
        infoBDateValue.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        infoBDateValue.setHorizontalAlignment(SwingConstants.CENTER);
        infoBDateValue.setBackground(Color.white);
        infoB.add(infoBDateValue);

        infoBVersion = new JLabel("고객.ver");
        infoBVersion.setOpaque(true);
        infoBVersion.setBounds(320, 5, 150, 20);
        infoBVersion.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        infoBVersion.setHorizontalAlignment(SwingConstants.CENTER);
        infoB.add(infoBVersion);

        infoBScreenPath = new JLabel("Screen Path");
        infoBScreenPath.setOpaque(true);
        infoBScreenPath.setBounds(20, 25, 150, 20);
        infoBScreenPath.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        infoBScreenPath.setHorizontalAlignment(SwingConstants.CENTER);
        infoB.add(infoBScreenPath);

        infoBScreenValue = new JLabel(" 고객 > Main > AS 신청");
        infoBScreenValue.setOpaque(true);
        infoBScreenValue.setBounds(170, 25, 710, 20);
        infoBScreenValue.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        infoBScreenValue.setBackground(Color.white);
        infoBScreenValue.setHorizontalAlignment(SwingConstants.LEFT);
        infoB.add(infoBScreenValue);

        ///////////////
        // SouthBar
        SouthBar = new JPanel();
        SouthBar.setBackground(Color.GRAY);
        SouthBar.setPreferredSize(new Dimension(900, 520));
        customerInfo.add(SouthBar, BorderLayout.SOUTH);

        listPanel = new JPanel();
        listPanel.setLayout(new GridLayout(4, 1, 10, 10)); // 4행 1열 
        listPanel.setBackground(Color.WHITE);
        listPanel.setPreferredSize(new Dimension(150, 500));
        SouthBar.add(listPanel, BorderLayout.WEST);

//        JButton buttonASRequest = new JButton("AS 신청");
//        JButton buttonASChange = new JButton("AS 변경");
//        JButton buttonDocument = new JButton("서류");
//        JButton buttonMyPage = new JButton("마이페이지");
//        listPanel.add(buttonASRequest);
//        listPanel.add(buttonASChange);
//        listPanel.add(buttonDocument);
//        listPanel.add(buttonMyPage);
        //AS신청페이지 
        asApply = new JPanel();
        asApply.setLayout(new GridLayout(1,1,5,5));
        asApply.setBackground(Color.pink);
        asApply.setPreferredSize(new Dimension(10, 5));
        listPanel.add(asApply);
        asApplyTitle = new JButton("AS 신청");
        asApply.add(asApplyTitle,BorderLayout.WEST);
        
        //as변경페이지
        asChange = new JPanel();
        asChange.setLayout(new GridLayout(3,1,5,5));
        //asChange.setBackground(Color.pink);
        asChange.setPreferredSize(new Dimension(10, 5));
        listPanel.add(asChange);
        
        asChangeTitle = new JLabel("AS 변경");
        asChangeCancel = new JButton("변경취소");
        asChangeDateChange = new JButton("날짜 변경");
        
        asChange.add(asChangeTitle,BorderLayout.WEST);
        asChange.add(asChangeCancel,BorderLayout.WEST);
        asChange.add(asChangeDateChange,BorderLayout.WEST);
        listPanel.add(asChange);
        //서류페이지 asDoc
        asDoc = new JPanel();
        asDoc.setLayout(new GridLayout(4,1,5,5));
        //asDoc.setBackground(Color.pink);
        asDoc.setPreferredSize(new Dimension(10, 5));
        listPanel.add(asDoc);
        
        asDocTitle = new JLabel("서류");
        asDocCash = new JButton("현금영수증");
        asDocDetail = new JButton("거래명세서");
        asDocBusiness = new JButton("사업자등록증");
        
        asDoc.add(asDocTitle);
        asDoc.add(asDocCash);
        asDoc.add(asDocDetail);
        asDoc.add(asDocBusiness);
        listPanel.add(asDoc);
        // MyPage = 마이페이지 
        
        MyPage = new JPanel();
        MyPage.setLayout(new GridLayout(3,1,5,5));
        //MyPage.setBackground(Color.pink);
        MyPage.setPreferredSize(new Dimension(10, 5));
        listPanel.add(MyPage);
        
        MyPageTitle = new JLabel("마이페이지");
        MyPageAsList = new JButton("AS내역");
        MyPagePay = new JButton("결제내역");
        
        MyPage.add(MyPageTitle);
        MyPage.add(MyPageAsList);
        MyPage.add(MyPagePay);
        
        listPanel.add(MyPage);
        
        
        
        
        asChangeTitle = new JLabel("AS 변경");
        asDocTitle = new JLabel("서류");
        MyPageTitle = new JLabel("마이페이지");

        pagePanel = new JPanel();
        pagePanel.setBackground(Color.WHITE);
        pagePanel.setPreferredSize(new Dimension(710, 500));
        SouthBar.add(pagePanel, BorderLayout.EAST);
        
        

        add(customerInfo);
        setVisible(true);
    }

    public static void main(String[] args) {
        customerpage cp = new customerpage();
    }
}
