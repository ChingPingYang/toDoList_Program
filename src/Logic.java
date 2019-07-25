
import java.util.Scanner;

public class Logic implements Runnable{

	private Thread thread;
	private boolean running = false;
	private int user;
	private List listOb = new List();
	private TextFile fileOb = new TextFile();
	
	
	public void update() throws InterruptedException {
		System.out.printf("\n=================================\n0.Exit\n1.Show Current List"
		+ "\n2.Add Item\n3.Remove Item\n4.Mark item\n5.Save File\n6.Read Old File\n=================================\n");
		System.out.println("What do you want to do?: ");
		Scanner input = new Scanner(System.in);
		user = input.nextInt();
		
		switch (user) {
		case 0:
			this.end();
			break;
		case 1:
			listOb.printList();
			break;
		case 2:
			listOb.addList();
			break;
		case 3:
			listOb.removeList();
			break;
		case 4:
			listOb.markItem();
			break;
		case 5:
			fileOb.saveFile();
			break;
		case 6:
			fileOb.readFile();
			break;
		}
		
	}
	

	public synchronized void start() {
		running = true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void end() throws InterruptedException {
		running = false;
		System.out.println("The program has ended.");
		thread.join();
	}
	
	@Override
	public void run() {
		while (running) {
			try {
				update();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
