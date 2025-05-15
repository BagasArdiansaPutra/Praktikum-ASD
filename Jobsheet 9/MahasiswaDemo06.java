import java.util.Scanner;
public class MahasiswaDemo06 {
    public static void main(String[] args) {
        StackTugasMahasiswa06 stack = new StackTugasMahasiswa06(5);
        Scanner sc = new Scanner(System.in);
        int pilih ;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas ");
            System.out.println("5. Lihat Tugas terbawah");
            System.out.println("6. Jumlah Tugas dikumpulkan");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
        
            switch (pilih) {
                case 1:
                    sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa06 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari" + dinilai.nama);
                        System.out.print("Masukkan nilai dari (0 - 100) :");
                        int nilai = sc.nextInt();
                        sc.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n " ,dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;

                case 3:
                    Mahasiswa06 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println(" Tugas terakhir  dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tkelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa06 TugasTerbawah = stack.TugasTerbawah();
                    if (TugasTerbawah != null) {
                        System.out.println("Tugas Terbawah adalah " + TugasTerbawah.nama);
                    }
                    break;
                case 6:
                    int jml = stack.JmlTugas();
                    System.out.println("Jumlah Tugas dikumpulkan " + jml);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!!");
            }
            
        } while (pilih >= 1 && pilih <=4);
    }
}