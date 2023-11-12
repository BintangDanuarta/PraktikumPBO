package uts1;

/**
 *
 * @author Bintang Danuarta
 */

import java.util.ArrayList;

// Kelas admin yang merupakan turunan dari kelas User
class Admin extends User {
    private PengelolaBuku pengelolaBuku;

    public Admin() {
        pengelolaBuku = new PengelolaBuku();
    }

    public void addBook(GenreBook newBook) {
        pengelolaBuku.tambahBuku(newBook);
        System.out.println("Buku ditambahkan: " + newBook.getInfo());
    }

    public void deleteBook(Book book) {
        pengelolaBuku.hapusBuku(book);
        System.out.println("Buku dihapus: " + book.getInfo());
    }

    @Override
    public void viewBooks() {
        System.out.println("Daftar buku untuk Admin:");
        pengelolaBuku.tampilkanDaftarBuku();
    }
}