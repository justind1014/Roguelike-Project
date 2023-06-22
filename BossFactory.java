import java.util.Random;
public class BossFactory {
    
    public static Boss randomBoss(){
        Random rand = new Random();
        int boss = rand.nextInt(4) + 1;
        Boss randBoss = null;
        if(boss == 1){
            Boss giantSlime = new Boss("Giant Slime", 35, 10, 100);
            randBoss = giantSlime;
        }else if(boss == 2){
            Boss goblinKing = new Boss("Goblin King", 35, 12, 300);
            randBoss = goblinKing;
        }else if(boss == 3){
            Boss golem = new Boss("Golem", 50, 15, 250);
            randBoss = golem;
        }else if(boss == 4){
            Boss dragon = new Boss("Dragon", 60, 20, 400);
            randBoss = dragon;
        }
        return randBoss;
    }

}
