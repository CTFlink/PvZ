import java.util.Scanner;

public class Game {

    public Game(){

    }

    public void start(){

        System.out.println("WELCOME to the Zombie Game!");
        System.out.println("Tryk enter for at starte spillet");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        game();


        input.nextLine();

        game();
    }

    public void game(){

        double zombieType = Math.random();
        Zombie ib;


        if(zombieType <0.333){
             ib = new FlagZombie();

        }else if(zombieType <0.666){
            ib = new ConeheadZombie();
        }else{

           ib = new Zombie3();

        }



        double plantType = Math.random();
        Plant bo;


        if(plantType <0.333){
            bo = new PeaShoter();

        }else if(plantType <0.666){
            bo = new Repeater();
        }else{

            bo = new SnowPea();

        }



        System.out.println("bo is " +bo.getClass().toString());
        System.out.println("ib is " + ib.getClass());


        while (bo.getToughness()>0 && ib.getLife()>0 ){

            bo.attack(ib);
            ib.attack(bo);

            System.out.print("Bo's liv er " + bo.getToughness() + " og Ib's liv er " + ib.getLife());
            if(ib.getStatus().equalsIgnoreCase("slowed")){
                System.out.print("; ååhh nej, Ib er slowed!!!\n");
            }
            else if(ib.getBlocked()){

                System.out.print("; yes! Ib blokerede\n");
            }else{
                System.out.print("\n");
            }
        }


    }
}
