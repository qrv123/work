package com.qrv.domain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame {

	static public boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1;
    }
	
	static public boolean sameVowelPatternOfLongWord(String s1, String s2) throws InvalidInputException {
        String vowels = new String ("AaEeIiOoUu");

        if (s1.length() == 0 || s2.length() == 0) {
            throw new InvalidInputException("Vui long dien vao o trong");
        }

        String s1_temp = "";
        String s2_temp = "";

        for(int i = 0; i < s1.length(); i++) {
            if (((int)s1.charAt(i)<65) ||( (int)s1.charAt(i)>90 && (int)s1.charAt(i)<97 ) || (int)s1.charAt(i) > 122){
                throw new InvalidInputException("Invalid Input");
            }
            if (isVowel(s1.charAt(i))) {
                s1_temp += s1.charAt(i);
            }
        }

        for(int j = 0; j < s2.length(); j++) {
            if (((int)s2.charAt(j)<65) ||( (int)s2.charAt(j)>90 && (int)s2.charAt(j)<97 ) || (int)s2.charAt(j) > 122){
                throw new InvalidInputException("Invalid Input");
            }
            if (isVowel(s2.charAt(j))) {
                s2_temp += s2.charAt(j);
            }
        }

        if (s1_temp.toLowerCase().equals(s2_temp.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
	
	public static void main(String[] args) {
	
		JFrame frame = new JFrame("Test");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblEntertxt1 = new JLabel("Word 1 :");
		lblEntertxt1.setBounds(62, 29, 96, 14);
		frame.getContentPane().add(lblEntertxt1);
		
		JLabel lblEntertxt2 = new JLabel("Word 2 :");
		lblEntertxt2.setBounds(62, 112, 96, 14);
		frame.getContentPane().add(lblEntertxt2);
		
		JLabel lblResult = new JLabel("Result :");
		lblResult.setBounds(62, 153, 96, 14);
		frame.getContentPane().add(lblResult);
		
		JTextField textfield1 = new JTextField();
		textfield1.setBounds(236, 26, 150, 20);
		frame.getContentPane().add(textfield1);
		
		JTextField textfield2 = new JTextField();
		textfield2.setBounds(236, 109, 150, 20);
		frame.getContentPane().add(textfield2);
		
		JTextField result = new JTextField();
		result.setBounds(236, 150, 150, 20);
		frame.getContentPane().add(result);
		
		JButton btnCheck = new JButton("Check");
		btnCheck.setBounds(180, 201, 89, 23);
		frame.getContentPane().add(btnCheck);
		btnCheck.addActionListener(new ActionListener() {
			

			
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String str1 = textfield1.getText();
				String str2 = textfield2.getText();
				
				try {
                    /*boolean bl = false;
                    bl = sameVowelPatternOfLongWord(txt1,txt2);*/
                    if (sameVowelPatternOfLongWord(str1,str2)){
                        //Toast.makeText(MainActivity.this,"TRUE",Toast.LENGTH_LONG).show();
                    	result.setText("TRUE");
                    }
                    else{
                        //Toast.makeText(MainActivity.this,"FALSE",Toast.LENGTH_LONG).show();
                    	result.setText("FALSE");
                    }
                } catch (InvalidInputException e){
                    //Toast.makeText(MainActivity.this,e.getMessage(),Toast.LENGTH_LONG).show();
                	String error = e.getMessage();
                	result.setText(error);
                }
				
			}
		});
		
		frame.setVisible(true);
		
	}
}
