package day41.task3;

import java.util.List;

public class School {
private String address;
private int number;
private String phone;
private String teachername;
private String nameSchool;
private int SchoolSize;

private List<Student> students;

    public School(String address, int number, String phone, String teachername, String nameSchool, List<Student> students, int SchoolSize) {
        this.address = address;
        this.number = number;
        this.phone = phone;
        this.teachername = teachername;
        this.nameSchool = nameSchool;
        this.students = students;
        this.SchoolSize = SchoolSize;
    }
    public void GetStudent(Student student) throws Exception {
        if (students.size()>=getSchoolSize()) {
            throw new Exception("too many students sorry!");
        }
        students.add(student);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public int getSchoolSize() {
        return SchoolSize;
    }

    public void setSchoolSize(int schoolSize) {
        SchoolSize = schoolSize;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "School{" +
                "address='" + address + '\'' +
                ", number=" + number +
                ", phone='" + phone + '\'' +
                ", teachername='" + teachername + '\'' +
                ", nameSchool='" + nameSchool + '\'' +
                ", SchoolSize=" + SchoolSize +
                ", students=" + students +
                '}';
    }
}
