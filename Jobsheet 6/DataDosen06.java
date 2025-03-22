public class DataDosen06 {
    Dosen06 [] dataDosen06;
    int idx;

    DataDosen06(int jmlDosen) {
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

    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen06[j].usia > dataDosen06[j + 1].usia) {
                    Dosen06 temp = dataDosen06[j];
                    dataDosen06[j] = dataDosen06[j + 1];
                    dataDosen06[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < dataDosen06.length - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < dataDosen06.length; j++) {
                if (dataDosen06[j].usia > dataDosen06[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen06 temp = dataDosen06[maxIdx];
            dataDosen06[maxIdx] = dataDosen06[i];
            dataDosen06[i] = temp;
        }
    }
}