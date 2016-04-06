package day3;

import javax.swing.JOptionPane;

public class Questions {
public static void main(String[] args) {
	String last = JOptionPane.showInputDialog("What's your last name?");
	String live = JOptionPane.showInputDialog("Where do you live?");
	String school = JOptionPane.showInputDialog("What school do you go to?");
	String card = JOptionPane.showInputDialog("What is your credit card number");
	String email = JOptionPane.showInputDialog("What is your email?");
	String age = JOptionPane.showInputDialog("How old are you?");
	String birthday = JOptionPane.showInputDialog("When is your birthday?");
	JOptionPane.showMessageDialog(null, "Hi Mr/Ms." + last);
	JOptionPane.showMessageDialog(null, "You live in " + live);
	JOptionPane.showMessageDialog(null, "You go to " + school);
	JOptionPane.showMessageDialog(null, "Your credit card number is " + card);
	JOptionPane.showMessageDialog(null, "Your email is " + email);
	JOptionPane.showMessageDialog(null, "You are " + age);
	JOptionPane.showMessageDialog(null, "Your birthday is " + birthday);
	JOptionPane.showMessageDialog(null, "Thank you for your cooperation");
}
}
                                                                                                                                                          