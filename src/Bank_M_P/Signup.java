package Bank_M_P;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JDateChooser dateChooser;
    Random ran=new Random();
    long first4=(ran.nextLong() % 9000L)+1000L;
    String first=" "+Math.abs(first4);

    JTextField textName,textFname, textdobfield,textemail,textfieldms, textfieldaddr,textfieldcity,textfieldPin,textfieldState;
  JRadioButton r1,r2,m1,m2,m3;
  JButton next;

    Signup(){

        super("APPLICATION FORM");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1=new JLabel("APPLICATION FORM NO:"+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Ralway",Font.BOLD,38));
        add(label1);

        JLabel label2=new JLabel("Page 1");
        label2.setFont(new Font("Ralway",Font.BOLD,22));
        label2.setBounds(330,70,600,30);
        add(label2);

        JLabel label3=new JLabel("Personal Detail");
        label3.setFont(new Font("Ralway",Font.BOLD,22));
        label3.setBounds(290,90,600,30);
        add(label3);

        JLabel labelname=new JLabel("Name:");
        labelname.setFont(new Font("Ralway",Font.BOLD,20));
        labelname.setBounds(100,190,100,30);
        add(labelname);

        textName=new JTextField();
        textName.setFont(new Font("Ralway",Font.BOLD,14));
        textName.setBounds(300,190,400,30);
        add(textName);

        JLabel labelFname=new JLabel("Father Name:");
        labelFname.setFont(new Font("Ralway",Font.BOLD,20));
        labelFname.setBounds(100,240,200,30);
        add(labelFname);

        textFname=new JTextField();
        textFname.setFont(new Font("Ralway",Font.BOLD,14));
        textFname.setBounds(300,240,400,30);
        add(textFname);


        JLabel DOB=new JLabel("Date Of Birth:");
        DOB.setFont(new Font("Ralway",Font.BOLD,20));
        DOB.setBounds(100,290,200,30);
        add(DOB);

        dateChooser=new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,290,400,30);
        add(dateChooser);

        JLabel labelG=new JLabel("Gender:");
        labelG.setFont(new Font("Ralway",Font.BOLD,20));
        labelG.setBounds(100,340,200,30);
        add(labelG);

        r1=new JRadioButton("Male");
        r1.setFont(new Font("Ralway",Font.BOLD,14));
        r1.setBackground(Color.WHITE);
        r1.setBounds(300,340,60,30);
        add(r1);

        r2=new JRadioButton("Female");
        r2.setFont(new Font("Ralway",Font.BOLD,14));
        r2.setBackground(Color.WHITE);
        r2.setBounds(400,340,100,30);
        add(r2);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelemail=new JLabel("Email Address:");
        labelemail.setFont(new Font("Ralway",Font.BOLD,20));
        labelemail.setBounds(100,390,200,30);
        add(labelemail);

        textemail=new JTextField();
        textemail.setFont(new Font("Ralway",Font.BOLD,14));
        textemail.setBounds(300,390,400,30);
        add(textemail);

        JLabel labelMS=new JLabel("Marital Status:");
        labelMS.setFont(new Font("Ralway",Font.BOLD,20));
        labelMS.setBounds(100,440,200,30);
        add(labelMS);

        m1=new JRadioButton("Married");
        m1.setFont(new Font("Ralway",Font.BOLD,14));
        m1.setBackground(Color.WHITE);
        m1.setBounds(300,440,100,30);
        add(m1);

        m2=new JRadioButton("Unmarried");
        m2.setFont(new Font("Ralway",Font.BOLD,14));
        m2.setBackground(Color.WHITE);
        m2.setBounds(400,440,100,30);
        add(m2);

        m3=new JRadioButton("Other");
        m3.setFont(new Font("Ralway",Font.BOLD,14));
        m3.setBackground(Color.WHITE);
        m3.setBounds(530,440,100,30);
        add(m3);

        ButtonGroup buttonGroup1=new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);

        JLabel labeladdr=new JLabel("Address:");
        labeladdr.setFont(new Font("Ralway",Font.BOLD,20));
        labeladdr.setBounds(100,490,200,30);
        add(labeladdr);

        textfieldaddr=new JTextField();
        textfieldaddr.setFont(new Font("Ralway",Font.BOLD,14));
        textfieldaddr.setBounds(300,490,400,30);
        add( textfieldaddr);

        JLabel labelcity=new JLabel("City:");
        labelcity.setFont(new Font("Ralway",Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add( labelcity);

        textfieldcity=new JTextField();
        textfieldcity.setFont(new Font("Ralway",Font.BOLD,14));
        textfieldcity.setBounds(300,540,400,30);
        add( textfieldcity);

        JLabel labelPin=new JLabel("Pin Code:");
        labelPin.setFont(new Font("Ralway",Font.BOLD,20));
        labelPin.setBounds(100,590,200,30);
        add( labelPin);

        textfieldPin=new JTextField();
        textfieldPin.setFont(new Font("Ralway",Font.BOLD,14));
        textfieldPin.setBounds(300,590,400,30);
        add( textfieldPin);

        JLabel labelstate=new JLabel("State:");
        labelstate.setFont(new Font("Ralway",Font.BOLD,20));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);

        textfieldState=new JTextField();
        textfieldState.setFont(new Font("Ralway",Font.BOLD,14));
        textfieldState.setBounds(300,640,400,30);
        add( textfieldState);

        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,700,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(255,255,255));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno= first;
        String name=textName.getText();
        String fname=textFname.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();

        String gender=null;
        if (r1.isSelected())
        {
            gender="Male";
        } else if (r2.isSelected()) {
            gender="Female";

        }
        String email=textemail.getText();

        String marital=null;
        if (m1.isSelected())
        {
            marital="Married";
        } else if (m2.isSelected()) {
            marital="Unmarried";

        } else if (m3.isSelected()) {
            marital="Other";

        }

        String address=textfieldaddr.getText();
        String city=textfieldcity.getText();
        String pincode=textfieldPin.getText();
        String state=textfieldState.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else {
                con Con1=new con();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob +"','"+gender +"','"+email+"','"+marital +"','"+address +"','"+city+"','"+pincode+"','"+state+"')";
                Con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);

            }

        } catch (Exception ex) {
             ex.printStackTrace();
        }



    }

    public static void main(String[] args) {
    new Signup();
    }
}
