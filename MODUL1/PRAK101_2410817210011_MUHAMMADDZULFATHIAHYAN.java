package MODUL1;
import java.util.Locale;
import java.util.Scanner;
public class PRAK101_2410817210011_MUHAMMADDZULFATHIAHYAN {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = scan.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scan.nextLine();

        int tanggalLahir;
        int bulanLahir;
        int tahunLahir;
        int tinggiBadan;
        double beratBadan;

        do {
            System.out.print("Masukkan Tanggal Lahir: ");
            tanggalLahir = scan.nextInt();
            if (tanggalLahir <= 0) {
                System.out.println("Input tidak valid. Masukkan angka positif.");
            }
        } while (tanggalLahir <= 0);

        do {
            System.out.print("Masukkan Bulan Lahir: ");
            bulanLahir = scan.nextInt();
            if (bulanLahir < 1 || bulanLahir > 12) {
                System.out.println("Input tidak valid. Masukkan bulan antara 1-12.");
            }
        } while (bulanLahir < 1 || bulanLahir > 12);

        do {
            System.out.print("Masukkan Tahun Lahir: ");
            tahunLahir = scan.nextInt();
            if (tahunLahir <= 0) {
                System.out.println("Input tidak valid. Masukkan angka positif.");
            }
        } while (tahunLahir <= 0);

        do {
            System.out.print("Masukkan Tinggi Badan: ");
            tinggiBadan = scan.nextInt();
            if (tinggiBadan <= 0) {
                System.out.println("Input tidak valid. Masukkan angka positif.");
            }
        } while (tinggiBadan <= 0);

        do {
            System.out.print("Masukkan Berat Badan: ");
            beratBadan = scan.nextDouble();
            if (beratBadan <= 0) {
                System.out.println("Input tidak valid. Masukkan angka positif.");
            }
        } while (beratBadan <= 0);

        scan.close();

        String[] namaBulan = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                              "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.println("Nama Lengkap " + namaLengkap + ", Lahir di " + tempatLahir + " pada Tanggal " + tanggalLahir
                + " " + namaBulan[bulanLahir] + " " + tahunLahir);
        System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
    }
}