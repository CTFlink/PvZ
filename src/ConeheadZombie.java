public class ConeheadZombie extends Zombie {



    public ConeheadZombie(){
        super(200,25);

    }


    @Override
    public void takeDamage(int d){
        setBlocked(false);
        //10% chance to block
        if(Math.random() < 0.9){
            setLife(getLife()-d);
        }else{
            setBlocked(true);
        }
    }


}
