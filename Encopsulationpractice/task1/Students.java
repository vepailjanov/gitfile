package Encopsulationpractice.task1;

enum Grades{
    FIRST, SECOND, THIRD
}

public class Students {
    private String name;
    private int age;
    private String address;
    private String email;
    private int id;
    private int phone;
    private Grades grades;

//    public Students(String name, int age, String address, String email, int id, int phone, Grades grades) {
//        this.name = name;
//        this.age = age;
//        this.address = address;
//        this.email = email;
//        this.id = id;
//        this.phone = phone;
//        this.grades = grades;
//    }

    public String getName()  {
        if (name.length()<3){
            throw new RuntimeException("Not real name!");
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge()  {
        if (age>45||age<18){
            throw new RuntimeException("Too young!");
        }
        return age;
    }

    public void setAge(int age) throws Exception {

        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }


    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                ", phone=" + phone +
                ", grades=" + grades +
                '}';
    }
}
