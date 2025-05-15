import java.util.Stack;
public class StackSurat06 {
    Stack<Surat06> data;
    
public StackSurat06() {
    data = new Stack<Surat06>();
}

void tambahSurat(Surat06 surat) {
    data.push(surat);
    System.out.println("Surat atas nama " + surat.namaMahasiswa + " telah ditambahkan");
}

void prosesSurat() {
        if (data.isEmpty()) {
        System.out.println("Tidak ada surat");
    } else {
        Surat06 surat = data.pop();
        System.out.println("Surat atas nama " + surat.namaMahasiswa + " telah diproses");
        surat.info(); 
    }
}

void suratTerakhir() {
    if (data.isEmpty()) {
        System.out.println("Tidak ada surat");
    } else {
        System.out.println("Surat terakhir: ");
        data.peek().info(); 
    }
}

void cariSurat(String cariNama) {
    boolean ketemu = false;
    for (Surat06 surat : data) {
        if (surat.namaMahasiswa.equalsIgnoreCase(cariNama)) {
            System.out.println("Surat atas nama " + surat.namaMahasiswa + " telah ditemukan");
            surat.info();
            ketemu = true;
        }
    }
    if (!ketemu) {
        System.out.println("Surat tidak ditemukan");
        }
    }
}
