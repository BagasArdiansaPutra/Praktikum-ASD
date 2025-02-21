public class MataKuliahMain06 {
    
    public static void main(String[] args) {
       
        MataKuliah06 matkul1 = new MataKuliah06();
        System.out.println("Mata Kuliah 1: ");
        matkul1.tampilInformasi();

        MataKuliah06 matkul2 = new MataKuliah06("002","Algoritma dan Struktur Data",4,6);
        System.out.println("Mata Kuliah 2: ");
        matkul2.tampilInformasi();

        matkul2.ubahSks(5);
        matkul2.tambahJam(4);
        matkul2.kurangiJam(3);
        matkul2.tampilInformasi();
} 
}