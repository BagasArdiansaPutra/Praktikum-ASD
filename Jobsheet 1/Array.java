import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mataKuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        double[][] dataNilai = new double[mataKuliah.length][2];
        double totalBobot = 0;

        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i] + ": ");
            dataNilai[i][0] = input.nextDouble();

            if (dataNilai[i][0] >= 90) {
                dataNilai[i][1] = 4.00; 
            } else if (dataNilai[i][0] >= 85) {
                dataNilai[i][1] = 3.50; 
            } else if (dataNilai[i][0] >= 70) {
                dataNilai[i][1] = 3.00;
            } else if (dataNilai[i][0] >= 60) {
                dataNilai[i][1] = 2.50; 
            } else if (dataNilai[i][0] >= 55) {
                dataNilai[i][1] = 2.00; 
            } else if (dataNilai[i][0] >= 50) {
                dataNilai[i][1] = 1.50; 
            } else {
                dataNilai[i][1] = 0.00; 
            }
            totalBobot += dataNilai[i][1];
        }

        System.out.println("====================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================================");
        System.out.printf("%-40s %-10s %-10s %-10s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf;

            if (dataNilai[i][0] >= 90) {
                nilaiHuruf = "A";
            } else if (dataNilai[i][0] >= 85) {
                nilaiHuruf = "B+";
            } else if (dataNilai[i][0] >= 70) {
                nilaiHuruf = "B";
            } else if (dataNilai[i][0] >= 60) {
                nilaiHuruf = "C+";
            } else if (dataNilai[i][0] >= 55) {
                nilaiHuruf = "C";
            } else if (dataNilai[i][0] >= 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            System.out.printf("%-40s %-10.2f %-10s %-10.2f\n", mataKuliah[i], dataNilai[i][0], nilaiHuruf, dataNilai[i][1]);
        }

        System.out.println("========================================");
        double ipSemester = totalBobot / mataKuliah.length;
        System.out.printf("IP Semester: %.2f", ipSemester);
    }
}
