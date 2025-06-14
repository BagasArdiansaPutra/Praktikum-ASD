public class Queue06 {
    private Node06 front;
    private Node06 rear;
    private int size;

    public Queue06() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false; 
    }

    public void enqueue(Mahasiswa06 mhs) {
        Node06 newNode = new Node06(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(mhs.getNama() + " berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang bisa dipanggil.");
        } else {
            Mahasiswa06 keluar = front.data;
            front = front.next;
            size--;
            System.out.println("Memanggil: " + keluar);
        }
    }

    public void tampilDepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terdepan: " + front.data);
        }
    }

    public void tampilBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian paling akhir: " + rear.data);
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar mahasiswa dalam antrian:");
            Node06 current = front;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }
}