public class Mahasiswa06 {
    private String nama;
    private String nim;

    public Mahasiswa06(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }
  
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim;
    }
}