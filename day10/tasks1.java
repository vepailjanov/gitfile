package day10;


import java.util.Scanner;

public class tasks1 {
   String str1;
   String str2;

   public void checkWords(){
       if (str1.equals(str2)){
           System.out.println(true);
       }
       else{
           System.out.println(false);
       }
   }

   public void print(){
       System.out.println("str1 is :" + str1);
       System.out.println("str2 is :" + str2);
   }

//    public tasks1(String str1, String str2) {
//        this.str1 = str1;
//        this.str2 = str2;
//    }

    @Override
    public String toString() {
        return "tasks1{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tasks1 task1 = new tasks1();
        task1.str1= scanner.nextLine();
        task1.str2= scanner.nextLine();
        task1.checkWords();
        task1.print();
    }
}
