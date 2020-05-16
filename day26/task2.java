package day26;

public class task2 {
        public static void main(String[] args){
            System.out.println(EvenOddNUms("6678421312"));
            System.out.println(EvenOddNUms("5456435564"));
        }
        public static int EvenOddNUms(String digits){
            int total=0;
            for(int i=0; i<digits.length(); i++){
                int number = Integer.valueOf(String.valueOf(digits.charAt(i)));
                if(number%2==0){
                    total+=number;
                }else{
                    total-=number;
                }
            }
            return total;
        }

}
