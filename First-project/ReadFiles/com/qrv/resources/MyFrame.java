package com.qrv.resources;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame {

private JFrame frame;
private JTextField textField;
private JTextField textField_1;

/**
 * Launch the application.
 */
public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
        public void run() {
            try {
                MyFrame window = new MyFrame();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    });
}

/**
 * Create the application.
 */
public MyFrame() {
    initialize();
}

/**
 * Initialize the contents of the frame.
 */
private void initialize() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);

    JLabel lblEnterText = new JLabel("Enter text");
    lblEnterText.setBounds(62, 29, 96, 14);
    frame.getContentPane().add(lblEnterText);

    JLabel lblEncrypt = new JLabel("Encrypt");
    lblEncrypt.setBounds(62, 112, 46, 14);
    frame.getContentPane().add(lblEncrypt);

    textField = new JTextField();
    textField.setBounds(236, 26, 86, 20);
    frame.getContentPane().add(textField);
    textField.setColumns(10);

    textField_1 = new JTextField();
    textField_1.setBounds(236, 109, 86, 20);
    frame.getContentPane().add(textField_1);
    textField_1.setColumns(10);

    JButton btnEncrypt = new JButton("Encrypt");
    btnEncrypt.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {

                String text;

                StringBuffer passWord = new StringBuffer(""+ text);

            for(int i = 0; i < passWord.length(); i++){
                int temp = 0;
                temp = (int)passWord.charAt(i);
                temp = temp*9834 / 8942 /33 *90023243 * 9 +124324534 - 2335 ;               
                passWord.setCharAt(i, (char)temp);

            }


        }
    });
    btnEncrypt.setBounds(222, 201, 89, 23);
    frame.getContentPane().add(btnEncrypt);
}
}
