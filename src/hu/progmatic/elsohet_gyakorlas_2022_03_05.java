package hu.progmatic;

import java.io.IOException;
import java.util.Scanner;

public class elsohet_gyakorlas_2022_03_05 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println(System.in.available());
        System.out.println("Kérek egy szöveget!");
        String szoveg = scanner.nextLine();
        System.out.println("A megadott szöveg " + szoveg);
        System.out.println("Kérem a második szöveget!");
        String szoveg2 = scanner.nextLine();
        System.out.println("A második szöveg: " + szoveg2);*/

        //TŐZSDE


        System.out.println("Mennyi a saját tőke?");
        int sajattoke = scanner.nextInt();
        scanner.nextLine();

        int evek = 0;

        if (sajattoke < 3000000) {
            System.out.println("Csóró vagy!!!!");
        }

        while (sajattoke >= 3000000) {
            System.out.println("Mennyi volt a nyereség ?");
            String bemenet = scanner.nextLine();

            if (!bemenet.equalsIgnoreCase("vége")){
                int nyereseg = Integer.parseInt(bemenet);
                sajattoke += nyereseg;

                evek++;
                System.out.println("A saját tőke a(z) " + evek + "év végén: "  +sajattoke);
            } else {
                break;
            }
        }



        System.out.println("A maradék pénzed:  " + sajattoke);








    }
}
