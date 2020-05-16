package day28;
class Person{
    String name;
    String surname;
    int age;
    String john;
    int getbirthyear(){
        return 2020 - age;
    }
    String initials(){
        return name.charAt(0) + "." + surname.charAt(0);
    }
    void  print(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(getbirthyear());
        System.out.println(initials());
    }
}

public class example {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Vepa";
        person.surname = "Iljanov";
        person.age = 31;
        int birthyearperson = person.getbirthyear();
        String initialp = person.initials();
        person.print();

        Person person1 = new Person();
        person1.name = "Mukam";
        person1.surname = "Soyunov";
        person1.age = 35;
        int birthyearperson1 = person1.getbirthyear();
        String initialp1 = person1.initials();
        person1.print();

        Person person2 = new Person();
        person2.name = "John";
        person2.surname = "Donald";
        person2.age = 34;
        int birthyearjohn = person2.getbirthyear();
        String initialjohn = person2.initials();
        person2.print();


    }
}
