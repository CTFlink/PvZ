public class FlagZombie extends Zombie{


    public FlagZombie(int life, int attack){
        super(life,attack);

    }


    public void take(int d){
            this.takeDamage(d);
        }
    }
        //Start bølge af Zombies
