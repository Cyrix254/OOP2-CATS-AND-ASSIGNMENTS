
//REAGAN TZISAGA CT100/G/22492/24.

import java.util.Scanner;
class Employee{

    String name;
    double salary;

Employee(String name, double salary) {
    this.name=name;
    this.salary=salary;
}

void Display() {
    System.out.println("Name:" + name);
    System.out.println("Salary:" + salary);
}

}

class salaryCalculator{

    double calculateBonus(double salary){
        return 0.1 * salary;
    }
}

public class MainApp{

    public static void main(String[] args){

Scanner scanner= new Scanner(System.in);

System.out.print("Enter your name:");
String name=scanner.nextLine();

System.out.print("Enter your monthly salary:");
double salary=scanner.nextDouble();

Employee emp1= new Employee(name, salary);

salaryCalculator bonus1= new salaryCalculator();

 emp1.Display();
System.out.println("Bonus: "+ bonus1.calculateBonus(salary));
System.out.println("Total salary with bonus: "+ (salary+ bonus1.calculateBonus(salary)));

scanner.close();

    }
}