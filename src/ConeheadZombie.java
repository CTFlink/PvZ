public class ConeheadZombie extends Zombie {

    public ConeheadZombie(int life, int attack){
        super(life,attack);

    }



    public void block(int d){
        //10% chance to block
        if(Math.random() < 0.9){
            this.takeDamage(d);
        }
    }

}
