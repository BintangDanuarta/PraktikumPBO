package uts2;

/**
 *
 * @author Bintang Danuarta
 */
// Kelas turunan Kucing
class Kucing extends Hewan {
    public Kucing() {
        jenisSuara = "Meong";
    }

    @Override
    public boolean isMamalia() {
        return true;
    }
}
