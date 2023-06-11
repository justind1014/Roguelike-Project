/*
 * This class takes rooms and pieces them together in a level for the player.
 * The goal is for these layouts to be randomized, but they're manually made right now.
 */
public class LevelLayout {
    
    //Instance variables
    private Room[][] layout;
    private int roomsAmount;

    //Constructor
    public LevelLayout() {
        this.roomsAmount = 9;
        this.layout = new Room[14][14];
        Room starterRoom = new Room(7, 7);
        WeaponRoom room01 = new WeaponRoom(5, 7, WeaponFactory.randomWeapon());
        EnemyRoom room02 = new EnemyRoom(5, 6, EnemyFactory.randomEnemy());
        Room room03 = new Room(4, 8);
        TreasureRoom room04 = new TreasureRoom(4, 7, 150);
        Room room05 = new Room(6, 8);
        Room room06 = new Room(7, 8);
        EnemyRoom room07 = new EnemyRoom(7, 7, EnemyFactory.randomEnemy());
        Room room08 = new Room(7, 6);
        TreasureRoom room09 = new TreasureRoom(6, 6, 100);
        this.layout[5][8] = starterRoom;
        this.layout[5][7] = room01;
        this.layout[5][6] = room02;
        this.layout[4][8] = room03;
        this.layout[4][7] = room04;
        this.layout[6][8] = room05;
        this.layout[7][8] = room06;
        this.layout[7][7] = room07;
        this.layout[7][6] = room08;
        this.layout[6][6] = room09;
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

}
