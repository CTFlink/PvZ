public class Game {

    public Game(){

    }

    public static void start(){
        Plant bo = new Plant();
        ConeheadZombie ib = new ConeheadZombie(100,25);


        while (bo.life>0 && ib.life>0 ){

            bo.attack(ib);
            ib.attack(bo);

            System.out.println("Bo's liv er " + bo.life + " og Ib's liv er " + ib.life);
        }
    }
}
