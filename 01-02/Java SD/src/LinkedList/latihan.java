package LinkedList;
import java.util.LinkedList;

public class latihan {
    public static void main(String[] args) {
        //Membuat objek
        LinkedList<String> buah = new LinkedList<>();

        //Menambahkan Data pada objek buah
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");

        //Menampilkan data
        System.out.println("Nama Buah: "+buah);

        //Menghitung jumlah
        System.out.println("Jumlah Buah: "+buah.size());

        buah.addFirst("Paling Atas");//Menambahkan Data pada Index Teratas
        buah.addLast("Paling Bawah");//Menambahkan Data pada Index Tebawah

        buah.set(2, "Diubah");// Mengubah Data pada No Index 2
        buah.set(5, "Diubah");// Mengubah Data pada No Index 5

//Mencetak/Menampilkan Data
        System.out.println("Nama Buah: "+buah);

    }
}
