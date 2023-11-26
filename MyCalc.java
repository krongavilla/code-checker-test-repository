import java.awt.*;
import java.awt.event.*;

class MyCalc extends WindowAdapter implements ActionListener {
  Frame f;
  Label l1;
  Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;
  Button badd, bsub, bmult, bdiv, bmod, bcalc, bclr, bpts, bneg, bback;
  double xd;
  double num1, num2, check;

  MyCalc() {
    f = new Frame("MY CALCULATOR");

    l1 = new Label();
    l1.setBackground(Color.LIGHT_GRAY);
    l1.setBounds(50, 50, 260, 60);

    // Buttons for numbers
    b1 = new Button("1");
    b1.setBounds(50, 340, 50, 50);
    b2 = new Button("2");
    b2.setBounds(120, 340, 50, 50);
    // ... rest of the button initialization skipped for brevity

    // Adding action listeners to the buttons
    b1.addActionListener(this);
    b2.addActionListener(this);
    // ... similarly, all the other buttons have action listeners set

    f.addWindowListener(this);

    // Adding components to the frame
    f.add(l1);
    // ... rest of the buttons added to the frame

    f.setSize(360, 500);
    f.setLayout(null);
    f.setVisible(true);
  }

  // For handling window closing
  public void windowClosing(WindowEvent e) {
    f.dispose();
  }

  public void actionPerformed(ActionEvent e) {
    // Handling button click actions
    // ... Logic for number, arithmetic operations, clear, backspace, etc.
  }

  // Main method to instantiate the MyCalc object
  public static void main(String args[]) {
    new MyCalc();
  }
}
