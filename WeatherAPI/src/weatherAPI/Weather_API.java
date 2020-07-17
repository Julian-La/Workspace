package weatherAPI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Weather_API extends JFrame {
   private JTextField textField;
   private JButton button;
   public Weather_API() {
      setTitle("JButtonTextChange Test");
      setLayout(new FlowLayout());
      textField = new JTextField(20);
      button = new JButton("Initial Button");
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent ae) {
            if (!textField.getText().equals(""))
               button.setText(textField.getText());
         }
      });
   }}