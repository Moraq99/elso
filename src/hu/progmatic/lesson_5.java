package hu.progmatic;

import java.util.Scanner;

public class lesson_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Kérem a szöveg hosszát!");
        int hossz = scanner.nextInt();
        scanner.nextLine();
        String szoveg = "";

        System.out.println(szoveg.length());
        System.out.println("abc".length());
        System.out.println("alma".length());
        System.out.println("alma".length() + 1);

        while (szoveg.length() < hossz) {
            System.out.println("Kérem a következő darabot!");
            String darab = scanner.nextLine();
            szoveg += darab;
        }

        System.out.println("A megadott szöveg: " + szoveg);*/

        /*String szoveg = "";
        String darab;

        do {
            System.out.println("Kérem a következő darabot!");
            darab = scanner.nextLine();
            szoveg += darab;

        } while (darab.length() > 0);

        System.out.println("A megadott szöveg: " + szoveg);*/

        /*System.out.println("Kérem a stop-loss értéket!");
        int stopLoss = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem az induló árfolyamot!");
        int arfolyam = scanner.nextInt();
        scanner.nextLine();

        int napokSzama = 0;

        while (arfolyam > stopLoss) {
            System.out.println("Kérem a napi változást!");
            int valtozas = scanner.nextInt();
            arfolyam += valtozas;
            napokSzama++;


        }
        System.out.println("A részvény elérte a stop-loss értéket!");
        System.out.println("El kell adni a részvényeket!");
        System.out.println("Az utolsó árfolyam: " + arfolyam);
        System.out.println("Az eltelt napok száma: " + napokSzama);*/

        /*System.out.println("Kérem a takeProfit értéket!");
        int takeProfit = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Kérem az induló árfolyamot!");
        int arfolyam = scanner.nextInt();
        scanner.nextLine();

        int napokSzama = 0;

        while (arfolyam < takeProfit) {
            System.out.println("Kérem a napi változást!");
            int valtozas = scanner.nextInt();
            arfolyam += valtozas;
            napokSzama++;


        }
        System.out.println("A részvény elérte a takeProfit értéket!");
        System.out.println("El kell adni a részvényeket!");
        System.out.println("Az utolsó árfolyam: " + arfolyam);
        System.out.println("Az eltelt napok száma: " + napokSzama);*/

        /*System.out.println("Kérem az induló árfolyamot!");
        int arfolyam = scanner.nextInt();
        scanner.nextLine();

        int napokSzama = 0;
        int valtozas;

        do{
            System.out.println("Kérem a napi változást!");
            valtozas = scanner.nextInt();
            arfolyam += valtozas;
            napokSzama++;
        } while (valtozas <= 0);

        System.out.println("Az utolsó árfolyam: " + arfolyam);
        System.out.println("Az eltelt napok száma: " + napokSzama);*/

        /*System.out.println("Kérem az induló árfolyamot!");
        int arfolyam = scanner.nextInt();
        scanner.nextLine();

        int napokSzama = 0;
        int valtozas;

        do{
            System.out.println("Kérem a napi változást!");
            valtozas = scanner.nextInt();
            arfolyam += valtozas;
            napokSzama++;
        } while (valtozas >= 0);

        System.out.println("Az utolsó árfolyam: " + arfolyam);
        System.out.println("Az eltelt napok száma: " + napokSzama);*/




        /*String jelszo;

        do {
            System.out.println("Adjon meg egy jelszót!");
            jelszo = scanner.nextLine();

            if (jelszo.length() < 8) {
                System.out.println("A jelszónak legalább 8 karakternek kell lennie!");
            }
        } while (jelszo.length() < 8);

        System.out.println("Az érvényes jelszó: " + jelszo);*/

        /*int iranyitoszam;

        do {
            System.out.println("Kérem az irányítószámot!");
            iranyitoszam = scanner.nextInt();
            scanner.nextLine();

            if (iranyitoszam < 1000 || iranyitoszam > 9999 ){
                System.out.println("Az irányítószámnak 1000 és 9999 között kell lennie!");
            }

        }while (iranyitoszam < 1000 || iranyitoszam > 9999 );

        System.out.println("Az irányítószám: " + iranyitoszam);
        System.out.println("Érvényes irányítószám!");*/

        /*System.out.println("Kérek egy számot!");
        int szam = scanner.nextInt();
        scanner.nextLine();

        int abszolut = szam >= 0 ? szam : -szam;

        System.out.println("A szám abszolút értéke: " + abszolut);
        System.out.println("Szám abszolút értéke: " + Math.abs(szam));*/

        System.out.println("Kérem egy számot!");
        int szam1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Kérek egy másik számot!");
        int szam2 = scanner.nextInt();
        scanner.nextLine();

        int kulonbseg = szam1 - szam2;
        int abszolut = kulonbseg >= 0 ? kulonbseg : -kulonbseg;

        System.out.println("A két szám különbségének abszolút értéke: " + abszolut);



    }
}
