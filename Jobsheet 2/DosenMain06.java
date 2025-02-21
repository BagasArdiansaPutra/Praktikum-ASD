public class DosenMain06 {
    public static void main(String[] args) {
        
        Dosen06 dosen1 = new Dosen06();
        System.out.println("Dosen 1: ");
        dosen1.tampilInformasi();

        Dosen06 dosen2 = new Dosen06("112","Pak Budi",2012,"Kesehatan Kerja");
        System.out.println("Dosen 2: ");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        dosen2.ubahKeahlian("Data Analis");
        
        int lamaKrjaDosen2 = dosen2.hitungLamaBekerja(2025);
        System.out.println("Lama Bekerja Dosen 2 : " + lamaKrjaDosen2 + " tahun");
        }
}