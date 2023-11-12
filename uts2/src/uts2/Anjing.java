package uts2;

/**
 *
 * @author Bintang Danuarta
 */
// Kelas turunan Anjing
class Anjing extends Hewan {
    public Anjing() {
        jenisSuara = "Guk Guk";
    }

    @Override
    public boolean isMamalia() {
        return true;
    }
}
