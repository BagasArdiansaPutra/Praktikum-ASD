import java.util.Scanner;
public class Fungsi {
    
    static int[][] stokBunga = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}    
    };
       
    static int[] hrgBunga = {75000, 50000, 60000, 10000}; 
       
    static void tampilPendapatan() {
        System.out.println("Pendapatan Setiap Cabang jika semua bunga terjual : ");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatan += stokBunga[i][j] * hrgBunga[j];
            }
            System.out.println("Cabang " + (i + 1) + ": Rp " + pendapatan);
        }
    }
    
    static void tampilStokBunga() {
        System.out.println("Stok Bunga Semua Cabang:");
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        
        for (int j = 0; j < hrgBunga.length; j++) {
            int totalStok = 0;
            for (int i = 0; i < stokBunga.length; i++) {
                totalStok += stokBunga[i][j];
            }
            System.out.println(jenisBunga[j] + ": " + totalStok + " bunga");
        }
    }

    public static void kurangiStok(int[] bungaMati) {
        System.out.println("Stock dikurangi karena bunga mati:");
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.print("RoyalGarden " + (i + 1) + ": ");
            for (int j = 0; j < stokBunga[i].length; j++) {
                
                stokBunga[i][j] += bungaMati[j]; 
                if (stokBunga[i][j] < 0) {
                    stokBunga[i][j] = 0;  
                }
                System.out.print(jenisBunga[j] + "=" + stokBunga[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do{ 

            System.out.println(" ========== Menu Royal Garden ========== ");
            System.out.println("1. Tampilkan Pendapatan");
            System.out.println("2. Tampilkan Stok Bunga");
            System.out.println("3. Kurangi Stok Bunga");
            System.out.println("4. Keluar");
            System.out.print("Pilihan : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    tampilPendapatan();
                    break;
                case 2:
                    tampilStokBunga();
                    break;
                case 3:
                    int[] bungaMati = {-1, -2, 0, -5};  
                    kurangiStok( bungaMati);
                    break;
                case 4:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 4);
    }
}