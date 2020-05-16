package day11;
class nums{
    double d1;
    double d2;
    double d3;

    public nums(double d1, double d2, double d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    nums(){

    }
}
public class task5 {
    int i1;
    int i2;
    int i3;

    public void calculate1(){
        if(Math.pow(i1,i2)==i3){
            System.out.println("you good to go!");
        }
        else {
            System.out.println("something is wrong here!");
        }
    }
    public void calculate2(){
        nums nums1 = new nums();
        if (Math.ceil(nums1.d1)+Math.ceil(nums1.d2)==Math.round(nums1.d3)){
            System.out.println("you're right");
        }
        else{
            System.out.println("you're wrong");
        }
    }

    public task5(int i1, int i2, int i3) {
        this.i1 = i1;
        this.i2 = i2;
        this.i3 = i3;
    }
    public void print(){
        nums nums1 = new nums();
        System.out.println("i1 is ;" + i1);
        System.out.println("i2 is ;" + i2);
        System.out.println("i3 is ;" + i3);
        System.out.println("d1 is ;" + nums1.d1);
        System.out.println("d2 is ;" + nums1.d2);
        System.out.println("d3 is ;" + nums1.d3);
    }

    public static void main(String[] args) {
        task5 task1 = new task5(5,3,125);
        nums nums12 = new nums(3.4,4.3,8.0);
        task1.calculate1();
    }
}
