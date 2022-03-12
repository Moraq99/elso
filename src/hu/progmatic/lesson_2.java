package hu.progmatic;

import java.util.Scanner;

public class lesson_2 {

    public static <boonlean> void main(String[] args) {
       /* int number1 = 2;
        int number2 = 3;
        int number3 = 2;*/

        String text1 = "kiscica";
        String text2 = "kiscica";

        //System.out.println(text1 == text2);

        //System.out.println(text1.equals(text2));

        //System.out.println(number1 == number3);

        // primitív és egész szám adattípus
        // byte short int long
        /*byte b1 = -128;
        byte b2 = 127;
        //byte b3 = b2 + 10;

        int i = 2140000;
        kasztolás - Cast:
        float f = 10 / 3F;
        double d = 10 / 3D;*/

        // törtek :
        // float, double
        // tulajdonjog hányad, valószínüség, PI értéke
        // Nem pontos !

        // character- char:
        // egy darab karaktert tárol

       /* char a = 'A';
        char b = 'B';



        System.out.println(a +" "+ b);*/

        // boolean - 2 értéke lehet: true / false

        /*int number1 = 5;
        int number2 = 6;
        String text = "szöveg";

        System.out.println(number1 + number2 + text);

        System.out.println(text + number1 + number2);

        System.out.println(text + (number1 + number2));*/


        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy számot!");
        int useNumber1 = scanner.nextInt();

        System.out.println("Adj meg még egy számot");
        int useNumber2 = scanner.nextInt();

        int eredmeny1 = useNumber1 + useNumber2;
        int eredmeny2 = useNumber1 - useNumber2;
        int eredmeny3 = useNumber1 * useNumber2;
        int eredmeny4 = useNumber1 / useNumber2;

        System.out.println("A két szám összege " + eredmeny1);
        System.out.println("A két szám kivonása " + eredmeny2);
        System.out.println("A két szám szorzása " + eredmeny3);
        System.out.println("A két szám osztása " + eredmeny4);






    }
}
