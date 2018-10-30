public class Zombie {

    private int life = 100;
    private int attack = (int) (Math.random() * 10) % 3 + 7;
    private String status = "";

    public void attack(Plant p) {
        p.takeDamage(attack);
    }

    public void takeDamage(int d) {
        life -= d;

    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
