import java.util.Scanner;
public class MataKuliahDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah06[] arrayofMataKuliah = new Matakuliah06[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------------");

            arrayofMataKuliah[i] = new Matakuliah06(kode, nama, sks, jumlahJam);
        }
        for (int i=0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i+1));
            System.out.println("Kode       : " + arrayofMataKuliah[i].kode);
            System.out.println("Nama       : " + arrayofMataKuliah[i].nama);
            System.out.println("SKS        : " + arrayofMataKuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayofMataKuliah[i].jumlahJam);
            System.out.println("-------------------------------");
        }
    }

}