import java.util.Scanner;

public class PlatMobil {

    public static void main(String[] args) {
        
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        String[][] KOTA = {
            {"Banten"},
            {"Jakarta"},
            {"Bandung"},
            {"Cirebon"},
            {"Bogor"},
            {"Pekalongan"},
            {"Semarang"},
            {"Surabaya"},
            {"Malang"},
            {"Tegal"}
        };
        
        Scanner sc = new Scanner(System.in);
        
        boolean found = false;
        
        while (!found) {
            System.out.print("Masukkan kode plat mobil : ");
            char inputKode = sc.next().charAt(0);
            
            for (int i = 0; i < KODE.length; i++) {
                if (KODE[i] == inputKode) {
                    System.out.println("Kode plat " + inputKode + " sebagai berikut:");
                    for (String kota : KOTA[i]) {
                        System.out.println(kota);
                    }
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                System.out.println("Kode plat mobil yang Anda masukkan tidak valid. Coba lagi.");
            }
        }
    }
}
