public class Dosen06 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen06 (String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    void tampilInfo() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-Laki" : "Perempuan"));
        System.out.println("Usia          : " + usia);
    }
}