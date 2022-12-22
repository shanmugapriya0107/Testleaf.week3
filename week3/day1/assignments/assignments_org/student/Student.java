package week3.day1.assignments_org.student;

import week3.day1.assignments_org.department.Department;

public class Student extends Department {
	public static void main(String[] args) {
		Student stud = new Student();
		System.out.println("The college name is " +stud.collegeName());
		System.out.println("The college code is " +stud.collegeCode());
		System.out.println("The college rank is " +stud.collegeRank());
		System.out.println("The department name is " +stud.deptName());
		System.out.println("The student name is " +stud.studentName());
		System.out.println("The student department is " +stud.studentDept());
		System.out.println("The student Id is " +stud.studentId());
	}
	public String studentName()
	{
		return "Shanmugapriya";
	}
	public String studentDept()
	{
		return "Computer Science";
	}
	public int studentId()
	{
		return 104;
	}
	
}
