
//REAGAN TZISAGA CT100/G/22492/24

import java.util.Scanner;

 class Student{
    String name;
    double marks;

Student(String name, double marks) {
    this.name=name;
    this.marks=marks;
}

 void displayDetails() {
    System.out.println("Name:" + name);
    System.out.println("Marks:" + marks);
}

}

 class gradeCalculator{

     String calculateGrade(double marks) {
        if (marks>=90 && marks<=100) {
            return "A";
        }

        else if(marks>=75 && marks <90) {
            return"B";
        }

        else if(marks>=50 && marks<75) {
            return "C";
        }

        else if(marks<50) {
            return"D";
        }

        else{
            return "Invalid marks";

        }
    }
}

public class Main{

public static void main (String[] args) {
    Scanner scanner= new Scanner(System.in);

    System.out.println("Enter the name of the student:");
    String name=scanner.nextLine();

    System.out.println("Enter the marks of the student:");

    double marks = scanner.nextDouble();

Student stud= new Student(name,marks);

gradeCalculator calc= new gradeCalculator();

stud.displayDetails();

System.out.println( "The student grade is:"+ calc.calculateGrade(marks));
scanner.close();
}

}