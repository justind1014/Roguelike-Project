import java.awt.Font;
import java.util.Random;
/*
 * This class takes rooms and pieces them together in a level for the player.
 * The goal is for these layouts to be randomized, but they're manually made right now.
 */
public class LevelLayout {
    
    //Instance variables
    private Room[][] layout = new Room[14][14];
    private int roomsAmount;

    //Constructor
    public LevelLayout() {
        Room starterRoom = new Room(7, 7);
        layout[7][7] = starterRoom;
        Random rand = new Random();
        int mainDirection = rand.nextInt(4) + 1;
        if(mainDirection == 1){
            int NEPiece = rand.nextInt(3) + 1;
            if(NEPiece == 1){
                TreasureRoom Room7_5 = new TreasureRoom(7, 5, 70);
                Room Room7_6 = new Room(7, 6);
                WeaponRoom Room8_6 = new WeaponRoom(8, 6, WeaponFactory.randomWeapon());
                Room Room8_7 = new Room(8, 7);
                Room Room9_6 = new Room(9, 6);
                EnemyRoom Room10_3 = new EnemyRoom(10, 3, EnemyFactory.randomEnemy());
                WeaponRoom Room10_4 = new WeaponRoom(10, 4, WeaponFactory.randomWeapon());
                Room Room10_5 = new Room(10, 5);
                EnemyRoom Room10_6 = new EnemyRoom(10, 6, EnemyFactory.randomEnemy());
                TreasureRoom Room10_7 = new TreasureRoom(10, 7, 120);
                BossRoom Room11_4 = new BossRoom(11, 4, BossFactory.randomBoss());
                layout[7][5] = Room7_5;
                layout[7][6] = Room7_6;
                layout[8][6] = Room8_6;
                layout[8][7] = Room8_7;
                layout[9][6] = Room9_6;
                layout[10][3] = Room10_3;
                layout[10][4] = Room10_4;
                layout[10][5] = Room10_5;
                layout[10][6] = Room10_6;
                layout[10][7] = Room10_7;
                layout[11][4] = Room11_4;
            }else if(NEPiece == 2){
                TreasureRoom Room6_5 = new TreasureRoom(6, 5, 75);
                WeaponRoom Room7_4 = new WeaponRoom(7, 4, WeaponFactory.randomWeapon());
                Room Room7_5 = new Room(7, 5);
                Room Room7_6 = new Room(7, 6);
                EnemyRoom Room8_4 = new EnemyRoom(8, 4, EnemyFactory.randomEnemy());
                Room Room8_6 = new Room(8, 6);
                Room Room8_7 = new Room(8, 7);
                Room Room9_4 = new Room(9, 4);
                WeaponRoom Room9_5 = new WeaponRoom(9, 5, WeaponFactory.randomWeapon());
                Room Room9_6 = new Room(9, 6);
                BossRoom Room10_3 = new BossRoom(10, 3, BossFactory.randomBoss());
                TreasureRoom Room10_4 = new TreasureRoom(10, 4, 100);
                layout[6][5] = Room6_5;
                layout[7][4] = Room7_4;
                layout[7][5] = Room7_5;
                layout[7][6] = Room7_6;
                layout[8][4] = Room8_4;
                layout[8][6] = Room8_6;
                layout[8][7] = Room8_7;
                layout[9][4] = Room9_4;
                layout[9][5] = Room9_5;
                layout[9][6] = Room9_6;
                layout[10][3] = Room10_3;
                layout[10][4] = Room10_4;
            }else if(NEPiece == 3){
                Room Room7_6 = new Room(7, 6);
                Room Room8_3 = new Room(8, 3);
                TreasureRoom Room8_4 = new TreasureRoom(8, 4, 70);
                Room Room8_5 = new Room(8, 5);
                WeaponRoom Room8_6 = new WeaponRoom(8, 6, WeaponFactory.randomWeapon());
                Room Room8_7 = new Room(8, 7);
                BossRoom Room9_3 = new BossRoom(9, 3, BossFactory.randomBoss());
                Room Room9_5 = new Room(9, 5);
                Room Room9_6 = new Room(9, 6);
                EnemyRoom Room10_5 = new EnemyRoom(10, 5, EnemyFactory.randomEnemy());
                TreasureRoom Room11_5 = new TreasureRoom(11, 5, 180);
                layout[7][6] = Room7_6;
                layout[8][3] = Room8_3;
                layout[8][4] = Room8_4;
                layout[8][5] = Room8_5;
                layout[8][6] = Room8_6;
                layout[8][7] = Room8_7;
                layout[9][3] = Room9_3;
                layout[9][5] = Room9_5;
                layout[9][6] = Room9_6;
                layout[10][5] = Room10_5;
                layout[11][5] = Room11_5;
            }

            int southPiece = rand.nextInt(6) + 1;
            if(southPiece == 1){
                Room Room7_8 = new Room(7, 8);
                TreasureRoom Room7_9 = new TreasureRoom(7, 9, 50);
                WeaponRoom Room6_9 = new WeaponRoom(6, 9, WeaponFactory.randomWeapon());
                Room Room8_9 = new Room(8, 9);
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[6][9] = Room6_9;
                layout[8][9] = Room8_9;
            }else if(southPiece == 2){
                Room Room7_8 = new Room(7, 8);
                WeaponRoom Room7_9 = new WeaponRoom(7, 9, WeaponFactory.randomWeapon());
                EnemyRoom Room7_10 = new EnemyRoom(7, 10, EnemyFactory.randomEnemy());
                Room Room6_9 = new Room(6, 9);
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[7][10] = Room7_10;
                layout[6][9] = Room6_9;
            }else if(southPiece == 3){
                Room Room7_8 = new Room(7, 8);
                WeaponRoom Room7_9 = new WeaponRoom(7, 9, WeaponFactory.randomWeapon());
                Room Room7_10 = new Room(7, 10);
                EnemyRoom Room8_10 = new EnemyRoom(8, 10, EnemyFactory.randomEnemy());
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[7][10] = Room7_10;
                layout[8][10] = Room8_10;
            }else if(southPiece == 4){
                Room Room7_8 = new Room(7, 8);
                Room Room7_9 = new Room(7, 9);
                TreasureRoom Room6_9 = new TreasureRoom(6, 9, 50);
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[6][9] = Room6_9;
            }else if(southPiece == 5){
                Room Room7_8 = new Room(7, 8);
                WeaponRoom Room7_9 = new WeaponRoom(7, 9, WeaponFactory.randomWeapon());
                Room Room8_9 = new Room(8, 9);
                EnemyRoom Room8_10 = new EnemyRoom(8, 10, EnemyFactory.randomEnemy());
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[8][9] = Room8_9;
                layout[8][10] = Room8_10;
            }else if(southPiece == 6){
                Room Room7_8 = new Room(7, 8);
                Room Room7_9 = new Room(7, 9);
                TreasureRoom Room7_10 = new TreasureRoom(7, 10, 70);
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[7][10] = Room7_10;
            }

            int westPiece = rand.nextInt(6) + 1;
            if(westPiece == 1){
                Room Room6_7 = new Room(6, 7);
                TreasureRoom Room5_7 = new TreasureRoom(5, 7, 50);
                WeaponRoom Room5_6 = new WeaponRoom(5, 6, WeaponFactory.randomWeapon());
                Room Room5_8 = new Room(5, 8);
                layout[6][7] = Room6_7;
                layout[5][7] = Room5_7;
                layout[5][6] = Room5_6;
                layout[5][8] = Room5_8;
            }else if(westPiece == 2){
                Room Room6_7 = new Room(6, 7);
                Room Room5_6 = new Room(5, 6);
                WeaponRoom Room5_7 = new WeaponRoom(5, 7, WeaponFactory.randomWeapon());
                EnemyRoom Room4_7 = new EnemyRoom(4, 7, EnemyFactory.randomEnemy());
                layout[6][7] = Room6_7;
                layout[5][6] = Room5_6;
                layout[5][7] = Room5_7;
                layout[4][7] = Room4_7;
            }else if(westPiece == 3){
                Room Room6_7 = new Room(6, 7);
                WeaponRoom Room5_7 = new WeaponRoom(5, 7, WeaponFactory.randomWeapon());
                Room Room4_7 = new Room(4, 7);
                EnemyRoom Room4_8 = new EnemyRoom(4, 8, EnemyFactory.randomEnemy());
                layout[6][7] = Room6_7;
                layout[5][7] = Room5_7;
                layout[4][7] = Room4_7;
                layout[4][8] = Room4_8;
            }else if(westPiece == 4){
                Room Room6_7 = new Room(6, 7);
                Room Room5_7 = new Room(5, 7);
                TreasureRoom Room5_6 = new TreasureRoom(5, 6, 60);
                layout[6][7] = Room6_7;
                layout[5][7] = Room5_7;
                layout[5][6] = Room5_6;
            }else if(westPiece == 5){
                Room Room6_7 = new Room(6, 7);
                WeaponRoom Room5_7 = new WeaponRoom(5, 7, WeaponFactory.randomWeapon());
                Room Room5_8 = new Room(5, 8);
                EnemyRoom Room4_8 = new EnemyRoom(4, 8, EnemyFactory.randomEnemy());
                layout[6][7] = Room6_7;
                layout[5][7] = Room5_7;
                layout[5][8] = Room5_8;
                layout[4][8] = Room4_8;
            }else if(westPiece == 6){
                Room Room6_7 = new Room(6, 7);
                TreasureRoom Room5_7 = new TreasureRoom(5, 7, 60);
                Room Room4_7 = new Room(4, 7);
                layout[6][7] = Room6_7;
                layout[5][7] = Room5_7;
                layout[4][7] = Room4_7;
            }

        }else if(mainDirection == 2){
            int SEPiece = rand.nextInt(3) + 1;
            if(SEPiece == 1){
                Room Room7_8 = new Room(7, 8);
                Room Room8_7 = new Room(8, 7);
                Room Room8_8 = new Room(8, 8);
                WeaponRoom Room8_9 = new WeaponRoom(8, 9, WeaponFactory.randomWeapon());
                Room Room9_9 = new Room(9, 9);
                EnemyRoom Room10_9 = new EnemyRoom(10, 9, EnemyFactory.randomEnemy());
                Room Room11_8 = new Room(11, 8);
                TreasureRoom Room11_9 = new TreasureRoom(11, 9, 80);
                EnemyRoom Room11_10 = new EnemyRoom(11, 10, EnemyFactory.randomEnemy());
                BossRoom Room12_7 = new BossRoom(12, 7, BossFactory.randomBoss());
                Room Room12_8 = new Room(12, 8);
                WeaponRoom Room12_10 = new WeaponRoom(12, 10, WeaponFactory.randomWeapon());
                layout[7][8] = Room7_8;
                layout[8][7] = Room8_7;
                layout[8][8] = Room8_8;
                layout[8][9] = Room8_9;
                layout[9][9] = Room9_9;
                layout[10][9] = Room10_9;
                layout[11][8] = Room11_8;
                layout[11][9] = Room11_9;
                layout[11][10] = Room11_10;
                layout[12][7] = Room12_7;
                layout[12][8] = Room12_8;
                layout[12][10] = Room12_10;
            }else if(SEPiece == 2){
                TreasureRoom Room6_10 = new TreasureRoom(6, 10, 120);
                Room Room7_8 = new Room(7, 8);
                WeaponRoom Room7_9 = new WeaponRoom(7, 9, WeaponFactory.randomWeapon());
                EnemyRoom Room7_10 = new EnemyRoom(7, 10, EnemyFactory.randomEnemy());
                Room Room7_11 = new Room(7, 11);
                Room Room8_7 = new Room(8, 7);
                Room Room8_8 = new Room(8, 8);
                BossRoom Room8_11 = new BossRoom(8, 11, BossFactory.randomBoss());
                TreasureRoom Room9_8 = new TreasureRoom(9, 8, 80);
                Room Room9_9 = new Room(9, 9);
                layout[6][10] = Room6_10;
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[7][10] = Room7_10;
                layout[7][11] = Room7_11;
                layout[8][7] = Room8_7;
                layout[8][8] = Room8_8;
                layout[8][11] = Room8_11;
                layout[9][8] = Room9_8;
                layout[9][9] = Room9_9;
            }else if(SEPiece == 3){
                TreasureRoom Room7_9 = new TreasureRoom(7, 9, 75);
                Room Room8_7 = new Room(8, 7);
                WeaponRoom Room8_8 = new WeaponRoom(8, 8, WeaponFactory.randomWeapon());
                Room Room8_9 = new Room(8, 9);
                EnemyRoom Room8_10 = new EnemyRoom(8, 10, EnemyFactory.randomEnemy());
                TreasureRoom Room8_11 = new TreasureRoom(8, 11, 100);
                Room Room9_7 = new Room(9, 7);
                Room Room9_8 = new Room(9, 8);
                Room Room9_10 = new Room(9, 10);
                BossRoom Room10_10 = new BossRoom(10, 10, BossFactory.randomBoss());
                layout[7][9] = Room7_9;
                layout[8][7] = Room8_7;
                layout[8][8] = Room8_8;
                layout[8][9] = Room8_9;
                layout[8][10] = Room8_10;
                layout[8][11] = Room8_11;
                layout[9][7] = Room9_7;
                layout[9][8] = Room9_8;
                layout[9][10] = Room9_10;
                layout[10][10] = Room10_10;
            }

            int westPiece = rand.nextInt(6) + 1;
            if(westPiece == 1){
                Room Room6_7 = new Room(6, 7);
                TreasureRoom Room5_7 = new TreasureRoom(5, 7, 50);
                WeaponRoom Room5_6 = new WeaponRoom(5, 6, WeaponFactory.randomWeapon());
                Room Room5_8 = new Room(5, 8);
                layout[6][7] = Room6_7;
                layout[5][7] = Room5_7;
                layout[5][6] = Room5_6;
                layout[5][8] = Room5_8;
            }else if(westPiece == 2){
                Room Room6_7 = new Room(6, 7);
                Room Room5_6 = new Room(5, 6);
                WeaponRoom Room5_7 = new WeaponRoom(5, 7, WeaponFactory.randomWeapon());
                EnemyRoom Room4_7 = new EnemyRoom(4, 7, EnemyFactory.randomEnemy());
                layout[6][7] = Room6_7;
                layout[5][6] = Room5_6;
                layout[5][7] = Room5_7;
                layout[4][7] = Room4_7;
            }else if(westPiece == 3){
                Room Room6_7 = new Room(6, 7);
                WeaponRoom Room5_7 = new WeaponRoom(5, 7, WeaponFactory.randomWeapon());
                Room Room4_7 = new Room(4, 7);
                EnemyRoom Room4_8 = new EnemyRoom(4, 8, EnemyFactory.randomEnemy());
                layout[6][7] = Room6_7;
                layout[5][7] = Room5_7;
                layout[4][7] = Room4_7;
                layout[4][8] = Room4_8;
            }else if(westPiece == 4){
                Room Room6_7 = new Room(6, 7);
                Room Room5_7 = new Room(5, 7);
                TreasureRoom Room5_6 = new TreasureRoom(5, 6, 60);
                layout[6][7] = Room6_7;
                layout[5][7] = Room5_7;
                layout[5][6] = Room5_6;
            }else if(westPiece == 5){
                Room Room6_7 = new Room(6, 7);
                WeaponRoom Room5_7 = new WeaponRoom(5, 7, WeaponFactory.randomWeapon());
                Room Room5_8 = new Room(5, 8);
                EnemyRoom Room4_8 = new EnemyRoom(4, 8, EnemyFactory.randomEnemy());
                layout[6][7] = Room6_7;
                layout[5][7] = Room5_7;
                layout[5][8] = Room5_8;
                layout[4][8] = Room4_8;
            }else if(westPiece == 6){
                Room Room6_7 = new Room(6, 7);
                TreasureRoom Room5_7 = new TreasureRoom(5, 7, 60);
                Room Room4_7 = new Room(4, 7);
                layout[6][7] = Room6_7;
                layout[5][7] = Room5_7;
                layout[4][7] = Room4_7;
            }

            int northPiece = rand.nextInt(6) + 1;
            if(northPiece == 1){
                Room Room7_6 = new Room(7, 6);
                TreasureRoom Room7_5 = new TreasureRoom(7, 5, 45);
                Room Room6_5 = new Room(6, 5);
                WeaponRoom Room8_5 = new WeaponRoom(8, 5, WeaponFactory.randomWeapon());
                layout[7][6] = Room7_6;
                layout[7][5] = Room7_5;
                layout[6][5] = Room6_5;
                layout[8][5] = Room8_5;
            }else if(northPiece == 2){
                Room Room7_6 = new Room(7, 6);
                WeaponRoom Room7_5 = new WeaponRoom(7, 5, WeaponFactory.randomWeapon());
                Room Room7_4 = new Room(7, 4);
                EnemyRoom Room8_5 = new EnemyRoom(8, 5, EnemyFactory.randomEnemy());
                layout[7][6] = Room7_6;
                layout[7][5] = Room7_5;
                layout[7][4] = Room7_4;
                layout[8][5] = Room8_5;
            }else if(northPiece == 3){
                Room Room7_6 = new Room(7, 6);
                Room Room7_5 = new Room(7, 5);
                WeaponRoom Room7_4 = new WeaponRoom(7, 4, WeaponFactory.randomWeapon());
                EnemyRoom Room6_4 = new EnemyRoom(6, 4, EnemyFactory.randomEnemy());
                layout[7][6] = Room7_6;
                layout[7][5] = Room7_5;
                layout[7][4] = Room7_4;
                layout[6][4] = Room6_4;
            }else if(northPiece == 4){
                Room Room7_6 = new Room(7, 6);
                Room Room7_5 = new Room(7, 5);
                TreasureRoom Room8_5 = new TreasureRoom(8, 5, 60);
                layout[7][6] = Room7_6;
                layout[7][5] = Room7_5;
                layout[8][5] = Room8_5;
            }else if(northPiece == 5){
                Room Room7_6 = new Room(7, 6);
                WeaponRoom Room7_5 = new WeaponRoom(7, 5, WeaponFactory.randomWeapon());
                Room Room6_5 = new Room(6, 5);
                EnemyRoom Room6_4 = new EnemyRoom(6, 4, EnemyFactory.randomEnemy());
                layout[7][6] = Room7_6;
                layout[7][5] = Room7_5;
                layout[6][5] = Room6_5;
                layout[6][4] = Room6_4;
            }else if(northPiece == 6){
                Room Room7_6 = new Room(7, 6);
                Room Room7_5 = new Room(7, 5);
                TreasureRoom Room7_4 = new TreasureRoom(7, 4, 75);
                layout[7][6] = Room7_6;
                layout[7][5] = Room7_5;
                layout[7][4] = Room7_4;
            }

        }else if(mainDirection == 3){
            int SWPiece = rand.nextInt(3) + 1;
            if(SWPiece == 1){
                BossRoom Room3_8 = new BossRoom(3, 8, BossFactory.randomBoss());
                Room Room3_9 = new Room(3, 9);
                Room Room4_9 = new Room(4, 9);
                TreasureRoom Room5_7 = new TreasureRoom(5, 7, 75);
                EnemyRoom Room5_9 = new EnemyRoom(5, 9, EnemyFactory.randomEnemy());
                TreasureRoom Room5_10 = new TreasureRoom(5, 10, 95);
                Room Room6_7 = new Room(6, 7);
                WeaponRoom Room6_8 = new WeaponRoom(6, 8, WeaponFactory.randomWeapon());
                Room Room6_9 = new Room(6, 9);
                Room Room7_8 = new Room(7, 8);
                layout[3][8] = Room3_8;
                layout[3][9] = Room3_9;
                layout[4][9] = Room4_9;
                layout[5][7] = Room5_7;
                layout[5][9] = Room5_9;
                layout[5][10] = Room5_10;
                layout[6][7] = Room6_7;
                layout[6][8] = Room6_8;
                layout[6][9] = Room6_9;
                layout[7][8] = Room7_8;
            }else if(SWPiece == 2){
                TreasureRoom Room5_8 = new TreasureRoom(5, 8, 50);
                Room Room6_7 = new Room(6, 7);
                Room Room6_8 = new Room(6, 8);
                EnemyRoom Room6_10 = new EnemyRoom(6, 10, EnemyFactory.randomEnemy());
                Room Room6_11 = new Room(6, 11);
                Room Room6_12 = new Room(6, 12);
                Room Room7_8 = new Room(7, 8);
                WeaponRoom Room7_9 = new WeaponRoom(7, 9, WeaponFactory.randomWeapon());
                Room Room7_10 = new Room(7, 10);
                BossRoom Room7_12 = new BossRoom(7, 12, BossFactory.randomBoss());
                TreasureRoom Room8_9 = new TreasureRoom(8, 9, 75);
                layout[5][8] = Room5_8;
                layout[6][7] = Room6_7;
                layout[6][8] = Room6_8;
                layout[6][10] = Room6_10;
                layout[6][11] = Room6_11;
                layout[6][12] = Room6_12;
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[7][10] = Room7_10;
                layout[7][12] = Room7_12;
                layout[8][9] = Room8_9;
            }else if(SWPiece == 3){
                Room Room4_10 = new Room(4, 10);
                BossRoom Room4_11 = new BossRoom(4, 11, BossFactory.randomBoss());
                WeaponRoom Room5_8 = new WeaponRoom(5, 8, WeaponFactory.randomWeapon());
                Room Room5_9 = new Room(5, 9);
                EnemyRoom Room5_10 = new EnemyRoom(5, 10, EnemyFactory.randomEnemy());
                Room Room6_7 = new Room(6, 7);
                Room Room6_8 = new Room(6, 8);
                TreasureRoom Room6_10 = new TreasureRoom(6, 10, 85);
                Room Room7_8 = new Room(7, 8);
                TreasureRoom Room8_8 = new TreasureRoom(8, 8, 50);
                layout[4][10] = Room4_10;
                layout[4][11] = Room4_11;
                layout[5][8] = Room5_8;
                layout[5][9] = Room5_9;
                layout[5][10] = Room5_10;
                layout[6][7] = Room6_7;
                layout[6][8] = Room6_8;
                layout[6][10] = Room6_10;
                layout[7][8] = Room7_8;
                layout[8][8] = Room8_8;
            }

            int northPiece = rand.nextInt(6) + 1;
            if(northPiece == 1){
                Room Room7_6 = new Room(7, 6);
                TreasureRoom Room7_5 = new TreasureRoom(7, 5, 45);
                Room Room6_5 = new Room(6, 5);
                WeaponRoom Room8_5 = new WeaponRoom(8, 5, WeaponFactory.randomWeapon());
                layout[7][6] = Room7_6;
                layout[7][5] = Room7_5;
                layout[6][5] = Room6_5;
                layout[8][5] = Room8_5;
            }else if(northPiece == 2){
                Room Room7_6 = new Room(7, 6);
                WeaponRoom Room7_5 = new WeaponRoom(7, 5, WeaponFactory.randomWeapon());
                Room Room7_4 = new Room(7, 4);
                EnemyRoom Room8_5 = new EnemyRoom(8, 5, EnemyFactory.randomEnemy());
                layout[7][6] = Room7_6;
                layout[7][5] = Room7_5;
                layout[7][4] = Room7_4;
                layout[8][5] = Room8_5;
            }else if(northPiece == 3){
                Room Room7_6 = new Room(7, 6);
                Room Room7_5 = new Room(7, 5);
                WeaponRoom Room7_4 = new WeaponRoom(7, 4, WeaponFactory.randomWeapon());
                EnemyRoom Room6_4 = new EnemyRoom(6, 4, EnemyFactory.randomEnemy());
                layout[7][6] = Room7_6;
                layout[7][5] = Room7_5;
                layout[7][4] = Room7_4;
                layout[6][4] = Room6_4;
            }else if(northPiece == 4){
                Room Room7_6 = new Room(7, 6);
                Room Room7_5 = new Room(7, 5);
                TreasureRoom Room8_5 = new TreasureRoom(8, 5, 60);
                layout[7][6] = Room7_6;
                layout[7][5] = Room7_5;
                layout[8][5] = Room8_5;
            }else if(northPiece == 5){
                Room Room7_6 = new Room(7, 6);
                WeaponRoom Room7_5 = new WeaponRoom(7, 5, WeaponFactory.randomWeapon());
                Room Room6_5 = new Room(6, 5);
                EnemyRoom Room6_4 = new EnemyRoom(6, 4, EnemyFactory.randomEnemy());
                layout[7][6] = Room7_6;
                layout[7][5] = Room7_5;
                layout[6][5] = Room6_5;
                layout[6][4] = Room6_4;
            }else if(northPiece == 6){
                Room Room7_6 = new Room(7, 6);
                Room Room7_5 = new Room(7, 5);
                TreasureRoom Room7_4 = new TreasureRoom(7, 4, 75);
                layout[7][6] = Room7_6;
                layout[7][5] = Room7_5;
                layout[7][4] = Room7_4;
            }

            int eastPiece = rand.nextInt(6) + 1;
            if(eastPiece == 1){
                Room Room8_7 = new Room(8, 7);
                TreasureRoom Room9_7 = new TreasureRoom(9, 7, 45);
                WeaponRoom Room9_8 = new WeaponRoom(9, 8, WeaponFactory.randomWeapon());
                Room Room9_6 = new Room(9, 6);
                layout[8][7] = Room8_7;
                layout[9][7] = Room9_7;
                layout[9][8] = Room9_8;
                layout[9][6] = Room9_6;
            }else if(eastPiece == 2){
                Room Room8_7 = new Room(8, 7);
                WeaponRoom Room9_7 = new WeaponRoom(9, 7, WeaponFactory.randomWeapon());
                EnemyRoom Room10_7 = new EnemyRoom(10, 7, EnemyFactory.randomEnemy());
                Room Room9_8 = new Room(9, 8);
                layout[8][7] = Room8_7;
                layout[9][7] = Room9_7;
                layout[10][7] = Room10_7;
                layout[9][8] = Room9_8;
            }else if(eastPiece == 3){
                Room Room8_7 = new Room(8, 7);
                WeaponRoom Room9_7 = new WeaponRoom(9, 7, WeaponFactory.randomWeapon());
                Room Room10_7 = new Room(10, 7);
                EnemyRoom Room10_6 = new EnemyRoom(10, 6, EnemyFactory.randomEnemy());
                layout[8][7] = Room8_7;
                layout[9][7] = Room9_7;
                layout[10][7] = Room10_7;
                layout[10][6] = Room10_6;
            }else if(eastPiece == 4){
                Room Room8_7 = new Room(8, 7);
                Room Room9_7 = new Room(9, 7);
                TreasureRoom Room9_8 = new TreasureRoom(9, 8, 60);
                layout[8][7] = Room8_7;
                layout[9][7] = Room9_7;
                layout[9][8] = Room9_8;
            }else if(eastPiece == 5){
                Room Room8_7 = new Room(8, 7);
                WeaponRoom Room9_7 = new WeaponRoom(9, 7, WeaponFactory.randomWeapon());
                Room Room9_6 = new Room(9, 6);
                EnemyRoom Room10_6 = new EnemyRoom(10, 6, EnemyFactory.randomEnemy());
                layout[8][7] = Room8_7;
                layout[9][7] = Room9_7;
                layout[9][6] = Room9_6;
                layout[10][6] = Room10_6;
            }else if(eastPiece == 6){
                Room Room8_7 = new Room(8, 7);
                Room Room9_7 = new Room(9, 7);
                TreasureRoom Room10_7 = new TreasureRoom(10, 7, 50);
                layout[8][7] = Room8_7;
                layout[9][7] = Room9_7;
                layout[10][7] = Room10_7;
            }

        }else if(mainDirection == 4){
            int NWPiece = rand.nextInt(3) + 1;
            if(NWPiece == 1){
                Room Room2_5 = new Room(2, 5);
                BossRoom Room2_6 = new BossRoom(2, 6, BossFactory.randomBoss());
                TreasureRoom Room3_4 = new TreasureRoom(3, 4, 90);
                EnemyRoom Room3_5 = new EnemyRoom(3, 5, EnemyFactory.randomEnemy());
                Room Room4_5 = new Room(4, 5);
                Room Room4_6 = new Room(4, 6);
                EnemyRoom Room4_7 = new EnemyRoom(4, 7, EnemyFactory.randomEnemy());
                WeaponRoom Room5_6 = new WeaponRoom(5, 6, WeaponFactory.randomWeapon());
                Room Room6_6 = new Room(6, 6);
                Room Room6_7 = new Room(6, 7);
                Room Room7_6 = new Room(7, 6);
                layout[2][5] = Room2_5;
                layout[2][6] = Room2_6;
                layout[3][4] = Room3_4;
                layout[3][5] = Room3_5;
                layout[4][5] = Room4_5;
                layout[4][6] = Room4_6;
                layout[4][7] = Room4_7;
                layout[5][6] = Room5_6;
                layout[6][6] = Room6_6;
                layout[6][7] = Room6_7;
                layout[7][6] = Room7_6;
            }else if(NWPiece == 2){
                EnemyRoom Room4_4 = new EnemyRoom(4, 4, EnemyFactory.randomEnemy());
                Room Room5_2 = new Room(5, 2);
                Room Room5_3 = new Room(5, 3);
                Room Room5_4 = new Room(5, 4);
                BossRoom Room6_2 = new BossRoom(6, 2, BossFactory.randomBoss());
                EnemyRoom Room6_4 = new EnemyRoom(6, 4, EnemyFactory.randomEnemy());
                Room Room6_5 = new Room(6, 5);
                WeaponRoom Room6_6 = new WeaponRoom(6, 6, WeaponFactory.randomWeapon());
                Room Room6_7 = new Room(6, 7);
                TreasureRoom Room7_4 = new TreasureRoom(7, 4, 75);
                Room Room7_6 = new Room(7, 6);
                layout[4][4] = Room4_4;
                layout[5][2] = Room5_2;
                layout[5][3] = Room5_3;
                layout[5][4] = Room5_4;
                layout[6][2] = Room6_2;
                layout[6][4] = Room6_4;
                layout[6][5] = Room6_5;
                layout[6][6] = Room6_6;
                layout[6][7] = Room6_7;
                layout[7][4] = Room7_4;
                layout[7][6] = Room7_6;
            }else if(NWPiece == 3){
                BossRoom Room3_5 = new BossRoom(3, 5, BossFactory.randomBoss());
                Room Room4_4 = new Room(4, 4);
                WeaponRoom Room4_5 = new WeaponRoom(4, 5, WeaponFactory.randomWeapon());
                EnemyRoom Room4_6 = new EnemyRoom(4, 6, EnemyFactory.randomEnemy());
                TreasureRoom Room5_4 = new TreasureRoom(5, 4, 40);
                Room Room6_3 = new Room(6, 3);
                EnemyRoom Room6_4 = new EnemyRoom(6, 4, EnemyFactory.randomEnemy());
                Room Room6_5 = new Room(6, 5);
                WeaponRoom Room6_6 = new WeaponRoom(6, 6, WeaponFactory.randomWeapon());
                Room Room6_7 = new Room(6, 7);
                TreasureRoom Room7_3 = new TreasureRoom(7, 3, 100);
                Room Room7_6 = new Room(7, 6);
                layout[3][5] = Room3_5;
                layout[4][4] = Room4_4;
                layout[4][5] = Room4_5;
                layout[4][6] = Room4_6;
                layout[5][4] = Room5_4;
                layout[6][3] = Room6_3;
                layout[6][4] = Room6_4;
                layout[6][5] = Room6_5;
                layout[6][6] = Room6_6;
                layout[6][7] = Room6_7;
                layout[7][3] = Room7_3;
                layout[7][6] = Room7_6;
            }

            int eastPiece = rand.nextInt(6) + 1;
            if(eastPiece == 1){
                Room Room8_7 = new Room(8, 7);
                TreasureRoom Room9_7 = new TreasureRoom(9, 7, 45);
                WeaponRoom Room9_8 = new WeaponRoom(9, 8, WeaponFactory.randomWeapon());
                Room Room9_6 = new Room(9, 6);
                layout[8][7] = Room8_7;
                layout[9][7] = Room9_7;
                layout[9][8] = Room9_8;
                layout[9][6] = Room9_6;
            }else if(eastPiece == 2){
                Room Room8_7 = new Room(8, 7);
                WeaponRoom Room9_7 = new WeaponRoom(9, 7, WeaponFactory.randomWeapon());
                EnemyRoom Room10_7 = new EnemyRoom(10, 7, EnemyFactory.randomEnemy());
                Room Room9_8 = new Room(9, 8);
                layout[8][7] = Room8_7;
                layout[9][7] = Room9_7;
                layout[10][7] = Room10_7;
                layout[9][8] = Room9_8;
            }else if(eastPiece == 3){
                Room Room8_7 = new Room(8, 7);
                WeaponRoom Room9_7 = new WeaponRoom(9, 7, WeaponFactory.randomWeapon());
                Room Room10_7 = new Room(10, 7);
                EnemyRoom Room10_6 = new EnemyRoom(10, 6, EnemyFactory.randomEnemy());
                layout[8][7] = Room8_7;
                layout[9][7] = Room9_7;
                layout[10][7] = Room10_7;
                layout[10][6] = Room10_6;
            }else if(eastPiece == 4){
                Room Room8_7 = new Room(8, 7);
                Room Room9_7 = new Room(9, 7);
                TreasureRoom Room9_8 = new TreasureRoom(9, 8, 60);
                layout[8][7] = Room8_7;
                layout[9][7] = Room9_7;
                layout[9][8] = Room9_8;
            }else if(eastPiece == 5){
                Room Room8_7 = new Room(8, 7);
                WeaponRoom Room9_7 = new WeaponRoom(9, 7, WeaponFactory.randomWeapon());
                Room Room9_6 = new Room(9, 6);
                EnemyRoom Room10_6 = new EnemyRoom(10, 6, EnemyFactory.randomEnemy());
                layout[8][7] = Room8_7;
                layout[9][7] = Room9_7;
                layout[9][6] = Room9_6;
                layout[10][6] = Room10_6;
            }else if(eastPiece == 6){
                Room Room8_7 = new Room(8, 7);
                Room Room9_7 = new Room(9, 7);
                TreasureRoom Room10_7 = new TreasureRoom(10, 7, 50);
                layout[8][7] = Room8_7;
                layout[9][7] = Room9_7;
                layout[10][7] = Room10_7;
            }

            int southPiece = rand.nextInt(6) + 1;
            if(southPiece == 1){
                Room Room7_8 = new Room(7, 8);
                TreasureRoom Room7_9 = new TreasureRoom(7, 9, 50);
                WeaponRoom Room6_9 = new WeaponRoom(6, 9, WeaponFactory.randomWeapon());
                Room Room8_9 = new Room(8, 9);
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[6][9] = Room6_9;
                layout[8][9] = Room8_9;
            }else if(southPiece == 2){
                Room Room7_8 = new Room(7, 8);
                WeaponRoom Room7_9 = new WeaponRoom(7, 9, WeaponFactory.randomWeapon());
                EnemyRoom Room7_10 = new EnemyRoom(7, 10, EnemyFactory.randomEnemy());
                Room Room6_9 = new Room(6, 9);
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[7][10] = Room7_10;
                layout[6][9] = Room6_9;
            }else if(southPiece == 3){
                Room Room7_8 = new Room(7, 8);
                WeaponRoom Room7_9 = new WeaponRoom(7, 9, WeaponFactory.randomWeapon());
                Room Room7_10 = new Room(7, 10);
                EnemyRoom Room8_10 = new EnemyRoom(8, 10, EnemyFactory.randomEnemy());
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[7][10] = Room7_10;
                layout[8][10] = Room8_10;
            }else if(southPiece == 4){
                Room Room7_8 = new Room(7, 8);
                Room Room7_9 = new Room(7, 9);
                TreasureRoom Room6_9 = new TreasureRoom(6, 9, 50);
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[6][9] = Room6_9;
            }else if(southPiece == 5){
                Room Room7_8 = new Room(7, 8);
                WeaponRoom Room7_9 = new WeaponRoom(7, 9, WeaponFactory.randomWeapon());
                Room Room8_9 = new Room(8, 9);
                EnemyRoom Room8_10 = new EnemyRoom(8, 10, EnemyFactory.randomEnemy());
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[8][9] = Room8_9;
                layout[8][10] = Room8_10;
            }else if(southPiece == 6){
                Room Room7_8 = new Room(7, 8);
                Room Room7_9 = new Room(7, 9);
                TreasureRoom Room7_10 = new TreasureRoom(7, 10, 70);
                layout[7][8] = Room7_8;
                layout[7][9] = Room7_9;
                layout[7][10] = Room7_10;
            }
        }
    }

    //Getters
    public Room[][] getLayout() {
        return layout;
    }

    public int getRoomsAmount() {
        return roomsAmount;
    }

    public Boolean isRoom(int x, int y){
        Room roomCheck = this.layout[x][y];
        Boolean isRoomThere = true;
        if(roomCheck == null){
            isRoomThere = false;
        }
        return isRoomThere;
    }

    public Room roomCheck(int x, int y){
        Room check = this.layout[x][y];
        return check;
    }

    /* 
    public String levelMap(){
        String output = "";
        for (int i = 0; i < layout.length; i++) {
            output += "\n";
            for (int j = 0; j < layout.length; j++) {
                Room isRoom = layout[j][i];
                if(isRoom == null){
                    output += "";
                }else{
                    output += "";
                }
            }
        }
        return output;
    }
    */

}
