import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuBar extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu Arithmetic, Area, SimpleInterest,Exit;
    JMenuItem Add, Subtract, Divide, Multiply, Circle, Triangle;

    MenuBar() {
        setTitle("Home");


        setVisible(true);
        setLayout(null);
        setSize(600, 400);
        setBounds(0, 0, 600, 400);
        setResizable(false);
        getContentPane().setBackground(Color.blue);

        //for menu
        menuBar = new JMenuBar();
        add(menuBar);


        //for menu
        Arithmetic = new JMenu("Arithmetic Operations");
        Area = new JMenu("Area");
        SimpleInterest = new JMenu("Simple Interest");
        Exit = new JMenu("Exit");

        //for menu item
        Add = new JMenuItem("Add");
        Subtract = new JMenuItem("Subtract");
        Divide = new JMenuItem("Divide");
        Multiply = new JMenuItem("Multiply");
        Circle = new JMenuItem("circle");
        Triangle = new JMenuItem("triangle");

        //Button
        Add.addActionListener(this);
        Subtract.addActionListener(this);
        Divide.addActionListener(this);
        Multiply.addActionListener(this);
        Circle.addActionListener(this);
        Triangle.addActionListener(this);


        menuBar.add(Arithmetic);
        menuBar.add(Area);
        menuBar.add(SimpleInterest);
        menuBar.add(Exit);
        Arithmetic.add(Add);
        Arithmetic.add(Subtract);
        Arithmetic.add(Divide);
        Arithmetic.add(Multiply);
        Area.add(Circle);
        Area.add(Triangle);

        setJMenuBar(menuBar);

        //for Simple Interest
        SimpleInterest.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
                new SimpleInterest().setVisible(true);

            }
        });

        //for Exit button
        Exit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                dispose();
            }
        });




    }


    public static void main(String[] args) {
        new MenuBar().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Circle) {
            dispose();
            new Circle();
        }
        if (e.getSource() == Triangle){
            dispose();
            new Triangle();
        }
        if (e.getSource() == Add){
            dispose();
            new Add();
        }
        if (e.getSource() == Subtract){
            dispose();
            new Subtract();
        }
        if (e.getSource() == Divide){
            dispose();
            new Divide();
        }
        if (e.getSource() == Multiply){
            dispose();
            new Multiply();
        }
    }

}

