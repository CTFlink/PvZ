public class Game {

    public Game(){

    }

    public static void start(){

        ConeheadZombie ib = new ConeheadZombie(100,25);


        double plantType = Math.random();
        Plant bo;


        if(plantType <0.3){
            bo = new PeaShoter();

        }else if(plantType <0.6){
            bo = new Repeater();
        }else{

            bo = new SnowPea();

        }




        while (bo.getToughness()>0 && ib.getLife()>0 ){

            bo.attack(ib);
            ib.attack(bo);

            System.out.println("Bo's liv er " + bo.getToughness() + " og Ib's liv er " + ib.getLife());
        }
    }
}
