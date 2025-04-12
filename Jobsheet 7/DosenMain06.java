import java.util.Scanner;
public class DosenMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen06 list = new DataDosen06();

        Dosen06 d1 = new Dosen06 ("111", "Ahmad", true, 33);
        Dosen06 d2 = new Dosen06 ("222", "Budi", true, 40);
        Dosen06 d3 = new Dosen06 ("333", "Salsa", false, 28);
        Dosen06 d4 = new Dosen06 ("444", "Alwi", true, 35);

        list.tambah(d1);
        list.tambah(d2);
        list.tambah(d3);
        list.tambah(d4);

        System.out.println("=====================================");
        System.out.println("Data Dosen");
        System.out.println("=====================================");
        list.SortingASC();
        list.tampil();

        System.out.println("Pencarian Data Dosen");
        System.out.println("=====================================");
        System.out.print("Masukkan Nama Dosen: ");
        String nama = sc.nextLine();
        int pos = list.sequentialSearchNama(nama);
        list.tampilPosisi(nama, pos);
        list.tampilDataSearch(nama, pos);
        list.cekHasilGanda(nama);

        System.out.println("=====================================");
        System.out.println("Masukkan usia dosen yang dicari: ");
        int usia = sc.nextInt();
        int posUsia = list.binarySearchUsia(usia, 0, list.idx - 1);
        if (posUsia != -1) {
            System.out.println("Dosen dengan usia " + usia + " ditemukan pada index " + posUsia);
            list.tampilDataSearch(list.dataDosen06[posUsia].nama, posUsia);
        } else {
            System.out.println("Data dengan usia " + usia + " tidak ditemukan");
        }
        System.out.println("=====================================");
    }
}   


        
        