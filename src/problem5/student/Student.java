/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

import problem5.validInputs.ValidInputs;

// to store student information and properties
public class Student {
    private int rollNumber;
    private String name;
    private int backLog;

    public Student(int rollNumber, String name, int backLog) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.backLog = backLog;
    }

    public static Student inputStudent() {
        ValidInputs validInputs = new ValidInputs();

        System.out.println("Enter student rollNumber");
        int rollNumber = validInputs.inputValidPositiveInteger();
        if (rollNumber == -1) {
            return null;
        }
        System.out.println("Enter student name: ");
        String name = validInputs.inputValidName();
        if (name == null) {
            return null;
        }
        System.out.println("Enter student's backLog: ");
        int backLogs = validInputs.inputValidNonNegativeInteger();
        if (backLogs == -1) {
            return null;
        }


        return new Student(rollNumber, name, backLogs);
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBackLog() {
        return backLog;
    }

    public void setBackLog(int backLog) {
        this.backLog = backLog;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber = " + rollNumber +
                ", name = '" + name + '\'' +
                ", backLog = " + backLog +
                '}';
    }

}
