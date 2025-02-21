public class MataKuliah06 {
    String kodeMk;
    String nama;
    int sks;
    int jmlJam;
    
    void tampilInformasi() {
        System.out.println("Kode Mata Kuliah : " + kodeMk);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jmlJam);
    }
    void ubahSks(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS diubah menjadi: " + sks);
    }
    void tambahJam(int jam) {
        this.jmlJam += jam;
        System.out.println("Jumlah jam ditambah menjadi: " + jmlJam);
    }
    void kurangiJam (int jam) {
        if (this.jmlJam >= jam) {
            this.jmlJam -= jam;
        System.out.println("Jumlah jam dikurang menjadi: " + jmlJam);
    } else {
        System.out.println("Jumlah jam tidak valid");
        }

    } 
    public MataKuliah06() {
    }
    public MataKuliah06(String kodeMk, String nama, int sks, int jmlJam) {
        this.kodeMk = kodeMk;
        this.nama = nama;
        this.sks = sks;
        this.jmlJam = jmlJam;
    } 
}

    
