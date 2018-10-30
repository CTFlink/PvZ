public class Zombie {

    public int life;
    public int attack;

    public Zombie(int life, int attack){

        this.life = life;
        this.attack=attack;

    }



    public void attack(Plant p){

        p.takeDamage(attack);
    }
    public void takeDamage(int d){
        life -= d;

    }
}
