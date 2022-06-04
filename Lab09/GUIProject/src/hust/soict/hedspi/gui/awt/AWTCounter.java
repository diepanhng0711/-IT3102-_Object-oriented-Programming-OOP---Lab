package hust.soict.hedspi.gui.awt;

import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame implements ActionListener {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;

    public AWTCounter() {
        setLayout(new FlowLayout());

        lblCount = new Label("Counter");
        add(lblCount);

        tfCount = new TextField(count + "", 10);
        tfCount.setEditable(false);
        add(tfCount);

        btnCount = new Button("Count");
        add(btnCount);

        btnCount.addActionListener(this);

        setTitle("AWT Counter");
        setSize(250, 100);

        setVisible(true);
    }

    public static void main(String[] args) {
        AWTCounter app = new AWTCounter();
    }
    
    //Override actionPerformed to count the number 
    public void actionPerformed(ActionEvent evt) {
        ++count;
        tfCount.setText(count + "");
    }

}
