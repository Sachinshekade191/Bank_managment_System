package Bank_M_P;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String formno;

    JComboBox<String> comboBox,comboBox2,comboBox3,comboBox4,comboBox5;

    JTextField textPan,textAadhar;

   JRadioButton r1,r2,e1,e2;

   JButton next;

   ButtonGroup buttonGroupC,buttonGroupEA;

   Signup2(String formno){

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(90,10,100,100);
        add(image);

        this.formno=formno;

        JLabel l1=new JLabel("Page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,30));
        l1.setBounds(300,30,400,40);
        add(l1);

        JLabel l2=new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3=new JLabel("Religion");
        l3.setFont(new Font("Raleway",Font.BOLD,22));
        l3.setBounds(100,150,100,30);
        add(l3);

        String religion[]={" ","Hindu","Sikh","Muslim","Christian","Other"};
        comboBox=new JComboBox<String>(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,150,320,30);
        add(comboBox);

        JLabel l4=new JLabel("Category");
        l4.setFont(new Font("Raleway",Font.BOLD,22));
        l4.setBounds(100,200,100,30);
        add(l4);

        String Category[]={" ","GENERAL","OBC","SC","ST","Other"};
        comboBox2=new JComboBox<String>(Category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,200,320,30);
        add(comboBox2);

        JLabel l5=new JLabel("Income");
        l5.setFont(new Font("Raleway",Font.BOLD,22));
        l5.setBounds(100,250,100,30);
        add(l5);

        String income[]={" ","Null","<1,50,000","<2,50,000","<5,00,000","<10,00,000","Above 10,00,000"};
        comboBox3=new JComboBox<String>(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,250,320,30);
        add(  comboBox3);

        JLabel l6=new JLabel("Education");
        l6.setFont(new Font("Raleway",Font.BOLD,22));
        l6.setBounds(100,300,120,30);
        add(l6);

        String educational[]={" ","Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
        comboBox4=new JComboBox<String>(educational);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,300,320,30);
        add( comboBox4);

        JLabel l7=new JLabel("Occupation");
        l7.setFont(new Font("Raleway",Font.BOLD,22));
        l7.setBounds(100,350,130,30);
        add(l7);

        String occupation[]={" ","Salaried","Self-Employed","Business","Student","Retired"};
        comboBox5=new JComboBox<String>(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,350,320,30);
        add(comboBox5);

        JLabel l8=new JLabel("Pan Card");
        l8.setFont(new Font("Raleway",Font.BOLD,22));
        l8.setBounds(100,400,130,30);
        add(l8);

        textPan=new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,14));
        textPan.setBackground(new Color(252,208,76));
        textPan.setBounds(350,400,320,30);
        add( textPan);

        JLabel l9=new JLabel("Adhar Card");
        l9.setFont(new Font("Raleway",Font.BOLD,22));
        l9.setBounds(100,450,130,30);
        add(l9);

        textAadhar=new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,14));
        textAadhar.setBackground(new Color(252,208,76));
        textAadhar.setBounds(350,450,320,30);
        add( textAadhar);

        JLabel l10=new JLabel("Senior Citizen");
        l10.setFont(new Font("Raleway",Font.BOLD,22));
        l10.setBounds(100,500,150,30);
        add(l10);

        r1=new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,500,100,30);
        add(r1);

        r2=new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(450,500,100,30);
        add( r2);

        buttonGroupC=new ButtonGroup();
        buttonGroupC.add(r1);
        buttonGroupC.add(r2);

        JLabel l11=new JLabel("Existing Account");
        l11.setFont(new Font("Raleway",Font.BOLD,22));
        l11.setBounds(100,550,200,30);
        add(l11);

        e1=new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,550,100,30);
        add(e1);

        e2=new JRadioButton("No");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(450,550,100,30);
        add( e2);

        buttonGroupEA=new ButtonGroup();
        buttonGroupEA.add(e1);
        buttonGroupEA.add(e2);

        JLabel l12=new JLabel("Form no: ");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(620,10,150,30);
        add(l12);

        JLabel l13=new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(710,10,90,30);
        add(l13);

        next=new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(400,60);
        getContentPane().setBackground(new Color(252,208,76));
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String rel = (String) comboBox.getSelectedItem();
         String cat = (String) comboBox2.getSelectedItem();
         String inc = (String) comboBox3.getSelectedItem();
         String edu = (String) comboBox4.getSelectedItem();
         String occ = (String) comboBox5.getSelectedItem();
         String pan = textPan.getText();
         String adhar = textAadhar.getText();

         String scitizen = " ";
         if (r1.isSelected()) {
              scitizen = "Yes";

         } else if (r2.isSelected()) {
              scitizen = "No";

         }

         String eAccount = " ";
         if (e1.isSelected()) {
              eAccount = "Yes";
         } else if (e2.isSelected()) {
              eAccount = "No";

         }

         try {
              if (textPan.getText().equals("") || textAadhar.getText().equals("")) {
                   JOptionPane.showMessageDialog(null, "Fill all the fields");
              } else {
                   con c1 = new con();
                   String q = "insert into signuptwo values('" + formno + "','" + rel + "','" + cat + "','" + inc + "','" + edu + "','" + occ + "','" + pan + "','" + adhar + "','" + scitizen + "','" + eAccount + "')";
                   c1.statement.executeUpdate(q);
                   new Signup3(formno);
                   setVisible(false);
              }

         } catch (Exception ex) {
              throw new RuntimeException(ex);
         }
    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
