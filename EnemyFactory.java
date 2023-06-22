import java.util.Random;

public class EnemyFactory {
    
    public static Enemy randomEnemy(){
        Random rand = new Random();
        int enemyType = rand.nextInt(5) + 1;
        Enemy randEnemy = null;
        if(enemyType == 1){
            Enemy slime = new Enemy("Slime", 10, 2, 20);
            randEnemy = slime;
        }else if(enemyType == 2){
            Enemy largeSpider = new Enemy("Dungeon Spider", 8, 5, 20);
            randEnemy = largeSpider;
        }else if(enemyType == 3){
            Enemy goblin = new Enemy("Goblin", 15, 5, 75);
            randEnemy = goblin;
        }else if(enemyType == 4){
            Enemy serpent = new Enemy("Serpent", 22, 10, 40);
            randEnemy = serpent;
        }else if(enemyType == 5){
            Enemy miniDragon = new Enemy("Mini Dragon", 25, 15, 100);
            randEnemy = miniDragon;
        }
        return randEnemy;
    }

}
