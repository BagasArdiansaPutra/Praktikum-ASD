public class Dosen06 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    Dosen06(String kd, String nm, boolean jk, int us) {
        kode = kd;
        nama = nm;
        jenisKelamin = jk;
        usia = us;
    }

    void tampilInfo() {
        System.out.println("Kode Dosen: " + kode);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
        System.out.println("--------------------------------------");
    }
}