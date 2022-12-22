package week3.day1.classwork;

public class MyPad extends Ipad {

	public static void main(String[] args) {
		Ipad res = new Ipad();
		res.watchMovie();
		res.watchMovie("Potrait");
		System.out.println("The time of the movie is" + " " +res.watchMovie("Potrait", 2));

	}

}
