import java.util.ArrayList;

public class Building {
    String name;
    ArrayList<Room> rooms;

    Building(String name){
        this.name=name;
        this.rooms=new ArrayList<>();
    }
    void addRoom(Room room){}
    int getTotalLampCount(){}
    int getTotalWatt(){}
    void printBuilding(){}

}
