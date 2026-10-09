import java.util.ArrayList;

public class Room {
    String name;
    ArrayList<Lamp> lamps;
    ArrayList<Window> windows;

    Room(String name){
        this.name=name;
        this.lamps = new ArrayList<>();
        this.windows = new ArrayList<>();
    }
    void addLamp(Lamp lamp){
        lamps.add(lamp);
    }
    void addWindow(Window window){}
    int getLampCount(){}
    int getTotalWatt(){}
    int getTotalWindowArea(){}
    void printRoom(){}

    }