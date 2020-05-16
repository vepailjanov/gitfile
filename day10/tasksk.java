package day10;

public class tasksk {
    String str1;
    String str2;

    public void checkLength(){
        if (str1.length()+str2.length()>10){
            System.out.println("Your string is too long!");
        }else if (str1.length()+str2.length()>5&&str1.length()+str2.length()<5){
            System.out.println("Your string might work but no guarantee");
        }
        else{
            System.out.println("your string is ok");
        }
    }
    public void print (){
        System.out.println(str1);
        System.out.println(str2);
    }

    public tasksk(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "tasksk{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                '}';
    }

    public static void main(String[] args) {
        tasksk task1 = new tasksk("hello","everyone");
        task1.print();
        task1.checkLength();
    }
}

