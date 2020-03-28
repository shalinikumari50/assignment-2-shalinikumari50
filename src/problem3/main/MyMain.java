/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.element.Element;
import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;
import problem5.student.Student;

import java.util.Scanner;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue<Student> myPriorityQueue = new MyPriorityQueue<>();
        Scanner scanner = new Scanner(System.in);
        myPriorityQueue.printMenu();
        int choice = -1;
        while (choice != 0) {
            System.out.println("Enter choice");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input");
                continue;
            }
            switch (choice) {
                case 0:
                    break;
                case 1:
                    System.out.println("Enter student roll number: ");
                    int rollNumber = Integer.parseInt(scanner.nextLine().trim());
                    System.out.println("Enter student name: ");
                    String name = scanner.nextLine().trim();
                    System.out.println("Enter number of back logs: ");
                    int backLogs = Integer.parseInt(scanner.nextLine().trim());
                    Student student = new Student(rollNumber, name, backLogs);

                    myPriorityQueue.enqueue(new Node<>(new Element<>(student, rollNumber)));
                    break;
                case 2:
                    myPriorityQueue.dequeue();
                    break;
                case 3:
                    myPriorityQueue.display();
                    break;
                case 4:
                    myPriorityQueue.printMenu();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }


        }
    }
}
