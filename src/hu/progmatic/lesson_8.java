package hu.progmatic;

import java.util.Scanner;

public class lesson_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //.1 feladat szökőév

        //1582-ben vezették be (tehát azelőtti év biztosan nem szökőév)
        //azon évek szökőévek, amelyek oszthatóak 4-gyel
        //de a 100-zal osztható évek közül csak azok szökőévek, amelyek 400-zal is oszthatóak
        //int evszam = 1582;
        System.out.println("Hello, adj egy évszámot, megmondom szökőév-e!");
        int evszam = scanner.nextInt();
        scanner.nextLine();

        boolean nemszokoev = ((evszam % 4 !=0) && (evszam < 1582));
        boolean szokoev = evszam % 4 ==0 && evszam > 1582;

        if(szokoev){
            System.out.println("A(z) " + evszam + " -es év szökőév!");
        } else if  (evszam % 400 == 0 ) {
            System.out.println("A(z) " + evszam + " -es év szökőév!");
        } else {
            System.out.println("A(z)  " + evszam + "  -es év NEM szökőév!");
        }











    }
}
