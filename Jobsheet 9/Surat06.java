public class Surat06 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    public Surat06() {
    }

    public Surat06(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void info() {
        String jenis = (jenisIzin == 'S') ? "Sakit" : "Izin";
        System.out.println("ID Surat : " + idSurat);
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("Kelas : " + kelas);
        System.out.println("Durasi izin : " + durasi + " hari");
    }
    
    
}