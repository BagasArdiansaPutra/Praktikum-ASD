public class Mahasiswa06 {

    String nama;
    String nim;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Ipk: " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas (String kelasBaru) {
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru) {
        if (ipkBaru <= 0.0 && ipkBaru >= 4.0) {
            System.out.println("IPK anda tidak valid. Mohon masukkan 0.0 sampai 0.4");
        } else {
            ipk = ipkBaru;
        }
    }
    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
    public Mahasiswa06() {    
    }
    public Mahasiswa06 (String nm, String nim, double ipk, String kls) {
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
}