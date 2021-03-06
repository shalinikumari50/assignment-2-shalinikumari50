/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue<Student> myCircularQueue = new MyCircularQueue<>();
        Student.inputStudentList(myCircularQueue);

        System.out.println("List of students: ");
        myCircularQueue.displayQueue();

        myCircularQueue.processQueue(myCircularQueue);

        System.out.println("After processing the queue: ");
        myCircularQueue.displayQueue();


    }


}
