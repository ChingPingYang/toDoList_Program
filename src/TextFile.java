import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFile {
	
	public List listOb = new List();
	File file = new File("TheToDoList.txt");
	
	public void saveFile() {
		try {
		PrintWriter writer = new PrintWriter(file);
		writer.printf("\n        TO DO LIST\n");
		writer.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for (int i = 0; i < listOb.theList.size(); i++) {
			writer.printf("%d.%s\n", i + 1, listOb.theList.get(i));
		}
		writer.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		writer.close();
		
		System.out.println("The file is saved.");
		} catch (IOException ex) {
			System.out.println("Error from SaveFile.");
		}	
	}
	
	public void readFile() {
		try {
		Scanner input = new Scanner(file);
		String x = input.nextLine();
		while (x != null) {
		System.out.println(x);
		x = input.nextLine();
		}
		
		} catch(Exception ex) {
			System.out.printf("\n\n\nEnd of the list.");
		}
	}
	
}
