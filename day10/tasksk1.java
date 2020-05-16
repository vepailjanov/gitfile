package day10;

import java.util.Random;
import java.util.Scanner;

public class tasksk1 {
    int i1;
    int i2;
    public int checklength(){
        return Math.max(i1,i2);
  }
  public void print(){
      System.out.println("1st number is : " + i1);
      System.out.println("2nd number is : "+ i2);
      System.out.println("Longer one is : "+checklength());
  }

    @Override
    public String toString() {
        return "tasksk1{" +
                "i1=" + i1 +
                ", i2=" + i2 +
                '}';
    }

    public static void main(String[] args) {
        Random random = new Random();
        tasksk1 task = new tasksk1();
        task.i1=random.nextInt(10);
        task.i2=random.nextInt(10);
        task.checklength();
        task.print();
    }

  }
