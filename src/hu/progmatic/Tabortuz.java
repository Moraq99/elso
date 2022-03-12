package hu.progmatic;

import java.util.Scanner;

public class Tabortuz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 perc égéshez 10 egység fa kell
        int perc = 0;
        System.out.println("Menyi fát hoztál a tűzre?");
        int tuzifa = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Esik az eső (i / n)?");
        boolean szaraz = !scanner.nextLine().equalsIgnoreCase("i");

        if (tuzifa < 10 || !szaraz){
            System.out.println("Nem volt bográcsozás!  :(");
        }
        while (tuzifa >= 10 && szaraz) {
            System.out.println("A tűz ég!");
            //perc = perc + 1;
            //perc =+ 1;
            perc++;

            tuzifa = tuzifa -10;

        }

        System.out.println("A tűz elaludt!");
        System.out.println("Az eltelt percek száma:  " + perc);
        System.out.println("A maradék tüzifa:  " + tuzifa);


    }
}
