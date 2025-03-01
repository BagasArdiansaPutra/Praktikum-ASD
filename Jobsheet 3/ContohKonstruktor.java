public class ContohKonstruktor {
    String kode;
    String nama;
    int sks;
    int jumlahJam;

    // konstruktor default 
    public ContohKonstruktor() {
        this.kode = "MK000";
        this.nama = "Tidak Diketahui";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    // Parameter untuk kode dan nama saja
    public ContohKonstruktor(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.sks = 0;
        this.jumlahJam = 0;
    }

    // Parameter lengkap
    public ContohKonstruktor(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}