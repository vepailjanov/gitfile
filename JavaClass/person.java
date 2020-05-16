package JavaClass;
// Blueprint or Templite
public class person {
    // CALLED Attributes or Fields or Instance variables
    String name;
    long id;
    int age;
    public static void main(String[] args) {
        person person1 = new person();
        person1.name = "Vepa";
        person1.id = 434234254;
        person1.age = 31;
        System.out.println(person1.name);
        System.out.println(person1.id);
        System.out.println(person1.age);
    }
}
