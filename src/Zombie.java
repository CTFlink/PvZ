public class Zombie {

    int life = 100;
    int attack = (int) (Math.random()*10) %3 +7;

    public void attack(Plant p){
        p.takeDamage(attack);
    }
    public void takeDamage(int d){
        life = life-d;

    }
}
