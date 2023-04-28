package Lesson3_homework;
import java.util.ArrayList;

public class task5 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<=10000; i++){
            list.add(0, 0);
        }
    System.out.println(list.toString());
    }
}
