package week3.day1.classwork;

public class Oneplus_ConcreteClass extends AndroidTV_AbstractClass { //can also use public class Oneplus extends AndroidTV implements Android
	public static void main(String[] args) {
		Oneplus_ConcreteClass one = new Oneplus_ConcreteClass();
		System.out.println(one.playVideo());
		System.out.println(one.openApp());
	}

	public String playVideo() {
		return "Video is not played";
	}

}
