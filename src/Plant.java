public class Plant {

    public int life = 100;
    public int attack = (int) (Math.random()*10) %3 +7;


    public void attack(Zombie z){
        z.takeDamage(attack);
    }
    public void takeDamage(int d){
        life = life-d;

    }

}
