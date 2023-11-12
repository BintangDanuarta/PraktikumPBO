package uts1;

import java.util.ArrayList;

/**
 *
 * @author Bintang Danuarta
 */
// Kelas PengelolaBuku untuk menyimpan daftar buku
class PengelolaBuku {
    private ArrayList<Book> daftarBuku;

    public PengelolaBuku() {
        daftarBuku = new ArrayList<>();
    }

    public void tambahBuku(Book buku) {
        daftarBuku.add(buku);
    }

    public void hapusBuku(Book buku) {
        daftarBuku.remove(buku);
    }

    public void tampilkanDaftarBuku() {
        for (Book buku : daftarBuku) {
            System.out.println(buku.getInfo() + " - Genre: " + buku.getGenre());
        }
    }
}
