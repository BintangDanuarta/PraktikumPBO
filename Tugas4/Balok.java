package tugas4;

/**
 *
 * @author Bintang Danuarta
 */
public class Balok extends Perhitungan{
    private double p, l, t;

    public Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    @Override
    public double Volume() {
        //rumus volume balok = p*l*t
        return p * l * t;
    }

    @Override
    public double LuasPermukaan() {
        //rumus luas permukaan balok = 2*(p*l + p*t + l*t)
        return 2 * (p * l + p * t + l * t);
    }
}
