public class Repeater implements Plant {

    int dps = 20;
    int toughness = 300;

    public Repeater() {
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
