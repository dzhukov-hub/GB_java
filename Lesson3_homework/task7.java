package Lesson3_homework;

import Lesson3_homework.task5;
import Lesson3_homework.task6;

public class task7 {
     public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
        task5.main(args);
        long task5_time=(System.currentTimeMillis() - time1);
        long time2 = System.currentTimeMillis();
        task6.main(args);
        long task6_time=(System.currentTimeMillis() - time2);        
        System.out.println("Duration task 5 - "+task5_time);
        System.out.println("Duration task 6 - "+task6_time);    
  
    }
    
}
