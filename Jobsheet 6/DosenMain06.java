import java.util.Scanner;
public class DosenMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jml = sc.nextInt();
        sc.nextLine();
        
        DataDosen06 list = new DataDosen06(jml);
        
        for(int i = 0; i < jml; i++) {
            System.out.println("\nMasukkan data dosen ke-"+ (i+1));
            System.out.print("Kode Dosen : ");
            String kode = sc.nextLine();
            
            System.out.print("Nama Dosen : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P) : ");
            boolean jenisKelamin = sc.nextBoolean();

            System.out.print("Usia : ");
            int usia = sc.nextInt();
            sc.nextLine();
            
            list.tambah(new Dosen06(kode, nama, jenisKelamin, usia));
        }
        
        System.out.println("Data dosen sebelum disorting: ");
        list.tampil();

        System.out.println("Data dosen berdasar usia setelah disorting menggunakan BUBBLE SORT (ASC) :  ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data dosen berdasar usia setelah disorting menggunakan SELECTION SORT (DESC) : ");
        list.selectionSort();
        list.tampil();
    }
}