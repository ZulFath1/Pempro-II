package MODUL1;

import java.util.Scanner;

public class PRAK104_2410817210011_MUHAMMADDZULFATHIAHYAN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String pilihanAbu = scan.nextLine().replace(" ", "");

        System.out.print("Tangan Bagas: ");
        String pilihanBagas = scan.nextLine().replace(" ", "");
        scan.close();

        int skorAbu = 0;
        int skorBagas = 0;

        for (int i = 0; i < 3; i++) {
            char abu = pilihanAbu.charAt(i);
            char bagas = pilihanBagas.charAt(i);

            if (abu == bagas) {
                continue;
            }

            if ((abu == 'B' && bagas == 'G') ||
                (abu == 'G' && bagas == 'K') ||
                (abu == 'K' && bagas == 'B')) {
                skorAbu++;
            } else {
                skorBagas++;
            }
        }

        if (skorAbu > skorBagas) {
            System.out.println("Pemenangnya adalah Abu");
        } else if (skorBagas > skorAbu) {
            System.out.println("Pemenangnya adalah Bagas");
        } else {
            System.out.println("Hasilnya Seri");
        }
    }
}