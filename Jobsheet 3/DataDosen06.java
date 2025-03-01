public class DataDosen06 {
    
    void dataSemuaDosen(Dosen06[] arrayofDosen06) {
        System.out.println("===== Semua Data Dosen =====");
        for (int i=0; i< arrayofDosen06.length; i++) {
            System.out.println("Data Dosen ke-" + (i+1));
            arrayofDosen06[i].tampilInfo();
            System.out.println("-------------------------------");
        }
    }
    
    void jmlDosenPerJnsKelamin (Dosen06[] arrayofDosen06) {
        int jmlLaki = 0;
        int jmlPerempuan = 0;
        for (int i=0; i< arrayofDosen06.length; i++) {
            if (arrayofDosen06[i].jenisKelamin) {
                jmlLaki++;
            } else {
                jmlPerempuan++;
            }
        }
        System.out.println("Jumlah Dosen Laki-Laki   : " + jmlLaki);
        System.out.println("Jumlah Dosen Perempuan   : " + jmlPerempuan);
    }
    
    void rerataUsiaDosenPerJnsKelamin (Dosen06[] arrayofDosen06) {
        
        int jmlLaki = 0;
        int jmlPerempuan = 0;
        int totalUsiaLaki = 0;
        int totalUsiaPerempuan = 0;
        for (int i=0; i< arrayofDosen06.length; i++) {
            if (arrayofDosen06[i].jenisKelamin) {
                jmlLaki++;
                totalUsiaLaki += arrayofDosen06[i].usia;
            } else {
                jmlPerempuan++;
                totalUsiaPerempuan += arrayofDosen06[i].usia;
            }
        }
        System.out.println("Rerata Usia Dosen Laki-Laki   : " + (totalUsiaLaki/jmlLaki));
        System.out.println("Rerata Usia Dosen Perempuan   : " + (totalUsiaPerempuan/jmlPerempuan));
    }

    void infoDosenPlgTua (Dosen06[] arrayofDosen06) {
        Dosen06 tertua = arrayofDosen06 [0];

        for (Dosen06 dosen06 : arrayofDosen06) {
            if (dosen06.usia > tertua.usia) {
                tertua = dosen06;
            }
        }

        System.out.println("=== Dosen Tertua ===");
        tertua.tampilInfo();
    }

    void infoDosenPlgMuda (Dosen06[] arrayofDosen06) {
        Dosen06 termuda = arrayofDosen06 [0];

        for (Dosen06 dosen06 : arrayofDosen06) {
            if (dosen06.usia < termuda.usia) {
                termuda = dosen06;
            }
        }

        System.out.println("=== Dosen Termuda ===");
        termuda.tampilInfo();
    }

}