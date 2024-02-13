
 package ribolabactivity1;

import java.util.Scanner;

public class RiboLabActivity1 {

     static Scanner InputString = new Scanner(System.in);
     static Scanner InputInteger = new Scanner(System.in);
     
    public static void main(String[] args) {
        
        System.out.print("Enter your full name: ");
        String name = InputString.nextLine();
        System.out.println("My full name is " + name);
        
        System.out.print("Enter your age: ");
        int age = InputInteger.nextInt();
        System.out.println("I am " + age);
        
        System.out.printf("Enter your Gender: ");
        String gender = InputString.nextLine();
        System.out.println("I am " + gender);
        
        System.out.print("Enter your Full Address: ");
        String address = InputString.nextLine();
        System.out.println("I live in " + address);
        
        System.out.print("Enter your Civil Status: ");
        String status = InputString.nextLine();
        System.out.println("I am " + status);
        
        System.out.print("Enter # of brother/sister: ");
        int siblings = InputInteger.nextInt();
        System.out.println("My total sibling: " + siblings);

    }
    
}
