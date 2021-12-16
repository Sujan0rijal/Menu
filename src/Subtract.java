import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class Subtract extends JFrame implements ActionListener {
    JLabel first,second,result;
    JTextField textfirst,textsecond,textresult;
    JButton Subtract,Back;
    Subtract(){
        setTitle("Subtraction");
        first = new JLabel("First Number");
        first.setBounds(50,0,100,20);
        add(first);

        textfirst = new JTextField();
        textfirst.setBounds(50,30,100,20);
        add(textfirst);

        second = new JLabel("Second Number");
        second.setBounds(50,60,100,20);
        add(second);

        textsecond = new JTextField();
        textsecond.setBounds(50,90,100,20);
        add(textsecond);

        result = new JLabel("Result");
        result.setBounds(50,120,100,20);
        add(result);

        textresult = new JTextField();
        textresult.setBounds(50,150,100,20);
        add(textresult);

        Subtract = new JButton("-");
        Subtract.setBounds(200,50,100,20);
        add(Subtract);

        Back = new JButton("Back to Home");
        Back.setBounds(180, 120, 200, 20);
        add(Back);



        Back.addActionListener(e -> {
            dispose();
            new MenuBar();
        });

        Subtract.addActionListener(this);

        setLayout(null);
        setSize(400,250);
        setVisible(true);
    }

    public static void main(String[] args) {

        Subtract subtract = new Subtract();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(textfirst.getText());
        int b = Integer.parseInt(textsecond.getText());
        int c = 0;
        if (e.getSource().equals(Subtract)) {
            c = a - b;
            textresult.setText(String.valueOf(c));
        }
        else{
            System.out.println("Error");
        }


    }
}
