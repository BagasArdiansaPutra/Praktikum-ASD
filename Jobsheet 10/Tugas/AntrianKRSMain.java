import java.util.Scanner;
public class AntrianKRSMain {
    public static void main(String[] args) {
        
        AntrianKRS ant = new AntrianKRS();
        Scanner sc = new Scanner (System.in);
        int pilih ;

        do {
            System.out.println("\n=== UPDATE KRS ===");
            System.out.println("1. Menambahkan Antrian ");
            System.out.println("2. Layani Antrian ");
            System.out.println("3. Lihat Antrian Terdepan ");
            System.out.println("4. Lihat Antrian Terakhir ");
            System.out.println("5. Lihat semua Antrian ");
            System.out.println("6. Jumlah Antrian ");
            System.out.println("7. Jumlah yang belum diproses  ");
            System.out.println("0. keluar ");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            System.out.println("===========================");
            sc.nextLine();
            
            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    ant.tambahAntrian(mhs);
                    break;
                
                case 2:
                    ant.prosesKRS();    
                    break;
                
                case 3:
                    ant.tampilkanDuaTerdepan();
                    break;
                
                case 4:
                    ant.lihatAkhir();
                    break;
                
                case 5:
                    ant.tampilkanSemua();
                    break;

                case 6:
                    ant.getJumlahAntrian();
                    break;

                case 7:
                    ant.getBelumKRS();
                    break;

                case 0:
                    System.out.println("Terima kasih :)");
                    break;
                default:
                    System.out.println("Pilihan tidak valid mohon pilih sesuai yang ada di Menu !!!");
                    break;
            }
        } while (pilih != 0);
    }
}