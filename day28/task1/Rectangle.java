package day28.task1;
class newclass{
    int length;
    int width;
    int perimeter(){
        return length + width;
    }
    int area (){
        return length * width;
    }
    void print(){
        System.out.println(length);
        System.out.println(width);
        System.out.println(perimeter());
        System.out.println(area());
    }
}
public class Rectangle {
    public static void main(String[] args) {
        newclass rec =  new newclass();
        rec.length = 2;
        rec.width = 23;
        int result = rec.perimeter();
        int result1 = rec.area();
        rec.print();
    }
}
