package ru.yandex.practicum;

import java.time.LocalDateTime;
import java.util.Arrays;

public class QA1 {

    public static void main(String[] args) {
        int[] array = new int[10];

        System.out.println(array);
        System.out.println(Arrays.toString(array));

        String[] strArray = new String[10];
        strArray[0] = "hello";
        strArray[1] = "!!!!!!!!!!!!!!!!!!!!!!!!";
        System.out.println(Arrays.toString(strArray));

        System.out.println("---");

        Object[] ojbs = {new Object(), "111", LocalDateTime.now()};

        System.out.println(Arrays.toString(ojbs));
        System.out.println("---");

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.toString(matrix));
        System.out.println(Arrays.deepToString(matrix));

        int[][] notAMatrix = {{1, 2, 3}, {4, 5, 6, 0}, {7, 8, 9}};

        System.out.println(Arrays.toString(notAMatrix));
        System.out.println(Arrays.deepToString(notAMatrix));

        for (int i = 0; i < notAMatrix[1].length; i++) {
            System.out.print(notAMatrix[1][i] + " ");
        }
        System.out.println();
        System.out.println("---");


/*        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notAMatrix.length; i++) {
            for (int j = 0; j < notAMatrix[i].length; j++) {
                System.out.printf("Enter element on line %d-th column %d-th:%n", i+1, j+1);
                notAMatrix[i][j] = Integer.parseInt(scanner.nextLine());
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(notAMatrix));*/

        int[][] anotherNotAMatrix = new int[3][];
        anotherNotAMatrix[0] = new int[3];
        anotherNotAMatrix[1] = new int[4];
        anotherNotAMatrix[2] = new int[5];

        System.out.println(Arrays.deepToString(anotherNotAMatrix));
        String[][] str = new String[3][3];

//        str[0][0] = "Hello";
//        str[1][1] = "Nice";
//        str[2][2] = "World";

        System.out.println(Arrays.deepToString(str));

        int[] simpleArray = notAMatrix[1];
        System.out.println(Arrays.toString(simpleArray));



    }

}


