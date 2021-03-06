package clicked;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Imput_Text_JButton extends JFrame {
   private JTextField textField;
   private JButton button;
   public Imput_Text_JButton() {
      setTitle("JButtonTextChange Test");
      setLayout(new FlowLayout());
      textField = new JTextField(30);
      button = new JButton("Click to receive words from above!");
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae) {
            if (!textField.getText().equals(""))
               button.setText(textField.getText());
         }
      });
      add(textField);
      add(button);
      setSize(400, 300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   public static void main(String[] args) {
      new Imput_Text_JButton();
   }
}
