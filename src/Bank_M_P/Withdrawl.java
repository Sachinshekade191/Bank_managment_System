package Bank_M_P;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Withdrawl extends JFrame implements ActionListener {
    JTextField textField;
    JButton b1,b2;
    String pin;
    Date date=new Date();

    Withdrawl(String pin){

        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1=new JLabel("MAXIMUM WITHDRAWL IS RS. 10,000");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System",Font.BOLD,16));
        label1.setBounds(460,160,400,35);
        l3.add(label1);


        JLabel label2=new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System",Font.BOLD,16));
        label2.setBounds(460,190,400,35);
        l3.add(label2);

        JLabel rs=new JLabel("RS:");
        rs.setFont(new Font("Raleway",Font.BOLD,16));
        rs.setForeground(Color.WHITE);
        rs.setBounds(410,235,50,25);
        l3.add(rs);


        textField= new JTextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        textField.setBounds(460,235,320,25);
        l3.add(textField);


        b1=new JButton("WITHDRAWAL");
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
        setSize(1550,1080);
        setLocation(0,0);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                String amount = textField.getText();
                if (amount.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to Withdraw");
                } else {
                    con c1 = new con();
                    ResultSet resultSet = c1.statement.executeQuery("select * from bank where pin='" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {

                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));

                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }

                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    c1.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "', 'Withdrawl' ,'" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    new main_Class(pin);
                    setVisible(false);
                }

            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

        } else if (e.getSource()==b2){
            new main_Class(pin);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }
}
