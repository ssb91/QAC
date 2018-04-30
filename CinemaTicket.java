import java.util.Scanner;

public class CinemaTicket {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Ticket prices are, standard (£8), pensioner (£6), student (£6), child (£4).");
		
		System.out.println("Enter the number of adults:");		
		int n_standard; n_standard = s1.nextInt();
		
		System.out.println("Enter the number of pensioners:");		
		int n_pensioner; n_pensioner = s1.nextInt();

		System.out.println("Enter the number of students:");		
		int n_student; n_student = s1.nextInt();
		
		System.out.println("Enter the number of children:");
		int n_child; n_child = s1.nextInt();
		
		double cost; 
		cost =  n_standard*8 + n_pensioner*6 + n_student*6 + n_child*4;
		System.out.println("The total cost of the ticket is: " + cost);
										
		}
	
}