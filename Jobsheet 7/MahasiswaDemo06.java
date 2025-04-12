import java.util.Scanner;
public class MahasiswaDemo06 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06(jumlahMhs);
        for(int i = 0; i < jumlahMhs; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-"+ (i+1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
  
            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK : ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            
            list.tambah(new Mahasiswa06(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("---------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang ingin dicari : ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan sequential searching ");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("---------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("---------------------------------------");
        System.out.println("Masukkan IPK Mahasiswa yang ingin dicari : ");
        System.out.print("IPK : ");
        cari = sc.nextDouble();
        System.out.println("menggunakan Binary Search ");
        double posisi2 = list.findBinarySearch(cari, 0, jumlahMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        }
    }