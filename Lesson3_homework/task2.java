package Lesson3_homework;

import java.util.ArrayList;

public class task2 {    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(8);
        list.add(15);
        list.add(14);

        System.out.println(list.toString());
        for (int i = 0; i < list.size(); i++) {
            int kj = list.get(i);
            if (kj%2!=0) {
                list2.add(kj);
            }
        }
        list=list2;
        System.out.println(list.toString());

    }     
}
