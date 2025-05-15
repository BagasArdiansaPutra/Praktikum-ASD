import java.util.Scanner;

public class SuratMain06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat06 stackSurat = new StackSurat06();
        
        while (true) {
            System.out.println("\n===== Surat Izin Mahasiswa =====");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");            
            int pilihan = sc.nextInt();
            sc.nextLine(); 
            
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Surat Izin ");
                    System.out.print("ID Surat: ");
                    String idSurat = sc.nextLine();
                    
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    
                    System.out.print("Jenis Izin (S untuk Sakit, I untuk Izin lain): ");
                    char jenis = sc.nextLine().charAt(0);
                    
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine(); 
                    
                    Surat06 surat = new Surat06(idSurat, nama, kelas, jenis, durasi);
                    stackSurat.tambahSurat(surat);
                    break;
                    
                case 2:
                    System.out.println("\n Proses Surat Izin ");
                    stackSurat.prosesSurat();
                    break;
                    
                case 3:
                    System.out.println("\n Surat Izin Terakhir ");
                    stackSurat.suratTerakhir();
                    break;
                    
                case 4:
                    System.out.println("\n Cari Surat ");
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = sc.nextLine();
                    stackSurat.cariSurat(cariNama);
                    break;
                    
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        }
    }
}