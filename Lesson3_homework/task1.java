package Lesson3_homework;

import java.util.ArrayList;
import java.util.Comparator;

public class task1 {
    public static void main(String[] args){
        ArrayList<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(7.0);
        list.add(15.0);
        list.sort(Comparator.reverseOrder());
        System.out.println(list.toString());
    }    
}
