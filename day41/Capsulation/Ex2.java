package day41.Capsulation;

public class Ex2 {

    public static void main(String[] args) {
//        User u1 = new User();
//        u1.setPassword("123");


        User admin = new User(1, "admin@techno", "superpassword");
        System.out.println("admin password is: " + admin.getPassword());
    }
}
