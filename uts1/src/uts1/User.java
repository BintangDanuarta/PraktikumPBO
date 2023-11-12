package uts1;

/**
 *
 * @author Bintang Danuarta
 */

import java.util.ArrayList;

// Kelas pengguna
class User {
    private PengelolaBuku pengelolaBuku;

    public User() {
        pengelolaBuku = new PengelolaBuku();
    }

    public void viewBooks() {
        System.out.println("Daftar buku untuk User:");
        pengelolaBuku.tampilkanDaftarBuku();
    }
}


