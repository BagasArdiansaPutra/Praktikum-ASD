public class MahasiswaBerprestasi06 {

    Mahasiswa06 [] listMHS = new Mahasiswa06[5];
    int idx;

    public MahasiswaBerprestasi06(int jmlMhs) {
        listMHS = new Mahasiswa06[jmlMhs];
        idx = 0;
    }

    void tambah(Mahasiswa06 m){
        if (idx < listMHS.length ) {
            listMHS[idx]= m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for(Mahasiswa06 m : listMHS){
            m.tampilInfo();
            System.out.println("--------------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMHS.length - 1; i++) { 
            for (int j = 1; j < listMHS.length - i; j++) { 
                if (listMHS[j].ipk > listMHS[j-1].ipk) { 
                    Mahasiswa06 temp = listMHS[j];
                    listMHS[j] = listMHS[j - 1];
                    listMHS[j - 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMHS.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < listMHS.length; j++) {
                if (listMHS[j].ipk < listMHS[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mahasiswa06 temp = listMHS[idxMin];
            listMHS[idxMin]= listMHS[i];
            listMHS[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMHS.length; i++) {
            Mahasiswa06 temp = listMHS[i];
            int j = i - 1;
            while (j >= 0 && listMHS[j].ipk > temp.ipk) {
                listMHS[j+1] = listMHS[j];
                j--;
            }
            listMHS[j+1] = temp;
        }
    }
}    