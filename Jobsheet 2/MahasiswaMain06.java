public class MahasiswaMain06 {
    public static void main(String[] args) {
        Mahasiswa06 mhs1 = new Mahasiswa06 ();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas ("SI 2K");
        mhs1.updateIpk (3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa06 mhs2 = new Mahasiswa06 ("Annisa Salsabila","2141720160",3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa06 mhsBagasArdi = new Mahasiswa06("Bagas Ardiansa","244107020166", 3.42,"TI 1B");
        mhsBagasArdi.tampilkanInformasi();
    }
}