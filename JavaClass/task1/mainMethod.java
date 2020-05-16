package JavaClass.task1;

public class mainMethod {
    public static void main(String[] args) {
        User user1 = simple("Vepa", "Iljanov", "vepasshka", 14021988, "Yashlyk 30",
                "08/14/1988", 55133343,"vepash@gmail.com");
        User user2 = simple("Mukam", "Soyunov", "mukky", 43423433,"Yashlyk 30",
                "08/14/1988", 55133343,"vepash@gmail.com");
        User user3 = simple("Sredar", "Durbayev", "serik", 2344324,"Yashlyk 30",
                "08/14/1988", 55133343,"vepash@gmail.com");
    }
    public static User simple(String firstname, String lastname, String username,
                              int password, String address, String birthday, int phone, String email){
        User user = new User();
        user.firstname = firstname;
        user.lastname = lastname;
        user.username = username;
        user.password = password;
        user.addedinfo.address = address;
        user.addedinfo.birthday = birthday;
        user.addedinfo.phone = phone;
        user.addedinfo.email = email;
        return user;
    }
}
