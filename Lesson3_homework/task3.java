package Lesson3_homework;

import java.util.ArrayList;

public class task3 {    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(8);
        list.add(15);
        list.add(14);

        //System.out.println(list.toString());
        int min_=list.get(0);
        int max_=list.get(0);
        double avg_=0;
        
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min_){min_=list.get(i);}
            if (list.get(i) > max_){max_=list.get(i);}
            avg_+=list.get(i);
        }
        avg_=avg_/list.size();
        System.out.println("Min value: "+min_);
        System.out.println("Max value: "+max_);
        System.out.println("Avg value: "+avg_);
        //System.out.println(list.toString());

    }     
}
