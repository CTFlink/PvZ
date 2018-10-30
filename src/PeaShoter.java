public class PeaShoter implements Plant {

    private int dps = 10;
    private int toughness = 300;

    public PeaShoter() {

    }


    @Override
    public void attack(Zombie z) {
        z.takeDamage(dps);

    }

    @Override
    public void takeDamage(int d) {
        toughness -= d;
    }

    public int getDps() {
        return dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }
}
