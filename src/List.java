import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class List {
	Scanner input = new Scanner(System.in);
	
	public static ArrayList<String> theList = new ArrayList<String>(); 
	private boolean empty = true;
	
	public void printList() {
		if (empty == false) {
			
			System.out.printf("\n        TO DO LIST\n");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			for (int i = 0; i < theList.size(); i++) {
				System.out.printf("%d.%s\n", i + 1, theList.get(i));
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		} else {
			System.out.println("Nothing in the List.");
		}
	}
	
	public void addList() {
		System.out.println("Add one to do thing: ");
		String tem = input.nextLine();
		theList.add(tem);
		empty = false;
		System.out.println("The item is added.");
		
	}
	
	public void removeList() {
		if (empty == true) {
			this.printList();
		} else {
		System.out.println("Which item do you want to remove?(give the integer): ");
		this.printList();
	 	int tem = input.nextInt() - 1;
	 	theList.remove(tem);
	 	System.out.println("The item has been removed.");
		}
	}
	
	public void markItem() {
		if (empty == true) {
			this.printList();
		} else {
		System.out.println("Which item do you want to mark?(give the integer): ");
		this.printList();
	 	int temIn = input.nextInt() - 1;
	 	String temS = "* " + theList.get(temIn) + " *";
	 	theList.set(temIn, temS);
	 	System.out.println("The item has been marked.");
		}
	}
}
