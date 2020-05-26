package day32.nonAccessModifier.StaticModifierPractice;

public class Person {
    String name;
    String jobTitle;
    Calculate calculate;


//    public Person(String name, String jobTitle) {
//        this.name = name;
//        this.jobTitle = jobTitle;
////        this.calculate =calculate;
//    }
    public void print(){
        System.out.println(name);
        System.out.println(jobTitle);
        System.out.println(calculate);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", calculate=" + calculate +
                '}';
    }
}
