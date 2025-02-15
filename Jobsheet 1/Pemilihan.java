import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas, kuis, UTS, UAS;
        
        System.out.print("Masukan nilai tugas : ");
        tugas = sc.nextInt();
        System.out.print("Masukan nilai kuis : ");
        kuis = sc.nextInt();
        System.out.print("Masukan nilai UTS : ");
        UTS = sc.nextInt();
        System.out.print("Masukan nilai UAS : ");
        UAS = sc.nextInt();

        if (tugas < 0 || tugas > 100) {
            System.out.println("Nilai tugas tidak valid");
            return; 
        } else if (kuis < 0 || kuis > 100) {
            System.out.println("Nilai kuis tidak valid");
            return;
        } else if (UTS < 0 || UTS > 100) {
            System.out.println("Nilai UTS tidak valid");
            return;
        } else if (UAS < 0 || UAS > 100) {
            System.out.println("Nilai UAS tidak valid");
            return;
        }

        double rata2 = (tugas * 0.2) + (kuis * 0.2) + (UTS * 0.3) + (UAS * 0.3);
        System.out.println("Hasil rata-rata : " + rata2);

        String nilaiHuruf;
        if (rata2 >=80 && rata2 <= 100) {
            nilaiHuruf = "A";
        }else if (rata2 >= 73) {
            nilaiHuruf = "B+";
        }else if (rata2 >= 65) {
            nilaiHuruf = "B";
        }else if (rata2 >= 57) {
            nilaiHuruf = "C+";
        }else if (rata2 >= 50) {
            nilaiHuruf = "C";
        }else if (rata2 >= 40) {
            nilaiHuruf = "D";
        }else if (rata2 >= 0) {
            nilaiHuruf = "E";
        }else{
            nilaiHuruf = "Nilai tidak valid";
        }
        System.out.println("Nilai Huruf: " + nilaiHuruf);

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || 
        nilaiHuruf.equals("B") || 
        nilaiHuruf.equals("C+") || 
        nilaiHuruf.equals("C")) {
            System.out.println("Anda dinyatakan Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
    }
}
