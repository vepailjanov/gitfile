package day28.task6;

public class Login {
    String username;
    String password;

   public static Login create(String u, String p){
       Login login = new Login();
       login.username = u;
       login.password = p;
       return login;
    }
    public void checkAndPrint(){
       if (username != null && username.isEmpty()){
           System.out.println("Not valid username");
       }
        if (password != null && password.isEmpty()){
            System.out.println("Not valid password");
        }
    }
}
