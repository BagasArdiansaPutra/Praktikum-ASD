import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue06 queue = new Queue06();
        int pilihan;

        do {
            System.out.println("\n=== MENU ANTRIAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Lihat Jumlah Antrian");
            System.out.println("6. Lihat Semua Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    Mahasiswa06 mhs = new Mahasiswa06(nama, nim);
                    queue.enqueue(mhs);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.tampilDepan();
                    break;
                case 4:
                    queue.tampilBelakang();
                    break;
                case 5:
                    queue.jumlahAntrian();
                    break;
                case 6:
                    queue.tampilkanSemua();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 8:
                    System.out.println("Terima kasih telah menggunakan layanan.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 8);

        sc.close();
    }
}