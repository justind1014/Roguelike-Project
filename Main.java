import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            //Create Player and Layout
            LevelLayout level01 = new LevelLayout();
            Player player = new Player();
            //Set the game to run
            Boolean game = true;
            while(game){
                System.out.println("Your current room position is " + player.getxPosition() + ", " + player.getyPosition());
                System.out.println("Enter an action");
                String action = input.nextLine();
                System.out.println();

                //Player wants to move north
                 if(action.equals("move north")){
                    Room checkNorth = level01.roomCheck(player.getxPosition(), player.getyPosition() - 1);
                    //Check if player can move that way
                    if(checkNorth == null){
                        System.out.println("There is no room in that direction");
                    }else{
                        player.moveNorth();
                        System.out.println("You moved to a new room");
                        //What type of room is the player in? Do whatever is required for the room type.
                        Room northRoom = level01.roomCheck(player.getxPosition(), player.getyPosition());

                        //Run this if the room is a Treasure Room
                        if(northRoom instanceof TreasureRoom){
                            TreasureRoom northTreasureRoom = (TreasureRoom)northRoom;
                            //Check if the gold has been emptied
                            if(northTreasureRoom.getGoldAmount() == 0){
                                System.out.println("This room is empty");
                            }else{
                                player.setGold(player.getGold() + northTreasureRoom.getGoldAmount());
                                System.out.println("You found treasure! You gained " + northTreasureRoom.getGoldAmount() + " gold!");
                                System.out.println("You now have " + player.getGold() + " gold");
                                northTreasureRoom.emptyRoom();
                            }

                        //Run this if the room is a Weapon Room
                        }else if(northRoom instanceof WeaponRoom){
                            WeaponRoom northWeaponRoom = (WeaponRoom)northRoom;
                            Weapon northRoomWeapon = northWeaponRoom.getRoomWeapon();
                            //Check if the weapon has already been picked up
                            if(northRoomWeapon == null){
                                System.out.println("This room is empty");
                            }else{
                                System.out.println("You found a " + northRoomWeapon.getName() + "! Would you like to change to this weapon?");
                                String nPickupChoice = input.nextLine();
                                //Ask if player wants to pick up the weapon
                                if(nPickupChoice.equals("yes")){
                                    player.setHeldWeapon(northRoomWeapon);
                                    System.out.println("You picked up the " + northRoomWeapon.getName());
                                    northWeaponRoom.emptyRoom();
                                }else if(nPickupChoice.equals("no")){
                                    System.out.println("You didn't pick up the " + northRoomWeapon.getName());
                                }
                            }

                        //Run this if the room is an Enemy Room
                        }else if(northRoom instanceof EnemyRoom){
                            EnemyRoom northEnemyRoom = (EnemyRoom)northRoom;
                            Enemy northRoomEnemy = northEnemyRoom.getRoomEnemy();
                            //Check if enemy has already been beat
                            if(northRoomEnemy == null){
                                System.out.println("This room is empty");
                            }else{
                                //Enter fight scene
                                Boolean nFight = true;
                                while(nFight){
                                    System.out.println();
                                    System.out.println("You're attacked by a " + northRoomEnemy.getName() + "!");
                                    System.out.println("What would you like to do?");
                                    String fightChoice = input.nextLine();
                                    if(fightChoice.equals("attack")){
                                        Weapon playerWeapon = player.getHeldWeapon();
                                        northRoomEnemy.setHealthPoints(northRoomEnemy.getHealthPoints() - playerWeapon.getDamage());
                                        System.out.println("You attacked the " + northRoomEnemy.getName() + " and did " + playerWeapon.getDamage() + " damage");
                                        if(northRoomEnemy.getHealthPoints() <= 0){
                                            System.out.println("You defeated the " + northRoomEnemy.getName() + "!");
                                            System.out.println("It dropped " + northRoomEnemy.getGoldReward() + " gold!");
                                            player.setGold(player.getGold() + northRoomEnemy.getGoldReward());
                                            northEnemyRoom.emptyRoom();
                                            nFight = false;
                                        }else{
                                            player.setHealthPoints(player.getHealthPoints() - northRoomEnemy.getDamage());
                                            System.out.println("The " + northRoomEnemy.getName() + " struck you and did " + northRoomEnemy.getDamage() + " damage");
                                            if(player.getHealthPoints() <= 0){
                                                System.out.println("GAME OVER");
                                                nFight = false;
                                                game = false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                //Player wants to move east
                }else if(action.equals("move east")){
                    Room checkEast = level01.roomCheck(player.getxPosition() + 1, player.getyPosition());
                    //Check if player can move that way
                    if(checkEast == null){
                        System.out.println("There is no room in that direction");
                    }else{
                        player.moveEast();
                        System.out.println("You moved to a new room");
                        //What type of room is the player in? Do whatever is required for the room type.
                        Room eastRoom = level01.roomCheck(player.getxPosition(), player.getyPosition());

                        //Run if the room is a Treasure Room
                        if(eastRoom instanceof TreasureRoom){
                            TreasureRoom eastTreasureRoom = (TreasureRoom)eastRoom;
                            //Check if gold has already been collected
                            if(eastTreasureRoom.getGoldAmount() == 0){
                                System.out.println("This room is empty");
                            }else{
                                player.setGold(player.getGold() + eastTreasureRoom.getGoldAmount());
                                System.out.println("You found treasure! You gained " + eastTreasureRoom.getGoldAmount() + " gold!");
                                System.out.println("You now have " + player.getGold() + " gold");
                                eastTreasureRoom.emptyRoom();
                            }

                        //Run if the room is a Weapon Room
                        }else if(eastRoom instanceof WeaponRoom){
                            WeaponRoom eastWeaponRoom = (WeaponRoom)eastRoom;
                            Weapon eastRoomWeapon = eastWeaponRoom.getRoomWeapon();
                            //Check if weapon has already been picked up
                            if(eastRoomWeapon == null){
                                System.out.println("This room is empty");
                            }else{
                                System.out.println("You found a " + eastRoomWeapon.getName() + "! Would you like to change to this weapon?");
                                String ePickupChoice = input.nextLine();
                                //Ask if the player wants to pick up the weapon
                                if(ePickupChoice.equals("yes")){
                                    player.setHeldWeapon(eastRoomWeapon);
                                    System.out.println("You picked up the " + eastRoomWeapon.getName());
                                    eastWeaponRoom.emptyRoom();
                                }else if(ePickupChoice.equals("no")){
                                    System.out.println("You didn't pick up the " + eastRoomWeapon.getName());
                                }
                            }

                        //Run this if the room is an Enemy Room
                        }else if(eastRoom instanceof EnemyRoom){
                            EnemyRoom eastEnemyRoom = (EnemyRoom)eastRoom;
                            Enemy eastRoomEnemy = eastEnemyRoom.getRoomEnemy();
                            //Check if enemy has already been beat
                            if(eastEnemyRoom == null){
                                System.out.println("This room is empty");
                            }else{
                                //Enter fight scene
                                Boolean eFight = true;
                                while(eFight){
                                    System.out.println();
                                    System.out.println("You're attacked by a " + eastRoomEnemy.getName() + "!");
                                    System.out.println("What would you like to do?");
                                    String fightChoice = input.nextLine();
                                    if(fightChoice.equals("attack")){
                                        Weapon playerWeapon = player.getHeldWeapon();
                                        eastRoomEnemy.setHealthPoints(eastRoomEnemy.getHealthPoints() - playerWeapon.getDamage());
                                        System.out.println("You attacked the " + eastRoomEnemy.getName() + " and did " + playerWeapon.getDamage() + " damage");
                                        if(eastRoomEnemy.getHealthPoints() <= 0){
                                            System.out.println("You defeated the " + eastRoomEnemy.getName() + "!");
                                            System.out.println("It dropped " + eastRoomEnemy.getGoldReward() + " gold!");
                                            player.setGold(player.getGold() + eastRoomEnemy.getGoldReward());
                                            eastEnemyRoom.emptyRoom();
                                            eFight = false;
                                        }else{
                                            player.setHealthPoints(player.getHealthPoints() - eastRoomEnemy.getDamage());
                                            System.out.println("The " + eastRoomEnemy.getName() + " struck you and did " + eastRoomEnemy.getDamage() + " damage");
                                            if(player.getHealthPoints() <= 0){
                                                System.out.println("GAME OVER");
                                                eFight = false;
                                                game = false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                //Player wants to move south
                }else if(action.equals("move south")){
                    Room checkSouth = level01.roomCheck(player.getxPosition(), player.getyPosition() + 1);
                    if(checkSouth == null){
                        System.out.println("There is no room in that direction");
                    }else{
                        player.moveSouth();
                        System.out.println("You moved to a new room");
                        //What type of room is the player in? Do whatever is required for the room type.
                        Room southRoom = level01.roomCheck(player.getxPosition(), player.getyPosition());
                        if(southRoom instanceof TreasureRoom){
                            TreasureRoom southTreasureRoom = (TreasureRoom)southRoom;
                            if(southTreasureRoom.getGoldAmount() == 0){
                                System.out.println("This room is empty");
                            }else{
                                player.setGold(player.getGold() + southTreasureRoom.getGoldAmount());
                                System.out.println("You found treasure! You gained " + southTreasureRoom.getGoldAmount() + " gold!");
                                System.out.println("You now have " + player.getGold() + " gold");
                                southTreasureRoom.emptyRoom();
                            }
                        }else if(southRoom instanceof WeaponRoom){
                            WeaponRoom southWeaponRoom = (WeaponRoom)southRoom;
                            Weapon southRoomWeapon = southWeaponRoom.getRoomWeapon();
                            if(southRoomWeapon == null){
                                System.out.println("This room is empty");
                            }else{
                                System.out.println("You found a " + southRoomWeapon.getName() + "! Would you like to change to this weapon?");
                                String sPickupChoice = input.nextLine();
                                if(sPickupChoice.equals("yes")){
                                    player.setHeldWeapon(southRoomWeapon);
                                    System.out.println("You picked up the " + southRoomWeapon.getName());
                                    southWeaponRoom.emptyRoom();
                                }else if(sPickupChoice.equals("no")){
                                    System.out.println("You didn't pick up the " + southRoomWeapon.getName());
                                }
                            }

                        //Run if the room is an Enemy Room
                        }else if(southRoom instanceof EnemyRoom){
                            EnemyRoom southEnemyRoom = (EnemyRoom)southRoom;
                            Enemy southRoomEnemy = southEnemyRoom.getRoomEnemy();
                            //Check if enemy has already been beat
                            if(southRoomEnemy == null){
                                System.out.println("This room is empty");
                            }else{
                                //Enter fight scene
                                Boolean nFight = true;
                                while(nFight){
                                    System.out.println();
                                    System.out.println("You're attacked by a " + southRoomEnemy.getName() + "!");
                                    System.out.println("What would you like to do?");
                                    String fightChoice = input.nextLine();
                                    if(fightChoice.equals("attack")){
                                        Weapon playerWeapon = player.getHeldWeapon();
                                        southRoomEnemy.setHealthPoints(southRoomEnemy.getHealthPoints() - playerWeapon.getDamage());
                                        System.out.println("You attacked the " + southRoomEnemy.getName() + " and did " + playerWeapon.getDamage() + " damage");
                                        if(southRoomEnemy.getHealthPoints() <= 0){
                                            System.out.println("You defeated the " + southRoomEnemy.getName() + "!");
                                            System.out.println("It dropped " + southRoomEnemy.getGoldReward() + " gold!");
                                            player.setGold(player.getGold() + southRoomEnemy.getGoldReward());
                                            southEnemyRoom.emptyRoom();
                                            nFight = false;
                                        }else{
                                            player.setHealthPoints(player.getHealthPoints() - southRoomEnemy.getDamage());
                                            System.out.println("The " + southRoomEnemy.getName() + " struck you and did " + southRoomEnemy.getDamage() + " damage");
                                            if(player.getHealthPoints() <= 0){
                                                System.out.println("GAME OVER");
                                                nFight = false;
                                                game = false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                //Player wants to move west
                }else if(action.equals("move west")){
                    Room checkWest = level01.roomCheck(player.getxPosition() - 1, player.getyPosition());
                    if(checkWest == null){
                        System.out.println("There is no room in that direction");
                    }else{
                        player.moveWest();
                        System.out.println("You moved to a new room");
                        //What type of room is the player in? Do whatever is required for the room type.
                        Room westRoom = level01.roomCheck(player.getxPosition(), player.getyPosition());
                        if(westRoom instanceof TreasureRoom){
                            TreasureRoom westTreasureRoom = (TreasureRoom)westRoom;
                            if(westTreasureRoom.getGoldAmount() == 0){
                                System.out.println("This room is empty");
                            }else{
                                player.setGold(player.getGold() + westTreasureRoom.getGoldAmount());
                                System.out.println("You found treasure! You gained " + westTreasureRoom.getGoldAmount() + " gold!");
                                System.out.println("You now have " + player.getGold() + " gold");
                                westTreasureRoom.emptyRoom();
                            }
                        }else if(westRoom instanceof WeaponRoom){
                            WeaponRoom westWeaponRoom = (WeaponRoom)westRoom;
                            Weapon westRoomWeapon = westWeaponRoom.getRoomWeapon();
                            if(westRoomWeapon == null){
                                System.out.println("This room is empty");
                            }else{
                                System.out.println("You found a " + westRoomWeapon.getName() + "! Would you like to change to this weapon?");
                                String wPickupChoice = input.nextLine();
                                if(wPickupChoice.equals("yes")){
                                    player.setHeldWeapon(westRoomWeapon);
                                    System.out.println("You picked up the " + westRoomWeapon.getName());
                                    westWeaponRoom.emptyRoom();
                                }else if(wPickupChoice.equals("no")){
                                    System.out.println("You didn't pick up the " + westRoomWeapon.getName());
                                }
                            }

                        //Run if the room is an Enemy Room
                        }else if(westRoom instanceof EnemyRoom){
                            EnemyRoom westEnemyRoom = (EnemyRoom)westRoom;
                            Enemy westRoomEnemy = westEnemyRoom.getRoomEnemy();
                            //Check if enemy has already been beat
                            if(westRoomEnemy == null){
                                System.out.println("This room is empty");
                            }else{
                                //Enter fight scene
                                Boolean wFight = true;
                                while(wFight){
                                    System.out.println();
                                    System.out.println("You're attacked by a " + westRoomEnemy.getName() + "!");
                                    System.out.println("What would you like to do?");
                                    String fightChoice = input.nextLine();
                                    if(fightChoice.equals("attack")){
                                        Weapon playerWeapon = player.getHeldWeapon();
                                        westRoomEnemy.setHealthPoints(westRoomEnemy.getHealthPoints() - playerWeapon.getDamage());
                                        System.out.println("You attacked the " + westRoomEnemy.getName() + " and did " + playerWeapon.getDamage() + "damage");
                                        if(westRoomEnemy.getHealthPoints() <= 0){
                                            System.out.println("You defeated the " + westRoomEnemy.getName() + "!");
                                            System.out.println("It dropped " + westRoomEnemy.getGoldReward() + " gold!");
                                            player.setGold(player.getGold() + westRoomEnemy.getGoldReward());
                                            westEnemyRoom.emptyRoom();
                                            wFight = false;
                                        }else{
                                            player.setHealthPoints(player.getHealthPoints() - westRoomEnemy.getDamage());
                                            System.out.println("The " + westRoomEnemy.getName() + " struck you and did " + westRoomEnemy.getDamage() + " damage");
                                            if(player.getHealthPoints() <= 0){
                                                System.out.println("GAME OVER");
                                                wFight = false;
                                                game = false;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                //Player wants to check their gold
                }else if(action.equals("check gold")){
                    System.out.println("You have " + player.getGold() + " gold");

                //Player wants to check their held weapon
                }else if(action.equals("check weapon")){
                    Weapon playerWeapon = player.getHeldWeapon();
                    System.out.println("You're currently holding a " + playerWeapon.getName());
                }
            }
        }
    }
}
