package JavaClass.task;

import java.util.ArrayList;

class home{
    String address;
    int roomNumber;
    int floorNumber;
}
public class task2 {
    public static void main(String[] args) {
        ArrayList<home> homes = new ArrayList<>();
        homes.add(homeMethod("Yashlyk 30", 3, 7));
        homes.add(homeMethod("Ajayip 11", 4, 9));
        homes.add(homeMethod("Menliyewa 112", 5, 2));
        for (home home : homes) {
            printhome(home);
        }
    }
    public static home homeMethod(String address, int roomNumber, int floorNumber){
        home home1 = new home();
        home1.address = address;
        home1.roomNumber = roomNumber;
        home1.floorNumber = floorNumber;
        return home1;
    }
    public static void printhome(home Home){
        System.out.println(Home.address + " Room : " + Home.roomNumber + " Floor : " + Home.floorNumber);
    }


}
