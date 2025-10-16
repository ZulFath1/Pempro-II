package MODUL3.PRAK302_MUHAMMADDZULFATHIAHYAN_2410817210011;

import java.util.Scanner;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
    		System.out.println("Masukkan");
        Scanner scanner = new Scanner(System.in);
        
        LinkedList<negara> daftarNegara = new LinkedList<>();
        
        int jumlahNegara = scanner.nextInt();
        scanner.nextLine();
        
        for (int i = 0; i < jumlahNegara; i++) {	
            String nama = scanner.nextLine();
            String jenisKepemimpinan = scanner.nextLine();
            String namaPemimpin = scanner.nextLine();
            
            if (jenisKepemimpinan.equalsIgnoreCase("monarki")) {
                daftarNegara.add(new negara(nama, jenisKepemimpinan, namaPemimpin));
            } else {
                int tanggal = scanner.nextInt();
                int bulan = scanner.nextInt();
                int tahun = scanner.nextInt();
                scanner.nextLine();
                daftarNegara.add(new negara(nama, jenisKepemimpinan, namaPemimpin, tanggal, bulan, tahun));
            }
        }

        for (negara Negara : daftarNegara) {
            String pemimpinTitle;
            switch (Negara.getJenisKepemimpinan().toLowerCase()) {
                case "monarki":
                    pemimpinTitle = "Raja";
                    break;
                case "presiden":
                    pemimpinTitle = "Presiden";
                    break;
                case "perdana menteri":
                    pemimpinTitle = "Perdana Menteri";
                    break;
                default:
                    pemimpinTitle = Negara.getJenisKepemimpinan();
                    break;
            }
            System.out.println("Negara " + Negara.getNama() + " mempunyai " + pemimpinTitle + " bernama " + Negara.getNamaPemimpin());
            
            if (!Negara.getJenisKepemimpinan().equalsIgnoreCase("monarki")) {
                String namaBulan = Negara.getNamaBulan(); 
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + Negara.getTanggalKemerdekaan() + " " + namaBulan + " " + Negara.getTahunKemerdekaan() );
            }
            System.out.println();
        }
        scanner.close();
    }
}