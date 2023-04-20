package Lesson1_homework;
import java.util.Random;
import java.util.ArrayList;

public class homework {
    public static void main(String[] args) {
        int i, n;
        i=task1();
        n=task2(i);
        task3(i, n);
        task4(i, n);        
    }
    public static int task1() {
        Random RanNumber = new Random();
        int i  = RanNumber.nextInt(2000);
        //System.out.println("Random number between 1 and 2000: " + i);
        return i;
    } 
    public static int task2(int i) {
        int n;
        n = Integer.toBinaryString(i).length();
        //System.out.println(n);
        return n;
    }
    public static void task3(int i, int n){
        ArrayList<Integer> m1 = new ArrayList<Integer>();
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1.add(j);
            }        
        }
        //System.out.println(m1);        
    }
    public static void task4(int i, int n){
        ArrayList<Integer> m2 = new ArrayList<Integer>();
        for (int j = Short.MIN_VALUE; j <=i ; j++) {
            if (j % n != 0) {
                m2.add(j);
            }        
        }
        //System.out.println(m2);
    }
}

