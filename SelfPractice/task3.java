package SelfPractice;
public class task3 {
    public static void main(String[] args) {
        OuterLoop:for (int i = 1; i <=10; i++) {
            InnerLoop:for (int j = 1; j <= 10; j++) {
                if (j==4) {
                    break OuterLoop;
                }
                System.out.println(i + "x" + j + "=" + i * j);
            }
            System.out.println();
        }
        }
    }

