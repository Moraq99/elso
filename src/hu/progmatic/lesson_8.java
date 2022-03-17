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

/*Leírás
Adott egy egész szám.
Írj programkódot, amely összeadja a szám számjegyeit!
Ellenőrző adatok
int number = 1;
számjegyek összege: 1
int number = 2;
számjegyek összege: 2
int number = -1;
számjegyek összege: 1
int number = 12;
számjegyek összege: 3
int number = -5483229;
számjegyek összege: 33*/

    /*int szam, szamjegy, osszeg = 0;
        System.out.println("Adj egy számot, összeadom a számjegyeit!");
        szam = sc.nextInt();
        sc.nextLine();

        while(szam > 0) {
            szamjegy = szam%10;
            osszeg = osszeg + szamjegy;
            szam = szam/10;

        }
        System.out.println("A számjegyek összege: " + osszeg);
       */

        /*Leírás
        Adott egy szöveg, amely egy hónapot jelöl.
         Írj programkódot, amely megmondja, hogy ez a hónap mely évszakhoz tartozik, és az évszak nevét kiírja a képernyőre.
        téli hónapok: december, január, február
        tavaszi hónapok: március, április, május
        nyári hónapok: június, július, augusztus
        őszi hónapok: szeptember, október, november
        minden más esetben azt írja ki, hogy "nem meghatározható"
        Ellenőrző adatok
        String month = "február";
        elvárt kiírás: tél
        String month = "április";
        elvárt kiírás: tavasz
        String month = "június";
        elvárt kiírás: nyár
        String month = "november";
        elvárt kiírás: ősz
        String month = "kiscica";
        elvárt kiírás: nem meghatározható*/


        /*System.out.println("Kérem a hónapot!");
        String honap = sc.nextLine();

        if (honap.equalsIgnoreCase("január") || (honap.equalsIgnoreCase("február")
                || (honap.equalsIgnoreCase("december")))) {
            System.out.println("A megadott " + honap + " hónap TÉLRE esik!");

        } else if (honap.equalsIgnoreCase("március") || (honap.equalsIgnoreCase("április")
                || (honap.equalsIgnoreCase("május")))) {
            System.out.println("A megadott " + honap + " hónap TAVASZRA esik!");

        } else if (honap.equalsIgnoreCase("június") || (honap.equalsIgnoreCase("július")
                || (honap.equalsIgnoreCase("augusztus")))) {
            System.out.println("A megadott " + honap + " hónap NYÁRRA esik!");

        } else if (honap.equalsIgnoreCase("szeptember") || (honap.equalsIgnoreCase("október")
                || (honap.equalsIgnoreCase("november")))) {
            System.out.println("A megadott " + honap + " hónap TÉLRE esik!");
        } else {
            System.out.println("A megadott  " + honap + " nem meghatározható!");
        }*/
    }
}



