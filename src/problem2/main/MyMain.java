/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem2.checkStatements.CheckStatements;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        CheckStatements checkStatements = new CheckStatements();
        int[][] testCasesA = {{50, 30, 20, 40, 70, 60, 80},
                {50, 60, 70, 80, 90, 99, 897, 899},
                {},
                {90, 80, 70, 60, 50, 45, 40},
                {50, 44, 60, 48, 55, 70, 32, 80, 61, 29, 18, 62, 63, 64, 65, 66}};

        int[][] testCasesB = {{50, 30, 20, 40, 70, 60, 80},
                {50, 60, 70, 80, 90, 99, 899},
                {},
                {90, 80, 70, 60, 50, 45, 40},
                {60, 70, 80, 90, 20, 30},
                {50, 44, 60, 48, 55, 70, 32, 80, 61, 29, 18, 62, 63, 64, 65, 66, 67}};
        checkStatements.results(testCasesA, testCasesB);
    }

}
