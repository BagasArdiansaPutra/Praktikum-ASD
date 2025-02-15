import java.util.Scanner;

public class JadwalKuliah {

    static void tampilkanSeluruhJadwal(String[] namaMataKuliah, int[] SKS, int[] semester, String[] hariKuliah) {
        System.out.println("===== Seluruh Jadwal Kuliah =====");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            System.out.println("Mata Kuliah: " + namaMataKuliah[i]);
            System.out.println("SKS: " + SKS[i]);
            System.out.println("Semester: " + semester[i]);
            System.out.println("Hari: " + hariKuliah[i]);
            System.out.println("-------------------------------");
        }
    }

    static void tampilkanJadwalBerdasarkanHari(String[] namaMataKuliah, int[] SKS, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("===== Jadwal Kuliah Hari " + hari + " =====");
        boolean found = false;
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println("Mata Kuliah: " + namaMataKuliah[i]);
                System.out.println("SKS: " + SKS[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("-------------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada kuliah pada hari " + hari + ".");
        }
    }

    static void tampilkanJadwalBerdasarkanSemester(String[] namaMataKuliah, int[] SKS, int[] semester, String[] hariKuliah, int semesterKe) {
        System.out.println("===== Jadwal Kuliah Semester " + semesterKe + " =====");
        boolean found = false;
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (semester[i] == semesterKe) {
                System.out.println("Mata Kuliah: " + namaMataKuliah[i]);
                System.out.println("SKS: " + SKS[i]);
                System.out.println("Hari: " + hariKuliah[i]);
                System.out.println("-------------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada kuliah pada semester " + semesterKe + ".");
        }
    }

    static void cariMataKuliah(String[] namaMataKuliah, int[] SKS, int[] semester, String[] hariKuliah, String nama) {
        System.out.println("===== Mencari Mata Kuliah: " + nama + " =====");
        boolean found = false;
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (namaMataKuliah[i].equalsIgnoreCase(nama)) {
                System.out.println("Mata Kuliah: " + namaMataKuliah[i]);
                System.out.println("SKS: " + SKS[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari: " + hariKuliah[i]);
                System.out.println("-------------------------------");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah " + nama + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] namaMataKuliah = new String[n];
        int[] SKS = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = sc.nextLine();
            System.out.print("SKS: ");
            SKS[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = sc.nextLine();
        }

        int pilihan;
        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Tampilkan Seluruh Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Kuliah Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Kuliah Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();  

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMataKuliah, SKS, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMataKuliah, SKS, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int semesterKe = sc.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMataKuliah, SKS, semester, hariKuliah, semesterKe);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String namaMataKuliahCari = sc.nextLine();
                    cariMataKuliah(namaMataKuliah, SKS, semester, hariKuliah, namaMataKuliahCari);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        sc.close();
    }
}
