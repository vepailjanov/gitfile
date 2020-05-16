package JavaClass.task2;

public class mainmethod {
    public static void main(String[] args) {
        Family family1 = result(3, "Japan", "Yesterday", "Chemen", 45);
        Family family2 = result(5, "Turkey", "never", "Guncha", 45);
        Family family3 = result(7, "Chine", "everyday", "Tawus", 45);

    }
    public static Family result(int size, String holiday, String fight, String name, int age){
        Family families = new Family();
        families.size = size;
        families.holiday = holiday;
        families.fight = fight;
        families.sister.name = name;
        families.sister.age = age;
        return families;
    }
}
