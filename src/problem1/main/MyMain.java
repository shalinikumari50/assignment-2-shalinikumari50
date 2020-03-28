/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        int[][] testCases = {{50, 30, 20, 40, 70, 60, 80},
                {50, 60, 70, 80, 90, 99, 897, 899},
                {},
                {90, 80, 70, 60, 50, 45, 40},
                {50, 44, 60, 48, 55, 70, 32, 80, 61, 29, 18, 62, 63, 64, 65, 66}};
        testCases(testCases);

    }

    private static void testCases(int[][] testCases) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        int i = 0;
        for (int[] test : testCases) {
            i++;
            System.out.println("Test " + i + ":");
            myBinarySearchTree.createBST(test);
            myBinarySearchTree.leftChildTraversal();
            System.out.println("***************************************************");
        }

    }
}
