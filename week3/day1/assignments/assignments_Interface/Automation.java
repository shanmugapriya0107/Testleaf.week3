package week3.day1.assignments_Interface;

public class Automation extends MultipleLanguage  {

	public static void main(String[] args) {
		Automation auto = new Automation();
		System.out.println(auto.python());
		System.out.println(auto.Selenium());
		System.out.println(auto.Java());
		System.out.println(auto.Ruby());
	}

	public String Selenium() {
		return "It is an Automation tool";
	}

	public String Java() {
		return "It is a object oriented programming language";
	}

	@Override
	public String Ruby() {
		return "It is a scripted language designed for front and back end web development";
	}

}
