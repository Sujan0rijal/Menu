import javax.swing.*;
import java.awt.*;

public class BlankWindow extends JFrame {
    JMenuBar menuBar;
    JMenu Arthimetic, Area, SimpleInterest;
    JMenuItem Add,Subtract,Divide,Multiply,Cirlce,Triangle;
    BlankWindow(){
        setTitle("Home");



        setVisible(true);
        setLayout(null);
        setSize(600,400);
    }

    public static void main(String[] args) {
        BlankWindow blankWindow = new BlankWindow();
    }
}

