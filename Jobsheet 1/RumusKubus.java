import java.util.Scanner;

public class RumusKubus {

    static void hitungVolume(double sisi) {
        double volume = sisi * sisi * sisi; 
        System.out.println("Volume Kubus: " + volume);
    }

    static void hitungLuasPermukaan(double sisi) {
        double luasPermukaan = 6 * sisi * sisi;  
        System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
    }

    static void hitungKeliling(double sisi) {
        double keliling = 12 * sisi;  
        System.out.println("Keliling Kubus: " + keliling);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = sc.nextDouble();

        while (true) {  
            System.out.println("===== Pilihan Menu =====");
            System.out.println("1. Hitung Volume");
            System.out.println("2. Hitung Luas Permukaan");
            System.out.println("3. Hitung Keliling");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    hitungVolume(sisi);
                    break;
                case 2:
                    hitungLuasPermukaan(sisi);
                    break;
                case 3:
                    hitungKeliling(sisi);
                    break;
                case 4:
                    System.out.println("Sudah keluar program:((");
                    sc.close();
                    return;  
                default:
                    System.out.println("Tidak valid di pilihan!!!!");
            }
        }
    }
}
