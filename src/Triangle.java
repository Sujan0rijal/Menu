import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Triangle extends JFrame implements ActionListener {
    JLabel base,height,result;
    JTextField textbase,textheight,textresult;
    JButton area,Back;
    Triangle(){
        setTitle("Area of Triangle");

        base = new JLabel("Base");
        base.setBounds(50,0,100,20);
        add(base);

        textbase = new JTextField();
        textbase.setBounds(50,30,100,20);
        add(textbase);

        height= new JLabel("Height");
        height.setBounds(50,60,100,20);
        add(height);

        textheight = new JTextField();
        textheight.setBounds(50,90,100,20);
        add(textheight);

        result = new JLabel("Result");
        result.setBounds(50,120,100,20);
        add(result);

        textresult = new JTextField();
        textresult.setBounds(50,150,100,20);
        add(textresult);

        area = new JButton("Area of Triangle");
        area.setBounds(50,180,200,20);
        add(area);

        Back = new JButton("Back to Home");
        Back.setBounds(180, 120, 200, 20);
        add(Back);

        area.addActionListener(this);
        Back.addActionListener(e -> {
            dispose();
            new MenuBar();
        });

        setLayout(null);
        setSize(400,250);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(textbase.getText());
        int b = Integer.parseInt(textheight.getText());
        int c = 0;
        if(e.getSource() == area){
            c = (a*b)/2;
            textresult.setText(String.valueOf(c));
        }else{
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
    }
}
