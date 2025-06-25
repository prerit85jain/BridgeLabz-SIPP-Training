package level02;

public class StudentReport {
	
 String name;
 int rollNumber;
 int marks;

 public StudentReport(String name, int rollNumber, int marks) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.marks = marks;
 }

 public String calculateGrade() {
     if (marks >= 90) {
         return "A+";
     } else if (marks >= 75) {
         return "A";
     } else if (marks >= 60) {
         return "B";
     } else if (marks >= 50) {
         return "C";
     } else if (marks >= 35) {
         return "D";
     } else {
         return "F";
     }
 }

 public void displayDetails() {
     System.out.println("Student Name: " + name);
     System.out.println("Roll Number: " + rollNumber);
     System.out.println("Marks: " + marks);
     System.out.println("Grade: " + calculateGrade());
 }

 public static void main(String[] args) {
     StudentReport student1 = new StudentReport("Vivek", 101, 78);
     student1.displayDetails();

     StudentReport student2 = new StudentReport("Sahil", 102, 45);
     student2.displayDetails();
 }
}
