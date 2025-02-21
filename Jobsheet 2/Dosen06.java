public class Dosen06 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

void tampilInformasi() {
    System.out.println("ID Dosen : " + idDosen);
    System.out.println("Nama Dosen : " + nama);
    System.out.println("Status Aktif : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
    System.out.println("Tahun Bergabung : " + tahunBergabung);
    System.out.println("Bidang Keahlian : " + bidangKeahlian);
}
void setStatusAktif(boolean status) {
    this.statusAktif = status;
    System.out.println("Status dosen diubah menjadi: " + (status ? "Aktif" : "Tidak Aktif"));
}
int hitungLamaBekerja(int tahunSekarang) {
    return tahunSekarang - tahunBergabung;
}
void ubahKeahlian (String bidang) {
    this.bidangKeahlian = bidang;
    System.out.println("Bidang keahlian dosen diubah menjadi: " + bidangKeahlian);
}
public Dosen06() {
}
public Dosen06(String idDosen, String nama, int tahunBergabung, String bidangKeahlian) {
    this.idDosen = idDosen;
    this.nama = nama;
    this.statusAktif = false;
    this.tahunBergabung = tahunBergabung;
    this.bidangKeahlian = bidangKeahlian;
} 
}