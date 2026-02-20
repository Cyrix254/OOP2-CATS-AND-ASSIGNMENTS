
//REAGAN TZISAGA CT100/G/22492/24.

import java.util.Scanner; 

class StudentRecord {
    int studentID;
    String name;
    String course;

    StudentRecord(int studentID, String name, String course) {

        this.studentID = studentID;
        this.name = name;
        this.course = course;
    }

    void displayInfo() {
        System.out.println("STUDENTID:" + studentID);
        System.out.println("NAME;" + name);
        System.out.println("COURSE:" + course);
    }


}

public class StudentApp{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the student ID:");
        int studentID=scan.nextInt();

        scan.nextLine(); // Consume the newline character left by nextInt()

        System.out.println("Enter the student name:");
        String name=scan.nextLine();

        System.out.println("Enter the student course:");
        String course=scan.nextLine();
//object
StudentRecord student1= new StudentRecord(studentID, name, course);

student1.displayInfo();

scan.close();

    }
}
