public class DataDosen06 {
    Dosen06 [] dataDosen06 = new Dosen06[4];
    int idx;

    void DataDosen06(int jmlDosen) {
        dataDosen06 = new Dosen06[jmlDosen];
    }

    void tambah(Dosen06 d) {
        if (idx < dataDosen06.length) {
            dataDosen06[idx] = d;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen06 d : dataDosen06) {
            d.tampilInfo();
        }
    }

    int sequentialSearchNama(String cari) {
        for (int i = 0; i < idx; i++) {
            if (dataDosen06[i].nama.equalsIgnoreCase(cari)) {
                return i;
            }
        }
        return -1;
    }

    int binarySearchUsia(int cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (dataDosen06[mid].usia == cari) {
                return mid;
            } else if (dataDosen06[mid].usia > cari) {
                return binarySearchUsia(cari, left, mid - 1);
            } else {
                return binarySearchUsia(cari, mid + 1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(String x, int pos) {
        if (pos != -1) {
            System.out.println("Dosen dengan nama '" + x + "' ditemukan pada index " + pos);
        } else {
            System.out.println("Data '" + x + "' tidak ditemukan");
        }
    }

    void tampilDataSearch(String x, int pos) {
        if (pos != -1) {
            System.out.println("Kode\t\t : " + dataDosen06[pos].kode);
            System.out.println("Nama\t\t : " + dataDosen06[pos].nama);
            System.out.println("Jenis Kelamin\t : " + (dataDosen06[pos].jenisKelamin ? "Laki-laki" : "Perempuan")); // Perubahan di sini
            System.out.println("Usia\t\t : " + dataDosen06[pos].usia);
        } else {
            System.out.println("Data Dosen dengan nama '" + x + "' tidak ditemukan");
        }
    }

    void cekHasilGanda(String nama) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen06[i].nama.equalsIgnoreCase(nama)) {
                count++;
                if (count > 1) {
                    System.out.println("Peringatan: Ditemukan lebih dari 1 dosen dengan nama '" + nama + "'!");
                    break;
                }
            }
        }
    }

    void SortingASC(){
        for (int i = 0; i < dataDosen06.length-1; i++) {
            for (int j = 1; j < dataDosen06.length-i; j++) {
                if (dataDosen06[j].usia<dataDosen06[j-1].usia) {
                    Dosen06 temp = dataDosen06[j];
                    dataDosen06[j]=dataDosen06[j-1];
                    dataDosen06[j-1]=temp;
                }
            }
        }
    }


}
