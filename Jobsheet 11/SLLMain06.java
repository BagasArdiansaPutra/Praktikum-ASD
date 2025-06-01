import java.util.Scanner;

public class SLLMain06 {
    public static void main(String[] args) {
        SingleLinkedList06 sll = new SingleLinkedList06();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mahasiswa");
            System.out.println("3. Hapus Data Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine(); 

                    Mahasiswa06 mhs = new Mahasiswa06(nim, nama, kelas, ipk);
                    sll.addLast(mhs);
                    System.out.println("Data berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\nData Mahasiswa:");
                    sll.print();
                    break;

                case 3:
                    System.out.print("Masukkan Nama Mahasiswa yang akan dihapus: ");
                    String namaHapus = sc.nextLine();
                    sll.remove(namaHapus);
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan!=4);
    }
}

        //Mahasiswa06 mhs1 = new Mahasiswa06("21212203", "Alvaro", "1A", 3.6);
        //Mahasiswa06 mhs2 = new Mahasiswa06("22212202", "Cintia", "3C", 3.5);
        //Mahasiswa06 mhs3 = new Mahasiswa06("23212201", "Bimon", "2B", 3.8);
        //Mahasiswa06 mhs4 = new Mahasiswa06("24212200", "Dirga", "4D", 4.0);

        //sll.print();
        //sll.addFirst(mhs4);
        //sll.print();
        //sll.addFirst(mhs1);
        //sll.print();
        //sll.insertAfter("Dirga", mhs3);
        //sll.insertAt(2, mhs2);
        //sll.print();

        //System.out.println("data index 1 : ");
        //sll.getData(1);

        //System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        //System.out.println();

        //sll.removeFirst();
        //sll.removeLast();
        //sll.print();
        //sll.removeAt(0);
        //sll.print();
    
