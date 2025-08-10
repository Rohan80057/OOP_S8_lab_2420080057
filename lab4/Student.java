package lab4;
import java.util.Scanner;
class Student {
	private int rollNumber;
	protected String grade;
	public String name;
	public void setStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter grade: ");
        String grade = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
	}    
	public void getStudent() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);
    }    
}	