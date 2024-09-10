package Bank_M_P;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {
    String pin;
    JButton button;
    mini(String pin){
        this.pin = pin;
        getContentPane().setBackground(new Color(255,204,204));
        setSize(1000,790);
        setLocation(300,20);
        setBackground(Color.BLUE);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(50,140,400,300);
        label1.setFont(new Font("System",Font.BOLD,16));
        add(label1);

        JLabel label2 = new JLabel("Sachin Shekade");
        label2.setFont(new Font("System",Font.BOLD,20));
        label2.setBounds(300,30,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(50,80,400,30);
        label3.setFont(new Font("System",Font.BOLD,20));
        label3.setBackground(Color.GRAY);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(50,450,300,20);
        label4.setBackground(Color.GRAY);
        label4.setFont(new Font("System",Font.BOLD,20));
        add(label4);

        try{
            con c=new con();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number:  "+ resultSet.getString("card_number").substring(0,4) + "XXXXXXXX"+ resultSet.getString("card_number").substring(12));
            }
        }catch (Exception e ){
            e.printStackTrace();
        }

        try{
            int balance =0;
           con c=new con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){

                label1.setText(label1.getText() + "<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+ "<br><br><html>");

                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs. "+balance);
        }catch (Exception e){
            e.printStackTrace();
        }

        button = new JButton("Exit");
        button.setBounds(20,500,100,25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new mini("");
    }
}
