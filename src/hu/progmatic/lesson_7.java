package hu.progmatic;

import java.util.Scanner;

public class lesson_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        /*double[] homersekletek = {34.3,22.1,24.1,23.30,21,23.4,23,22.3,24,32.4};
        // i = 0
        /*int i = 0;
        System.out.println("Kérem az " + (i + 1) + ". nap hőmérsékletét!");
        homersekletek[0] = scanner.nextDouble();
        scanner.nextLine();
        i++;
        // i = 1
        System.out.println("Kérem a " + (i + 1) +  ". nap hőmérsékletét!");
        homersekletek[1] = scanner.nextDouble();
        scanner.nextLine();
        i++;
        // i = 2
        System.out.println("Kérem a " + (i + 1) + ". nap hőmérsékletét!");
        homersekletek[2] = scanner.nextDouble();
        scanner.nextLine();
        i++;*/

        /*for (int i = 0; i < homersekletek.length; i++) {
            System.out.println("Kérem a(z) " + (i + 1) + ". nap hőmérsékletét.");
            homersekletek[i] = scanner.nextDouble();
            scanner.nextLine();

        }

        System.out.println("Kérek az első napot!");
        int elso = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a kirándulás hosszát  napokban!");
        int hossz = scanner.nextInt();
        scanner.nextLine();

        double elsonap =homersekletek[elso - 1];
        double utolsonap =homersekletek[elso + hossz - 2];
        double valtozas = utolsonap - elsonap;

        System.out.println("Az első napon mért hőmérdséklet: " + homersekletek[elso - 1]);
        System.out.println("Az utolsó nap hőmérséklete: " + homersekletek[elso + hossz - 2]);

        if ( hossz < 1) {
            System.out.println("Az átlagos változás naponta: " + valtozas / (hossz -1));
        }*/

        /*double[] homersekletek = {34.3,22.1,24.1,23.30,21,23.4,23,22.3,24,32.4};

        System.out.println("Kérek az első napot!");
        int elso = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérem a kirándulás hosszát  napokban!");
        int hossz = scanner.nextInt();
        scanner.nextLine();

        //elso = 2;
        //utolsó = 3;
        /*int i = 1; // elso = - 1;
        homersekletek[i] = 0.0;
        i++;
        homersekletek[i] = 0.0;
        i++;
        homersekletek[i] = 0.0;
        i++;*/

        //i = 4

        /*System.out.println("Első hány szám összegét adjam meg?");
        int darab = scanner.nextInt();
        scanner.nextLine();
        int osszeg = 0;

        for (int i = 0; i < darab; i++) {
            osszeg += (i + 1);
        }

        System.out.println("A számok összege: " + osszeg);*/

        System.out.println("Hány nap adatát szeretnéd tárolni?");
        int napok = scanner.nextInt();
        scanner.nextLine();
        int[] homersekletek = new int[napok];

        for (int i = 0; i < homersekletek.length; i++) {
            System.out.println("Kérem a(z) " + (i + 1) + ". nap értékét!");
            homersekletek[i] = scanner.nextInt();
            scanner.nextLine();

        }

        System.out.println("Vége.");



    }
}
