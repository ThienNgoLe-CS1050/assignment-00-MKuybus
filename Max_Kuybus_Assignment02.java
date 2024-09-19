
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Max_Kuybus_Assignment02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyBoardInput = new Scanner (System.in);
		
		String firstName, lastName;
		
		char middleInitial;
		int age;
		double grossAnnualPay, taxRate, netAnnualPay;
		
		firstName = JOptionPane.showInputDialog("Enter your name. ");

		
		lastName = JOptionPane.showInputDialog("Enter your middle intial. ");
		middleInitial = lastName.charAt(0);

		
		lastName = JOptionPane.showInputDialog("Enter your last name. ");
		

		
		
		age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age. "));
		

		
		grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog("Enter your annual gross pay. "));
		

		
		taxRate = Double.parseDouble(JOptionPane.showInputDialog("Enter your tax rate. "));
		
		netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
		

		
		
		System.out.println("Hello " + firstName + " " + middleInitial + ". " + lastName + ",\n" 
				+ "You are " + age + " years old now.\nIt is amazing that you made $" + grossAnnualPay  + " this year."
						+ " With the tax \nrate of " + taxRate + ", you can take home $" + netAnnualPay);
		
		keyBoardInput.close();
	}

}
