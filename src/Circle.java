import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Circle extends JFrame implements ActionListener {
    JLabel radius, result;
    JTextField textradius, textresult;
    JButton area,Back;
    public Circle(){
        radius = new JLabel("Radius");
        radius.setBounds(50,0,100,20);
        add(radius);

        textradius = new JTextField();
        textradius.setBounds(50,30,100,20);
        add(textradius);

        result = new JLabel("Result");
        result.setBounds(50,60,100,20);
        add(result);

        textresult = new JTextField();
        textresult.setBounds(50,90,100,20);
        add(textresult);

        area = new JButton("Area of Circle");
        area.setBounds(50,120,100,20);
        add(area);

        Back = new JButton("Back to Home");
        Back.setBounds(180, 120, 200, 20);
        add(Back);



        Back.addActionListener(e -> {
            dispose();
            new MenuBar();
        });
        area.addActionListener( this);

        setLayout(null);
        setSize(400,250);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(textradius.getText());
        int b = 0;
        if(e.getSource()==area){
            b = 22*a*a/7;
            textresult.setText(String.valueOf(b));
        }else{
            System.out.println("ERROR");
        }

    }

    public static void main(String[] args) {
        Circle circle = new Circle();
    }
}
