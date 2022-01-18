package DSA.Arrays;

import java.util.*;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class arrayDoc {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int size = 10;

        // Array Declaration
        int arr1[];
        int arr2[] = new int[5];
        int arr3[] = new int[size];

        // Array Initialization
        int arr4[] = { 1, 2, 3, 4, 5 };
        int arr5[] = new int[] { 1, 2, 3, 4, 5 };

        // Adding Elements in Array through Loop
        for (int i = 0; i < size; i++) {
            arr3[i] = sc.nextInt();
        }

        // Adding Elements in Array without Loop
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;

        // Accessing Elements of Array
        int fg1 = arr3[0];

        // Updating Elements in Array
        arr3[1] = fg1;

        // Printing Elements of Array
        for (int i = 0; i < size; i++) {
            System.out.println(arr3[i]);
        }

        // Declaring Array of Class or Objects
        Student[] starr = new Student[5];

        // Initializing Object Array
        starr[0] = new Student("Arpit", 18);
        starr[1] = new Student("Khushi", 32);
        starr[2] = new Student("Akshat", 10);
        starr[3] = new Student("Himanshu", 28);
        starr[4] = new Student("Yash", 43);

        // Accessing the Elements in object array
        String name1 = starr[0].name;
        int rollNo1 = starr[1].rollNo;

        // Multi Dimensional Arrays
        int arr6[][] = new int[10][5];
        int arr7[][][] = new int[10][20][30];
        int arr8[][] = { { 1, 2 }, { 3, 4 } };
        int arr9[][][] = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

        // Accessing the Elements in Multi Dimensional Array
        int fg2 = arr8[0][1];
        int fg3 = arr9[1][0][1];

        // Printing in tabular form 2-D Array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr8[i][j] + " ");
            }
            System.out.println();
        }

        // Printing in tabular form 3-D Array
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr9[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
