package hu.progmatic;

import java.util.Scanner;

public class lesson_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //.1 feladat szökőév

        //1582-ben vezették be (tehát azelőtti év biztosan nem szökőév)
        //azon évek szökőévek, amelyek oszthatóak 4-gyel
        //de a 100-zal osztható évek közül csak azok szökőévek, amelyek 400-zal is oszthatóak
        //int evszam = 1582;
        /*System.out.println("Hello, adj egy évszámot, megmondom szökőév-e!");
        int evszam = sc.nextInt();
        sc.nextLine();

        //boolean nemszokoev = ((evszam % 4 !=0) && (evszam < 1582));
        boolean szokoev = evszam % 4 ==0 && evszam > 1582;

        if(szokoev && evszam % 100 != 0){
            System.out.println("A(z) " + evszam + " -es év szökőév!");
        } else if  (evszam % 400 == 0 && evszam % 100 == 0) {
            System.out.println("A(z) " + evszam + " -es év szökőév!");
        } else {
            System.out.println("A(z)  " + evszam + "  -es év NEM szökőév!");
        }*/

        /*System.out.println("Kérem a számot és én megmondom, hogy prím szám-e!");
        int szam = sc.nextInt();
        sc.nextLine();



        int i =2;
        boolean prim = false;
        //for (int i = 2; i <= szam/2;)
        while ( i <= szam / 2) {
            if (szam % i == 0) {
                prim = true;
                break;
                //System.out.println("Nem Prím szám a " + szam + "!");
            }
            ++i;
        }
            if (!prim) {
                //} else if (){
                //System.out.println("Nem Prím szám!");
                System.out.println("A " + szam + " Prím szám!");
            } else {
                System.out.println("Nem Prím szám a " + szam + "!");
            }*/

        /*System.out.println("Kérem a számot!");
        int szam = sc.nextInt();
        sc.nextLine();
        int db = szam;
        int n = 0;
        int[] osztok = new int[n];
        for (int i = 1; i <=db;i++)
            if (db % i == 0) {
                System.out.println("A szám osztója " + i);
                n++;
            }
        System.out.println("a szám osztóinak száma: " + n);
        System.out.println();*/

       /* System.out.println("Kérem a színt!");
        String light = sc.nextLine();

        if (light.equalsIgnoreCase("zöld")) {
            System.out.println("SZABAD");
        } else if (light.equalsIgnoreCase("SÁRGA")) {
            System.out.println("Lassíts!");
        } else if (light.equalsIgnoreCase("piros")) {
            System.out.println("MEGÁLLJ!");

        } else {
            System.out.println("NEM TUDOM!");
        }*/
        /*Elem csere
★★
Leírás
Adott egy karaktereket tartalmazó tömb.
Írj programkódot, amely felcseréli a tömb legelső és legutolsó elemét!
Ügyelj arra, hogy a tömb akár üres is lehet! (Üres tömb elemeit nem tudod felcserélni.)
Ellenőrző adatok
char[] chars = new char[0];
elvárt eredmény: {}
char[] chars = {'a'};
elvárt eredmény: {'a'}
char[] chars = {'a', 'A'};
elvárt eredmény: {'A', 'a'}
char[] chars = {'a', 'A', 'b'};
elvárt eredmény: {'b', 'A', 'a'}
char[] chars = {'+', '-', '*', '/', '%'};
elvárt eredmény: {'%', '-', '*', '/', '+'}*/

/*char[] chars = {'a', 'b', 'c', 'A', 'B', 'C', '+', '!'};
        int i;
        //switch (chars);
        chars[1] = chars[7];


        System.out.println(chars[1]);*/


    }
}



