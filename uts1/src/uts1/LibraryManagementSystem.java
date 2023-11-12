package uts1;

/**
 *
 * @author Bintang Danuarta
 */

import java.util.ArrayList;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Membuat objek buku dengan genre tertentu
        GenreBook book1 = new GenreBook("Buku S.Tatang", "Tatang Sutarman", 1990, "Comedy");
        GenreBook book2 = new GenreBook("Laskar Pelangi", "Andrea Hirata", 2006, "Slice of Life");

        // Membuat objek pengguna (user) dan admin
        User user = new User();
        Admin admin = new Admin();

        // Menambahkan buku oleh admin
        admin.addBook(book1);
        admin.addBook(book2);

        // Menampilkan daftar buku untuk user dan admin
        user.viewBooks();
        admin.viewBooks();

        // Menghapus buku oleh admin
        admin.deleteBook(book2);

        // Menampilkan kembali daftar buku setelah penghapusan oleh admin
        admin.viewBooks();
    }
}



