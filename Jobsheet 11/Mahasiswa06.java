public class Mahasiswa06 {
    
    String nim, nama, kelas;
    double ipk;

    Mahasiswa06 () {
    
    }

    Mahasiswa06(String nm, String name, String kl, double ip) {
        nim = nm;
        nama = name;
        kelas = kl;
        ipk = ip;
    }

    public void tampilInformasi() {
        System.out.println(nama + "  " + nim + "  " + kelas +  "  " + ipk);
        
    }
}