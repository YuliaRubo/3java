package com.company;

public class Main {

    public static void main(String[] args) {

        int month = 6;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Зима");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Весна");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Лето");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Такого месяца не существует");
        }
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
        int[] marray = {2, 3, 4, 6, 9, 4, 8, 10, 12, 16};
        for (int i = 9; i >= 0; i--) {
            System.out.print(" " + marray[i] + " ");
        }
        System.out.println();
        System.out.println();

        int[][] squareArray = new int[2][3];
        squareArray[0][0] = 4;
        squareArray[0][1] = 5;
        squareArray[0][2] = 4;
        squareArray[1][0] = 5;
        squareArray[1][1] = 8;
        squareArray[1][2] = 2;

        for (int i = 0; i < squareArray.length; i++) {
            int k = 0;
            int y = 1;
            System.out.println();

            for (int j = 0; j < squareArray[i].length; j++) {
                System.out.print(squareArray[i][j] + "["+i+"]" + "["+j+"]" + " ");
            }

        }


    }
}
