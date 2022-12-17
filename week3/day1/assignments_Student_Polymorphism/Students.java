package week3.day1.assignments_Student_Polymorphism;

public class Students {
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(104);
		stud.getStudentInfo(100, "Shanmugapriya");
		stud.getStudentInfo("abc@gmail.com", 876459122);
	}
		
		public void getStudentInfo(int id)
		{
			System.out.println("The student Id is " +id);
		}
		
		public void getStudentInfo(int id, String name)
		{
			System.out.println("The student Id is " +id);
			System.out.println("The name of the student is " +name);
		}
		
		public void getStudentInfo(String email, int phoneNumber)
		{
			System.out.println("The email of the student is " +email);
			System.out.println("The phone number of the student is " +phoneNumber);	
		
}

	}

