package hu.progmatic;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lesson_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Adj meg egy számot!");
        int useNumber1 = scanner.nextInt();

        System.out.println("Adj meg még egy számot");
        int useNumber2 = scanner.nextInt();


        int eredmeny1 = 0;
        if (useNumber1 > 0) {
        };

        if (useNumber2 > 0){

        }
        System.out.println(eredmeny1);*/
        /*System.out.println("Hány éves vagy?");


        int eletkor = scanner.nextInt();

        if (eletkor >= 18) {
            System.out.println("Itt a söre.");
        }
        if (eletkor < 18) {
            System.out.println("Önt sajnos nem tudjuk kiszolgálni");
        }*/


        /*System.out.println("Hány fokos a víz ?");
        int fok = scanner.nextInt();

        if (fok < 0) {
            System.out.println("Szilárd");
        } else if (fok > 100 ) {
            System.out.println("Légnemű");
        } else {
            System.out.println("Folyékony");*/

        /*System.out.println("Hány százalékos lett az érettségid? ");
        int százalék = scanner.nextInt();

        if (százalék < 25){
            System.out.println("Elégtelen");
        }else if (százalék < 40){
            System.out.println("Elégséges");
        } else if (százalék < 60){
            System.out.println("Közepes");
        } else if ( százalék < 80){
            System.out.println("Jó");
        } else {
            System.out.println("Jeles");
        }*/

        /*System.out.println("Kérek egy nevet!");
        String nev = scanner.nextLine();

        if (nev.equalsIgnoreCase("Ria")){
            System.out.println("Oktató");
        } else if (nev.equalsIgnoreCase("Balázs")) {
            System.out.println("Oktató");
        } else  {
            System.out.println("Diák");
        }*/

        /*System.out.println("Kérek egy országot!");
        String orszag = scanner.nextLine();
        switch (orszag) {
            case "Magyarország":
                System.out.println("Magyarország fővárosa Budapest");
                System.out.println("Hajrá Magyarország");
                break;
            case "Szlovákia":
                System.out.println("Szlovákia fővárosa Pozsony");
                break;
            case "Csehország":
                System.out.println("Csehország fővárosa Prága");
            case "Lengyelország":
                System.out.println("Lengyelország fővárosa Varsó");
                break;
            default:
                System.out.println(orszag + "Nem tagja a V4-nek");
                break;*/

        /*System.out.println("Kérem az osztályzatodat!");
        String osztalyzat = scanner.nextLine();
        switch (osztalyzat) {
            case "1":
                System.out.println("Elégtelen");
                System.out.println("Tanulj többet!");
                break;
            case "2":
                System.out.println("Elégséges");
                System.out.println("Tudsz te többet!");
                break;
            case "3":
                System.out.println("Közepes");
                System.out.println("Alakul!");
                break;
            case "4":
                System.out.println("Jó");
                System.out.println("Nem is rossz!");
                break;
            case "5":
                System.out.println("Jeles");
                System.out.println("Ügyes vagy, gratulálok !");
                break;
            default:
                System.out.println("Egytől ötig írjál :D");
                break;*/

        // || -> LOGIKAI VAGY
        // && -> LOGIKAI ÉS

        // De-Morgan azonosság

        System.out.println("Nappali tagozatos vagy-e?");
        String nappali = scanner.nextLine();

        System.out.println("Heti hány órás munkaviszonyod van?");
        int munkaviszony = scanner.nextInt();

        if (nappali.equalsIgnoreCase("i") || munkaviszony >= 36) {
            System.out.println("Mellékákkású");
        } else {
            System.out.println("Főállású");
        }

        /*if (!nappali.equalsIgnoreCase("i") && munkaviszony < 36) {
            System.out.println("Főállású");
        } else {
            System.out.println("Mellékákkású");


        }*/

    }
}





