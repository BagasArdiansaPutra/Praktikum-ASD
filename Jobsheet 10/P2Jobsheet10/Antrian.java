public class Antrian {
    Mahasiswa[] data;
    int front ,rear,size, max;
    int totalMasuk = 0;

    public Antrian(int i) {
        max = i;
        data = new Mahasiswa[max];
        size = front = 0;
        rear = -1;
    }
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (size == max ) {
            return true;
        }else{
            return false;
        }
    }
     public void clear (){
        if (!isEmpty()) {
            front = size = 0;
            rear = -1;
            System.out.println("Antrian berhasil dikosongkan");
        }else{
            System.out.println("Antrian masih kosong");
        }
    }
    public void tambahAntrian (Mahasiswa mhs){
        if (isFull()) {
            System.out.println("Antrian sudah penuh, tidak dapat menambah mahasiswa!!");
            return;
        }else{
           rear = (rear + 1) % max;
           data[rear] = mhs;
           size++;
           totalMasuk++;
           System.out.println(mhs.nama + " Berhasil masuk ke antrian.");
        }
    }
    public void panggil2Mahasiswa (){
        if (size < 2){
            System.out.println("Antrian tidak bisa diproses. Antrian minimal 2 orang");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < 2; i++) {
            Mahasiswa mhs = data[front];
            front = (front + 1) % max;
            size--;
            System.out.print((i+1) + ". ");
            mhs.tampilInfo();
        }  
    }
     public void tampilkanSemua (){
        if (isEmpty()){
            System.out.println("Antrian Kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ". ");
            data[index].tampilInfo();
        }  
    }
    public void lihatTerdepan (){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else{
            System.out.println("Mahasiswa 2 terdepan : ");
            System.out.println("NIM - NAMA - PRODI - KELAS ");
            data[front].tampilInfo();
        }
    }
    public void lihatAkhir (){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else{
            System.out.println("Antrian terakhir : ");
            System.out.println("NIM - NAMA - PRODI - KELAS ");
            data[rear].tampilInfo();
        }
    }
    public void jmlAntrian (){
       
        System.out.println("Jumlah antrian saat ini : " + size);
        System.out.println("Jumlah yang sudah di panggil : " + (totalMasuk - size));
        
    }
    public void belumdiProses (){
        int jmlBelum = 30 -(totalMasuk - size);
        System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS: " + jmlBelum);
    }

}