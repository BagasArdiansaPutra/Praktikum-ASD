import java.util.Scanner;
public class MahasiswaDemo06 {   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi06 list = new MahasiswaBerprestasi06(jmlMhs);
        for(int i = 0; i < jmlMhs; i++) {
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
        System.out.println("Data Mahasiswa sebelum disorting: ");
        list.tampil();

        System.out.println("Data mahasiswa setelah disorting berdasar IPK (DESC) :  ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut dengan SELECTION SORT (ASC) : ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut dengan INSERTION SORT (DESC) : ");
        list.insertionSort();
        list.tampil();
        }
    }
}