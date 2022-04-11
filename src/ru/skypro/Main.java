package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// Задача №1 - №2
        // 1.
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length-1) {
                System.out.println(array1[i]);
            } else {
                System.out.print(array1[i] + ", ");
            }
        }
            
        // 2.
        double[] array2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length-1) {
                System.out.println(array2[i]);
            } else {
                System.out.print(array2[i] + ", ");
            }
        }

        // 3.
        char[] array3 = {65, 66, 67};
        for (int i = 0; i < array3.length; i++) {
            if (i == array3.length - 1) {
                System.out.println(array3[i]);
            } else {
                System.out.print(array3[i] + ", ");
            }
        }
    // Задача №3

        // 1.

        for (int i = array1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array1[i]);
            } else {
                System.out.print(array1[i] + ", ");
            }
        }
        // 2.

        for (int i = array2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array2[i]);
            } else {
                System.out.print(array2[i] + ", ");
            }
        }
        // 3.

        for (int i = array3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(array3[i]);
            } else {
                System.out.print(array3[i] + ", ");
            }
        }
    // Задача №4

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0 && i != array1.length - 1) {
                System.out.print(array1[i] + ", ");
            } else if (i != array1.length - 1) {
                array1[i] = array1[i] + 1;
                System.out.print(array1[i] + ", ");
            } else if (array1[i] % 2 == 0) {
                System.out.println(array1[i]);
            } else {
                array1[i] = array1[i] + 1;
                System.out.println(array1[i]);
            }
        }
    }
}
