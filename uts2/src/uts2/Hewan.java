package uts2;

/**
 *
 * @author Bintang Danuarta
 */
// Kelas dasar Hewan
class Hewan {
    protected String jenisSuara;

    public void bersuara() {
        System.out.println("Suara hewan: " + jenisSuara);
    }

    public boolean isMamalia() {
        return false;
    }
}
