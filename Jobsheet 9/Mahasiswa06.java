public class Mahasiswa06 {
    String nim, nama, kelas;
    int nilai;

    Mahasiswa06() {

    }
    Mahasiswa06 ( String nim, String nama, String kelas) {

        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }
    void tugasDinilai(int nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Nilai harus antara 0-100");
        }
    }
}
