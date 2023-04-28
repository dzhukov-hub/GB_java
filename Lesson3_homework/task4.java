package Lesson3_homework;

import java.util.ArrayList;

public class task4 {    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(8);
        list.add(15);
        list.add(14);

        list2.add(10);
        list2.add(6);
        list2.add(8);
        list2.add(17);
        list2.add(14);
       
        for (int i = 0; i < list2.size(); i++) {
            if (!list.contains(list2.get(i))) {
                list.add(list2.get(i));
            }
        }
        System.out.println(list.toString());
    }     
}
