package Bank_M_P;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Pin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;
    Pin(String pin){
        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1=new JLabel("CHANGE YOUR PASSWORD");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(430,180,400,35);
        l3.add(label1);

        JLabel label2=new JLabel("New PIN: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(430,220,400,40);
        l3.add(label2);

        p1=new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        p1.setBounds(550,224,250,25);
        l3.add(p1);

        JLabel label3=new JLabel("Confirm PIN: ");
        label3.setForeground(Color.WHITE);
        label3.setFont(new Font("System",Font.BOLD,16));
        label3.setBounds(430,260,400,40);
        l3.add(label3);

        p2=new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        p2.setBounds(550,264,250,25);
        l3.add(p2);


        b1=new JButton("CHANGE");
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.setBounds(700,362,150,35);
        b1.addActionListener(this);
        l3.add(b1);

        b2=new JButton("BACK");
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.setBounds(700,406,150,35);
        b2.addActionListener(this);
        l3.add(b2);



        setLayout(null);
        setSize(1550,1030);
        setLocation(0,0);
       // setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

      try {


          String pin1=p1.getText();
          String pin2=p2.getText();

          if (!pin1.equals(pin2)){
              JOptionPane.showMessageDialog(null,"Entered PIN doesn't match");
              return;
          }

          if (e.getSource()==b1){
              if (p1.getText().equals("")){
                  JOptionPane.showMessageDialog(null,"Enter New PIN");
                  return;
              }
              if (p2.getText().equals("")){
                  JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                  return;
              }

              con c1=new con();
              String q1="update bank set pin = '"+pin1+"' where pin= '"+pin+"'";
              String q2="update login set pin = '"+pin1+"' where pin= '"+pin+"'";
              String q3="update signupthree set pin = '"+pin1+"' where pin= '"+pin+"'";

              c1.statement.executeUpdate(q1);
              c1.statement.executeUpdate(q2);
              c1.statement.executeUpdate(q3);

              JOptionPane.showMessageDialog(null,"Pin Changed Successfully !");
              new main_Class(pin1);
              setVisible(false);
          }

          if (e.getSource()==b2){
              new main_Class(pin);
              setVisible(false);
          }



      }  catch (SQLException ex) {
          throw new RuntimeException(ex);
      }
    }

    public static void main(String[] args) {
        new Pin("");
    }
}
