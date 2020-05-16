package day32.nonAccessModifier.tasks;

public class task2 {
   String name;
    public static int count = 0;

    public task2(String name) {
        this.name = name;
    }
    static void counting(){
            count++;
        }
        public void print(){
            System.out.println(name + " " + count);
        }
    public String toString() {
        return "task2{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        task2 person1 = new task2("Jack");
        person1.counting();
        person1.print();
        task2 person2 = new task2("Max");
        person1.counting();
        person2.print();
        task2 person3 = new task2("John");
        person1.counting();
        person3.print();
    }
}
