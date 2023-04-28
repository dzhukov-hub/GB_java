package Lesson3_homework;
import java.util.LinkedList;

public class task6 {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i=0; i<=10000; i++){
            list.add(0, 0);
        }
    System.out.println(list.toString());
    }
}
