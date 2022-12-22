package week3.day1.assignments_org.system;

public class Desktop extends Computer {
	public static void main(String[] args) {
		Computer comp = new Computer();
		System.out.println("The Computer Model is " +comp.computerModel());
		Desktop desk = new Desktop();
		System.out.println("The Desktop size is " +desk.desktopSize());
	}
	
	public int desktopSize()
	{
		return 50;
	}
	
	}

