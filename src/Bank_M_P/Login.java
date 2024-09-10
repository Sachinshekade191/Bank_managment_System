package Bank_M_P;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Login extends JFrame implements ActionListener {
    JLabel lable2, lable3;
    JTextField textfield2;
    JPasswordField passwordfield2;
    JButton btn1,btn2,btn3;
    String pin;
    Login()
    {
        super("Bank Management System");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/creaditcard.png"));
        Image ii2=ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel iimage=new JLabel(ii3);
        iimage.setBounds(650,340,100,100);
        add(iimage);

        JLabel label1=new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        lable2=new JLabel("Card No:");
        lable2.setFont(new Font("Ralway",Font.BOLD,28));
        lable2.setForeground(Color.WHITE);
        lable2.setBounds(150,190,375,30);
        add(lable2);

        textfield2=new JTextField(15);
        textfield2.setBounds(325,190,230,30);
        textfield2.setFont(new Font("Arial",Font.BOLD,14));
        textfield2.addActionListener(this);
        add(textfield2);


        lable3=new JLabel("PIN:");
        lable3.setFont(new Font("Ralway",Font.BOLD,28));
        lable3.setForeground(Color.WHITE);
        lable3.setBounds(150,250,375,30);
        add(lable3);

        passwordfield2=new JPasswordField(15);
        passwordfield2.setBounds(325,250,230,30);
        passwordfield2.setFont(new Font("Arial",Font.BOLD,14));
        passwordfield2.addActionListener(this);
        add(passwordfield2);

        btn1=new JButton("Sign in");
        btn1.setBounds(190,320,150,30);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.BLACK);
        btn1.setFont(new Font("Arial",Font.BOLD,20));
        btn1.addActionListener(this);
        add(btn1);

        btn2=new JButton("Sign up");
        btn2.setBounds(470,320,150,30);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.BLACK);
        btn2.setFont(new Font("Arial",Font.BOLD,20));
        btn2.addActionListener(this);
        add(btn2);

        btn3=new JButton("Clear");
        btn3.setBounds(330,370,150,30);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.BLACK);
        btn3.setFont(new Font("Arial",Font.BOLD,20));
        btn3.addActionListener(this);
        add(btn3);

        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2=iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel iiimage=new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);

        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
  try {
      if (e.getSource()==btn1) {

          con c1=new con();
          String cardno=textfield2.getText();
          String pin=passwordfield2.getText();
          String q="select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
          ResultSet resultSet=c1.statement.executeQuery(q);
          if (resultSet.next()){
              setVisible(false);
              new main_Class(pin);

          }else {
              JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin");
          }

      } else if (e.getSource()==btn2) {
          new Signup();
          setVisible(false);

      } else if (e.getSource()==btn3) {

          textfield2.setText("");
          passwordfield2.setText("");
      }

  } catch (SQLException ex) {
      throw new RuntimeException(ex);
  }

    }

    public static void main(String[] args) {
    new Login();
    }
}
