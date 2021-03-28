package scann;
import javax.swing.JOptionPane;

public class Guiintro {
	public static void main(String[] args) {
		
		String input=JOptionPane.showInputDialog("Enter name");
		JOptionPane.showMessageDialog(null,"My name is " +input);
		
		int age=Integer.parseInt(JOptionPane.showInputDialog("Enter age"));
		JOptionPane.showMessageDialog(null,"My age is " +age);
		
		int height=Integer.parseInt(JOptionPane.showInputDialog("Enter height"));
		JOptionPane.showMessageDialog(null,"My height is " +height );
		
		
		
		
		
		
		
	}

}
