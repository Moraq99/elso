package hu.progmatic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    /*String nev;
        nev = "Barni";
        String koszones = "szia " + nev + "!";

        System.out.println(koszones);*/
        /*int szuletesiEv = 1999;
        int aktualisEv = 2022;
        int eletkor;

        eletkor = aktualisEv - szuletesiEv;

        System.out.println(eletkor - 1);*/
        /*int a = 5;
        int b = 10;
        int terulet = a * b;

        System.out.println("terület:"  + terulet);*/

        /*int torzstoke = 3000000;
        int toke = torzstoke;

        System.out.println("0. év:" + toke );
        toke = toke + 200000;
        System.out.println("1. év:" + toke);
        toke = toke -100000;
        System.out.println("2. év:" + toke);
        toke = toke +500000;
        System.out.println("3. év:" + toke);*/

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Mi a vezetékneved?");
        String vezeteknev = scanner.nextLine();
        System.out.println("Mi a keresztneved?");
        String keresztnev = scanner.nextLine();
        String nev = vezeteknev + " " + keresztnev;

        System.out.println("Szia " + nev + "!");*/

        System.out.println("Kérem a számot");
        int szam = scanner.nextInt();
        int eredmeny = szam;

        if (szam < 0) {
            eredmeny = szam * -1;
        }

        System.out.println("A szam abszolút értéke: " + eredmeny);
    }


}
