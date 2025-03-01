import java.util.Scanner;
public class DosenDemo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen06[] arrDosen06 = new Dosen06[3];
        
        for (int i=0; i < 3; i++ ) {
            System.out.println("Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            boolean jenisKelamin = sc.nextBoolean();
            sc.nextLine();
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            arrDosen06[i] = new Dosen06 (kode, nama, jenisKelamin, usia);
        }
        DataDosen06 dataDosen06 = new DataDosen06();
        dataDosen06.dataSemuaDosen(arrDosen06);
        dataDosen06.jmlDosenPerJnsKelamin(arrDosen06);
        dataDosen06.rerataUsiaDosenPerJnsKelamin(arrDosen06);
        dataDosen06.infoDosenPlgTua(arrDosen06);
        dataDosen06.infoDosenPlgMuda(arrDosen06);
        }
    }