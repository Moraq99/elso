package hu.progmatic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lesson_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Adjon meg 5 számot!");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        String numsToString = num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5;

        int sum = num1 + num2 + num3 + num4 + num5;

        System.out.println("A számaid: " + numsToString);
        System.out.println("Összeadva: " + sum);*/

        //TÖMB == ARRAY ? TRUE !!!!!

        //"üres" tömb
        /*int[] numbers = new int [5];   // ennek a tömbnek a tartalma: 0,0,0,0,0

        int[] numbers2 = new int []{1, 2, 3, 4, 5};
        int[] numbers3 = {6, 7, 8, 9, 10};
        // Ez a három ugyan az!
        */

        /*int[] numbers = new int[5];

        int x = numbers[0];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);*/

        /*int[] numbers = new int[]{1,2,3,4};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);*/

        /*int[] numbers = new int[5];

        System.out.println("eredeti érték: " + numbers[0]);
        numbers[0] = 42;
        numbers[1] = 33;
        numbers[2] = 66;
        numbers[3] = 5;
        numbers[4] = 9;

        numbers[3] = 10;
        numbers[4] = 10;

        numbers[0] = numbers[1] + numbers[2];  //99
        numbers[0] += 1;                       //100
        */

        /*double[] d = new double[2];
        boolean[] b = new boolean[2];
        String[] s = new String[2];

        System.out.println(d[0]);
        System.out.println(b[0]);
        System.out.println(s[0]);*/


        /*System.out.println("Kérek szépen 5 számot!");
        int[] numbers = new int[5];

        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        numbers[3] = scanner.nextInt();
        numbers[4] = scanner.nextInt();


        String numbersToString = numbers[0] + ", " + numbers[1] + ", " + numbers[2] + ", " + numbers[3] + ", " +numbers[4];
        int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];

        System.out.println("Az öt szám: " + numbersToString);
        System.out.println("Az öt szám összege: " + sum);*/

        /*char[] chars = new char[10];

        System.out.println(chars[10]);*/

        //  JAVA EXCEPTION !!!!!





        // Tömbök kezelése cikklussa //




        /*int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        int index = 0;
        while (index < 5) {
            System.out.println(numbers[index++]);
        }*/


       /*System.out.println("Kérek 5 számot!");
        int[] numbers = new int[5];


        int index = 0;
        while ( index < numbers.length) {
            numbers[index] = scanner.nextInt();
            index++;
        }

        System.out.println("a számaid: ");

        index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }*/


        /*System.out.println("Hány számot szeretnél?");
        int db = scanner.nextInt();


        int[] numbers = new int[db];

        System.out.println("Add meg a számaidat! (Összesen " + db + " darab számot.)");


        int index = 0;
        while ( index < numbers.length) {
            numbers[index] = scanner.nextInt();
            index++;
        }

        System.out.println("a számaid: ");

        index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }*/

        /*System.out.println("Hány számot szeretnél?");
        int db = scanner.nextInt();


        int[] numbers = new int[db];

        System.out.println("Add meg a számaidat! (Összesen " + db + " darab számot.)");


        int index = 0;
        while ( index < numbers.length) {
            numbers[index] = scanner.nextInt();
            index++;
        }



        index = 0;
        while (index < numbers.length) {
            System.out.println(numbers[index]);
            index++;
        }
        System.out.println("az első szám: " + numbers[0]);
        System.out.println("az utolsó szám: " + numbers[numbers.length - 1]);
        */

        String[] strings = {"első", "második", "harmadik", "negyedik", "ötödik", "hatodik", "hetedik"};

        int index = 0;

        index = 0;
        while (index < 6) {
            System.out.println(strings[index]);
            index =+ 2;
        }




    }
}
