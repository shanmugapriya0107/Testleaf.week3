package week3.day1.classwork;

public class Samsung_ConcreteClass extends AndroidTV_AbstractClass{
	public static void main(String[] args) {
		Samsung_ConcreteClass sam = new Samsung_ConcreteClass();
		System.out.println(sam.playVideo());		
	}

	public String playVideo() {
		return "Video is played";
	}

}
