package hu.progmatic;

import java.util.Scanner;

public class lesson_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*System.out.println("Nappali tagozatos vagy-e? (i / n)");
        String nappali = scanner.nextLine();

        System.out.println("Heti hány órás munkaviszonyod van?");
        int munkaviszony = scanner.nextInt();

        scanner.nextLine();

        System.out.println(("szeretnéd támogatni az államot (i / n)?"));
        String bokezu = scanner.nextLine();

        System.out.println("Mennyi volt a havi bevételed?");
        int bevetel = scanner.nextInt();
        int netto = bevetel;

       // boolean foallasu =

        /*if (nappali.equalsIgnoreCase("i") || munkaviszony >= 36) {
            netto = bevetel -25;
        } else if(!bokezu.equalsIgnoreCase("i")){
            netto = bevetel -50;
        } else {
           netto = -75;
        }

        System.out.println("A bevétel: " + bevetel);
        System.out.println("A nettó Jövedelem: " + netto);

        if (!nappali.equalsIgnoreCase("i") && munkaviszony < 36 && bokezu.equalsIgnoreCase("i")) {
            netto = bevetel -75;
        } else if(!nappali.equalsIgnoreCase("i") && munkaviszony < 36) {
            netto = bevetel - 50;
        } else {
            netto = -25;
        }

        System.out.println("A bevétel: " + bevetel);
        System.out.println("A nettó Jövedelem: " + netto);*/


        /*if (!nappali.equalsIgnoreCase("i") && munkaviszony < 36) {
            System.out.println("Főállású");
        } else {
            System.out.println("Mellékákkású");
            }*/


        /*boolean foallasu = nappali.equalsIgnoreCase("i") && munkaviszony >= 36 ;
        if (foallasu && bokezu.equalsIgnoreCase("i")) {
            netto = bevetel - 25;
        }else if(foallasu) {
            netto = bevetel -50;
        } else {
            netto = -75;
        }

        System.out.println("A bevétel: " + bevetel);
        System.out.println("A nettó jövedelem: " + netto);*/

        //

        /*System.out.println("Nappali tagozatos vagy (i / n)?");
        boolean nappali = scanner.nextLine().equalsIgnoreCase("i");
        System.out.println("Heti hány órás munkaviszonyod van?");
        int munkaviszony = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Szereted támogatni az államot (i / n)?");
        boolean bokezu = scanner.nextLine().equalsIgnoreCase("i");
        System.out.println("Mennyi volt a havi bevételed?");
        int bevetel = scanner.nextInt();
        scanner.nextLine();
        int netto = bevetel;
        // boolean foallasu = true; // igaz
        // boolean foallasu = false; // hamis
        boolean foallasu = !nappali && munkaviszony < 36;
        if (foallasu && bokezu) {
            netto = bevetel - 75;
        } else if (foallasu) {
            netto = bevetel - 50;
        } else {
            netto = bevetel - 25;
        }
        System.out.println("A bevétel: " + bevetel);
        System.out.println("A nettó jövedelem: " + netto);*/

        //

        System.out.println("Van angol nyelvvizsvág? (i / n)");
        String nyelv = scanner.nextLine();

        System.out.println("Elmultál már 18 éves? (i / n) ");
        String korhatar = scanner.nextLine();
        System.out.println("Hány éves munkatapasztalatod van?");
        int tapasztalat = scanner.nextInt();
        scanner.nextLine();

        if (nyelv.equalsIgnoreCase("i") && korhatar.equalsIgnoreCase("i")) {
            System.out.println("Gratulálunk, jelentkezhetsz hozzánk!");
        } else {
            System.out.println("Sajnálom, nem tudsz jelentkezni hozzánk!");
        }
        if (nyelv.equalsIgnoreCase("i") && tapasztalat <= 2) {
            System.out.println("Önt 400 ezer forinttal tudjuk alkalmazni!");
        } else if (nyelv.equalsIgnoreCase("i") && tapasztalat <= 5 ) {
            System.out.println("Önt 650 ezer forinttal tudjuk alkalmazni!");
        } else if (nyelv.equalsIgnoreCase("i") && tapasztalat > 5 ) {
            System.out.println("Önt 950 ezer forinttal tudjuk alkalmazni!");
        }

        System.out.println("Megfelel ez önnek ( i / n) ?");
        String eleg = scanner.nextLine();

        if (eleg.equalsIgnoreCase("n")) {
                System.out.println("Milyen összeg lenne a megfelelő önnek?");
                int osszeg = scanner.nextInt();
                scanner.nextLine();
                if (osszeg > 1200){
                    System.out.println("Ezt a kérését nem tudjuk teljesíteni! Sajnáljuk!");
                } else {
                    System.out.println("Rendben van, megeggyeztünk! Gratulálunk, ön a mától a vállalatunk részét képezi!");
                }
                }else {
            System.out.println("Rendben, köszöntjük a vállalatnál!");
        }
















    }
}